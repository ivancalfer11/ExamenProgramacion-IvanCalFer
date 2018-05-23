/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogramacion.ivancalfer;

/**
 *
 * @author Alumno
 */
public class Vehiculo {
    protected String matricula;
    protected int numPasajeros;

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public Vehiculo(String matricula,int numeroPasajeros) {
        this.matricula = matricula;
        this.numPasajeros= numPasajeros;
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   

    

    

    
    
}
