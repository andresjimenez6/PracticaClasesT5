/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;

/**
 *
 * @author EAG
 */
public class Medalla {
    private int contador;
    private TipoMedalla tipoMedalla;
    
    public Medalla(){
        this.contador = 0;
    }
    public Medalla( int contador, TipoMedalla tipoMedalla){
        this.contador = contador;
        this.tipoMedalla = tipoMedalla;
    }
    public Medalla(Medalla copia){
        this.contador = copia.contador;
        this.tipoMedalla = copia.tipoMedalla;
    }

    public int getContador() {
        return contador;
    }

    public TipoMedalla getTipoMedalla() {
        return tipoMedalla;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setTipoMedalla(TipoMedalla tipoMedalla) {
        this.tipoMedalla = tipoMedalla;
    }
    
    
}
