package modelos.daos.contratos;

import java.sql.SQLException;

public interface AdminDAO {
    boolean postRegistrar(String nombre, String contrasena, String email) throws SQLException;
    
    boolean updateActualizarDatosPersonales(String nombre, String contrasena, String emailViejo, String emailNuevo) throws SQLException;
    
    boolean getLogin(String email, String contrasena) throws SQLException;

    boolean deleteEliminarAdmin(String email) throws SQLException;
}