/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaspaceship;

/**
 *
 * @author SalsaBechamel
 */
public class Launcher extends SpaceShip{
    public int capacity;
    public int height;
    
    public Launcher(String shipName, String shipCountry, String fuelName, int capacity, int height){
        super(shipName,shipCountry,fuelName);
        this.capacity = capacity;
        this.height = height;   
    }
    
    @Override
    public void decoupling(){
        System.out.print("Decoupling Launcher...");
    }
    
    public void download(){
        System.out.print("Downloading");
    }

    public void returnToEarth(){
        System.out.print("Returning to earth...");
    }
}
