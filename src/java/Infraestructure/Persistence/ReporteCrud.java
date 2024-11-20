
package Infraestructure.Persistence;

/**
 *
 * @Yesid Martinez
 */
import Domain.Model.Reporte;
import Infraestructure.Database.ConnectionDbMysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReporteCrud {
    public List<Reporte>getAllReportes(){
    List<Reporte> reportes=new ArrayList<>();
    String query= "SELECT * FROM reporte";
        try {
            Connection conn =ConnectionDbMysql.getConnection();
            
            Statement stmt = conn.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            
            while (rs.next()){
                //reportes.add(0, "");
               rs.getString(query);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return reportes;
    }
}
