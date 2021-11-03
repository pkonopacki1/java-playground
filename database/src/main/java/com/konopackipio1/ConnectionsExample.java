package com.konopackipio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionsExample 
{
    public static void main( String[] args ) throws SQLException
    {
        Connection conn = getConnection();
        createTable(conn);
        addData(conn);
        addPreparedData(conn, 102, "Piotr");
        getData(conn);
        dropTable(conn);
        conn.close();      
        
    }

    private static Connection getConnection() {
        String dbURL = "jdbc:sqlserver://localhost\\MSSQLEXPRESS;database=JavaTEST;user=sa;password=sa";
        // Not required since JDBC 4.0
        // DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        if (conn != null) {
            System.out.println("Connected");
        }

        return conn;
    }

    private static void addData(Connection connection) {
        String isnertSQL = "INSERT INTO PERSON(PERSON_ID, NAME) VALUES(101, 'JOE')";
        try(Statement stmt = connection.createStatement()) {
            int i = stmt.executeUpdate(isnertSQL); 
            if(i > 0) {
                System.out.println("Table was updated");
            }
        } catch(SQLException e) {
            System.err.println("Could not add data to a table: " + e);
        }
    }

    // Prepared statement is better solution than statement
    private static void addPreparedData(Connection connection, int id, String name) {
        String isnertSQL = "INSERT INTO PERSON(PERSON_ID, NAME) VALUES(?, ?)";
        try(PreparedStatement stmt = connection.prepareStatement(isnertSQL)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            int i = stmt.executeUpdate(); 
            if(i > 0) {
                System.out.println("Table was updated");
            }
        } catch(SQLException e) {
            System.err.println("Could not add data to a table: " + e);
        }
    }

    private static void getData(Connection connection) {
        String selectSQL = "SELECT * FROM PERSON";
        try(Statement stmt = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
            try(ResultSet rs = stmt.executeQuery(selectSQL)) {
                while(rs.next()) {
                    int columnCount = rs.getMetaData().getColumnCount();
                    for(int i = 1; i <= columnCount; i++) {
                        if(i == 2) {
                            rs.updateString(i, rs.getString(i) + " updated");
                            rs.updateRow();
                        }
                        System.out.println(rs.getMetaData().getColumnName(i) + ": " + rs.getObject(i));
                    }
                }
            }             
        } catch(SQLException e) {
            System.err.println("Could not add data to a table: " + e);
        }
    }




    private static void createTable(Connection connection) {
        String createSQL = "create table PERSON(PERSON_ID INTEGER NOT NULL, NAME varchar(255))";
        try(Statement stmt = connection.createStatement()) {
            stmt.execute(createSQL);           
        } catch(SQLException e) {
            System.err.println("Could not create a table: " + e);
        }
    }

    private static void dropTable(Connection connection) {
        String createSQL = "drop table person";
        try(Statement stmt = connection.createStatement()) {
            stmt.execute(createSQL);           
        } catch(SQLException e) {
            System.err.println("Could not drop a table: " + e);
        }
    }


}
