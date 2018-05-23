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
public class UberBlack extends VehiculoPremium{
    private int ocupantes;
    public UberBlack(String matricula, int tasaInicial, Categoria categoria,int ocupantes) {
        super(matricula, tasaInicial, categoria);
        this.ocupantes= ocupantes;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    
    
    
}
