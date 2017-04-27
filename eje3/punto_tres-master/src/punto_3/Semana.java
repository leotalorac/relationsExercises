/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_3;
import java.util.*;
/**
 *
 * @author JAVIER
 */
public class Semana
{
 private int numero;
 private ArrayList<Segmento> s;
 private Dia[] DaysOFWork;
 Scanner tec = new Scanner(System.in);
 int w;
         
 public Semana (int n, int nd)
 {
     this.numero = n;
     this.DaysOFWork = new Dia[nd];
 }
 
 public void Dias()
 {
     for (int i = 0; i < DaysOFWork.length; i++) 
     {
         System.out.println("Ingrese el nombre del dia que trabaja la sala "
         + "seguido de la fecha");
         String name = tec.next();
         String date = tec.next();
         this.DaysOFWork[i]= new Dia(name, date);        
     }
     System.out.println("En formato 24h\nIngrese la hora de inicio de las "
                + "actividades en la sala.");
     int hi = tec.nextInt();
     System.out.println("Ingrese la hora de finalizacion de las actividades "
                + "de la sala.");
     int hf = tec.nextInt();
     if (hf < 24)
     {
     System.out.println("Ingrese el numero de funciones de la sala "
        + "teniendo en cuenta que esta se reserva para dos horas.");
     int seg = tec.nextInt();
     if (seg ==((hf-hi)/2))
     {
     for (Dia DaysOFWork1 : DaysOFWork)
     {
         DaysOFWork1.numSegmentos(seg, hi, hf);
     }
     } else {
         System.out.println("Por favor ingrese en formatos de dos horaa.");
     }
     } else {
         System.out.println("Ingrese el tiempo en un formato valido.");
     }
     w = ((hi-hf)/2);
 }
  
 public void listarDias()
 {
     for (int i = 0; i < DaysOFWork.length; i++)
     {
         System.out.print("En el dia " + this.DaysOFWork[i].getName() + " "
         + this.DaysOFWork[i].getDate() + " estan disponibles las seguientes"
                 + " funciones ");
         this.DaysOFWork[i].listarSegmentos();
     }
 }

    public int getNumero() {
        return numero;
    }
 
}
