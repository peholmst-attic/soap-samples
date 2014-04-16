package com.github.peholmst.soapsamples.server;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Singleton
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class ContactWS {

    private final Map<String, Contact> contactsMap = new HashMap<>();

    @WebMethod(operationName = "findAll")
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
    public synchronized Contact findByUuid(@WebParam(name = "uuid") final String uuid) throws NoSuchContactException {
        final Contact contact = contactsMap.get(uuid);
        if (contact == null) {
            throw new NoSuchContactException();
        } else {
            return contact;
        }
    }

    @WebMethod(operationName = "deleteByUuid")
    public synchronized void deleteByUuid(@WebParam(name = "uuid") final String uuid) throws NoSuchContactException {
        if (contactsMap.remove(uuid) == null) {
            throw new NoSuchContactException();
        }
    }

    @WebMethod(operationName = "create")
    public synchronized Contact create() {
        final Contact contact = new Contact();
        contactsMap.put(contact.getUuid().toString(), contact);
        return contact;
    }

    @WebMethod(operationName = "update")
    public synchronized Contact update(@WebParam(name = "contact") final Contact contact) throws NoSuchContactException {
        if (!contactsMap.containsKey(contact.getUuid().toString())) {
            throw new NoSuchContactException();
        }
        contactsMap.put(contact.getUuid().toString(), contact);
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
