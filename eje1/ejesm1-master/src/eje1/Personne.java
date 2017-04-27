/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Personne {
    String name;
    int tel;
    ArrayList<Voiture>  voitures = new ArrayList<>();

    public Personne(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public void Addpersonne(Voiture v){
        voitures.add(v);
    }
    
    public void Listar(){
        System.out.println("Nombre de la persona" + name);
        System.out.println("Tel: " + tel);
        for (int i = 0; i < voitures.size(); i++) {
            System.out.println("Placa: " + voitures.get(i).getPlate());
            System.out.println("Color: " + voitures.get(i).getColor());
            System.out.println("chasis de color: " + voitures.get(i).getChassis().getColor());
            System.out.println("motor marca: " + voitures.get(i).getMoteur().getBrand());
            System.out.println("motor caballos de fuerza: " + voitures.get(i).getMoteur().getHorses());
            System.out.println("motor capacidad de combustible: " + voitures.get(i).getMoteur().getFuel_capacity());
            System.out.println("Numero de ruedas" + voitures.get(i).getRoues().length);
        }
    }
    
     
     
     
}

