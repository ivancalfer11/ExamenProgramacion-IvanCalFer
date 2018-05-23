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
public class VehiculoEconomico extends Vehiculo{
    protected int tasaInicial;
    protected Categoria categoria;

    public VehiculoEconomico(String matricula, int numPasajeros, Categoria categoria) {
        super(matricula,numPasajeros);
        if(this.categoria == Categoria.LUJO){
            this.tasaInicial = 15;
        }
        if(this.categoria==Categoria.SUPERLUJO){
            this.tasaInicial= 30;
        }
    }

    public int getTasaInicial() {
        return tasaInicial;
    }

    public void setTasaInicial(int tasaInicial) {
        this.tasaInicial = tasaInicial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
   
    
}
