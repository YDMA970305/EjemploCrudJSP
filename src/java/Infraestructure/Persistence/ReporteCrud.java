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

    public List<Reporte> getAllReportes() {
        List<Reporte> reportes = new ArrayList<>();
        String query = "SELECT * FROM reporte";
        try {
            Connection conn = ConnectionDbMysql.getConnection();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                reportes.add(
                        new Reporte(rs.getString("id"),
                                rs.getString("titulo"),
                                rs.getInt("paginas"),
                                rs.getDouble("costo"),
                                rs.getString("fecha_reporte"),
                                rs.getString("user_id")));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return reportes;
    }
}
