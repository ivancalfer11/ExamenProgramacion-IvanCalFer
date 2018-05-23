/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogramacion.ivancalfer;

import java.util.ArrayList;
import examenprogramacion.ivancalfer.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Uber {

    public static ArrayList<Vehiculo> cochesDisponibles;

    public Uber() {
        cochesDisponibles = new ArrayList<Vehiculo>();
        cochesDisponibles.add(new UberXL("8777CJH", 6, Categoria.ELECTRICO));
        cochesDisponibles.add(new UberX("9767CFH", 4, Categoria.NO_ELECTRICO));
        cochesDisponibles.add(new UberBlack("1234HGY", 5, Categoria.LUJO, 6));
        cochesDisponibles.add(new UberSUV("768JTY", 6, Categoria.SUPERLUJO, 9));
    }

    public static void main(String[] args) {
        new Uber();

        System.out.println("Bienvenido a Uber");
        System.out.println("Elija la accion de las siguientes que desea realizar");
        Scanner sc = new Scanner(System.in);
        System.out.println("Si desea dar de alta un vehiculo pulse, 1");
        System.out.println("Si desea cambiar el estado de un vehiculo, pulse 2");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                Scanner cs2= new Scanner(System.in);
                String matr = cs2.nextLine();
                altaCoche(matr);
        }

        
    }

    public static void altaCoche(String matricula) {
        try {
            Vehiculo nuevoVehiculo = new Vehiculo(matricula, 4);
            cochesDisponibles.add(nuevoVehiculo);
        } catch (Exception e) {
            System.out.println("Algo ha ido mal");
        }

    }

    public static void cambiarEstado(String matricula) {

        for (Vehiculo coche : cochesDisponibles) {
            if (matricula == coche.getMatricula()) {
                cochesDisponibles.remove(coche);
                System.out.println("Se ha dado de baja su vehiculo");
            } else {
                altaCoche(matricula);
                System.out.println("Se ha dado de alta su vehiculo");

            }
        }

    }

    public static Vehiculo devolverCoche(String matricula) {
        Vehiculo cocheADevolver = null;
        for (Vehiculo coche : cochesDisponibles) {
            if (matricula == coche.getMatricula()) {
                cocheADevolver = coche;
            } else {
                System.out.println("Error");
            }

        }

        return cocheADevolver;
    }

    public static void calcularViaje(int numPasajeros, int km) {

    }

}
