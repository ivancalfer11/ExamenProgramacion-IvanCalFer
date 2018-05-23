/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogramacion.ivancalfer;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Uber {

    public static Vehiculo[] cochesDisponibles =new Vehiculo[50];

    public static void main(String[] args) {
        System.out.println("Bienvenido a Uber");
        altaCoche("8777CJH");
    }

    public static void altaCoche(String matricula) {
        try {
            Vehiculo nuevoVehiculo = new Vehiculo(matricula);
            cochesDisponibles[0]= nuevoVehiculo;
        } catch (Exception e) {
            System.out.println("Algo ha ido mal");
        }

    }

    public static void cambiarEstado(String matricula) {
        try{
        for (int x = 0; x < cochesDisponibles.length; x++) {
            if(matricula==cochesDisponibles[x].getMatricula()){
                cochesDisponibles[0]= null;
            }
            else{
                altaCoche(matricula);
            }
        }
        }catch(Exception e){
            System.out.println("Algo ha ido mal");
        }
    }

}
