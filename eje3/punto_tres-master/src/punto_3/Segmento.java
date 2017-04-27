/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_3;

/**
 *
 * @author JAVIER
 */
public class Segmento 
{
    private String inicio;
    private String fin;
    private String nombre;
    private boolean bool = false;
    
    public Segmento(String i, String f)
    {
        this.inicio = i;
        this.fin = f;        
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
        
}
