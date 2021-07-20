
package Modelo;

/**
 *
 * @author ARANAGA
 */
public class Deuda {
   private String id_deuda;
   private String fecha_carga;
   private String descripcion;
   private float monto_dolares;
   private int monto_bolivares;
   private int tasa_dolar;
   private String id_servicio2;

    public String getId_deuda() {
        return id_deuda;
    }

    public void setId_deuda(String id_deuda) {
        this.id_deuda = id_deuda;
    }

    public String getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(String fecha_carga) {
        this.fecha_carga = fecha_carga;
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
    
    public int getTasa_dolar(){
        return tasa_dolar;
    }
    
    public void setTasa_dolar(int tasa_dolar){
        this.tasa_dolar = tasa_dolar;
    }
    
    public String getId_servicio2() {
        return id_servicio2;
    }

    public void setId_servicio2(String id_servicio2) {
        this.id_servicio2 = id_servicio2;
    }
}
