package com.talentotech.datos;

import java.sql.*;

public class conexion {

    /**
     * tienen que crear una base de datoos llamada transicion_energetica para que no les
     * aparezca error
     */
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/transicion_energetica?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";


    /**
     * Este método está diseñado para establecer una conexión con la base de datos
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }


    /**
     * Este método está diseñado para cerrar un objeto Statement.
     * Un Statement se utiliza para ejecutar consultas SQL en la base de datos.
     * @param statement
     * @throws SQLException
     */
    public static void close(Statement statement) throws SQLException {
        statement.close();
    }

    /**
     * Este método está diseñado para cerrar un objeto ResultSet.
     * Un ResultSet contiene los resultados de una consulta SQL
     * que devuelve datos, como los resultados de una instrucción SELECT.
     * @param resultSet
     * @throws SQLException
     */
    public static void close(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    /**
     * Este método está diseñado para cerrar un objeto PreparedStatement.
     * Un PreparedStatement es una variante de Statement que permite ejecutar
     * consultas precompiladas con parámetros (es decir, con valores que pueden
     * ser diferentes en cada ejecución).
     * @param preparedStatement
     * @throws SQLException
     */
    public static void close(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    /**
     * Este método está diseñado para cerrar una conexión con la base de datos (Connection).
     * @param connection
     * @throws SQLException
     */
    public static void close(Connection connection) throws SQLException {
        connection.close();
    }
}
