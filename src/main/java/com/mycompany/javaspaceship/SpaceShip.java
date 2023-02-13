/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaspaceship;

/**
 *
 * @author Eduardo Jose Maya Rodriguez
 */
public abstract class SpaceShip {
    public String spaceShipName;
    public String spaceShipCountry;
    public boolean inAction;
    public String fuelType;
    
    public SpaceShip(String shipName, String shipCountry, String fuelType){
        this.spaceShipName = shipName;
        this.spaceShipCountry = shipCountry;
        this.inAction = true;
        this.fuelType = fuelType;
    }
    
    private void startEngine(){
        System.out.print("Engine Start");
    }
    public void launch(){
        startEngine();
        System.out.print("Launching...");
    }
    public void landing(){
        System.out.print("Landing...");
    }
    public abstract void decoupling();
    
    
}
