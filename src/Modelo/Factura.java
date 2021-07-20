
package Modelo;

/**
 *
 * @author ARANAGA
 */

public class Factura {
    private String id_factura;
    private String descripcion;
    private float monto_dolares;
    private int monto_bolivares;
    private String fecha_emision;
    private String id_servicio3;

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public float getMonto_dolares() {
        return monto_dolares;
    }

    public void setMonto_dolares(float monto_dolares) {
        this.monto_dolares = monto_dolares;
    }

    public int getMonto_bolivares() {
        return monto_bolivares;
    }

    public void setMonto_bolivares(int monto_bolivares) {
        this.monto_bolivares = monto_bolivares;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getId_servicio3() {
        return id_servicio3;
    }

    public void setId_servicio3(String servicio3) {
        this.id_servicio3 = servicio3;
    }
}
