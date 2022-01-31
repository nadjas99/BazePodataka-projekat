/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domenski.objekat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jovan
 */
public abstract class DomenskiObjekat {
    
    public abstract String getTableName();
    
    public abstract String getAllColumnNames();
    
    public abstract String getInsertColumnNames();

    public abstract String getColumnValues();

    public abstract String getUpdateClause();

    public abstract String getWhereIdClause();
    
    public abstract String getUpdateWhereClause();

    public abstract String getDeleteWhereClause();
    
    public abstract List<DomenskiObjekat> getObjectsFromResultSet(ResultSet rs) throws SQLException;

    public abstract String getOrderByColumn();
    
}
