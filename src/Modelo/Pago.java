
package Modelo;

/**
 *
 * @author ARANAGA
 */

public class Pago {
    private String id_pago;
    private float monto_dolares;
    private int monto_bolivares;
    private String fecha_pago;
    private String descripcion;
    private int tasa_dolar;
    private int numero_casa2;
    private String id_deuda2;

    public String getId_pago(){
        return id_pago;
    }
    
    public void setId_pago(String id_pago){
        this.id_pago = id_pago;
    }
    
    public float getMonto_dolares(){
        return monto_dolares;
    }
    
    public void setMonto_dolares(float monto_dolares){
        this.monto_dolares = monto_dolares;
    }
    
    public int getMonto_bolivares(){
        return monto_bolivares;
    }
    
    public void setMonto_bolivares(int monto_bolivares){
        this.monto_bolivares = monto_bolivares;
    }
    
    public String getFecha_pago(){
        return fecha_pago;
    }
    
    public void setFecha_pago(String fecha_pago){
        this.fecha_pago = fecha_pago;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public int getTasa_dolar(){
        return tasa_dolar;
    }
    
    public void setTasa_dolar(int tasa_dolar){
        this.tasa_dolar = tasa_dolar;
    }
    
    public int getNumero_casa2(){
        return numero_casa2;
    }
    
    public void setNumero_casa2(int numero_casa2){
        this.numero_casa2 = numero_casa2;
    }
    
    public String getId_deuda2(){
        return id_deuda2;
    }
    
    public void setId_deuda2(String id_deuda2){
        this.id_deuda2 = id_deuda2;
    }
}
