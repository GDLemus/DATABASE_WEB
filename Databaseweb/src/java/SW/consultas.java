package SW;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebService(serviceName = "consultas")
public class consultas {

 @WebMethod(operationName = "insertarCliente")
    public String insertarCliente(
        @WebParam(name = "nombre") String nombre,
        @WebParam(name = "direccion") String direccion,
        @WebParam(name = "telefono") String telefono,
        @WebParam(name = "correo") String correo,
        @WebParam(name = "fechaNacimiento") String fechaNacimiento,
        @WebParam(name = "saldo") double saldo,
        @WebParam(name = "ultimaCompra") String ultimaCompra) {

        Connection connection = null;
        try {

            Conexion conexionDB = new Conexion();
            connection = conexionDB.Conectar();

            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date parsedDate = dateFormat.parse(fechaNacimiento);
            java.sql.Date sqlFechaNacimiento = new java.sql.Date(parsedDate.getTime());

            parsedDate = dateFormat.parse(ultimaCompra);
            java.sql.Date sqlUltimaCompra = new java.sql.Date(parsedDate.getTime());


            String insertQuery = "INSERT INTO Clientes (nombre, direccion, telefono, correo, fecha_nacimiento, saldo, ultima_compra) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, direccion);
            preparedStatement.setString(3, telefono);
            preparedStatement.setString(4, correo);
            preparedStatement.setDate(5, sqlFechaNacimiento);
            preparedStatement.setDouble(6, saldo);
            preparedStatement.setDate(7, sqlUltimaCompra);


            int rowCount = preparedStatement.executeUpdate();

            if (rowCount > 0) {
                return "Cliente insertado correctamente";
            } else {
                return "Error al insertar el cliente";
            }
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            return "Error en la base de datos: " + e.getMessage();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 @WebMethod(operationName = "listarClientes")
    public List<ClienteDATA> listarClientes() {

        List<ClienteDATA> listaClientes = new ArrayList<>();
        Connection connection = null;
        try {

            Conexion conexionDB = new Conexion();
            connection = conexionDB.Conectar();


            String query = "SELECT * FROM Clientes";
            PreparedStatement preparedStatement = connection.prepareStatement(query);


            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                ClienteDATA cliente = new ClienteDATA();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setCorreo(resultSet.getString("correo"));
                cliente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento"));
                cliente.setSaldo(resultSet.getDouble("saldo"));
                cliente.setUltimaCompra(resultSet.getDate("ultima_compra"));
                listaClientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return listaClientes;
    }
}
