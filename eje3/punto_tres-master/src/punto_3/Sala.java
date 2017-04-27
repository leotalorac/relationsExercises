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
public class Sala 
{
    private Semana[] semanas;
    private int numSala;
    Scanner tec = new Scanner(System.in);
    
    public Sala(int ns)
    {
        this.numSala = ns;        
    }
    
    public void SemanasdeSala(int s)
    {
        this.semanas = new Semana[s];
        System.out.println("Ingrese el numero de dias que trabaja la sala"
                + " a la semana.");
        int dw = tec.nextInt();
        if (dw < 8)
        {
        for (int i = 0; i < semanas.length; i++) {
            this.semanas[i] = new Semana((i+1), dw);
            System.out.println("Semana "+ this.semanas[i].getNumero()+"\n  \n");
            this.semanas[i].Dias();
        }            
        } else {
            System.out.println("ERROR!\nLa semana tiene 7 dias.");
        }
    }

    public Semana[] getSemanas() {
        return semanas;
    }

    public int getNumSala() {
        return numSala;
    }

    public Scanner getTec() {
        return tec;
    }

    public void setSemanas(Semana[] semanas) {
        this.semanas = semanas;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public void setTec(Scanner tec) {
        this.tec = tec;
    }

    public void listarSemana()
    {
        for (int i = 0; i < semanas.length; i++)
        {
            System.out.println("para la semana " + semanas[i].getNumero() + ":" );
            this.semanas[i].listarDias();
        }
    }
    
}
