
package Modelo;

/**
 *
 * @author ARANAGA
 */
public class Servicio {
    private String id_servicio;
    private String nombre_servicio;
    private String rif_proveedor;
    private String nombre_proveedor;
    private String apellido_proveedor;
    private String nombre_empresa;

    public String getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(String id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getRif_proveedor() {
        return rif_proveedor;
    }

    public void setRif_proveedor(String rif_proveedor) {
        this.rif_proveedor = rif_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getApellido_proveedor() {
        return apellido_proveedor;
    }

    public void setApellido_proveedor(String apellido_proveedor) {
        this.apellido_proveedor = apellido_proveedor;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
}
