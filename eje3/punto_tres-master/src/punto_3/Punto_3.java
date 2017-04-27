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
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Bienvenido por favor indique cuantas"
                + " salas va a programar");
        int op = tec.nextInt();
        Programacion po = new Programacion(op);
        po.doPrograming();
        System.out.println("¿Quiere conocer la lista de funciones?\n1. Si\n2. No");
        int list = tec.nextInt();
        if (list == 1)
        {
            po.listarFnciones();
        } else {
            System.out.println("Hasta luego.");
        }
        
      
        
    }
    
}
