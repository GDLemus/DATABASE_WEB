
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _InsertarClienteResponse_QNAME = new QName("http://SW/", "insertarClienteResponse");
    private final static QName _ListarClientesResponse_QNAME = new QName("http://SW/", "listarClientesResponse");
    private final static QName _ListarClientes_QNAME = new QName("http://SW/", "listarClientes");
    private final static QName _InsertarCliente_QNAME = new QName("http://SW/", "insertarCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarClientes }
     * 
     */
    public ListarClientes createListarClientes() {
        return new ListarClientes();
    }

    /**
     * Create an instance of {@link InsertarCliente }
     * 
     */
    public InsertarCliente createInsertarCliente() {
        return new InsertarCliente();
    }

    /**
     * Create an instance of {@link InsertarClienteResponse }
     * 
     */
    public InsertarClienteResponse createInsertarClienteResponse() {
        return new InsertarClienteResponse();
    }

    /**
     * Create an instance of {@link ListarClientesResponse }
     * 
     */
    public ListarClientesResponse createListarClientesResponse() {
        return new ListarClientesResponse();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "insertarClienteResponse")
    public JAXBElement<InsertarClienteResponse> createInsertarClienteResponse(InsertarClienteResponse value) {
        return new JAXBElement<InsertarClienteResponse>(_InsertarClienteResponse_QNAME, InsertarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "listarClientesResponse")
    public JAXBElement<ListarClientesResponse> createListarClientesResponse(ListarClientesResponse value) {
        return new JAXBElement<ListarClientesResponse>(_ListarClientesResponse_QNAME, ListarClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "listarClientes")
    public JAXBElement<ListarClientes> createListarClientes(ListarClientes value) {
        return new JAXBElement<ListarClientes>(_ListarClientes_QNAME, ListarClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SW/", name = "insertarCliente")
    public JAXBElement<InsertarCliente> createInsertarCliente(InsertarCliente value) {
        return new JAXBElement<InsertarCliente>(_InsertarCliente_QNAME, InsertarCliente.class, null, value);
    }

}
