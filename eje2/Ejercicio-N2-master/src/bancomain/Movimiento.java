/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomain;

import java.util.Scanner;

/**
 *
 * @author Bryan M
 */
public class Movimiento {
    Scanner sc = new Scanner(System.in);
    private Date date;
    private double Sprecedente;
    private double cantidad;     
    private Tipo tipo;
    public static String sl = System.getProperty("line.separator");
   
    public Movimiento(Date d,double Sp, double c,Tipo t){
        
        this.date = d;
        this.Sprecedente = Sp;
        this.cantidad = c;
        this.tipo = t;     
    }
  
    public void Consignar(double d){
        cantidad = cantidad + d;
        System.out.println("La cantidad en su cuenta es: " + cantidad);
    }
    public void retirar(double r){
        cantidad = cantidad - r;
        System.out.println("La cantidad en su cuenta es: " + cantidad);
    }
    public void PagarCompra(double cp){
        cantidad = cantidad - cp;
        System.out.println("La cantidad en su cuenta es: " + cantidad);
    }
    public void RTransferencia(String name,double su){
        cantidad = cantidad + su;
        System.out.println(" Se ha recibido "+ su +" Por parte de "+ name +" la cantidad de su cuenta es :"+ cantidad);
    }

    public Date getDate() {
        return date;
    }

   

    public double getSprecedente() {
        return Sprecedente;
    }

   

    public double getCantidad() {
        return cantidad;
    }

 

    public Tipo getTipo() {
        return tipo;
    }

   
     public String Show(){
        
         return( "Fecha: " + date.print() + sl + "Saldo precedente: " + Sprecedente +  sl + "Cantidad: " + cantidad + sl +" Tipo: " + tipo.imprimir());
         
    }
    
}
