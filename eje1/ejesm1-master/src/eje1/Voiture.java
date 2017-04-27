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
public class Voiture {
    String color;
    String plate;
    
    Roue[] _roues;
    Chassis  _chassis;
    Moteur _moteur;

    public Voiture(String color, String plate,Moteur m) {
        this.color = color;
        this.plate = plate;
        this._roues = new Roue[4];
        this._chassis = new Chassis(color);
        this._moteur = m;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }

    public Chassis getChassis() {
        return _chassis;
    }

    public Moteur getMoteur() {
        return _moteur;
    }

    public Roue[] getRoues() {
        return _roues;
    }
    
    

    
    
    
}
