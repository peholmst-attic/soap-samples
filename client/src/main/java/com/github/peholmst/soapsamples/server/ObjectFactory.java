
package com.github.peholmst.soapsamples.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.peholmst.soapsamples.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NoSuchContactException_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "NoSuchContactException");
    private final static QName _DeleteByUuidResponse_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "deleteByUuidResponse");
    private final static QName _FindAll_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "findAll");
    private final static QName _FindByUuid_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "findByUuid");
    private final static QName _UpdateResponse_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "updateResponse");
    private final static QName _Create_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "createResponse");
    private final static QName _Update_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "update");
    private final static QName _FindAllResponse_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "findAllResponse");
    private final static QName _DeleteByUuid_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "deleteByUuid");
    private final static QName _FindByUuidResponse_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "findByUuidResponse");
    private final static QName _Contact_QNAME = new QName("http://server.soapsamples.peholmst.github.com/", "contact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.peholmst.soapsamples.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteByUuid }
     * 
     */
    public DeleteByUuid createDeleteByUuid() {
        return new DeleteByUuid();
    }

    /**
     * Create an instance of {@link FindByUuidResponse }
     * 
     */
    public FindByUuidResponse createFindByUuidResponse() {
        return new FindByUuidResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link NoSuchContactException }
     * 
     */
    public NoSuchContactException createNoSuchContactException() {
        return new NoSuchContactException();
    }

    /**
     * Create an instance of {@link DeleteByUuidResponse }
     * 
     */
    public DeleteByUuidResponse createDeleteByUuidResponse() {
        return new DeleteByUuidResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindByUuid }
     * 
     */
    public FindByUuid createFindByUuid() {
        return new FindByUuid();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchContactException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "NoSuchContactException")
    public JAXBElement<NoSuchContactException> createNoSuchContactException(NoSuchContactException value) {
        return new JAXBElement<NoSuchContactException>(_NoSuchContactException_QNAME, NoSuchContactException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByUuidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "deleteByUuidResponse")
    public JAXBElement<DeleteByUuidResponse> createDeleteByUuidResponse(DeleteByUuidResponse value) {
        return new JAXBElement<DeleteByUuidResponse>(_DeleteByUuidResponse_QNAME, DeleteByUuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUuid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "findByUuid")
    public JAXBElement<FindByUuid> createFindByUuid(FindByUuid value) {
        return new JAXBElement<FindByUuid>(_FindByUuid_QNAME, FindByUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByUuid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "deleteByUuid")
    public JAXBElement<DeleteByUuid> createDeleteByUuid(DeleteByUuid value) {
        return new JAXBElement<DeleteByUuid>(_DeleteByUuid_QNAME, DeleteByUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByUuidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "findByUuidResponse")
    public JAXBElement<FindByUuidResponse> createFindByUuidResponse(FindByUuidResponse value) {
        return new JAXBElement<FindByUuidResponse>(_FindByUuidResponse_QNAME, FindByUuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapsamples.peholmst.github.com/", name = "contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

}
