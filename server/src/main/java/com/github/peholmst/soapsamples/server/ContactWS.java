package com.github.peholmst.soapsamples.server;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Singleton
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class ContactWS {

    private final Map<String, Contact> contactsMap = new HashMap<>();

    @WebMethod(operationName = "findAll")
    @WebResult(name = "contact")
    public Collection<Contact> findAll() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }
        synchronized (this) {
            return contactsMap.values();
        }
    }

    @WebMethod(operationName = "findByUuid")
    @WebResult(name = "contact")
    public synchronized Contact findByUuid(@WebParam(name = "uuid") String uuid) throws NoSuchContactException {
        final Contact contact = contactsMap.get(uuid);
        if (contact == null) {
            throw new NoSuchContactException();
        } else {
            return contact;
        }
    }

    @WebMethod(operationName = "deleteByUuid")
    public synchronized void deleteByUuid(@WebParam(name = "uuid") String uuid) throws NoSuchContactException {
        Logger.getLogger(getClass().getName()).log(Level.INFO, "Deleting contact {0}", uuid);
        if (contactsMap.remove(uuid) == null) {
            throw new NoSuchContactException();
        }
    }

    @WebMethod(operationName = "create")
    @WebResult(name = "createdContact")
    public synchronized Contact create() {
        final Contact contact = new Contact();
        contact.setUuid(UUID.randomUUID().toString());
        contactsMap.put(contact.getUuid(), contact);
        return contact;
    }

    @WebMethod(operationName = "update")
    @WebResult(name = "updatedContact")
    public synchronized Contact update(@WebParam(name = "contactToUpdate") Contact contact) throws NoSuchContactException {
        Logger.getLogger(getClass().getName()).log(Level.INFO, "Updating contact {0}", contact);
        if (!contactsMap.containsKey(contact.getUuid())) {
            throw new NoSuchContactException();
        }
        contactsMap.put(contact.getUuid(), contact);
        return contact;
    }
        
    @PostConstruct
    void init() {
        /*
         * This method is very ugly. It was late and I was running out of time.
         */
        final String[] femaleFirstNames = {"Sarah", "Jane", "Marilyn", "Eve", "Alice", "Ann"};
        final String[] maleFirstNames = {"Joe", "John", "Bob", "Mark", "Adam", "Maxwell"};
        final String[] lastNames = {"Smith", "Doe", "Cool", "Smart", "Twain", "Anderson"};
        
        for (String lastName : lastNames) {
            for (String firstName : femaleFirstNames) {
                Contact contact = create();
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setGender(Gender.FEMALE);
            }
            for (String firstName : maleFirstNames) {
                Contact contact = create();
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setGender(Gender.MALE);
            }
        }
    }

}
