
package Modelo;

/**
 *
 * @author ARANAGA
 */
public class DeudaE {
    //DECLARACION DE VARIABLES RESPECTIVAS A LOS ATRIBUTOS DE LA BASE DE DATOS
   
    private String id_deudae;
    private String fecha_carga;
    private String descripcion;
    private float monto_dolares;
    private int monto_bolivares;
    private float deuda_restante_dolares;
    private int deuda_restante_bolivares;
    private String estado;
    private String id_deuda2;
    private int numero_casa3;
    
    //DECLARACION DE METODOS GETTERS Y SETTERS
    
    public String getId_deudae() {
        return id_deudae;
    }

    public void setId_deudae(String id_deudae) {
        this.id_deudae = id_deudae;
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
  
    public float getDeuda_restante_dolares(){
        return deuda_restante_dolares;
    }
    
    public void setDeuda_restante_dolares(float deuda_restante_dolares){
        this.deuda_restante_dolares = deuda_restante_dolares;
    }
    
    public int getDeuda_restante_bolivares(){
        return deuda_restante_bolivares;
    }
    
    public void setDeuda_restante_bolivares(int deuda_restante_bolivares){
        this.deuda_restante_bolivares = deuda_restante_bolivares;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getId_deuda2() {
        return id_deuda2;
    }

    public void setId_deuda2(String id_deuda2) {
        this.id_deuda2 = id_deuda2;
    }

    public int getNumero_casa3() {
        return numero_casa3;
    }

    public void setNumero_casa3(int numero_casa3) {
        this.numero_casa3 = numero_casa3;
    }
}
