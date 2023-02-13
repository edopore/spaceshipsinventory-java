/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaspaceship;

/**
 *
 * @author SalsaBechamel
 */
public class UnmannedShip extends SpaceShip {
    
    public int driveAutonomy;
    
    public UnmannedShip(String shipName, String shipCountry, String fuelName, int autonomy){
        super(shipName,shipCountry,fuelName);
        this.driveAutonomy = autonomy;
    }

    public void takeprobe(){
        System.out.print("Taking probe...");
    }
    
    public void sendPicture(){
        System.out.print("Taking and sending probe to station on earth...");
    }
    
    @Override
    public void decoupling(){
        System.out.print("Decoupling Unmanned Ship...");
    }
    
    
    
    
    
}
