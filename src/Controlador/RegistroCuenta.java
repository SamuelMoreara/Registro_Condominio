
package Controlador;

import Modelo.Pago;
import Modelo.PagoSQL;
import Modelo.DeudaE;
import Modelo.DeudaESQL;
import Modelo.Cuenta;
import Modelo.CuentaSQL;
import java.time.LocalDateTime;


/**
 *
 * @author ARANAGA
 */
public class RegistroCuenta {
    
    Cuenta modeloCuenta = new Cuenta();
    Pago modeloPago = new Pago();
    DeudaE modeloDeudaEs = new DeudaE();
    PagoSQL modeloPagoSQL = new PagoSQL();
    DeudaESQL modeloDeudaESQL = new DeudaESQL();
    CuentaSQL modeloCuentaSQL = new CuentaSQL();
    
    
    public void actualizarCuenta(Pago pagox, DeudaE deudaE, int casa){
        Fecha fecha = new Fecha();
        
        modeloDeudaEs = deudaE;
        
        String fechaI = "", fechaL = "";
        
        fechaI = fecha.obtenerFecha(1);
        fechaL = fecha.obtenerFecha(2);
        
        if(modeloDeudaESQL.consultarDeudaAcumuladaD(modeloDeudaEs, fechaI, fechaL)){
            modeloCuenta.setDeuda_dolares(modeloDeudaEs.getMonto_dolares());
        }
        else{
            modeloCuenta.setDeuda_dolares(0);
        }
        
        if(modeloDeudaESQL.consultarDeudaAcumuladaBs(modeloDeudaEs, fechaI, fechaL)){
            modeloCuenta.setDeuda_bolivares(modeloDeudaEs.getMonto_bolivares());
        }
        else{
            modeloCuenta.setDeuda_bolivares(0);
        }
        
        if(modeloPagoSQL.consultarPagoGeneralD(pagox, fechaI, fechaL)){
            modeloCuenta.setPago_dolares(pagox.getMonto_dolares());
        }
        else{
            modeloCuenta.setPago_dolares(0);
        }
        
        if(modeloPagoSQL.consultarPagoGeneralBs(pagox, fechaI, fechaL)){
            modeloCuenta.setPago_bolivares(pagox.getMonto_bolivares());
        }
        else{
            modeloCuenta.setPago_bolivares(0);
        }    
        
        modeloCuenta.setNumero_casa4(casa);
        obtenerFecha();
        
        if(modeloCuentaSQL.modificar(modeloCuenta)){
            System.out.println("Casa "+casa+": Actualizacion de cuenta completa");
        }
        else{
            System.out.println("Casa "+casa+": Actualizacion de cuenta erronea");
        }
    }
    
    private void obtenerFecha(){
        LocalDateTime fecha = LocalDateTime.now();
        
        modeloCuenta.setAño2(fecha.getYear());
        modeloCuenta.setMes2(fecha.getMonthValue());
    }
}
