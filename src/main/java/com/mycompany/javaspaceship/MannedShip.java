/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaspaceship;

/**
 *
 * @author SalsaBechamel
 */
public class MannedShip extends SpaceShip{
    
    public int passengers;
    
    public MannedShip(String shipName, String shipCountry, String fuelName, int capacity){
        super(shipName,shipCountry,fuelName);
        this.passengers = capacity;
    }
    
    
    @Override
    public void decoupling(){
        System.out.print("Decoupling Manned Ship...");
    }
    
    public void manualControl(){
        System.out.print("Manual control Activated...");
    }
    
    public void manualcoupling(){
        System.out.println("Manual coupling complete...");
    }
}
