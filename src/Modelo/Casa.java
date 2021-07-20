package Modelo;

/**
 *
 * @author ARANAGA
 */

public class Casa {
    private int numero_casa;
    private String estado_pago;
    private String cedula_propietario;
    private String nombre;
    private String apellido;
    private String telefono;
    private float fondo_dolares;
    private int fondo_bolivares;
    private String nombre_condominio3;

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int casa) {
        this.numero_casa = casa;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getCedula_propietario() {
        return cedula_propietario;
    }

    public void setCedula_propietario(String cedula_propietario) {
        this.cedula_propietario = cedula_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getFondo_dolares() {
        return fondo_dolares;
    }

    public void setFondo_dolares(float fondo_dolares) {
        this.fondo_dolares = fondo_dolares;
    }

    public int getFondo_bolivares() {
        return fondo_bolivares;
    }

    public void setFondo_bolivares(int fondo_bolivares) {
        this.fondo_bolivares = fondo_bolivares;
    }

    public String getNombre_condominio3() {
        return nombre_condominio3;
    }

    public void setNombre_condominio3(String nombre_condominio3) {
        this.nombre_condominio3 = nombre_condominio3;
    }
}
