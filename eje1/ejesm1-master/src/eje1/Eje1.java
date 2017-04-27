/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese su nombre");
        String n = sc.next();
        System.out.println("Ingrese su telefono");
        int t = sc.nextInt();
        Personne p = new Personne(n,t);
        
        System.out.println("Cuantos carros quiere adicionar");
        int in = sc.nextInt();
        for (int i = 0; i < in; i++) {
            System.out.println("ingrese color;");
            String c = sc.next();
            System.out.println("ingrese placa;");
            String plac = sc.next();
            System.out.println("ingrese la marca del motor;");
            String m = sc.next();
            System.out.println("ingrese los caballos de fuerza del motor;");
            int h = sc.nextInt();
            System.out.println("ingrese la capacidad en centimetros cubicos;");
            int fc = sc.nextInt();
            Moteur mo = new Moteur(m,h,fc);
            Voiture v = new Voiture(c,plac,mo);
            p.Addpersonne(v);
        }
        System.out.println("Quiere listar?  \n 1: si  \n 2: no");
        int o = sc.nextInt();
        switch(o){
            case 1:
                p.Listar();
                break;
            case 2:
                System.out.println("Gracias por usar nuestro software");
                break;
            default:
                System.out.println("Gracias por usar nuestro software");
                break;
        }
        
        
         
    }
    
}
