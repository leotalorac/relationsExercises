/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

/**
 *
 * @author Estudiante
 */
public class Moteur {
    String brand;
    int horses;
    int fuel_capacity;

    public Moteur(String brand, int horses, int fuel_capacity) {
        this.brand = brand;
        this.horses = horses;
        this.fuel_capacity = fuel_capacity;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorses() {
        return horses;
    }

    public int getFuel_capacity() {
        return fuel_capacity;
    }

    
    
    
}
