
package Controlador;

import Modelo.Balance;
import Modelo.BalanceSQL;
import Modelo.Pago;
import Modelo.PagoSQL;
import Modelo.FacturaBalanceSQL;
import Controlador.Fecha;
import java.time.LocalDateTime;

/**
 *
 * @author ARANAGA
 */
public class RegistroBalance {
    
    Balance modeloBalance = new Balance();
    Pago modeloPago = new Pago();
    BalanceSQL modeloBalanceSQL = new BalanceSQL();
    PagoSQL modeloPagoSQL = new PagoSQL();
    FacturaBalanceSQL modeloFacturaSQL = new FacturaBalanceSQL();
    Fecha fecha = new Fecha();
    String fechaI = " ", fechaL = " ";
    
    //Seccion de Ingresos
    public void registrarIngresos(){
        LocalDateTime Fecha = LocalDateTime.now();
        
        //Ingresos por Deuda Morosa, Deuda Actual y Total de Ingresos en $ - Bs
        
        //Obtener Fecha Inicial y Limite del mes
        
        fechaI = fecha.obtenerFecha(1);
        fechaL = fecha.obtenerFecha(2);
        
        
        modeloBalance.setAño(Fecha.getYear());
        modeloBalance.setMes(Fecha.getMonthValue());
        
        //Sumatoria de Pagos hechos en mes actual, por deudas cargadas en el mes
        //o antes
        modeloPagoSQL.deudaMorosaD(modeloBalance, fechaI, fechaL);
        modeloPagoSQL.deudaMorosaBs(modeloBalance, fechaI, fechaL);
        modeloPagoSQL.deudaActualD(modeloBalance, fechaI, fechaL);
        modeloPagoSQL.deudaActualBs(modeloBalance, fechaI, fechaL);
        
        //Resultado de Suma
        modeloBalance.setTotal_ingresos_dolares(modeloBalance.getDeuda_morosa_dolares()+
                modeloBalance.getDeuda_actual_dolares());
        modeloBalance.setTotal_ingresos_bolivares(modeloBalance.getDeuda_morosa_bolivares()+
                modeloBalance.getDeuda_actual_bolivares());
        
        registrarEgresos();
    }
    
    //Seccion de Egresos
    public void registrarEgresos(){
        //Egresos por Aseo, Vigilancia Externa e Interna, 3 Cuotas Especiales 
        //y Total Egresos en $ y Bs
        
        //Sumatoria de Facturas hechas en mes actual
        modeloFacturaSQL.sumatoriaAseoD(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaAseoB(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaVED(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaVEB(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaVID(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaVIB(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaCE1D(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaCE1B(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaCE2D(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaCE2B(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaCE3D(modeloBalance, fechaI, fechaL);
        modeloFacturaSQL.sumatoriaCE3B(modeloBalance, fechaI, fechaL);
        
        //Resultado de Suma
        //Dolares
        modeloBalance.setTotal_egresos_dolares(
                modeloBalance.getAseo_dolares()+
                modeloBalance.getVigilancia_externa_dolares()+
                modeloBalance.getVigilancia_interna_dolares()+
                modeloBalance.getCuota_especial1_dolares()+
                modeloBalance.getCuota_especial2_dolares()+
                modeloBalance.getCuota_especial3_dolares());
        //Bolivares
        modeloBalance.setTotal_egresos_bolivares(
                modeloBalance.getAseo_bolivares()+
                modeloBalance.getVigilancia_externa_bolivares()+
                modeloBalance.getVigilancia_interna_bolivares()+
                modeloBalance.getCuota_especial1_bolivares()+
                modeloBalance.getCuota_especial2_bolivares()+
                modeloBalance.getCuota_especial3_bolivares());
        
        registrarSaldo();
    }
    
    //Seccion de Saldo
    public void registrarSaldo(){
        //Saldo en $ y Bs
        modeloBalance.setSaldo_dolares(
                modeloBalance.getTotal_ingresos_dolares() - modeloBalance.getTotal_egresos_dolares());
        
        modeloBalance.setSaldo_bolivares(
                modeloBalance.getTotal_ingresos_bolivares() - modeloBalance.getTotal_egresos_bolivares());
        
        //Actualizar Balance General
        modeloBalanceSQL.modificar(modeloBalance);
    }
}
