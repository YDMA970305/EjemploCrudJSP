
package Domain.Model;

/**
 *
 * @author YESID MARTINEZ   
 */
public class Reporte {
    private String id;
    private String titulo;
    private int paginas;
    private double costo;
    private String fecha_reporte;
    /*Foreign key*/
    private String user_id;

    public Reporte() {
    }

    
    public Reporte(String id, String titulo, int paginas, double costo, String fecha_reporte, String user_id) {
        this.id = id;
        this.titulo = titulo;
        this.paginas = paginas;
        this.costo = costo;
        this.fecha_reporte = fecha_reporte;
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getCosto() {
        return costo;
    }

    public String getFecha_reporte() {
        return fecha_reporte;
    }

    public String getUser_id() {
        return user_id;
    }
    





}
