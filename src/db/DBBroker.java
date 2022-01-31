/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domenski.objekat.DomenskiObjekat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Nadja
 */
public class DBBroker {
    Connection connection=DbConnection.getConnection();
    
     public List<DomenskiObjekat> getAll(DomenskiObjekat object) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT " + object.getAllColumnNames() + " FROM "
                    + object.getTableName() + " ORDER BY " + object.getOrderByColumn();
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);

            return object.getObjectsFromResultSet(rs);
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
    public List<DomenskiObjekat> getAllWithWhere(DomenskiObjekat object, String whereClause) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT " + object.getAllColumnNames() + " FROM "
                    + object.getTableName() + " WHERE " + whereClause + " ORDER BY " + object.getOrderByColumn();
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);

            return object.getObjectsFromResultSet(rs);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public int insert(DomenskiObjekat object) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO " + object.getTableName().split(" ")[0] + "(" + object.getInsertColumnNames() + ")" + " VALUES (" + object.getColumnValues() + ")";
            System.out.println(query);
            return statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public int update(DomenskiObjekat odo) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "UPDATE " + odo.getTableName() + " SET " + odo.getUpdateClause() + " WHERE " + odo.getUpdateWhereClause();
            System.out.println(query);
            int rowsUpdated = statement.executeUpdate(query);
            return rowsUpdated;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public int delete(DomenskiObjekat odo) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            String query = "DELETE FROM " + odo.getTableName() + " WHERE " + odo.getDeleteWhereClause();
            System.out.println(query);
            int rowsUpdated = statement.executeUpdate(query);
            return rowsUpdated;
        } catch (SQLException ex) {
            throw ex;
        }
    }
}
