
package Controlador;

import java.time.LocalDateTime;

/**
 *
 * @author ARANAGA
 */
public class Fecha {
   
   public String proximoCierreBalance(){
       LocalDateTime Fecha = LocalDateTime.now();

       //Obtencion de Fecha/Hora actual
       int año = Fecha.getYear();
       int mes = Fecha.getMonthValue();
       
       if(mes < 12){ mes += 1;}
       else{ mes = 1;}
  
       String fecha = convertiraString(año,mes,01);
       
       return fecha;
   } 
   
   public String obtenerFechaActual(){
       
       LocalDateTime Fecha = LocalDateTime.now();

       //Obtencion de Fecha/Hora actual
       int año = Fecha.getYear();
       int mes = Fecha.getMonthValue();
       int dia = Fecha.getDayOfMonth();
       
       String fecha = convertiraString(año,mes,dia);
       
       return fecha;
   }
   
   public String obtenerFecha(int eleccion){
       
       LocalDateTime Fecha = LocalDateTime.now();
       String fecha = " ";
       //Obtencion de Fecha/Hora actual
       int año = Fecha.getYear();
       int mes = Fecha.getMonthValue();
       int dia = diasMeses(mes);
       
       if(eleccion == 1){
           fecha = convertiraString(año,mes,01);
       }
       if(eleccion == 2){
           fecha = convertiraString(año,mes,dia);
       }
       return fecha;
   }
   
    public String nombreMes(int mes){
         String nombreMes = " ";

         switch(mes){
             case 1:nombreMes = "Enero"; break;
             case 2:nombreMes = "Febrero"; break;
             case 3:nombreMes = "Marzo"; break;
             case 4:nombreMes = "Abril"; break;
             case 5:nombreMes = "Mayo";break;
             case 6:nombreMes = "Junio"; break;
             case 7:nombreMes = "Julio"; break;
             case 8:nombreMes = "Agosto"; break;
             case 9:nombreMes = "Septiembre"; break;
             case 10:nombreMes = "Octubre"; break;
             case 11:nombreMes = "Noviembre"; break;
             case 12:nombreMes = "Diciembre"; break;
         }
         return nombreMes;
    }
    
    public int diasMeses(int retornomes){
        int cantidadias=0, retornobisiesto = 0; boolean bisiesto;

        switch(retornomes){
            case 1:cantidadias = 31; break;
            case 2:bisiesto = determinarbisiesto(retornobisiesto);
                   if(bisiesto==true){cantidadias = 29;}
                   else{cantidadias = 28;} break;
            case 3:cantidadias = 31; break;
            case 4:cantidadias = 30; break;
            case 5:cantidadias = 31; break;
            case 6:cantidadias = 30; break;
            case 7:cantidadias = 31; break;
            case 8:cantidadias = 31; break;
            case 9:cantidadias = 30; break;
            case 10:cantidadias = 31; break;
            case 11:cantidadias = 30; break;
            case 12:cantidadias = 31; break;
        }
        return cantidadias;
   }
    
    private boolean determinarbisiesto(int retornobisiesto){
        boolean bisiesto=false;

        if(retornobisiesto%4==0){
          if(retornobisiesto%100==0){
            if(retornobisiesto%400==0){
               bisiesto = true;
            }
          }
          if(retornobisiesto%100!=0){
            bisiesto = true;
          }
        }
        return bisiesto;
   }
    
    private String convertiraString(int año, int mes, int dia){
       String añoS = String.valueOf(año);
       String mesS = String.valueOf(mes);
       String diaS = String.valueOf(dia);
       
       String fecha = añoS+"-"+mesS+"-"+diaS;
       
       return fecha; 
    }
}
