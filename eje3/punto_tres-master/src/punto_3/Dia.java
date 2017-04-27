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
public class Dia 
{
 private String date;
 private String name;
 private Segmento[] segmentos; 
 Scanner tec = new Scanner(System.in);
 
 public Dia(String d, String n)
 {
     this.date = d;
     this.name = n;
 }

    public void numSegmentos(int seg, int hi, int hf)
    {
        this.segmentos = new Segmento[seg];        
        for (int i = 0; i < segmentos.length; i++) {
            this.segmentos[i] = new Segmento( (i+1)+hi + ":00", hf + ":00");            
        }
        for (int j = 0; j < segmentos.length; j++)
        {
            System.out.println("Ingrese el nombre de la funcion de las "
                    + this.segmentos[j].getInicio());
            String nm = tec.next();
            this.segmentos[j].setNombre(nm);
            this.segmentos[j].setBool(true);
        }
    }
            
    public String getDate()
    {
        return date;
    }

    public String getName() 
    {
        return name;
    }

    public Segmento[] getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(Segmento[] segmentos) {
        this.segmentos = segmentos;
    }
        
    public void setDate(String date)
    {
        this.date = date;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void listarSegmentos()
    {
        for (int i = 0; i < segmentos.length; i++)
        {
            System.out.println("La funcion " + this.segmentos[i].getNombre() 
                    + " inicia a las " + this.segmentos[i].getInicio()
            + " y finaliza a las " + this.segmentos[i].getFin());
        }        
    }
 
 }
