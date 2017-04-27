
package bancomain;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoMain {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el codigo del banco");
      String c = sc.next();
      Banco banco = new Banco(c);
       
      boolean ejec = true;
        while(ejec) {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Listar Cuentas y Movimientos ");
            System.out.println("3. Salir");
           
            
            int o = sc.nextInt();
            switch (o) {
                
                case 1:
             
                System.out.println("Codigo de la transaccion");
                String cd = sc.next();
                System.out.println("Numero de la cuenta");
                int Ncuenta = sc.nextInt();
                System.out.println("Saldo de la cuenta");
                double saldoC = sc.nextDouble();
                System.out.println("Fecha de la creacion de la cuenta (dd mm aa)");
                Date Dcreation = new Date (); 
                System.out.println("Nombre del propietario de la cuenta");
                String name = sc.next(); 
               
               
                    
                System.out.println("Que tipo de transaccion desea hacer: ");
                System.out.println("5. Debito");
                System.out.println("6. Credito");
                
                int tt = sc.nextInt();
                String A1;
                String A2;
                if ( tt == 5){
                    
                    System.out.println("Para hacer un movimiento rellene los datos");
                    System.out.println("Fecha actual (dd mm aa)");
                    Date dateM = new Date ();
                    System.out.println("Saldo precedente ");
                    double saldo = sc.nextDouble();
                    System.out.println("Cantidad");
                    double cantidad = sc.nextDouble();
                    System.out.println("Que tipo de movimiento desea hacer");
                    System.out.println("1. Pagar servicios");
                    System.out.println("2. Retirar dinero");
                    int tm = sc.nextInt();
                    if( tm == 1){
                        A1 = Integer.toString(tt);
                        A1 = "Debito";
                        A2 = Integer.toString(tm);
                        A2 = "Pagó Servicios";
                        Tipo tipo = new Tipo(cd,A1,A2);
                        banco.Agregartipos(tipo);
                        Movimiento mov = new Movimiento(dateM,saldo,cantidad,tipo);
                        banco.AgregarMov(mov);
                        Cuenta cuenta = new Cuenta(Ncuenta,saldoC,Dcreation,name,mov);
                        banco.Agregarcuenta(cuenta);
                        mov.PagarCompra(cantidad);
                    }
                    else if ( tm ==2){
                        A1 = Integer.toString(tt);
                        A1 = "Debito";
                        A2 = Integer.toString(tm);
                        A2 = "Retiró dinero";
                        Tipo tipo = new Tipo(cd,A1,A2);
                        banco.Agregartipos(tipo);
                        Movimiento mov = new Movimiento(dateM,saldo,cantidad,tipo);
                        banco.AgregarMov(mov);
                        Cuenta cuenta = new Cuenta(Ncuenta,saldoC,Dcreation,name,mov);
                        banco.Agregarcuenta(cuenta);
                        mov.retirar(cantidad);
                    }
                }
                
                    else if (tt == 6){
                    
                    System.out.println("Para hacer un movimiento rellene los datos");
                    System.out.println("Fecha actual (dd mm aa)");
                    Date dateM2 = new Date (); 
                    System.out.println("Saldo precedente ");
                    double saldo2 = sc.nextDouble();
                    System.out.println("Cantidad");
                    double cantidad2 = sc.nextDouble();
                    System.out.println("Que tipo de movimiento desea hacer");
                    System.out.println("1. Consignar dinero");
                    System.out.println("2. Recibir Transferencia");
                    int tm2 = sc.nextInt();
                    if( tm2 == 1){
                        A1 = Integer.toString(tt);
                        A1 = "Credito";
                        A2 = Integer.toString(tm2);
                        A2 = "Consignó Dinero";
                        Tipo tipo2 = new Tipo(cd,A1,A2);
                        banco.Agregartipos(tipo2);
                        Movimiento mov2 = new Movimiento(dateM2,saldo2,cantidad2,tipo2);
                        banco.AgregarMov(mov2);
                         Cuenta cuenta = new Cuenta(Ncuenta,saldoC,Dcreation,name,mov2);
                        banco.Agregarcuenta(cuenta);
                        mov2.Consignar(cantidad2);
                    }
                    else if ( tm2 ==2){
                        A1 = Integer.toString(tt);
                        A1 = "Credito";
                        A2 = Integer.toString(tm2);
                        A2 = "Recibio Transferencia";
                        Tipo tipo2 = new Tipo(cd,A1,A2);
                        banco.Agregartipos(tipo2);
                        Movimiento mov2 = new Movimiento(dateM2,saldo2,cantidad2,tipo2);
                        banco.AgregarMov(mov2);
                         Cuenta cuenta = new Cuenta(Ncuenta,saldoC,Dcreation,name,mov2);
                        banco.Agregarcuenta(cuenta);
                        System.out.println("De parte de quien es la transferencia");
                        String name2 = sc.next();
                        mov2.RTransferencia(name2, cantidad2);
                    }
                    }
                    
                    
                break;
                
                case 2: 
                     ArrayList<Cuenta> cuentas = banco.ListarCuenta();
                     
                     for(int i=0; i<cuentas.size();i++){
                         Cuenta k = cuentas.get(i);
                          
                          
                           
                     
                     System.out.println(".....................Cuenta N" + (i+1)+".....................");
                  System.out.println("Nombre propietario "+k.getName());                 
                  System.out.println("N Cuenta " +k.getNcuenta());
                  System.out.println("Saldo Cuenta "+k.getSaldoC());
                  System.out.println("Fecha creacion "+k.getDcreation().print());
                  System.out.println("....................Movimientos..........................................");
                  System.out.println(k.getMovs().Show());
                  System.out.println("......................................................................"); 
                
                  }
                     
                    break;
                
                        
                case 3:
                System.out.println("....................Saliendo.......................");
                ejec = false;
                break;
            }
        }
      }

   }   
      

    

