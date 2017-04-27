/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bryan M
 */
public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private int Ncuenta;
    private double saldoC;
    private Date Dcreation;
    private String name;
    private Movimiento movimientos;
    
    public Cuenta(int nc,double sc,Date dc,String name, Movimiento m){
        this.Ncuenta=nc;
        this.saldoC=sc;
        this.Dcreation  =dc;
        this.name= name;
        this.movimientos = m;
    }
     
        
    

    public int getNcuenta() {
        return Ncuenta;
    }

    

    public double getSaldoC() {
        return saldoC;
    }

   
    public Date getDcreation() {
        
        return Dcreation;
    }

   

    public String getName() {
        return name;
    }

    public Movimiento getMovs() {
        return movimientos;
    }

   
    
   /*  public Cuenta(){
                System.out.println("Numero de la cuenta");
                this.Ncuenta = sc.nextInt();
                System.out.println("Saldo de la cuenta");
                this.saldoC = sc.nextDouble();
                System.out.println("Fecha de la creacion de la cuenta (dd mm aa)");
                this.Dcreation = new Date (); 
                System.out.println("Nombre del propietario de la cuenta");
                this.name = sc.next(); 
     }*/ 
    
}
