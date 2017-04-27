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
public class Programacion 
{
    private Sala[] salas;
    Scanner tec = new Scanner(System.in);
    
    public Programacion(int s)
    {
        this.salas = new Sala[s];
    } 
    
    public void doPrograming()
    {
        for (int i = 0; i < salas.length; i++)
        {
            this.salas[i] = new Sala(i+1);
            System.out.println("Cuantas semanas de trabajo tiene cada sala");
            int ss = tec.nextInt();
            this.salas[i].SemanasdeSala(ss);
        }
    }
    
    public void listarFnciones()
    {
        for (int i = 0; i < salas.length; i++)
        {
            System.out.print("Para la sala " + (i+1) + " y ");
            this.salas[i].listarSemana();
        }
    }
}
