
package dataweb;

import sw.Cliente;

public class ClientesRelacional {


    public static java.util.List<sw.Cliente> listarClientes() {
        sw.Consultas_Service service = new sw.Consultas_Service();
        sw.Consultas port = service.getConsultasPort();
        return port.listarClientes();
    }

    public   String insertarCliente(java.lang.String nombre, java.lang.String direccion, java.lang.String telefono, java.lang.String correo, java.lang.String fechaNacimiento, double saldo, java.lang.String ultimaCompra) {
        sw.Consultas_Service service = new sw.Consultas_Service();
        sw.Consultas port = service.getConsultasPort();
        return port.insertarCliente(nombre, direccion, telefono, correo, fechaNacimiento, saldo, ultimaCompra);
    }


    
}
