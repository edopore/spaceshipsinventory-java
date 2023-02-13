/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaspaceship;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SalsaBechamel
 */
public class JavaSpaceShip {

    public static void main(String[] args) {
        String exit = "N";
        ArrayList<Launcher> launcherList = new ArrayList<Launcher>();
        ArrayList<UnmannedShip> unmannedList = new ArrayList<UnmannedShip>();
        ArrayList<MannedShip> mannedList = new ArrayList<MannedShip>();

        do{
        Scanner scann = new Scanner(System.in);
        System.out.print("----------MENÚ PRINCIPAL----------\n");
        System.out.print("Seleccione la opción que desea realizar:"
                + "\n1-Mostrar Naves Espaciales "
                + "\n2-Crear una nave espacial "
                + "\n3-Salir del programa"
                + "\nOpción: ");
        int option = scann.nextInt();
        switch(option){
            case 1:
                if(launcherList.isEmpty()){
                    System.out.print("Noy hay naves tipo lanzadera en el sistema, por favor agregue una\n");
                }else{
                    for(Launcher launcher:launcherList){
                        System.out.print("------------------------------------------");
                        System.out.print("Nombre de la nave: "+launcher.spaceShipName);
                        System.out.print("Pais de la nave: "+launcher.spaceShipCountry);
                        System.out.print("Tipo de combustible de la nave: "+launcher.fuelType);
                        System.out.print("Capacidad de la nave (en toneladas): "+launcher.capacity);
                        System.out.print("Altura de la nave (en metros): "+launcher.height);
                    }
                }
                if(unmannedList.isEmpty()){
                    System.out.print("Noy hay naves no tripuladas en el sistema, por favor agregue una\n");
                }else{
                    for(UnmannedShip unmanned:unmannedList){
                        System.out.print("------------------------------------------");
                        System.out.print("Nombre de la nave: "+unmanned.spaceShipName);
                        System.out.print("Pais de la nave: "+unmanned.spaceShipCountry);
                        System.out.print("Tipo de combustible de la nave: "+unmanned.fuelType);
                        System.out.print("Capacidad de la nave (en toneladas): "+unmanned.driveAutonomy);
                    }
                }
                if(mannedList.isEmpty()){
                    System.out.print("Noy hay naves tripuladas en el sistema, por favor agregue una\n");
                }else{
                    for(MannedShip manned:mannedList){
                        System.out.print("------------------------------------------");
                        System.out.print("Nombre de la nave: "+manned.spaceShipName);
                        System.out.print("Pais de la nave: "+manned.spaceShipCountry);
                        System.out.print("Tipo de combustible de la nave: "+manned.fuelType);
                        System.out.print("Cantidad en tripulantes de la nave: "+manned.passengers);
                    }
                }
                break;
            case 2:
                Scanner shipOption = new Scanner(System.in);
                System.out.print("Seleccione el tipo de nave espacial a crear:"
                        + "\n1- Lanzadera"
                        + "\n2- Nave no tripulada"
                        + "\n3- Nave Tripulada"
                        + "\nOpción: ");
                int soption = shipOption.nextInt();
                switch(soption){
                    case 1:
                        Scanner scLauncher = new Scanner(System.in);
                        System.out.print("Nombre de la nave: ");
                        String nameLauncher = scLauncher.nextLine();
                        System.out.print("Pais de la nave: ");
                        String countryLauncher = scLauncher.nextLine();
                        System.out.print("Tipo de combustsible de la nave: ");
                        String fuelLauncher = scLauncher.nextLine();
                        System.out.print("Capacidad de la nave (En Toneladas): ");
                        Integer capacityLauncher = scLauncher.nextInt();
                        System.out.print("Altura de la nave (En metros): ");
                        Integer heightLauncher = scLauncher.nextInt();
                        launcherList.add(new Launcher(nameLauncher,countryLauncher,fuelLauncher,capacityLauncher,heightLauncher));
                        System.out.print("Nave creada con exito...");
                        break;
                    case 2:
                        Scanner scUnmanned = new Scanner(System.in);
                        System.out.print("Nombre de la nave: ");
                        String nameUnmanned = scUnmanned.nextLine();
                        System.out.print("Pais de la nave: ");
                        String countryUnmanned = scUnmanned.nextLine();
                        System.out.print("Tipo de combustsible de la nave: ");
                        String fuelUnmanned = scUnmanned.nextLine();
                        System.out.print("Capacidad de la nave (En Toneladas): ");
                        Integer autonomyUnmanned = scUnmanned.nextInt();
                        unmannedList.add(new UnmannedShip(nameUnmanned,countryUnmanned,fuelUnmanned,autonomyUnmanned));
                        System.out.print("Nave creada con exito...");
                        break;
                    case 3:
                        Scanner scManned = new Scanner(System.in);
                        System.out.print("Nombre de la nave: ");
                        String nameManned = scManned.nextLine();
                        System.out.print("Pais de la nave: ");
                        String countryManned = scManned.nextLine();
                        System.out.print("Tipo de combustsible de la nave: ");
                        String fuelManned = scManned.nextLine();
                        System.out.print("Canatidad de tripulantes de la nave: ");
                        Integer passengersManned = scManned.nextInt();
                        mannedList.add(new MannedShip(nameManned,countryManned,fuelManned,passengersManned));
                        System.out.print("Nave creada con exito...");
                        break;
                    default:
                        System.out.print("Opción invalida, seleccione una opcion del menú\n");
                }
                break;
            case 3:
                Scanner scannexit = new Scanner(System.in);
                System.out.print("Desea Salir?\nN:No, Y:Yes Opción: ");
                exit = scannexit.nextLine();
                break;
            default:
                System.out.print("Opción invalida, seleccione una opcion del menú\n");
        }
        
        }
        while(exit.equals("N")||exit.equals("n"));
    }
}
