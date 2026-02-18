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
public class Deporte {
    private String nombre;
    private Tipo tipo;
    private int numeroMaximoDeparticipantesPorPrueba;
    private Prueba[] conjuntoDePruebasAsociadas;
    
    protected Deporte(){
        this.nombre ="";
        this.numeroMaximoDeparticipantesPorPrueba = 0;
        this.conjuntoDePruebasAsociadas = new Prueba[0];  
    }
    
    protected Deporte(String nombre, int numMax,Tipo tipo, Prueba[] con ){
        this.nombre = nombre;
        this.tipo= tipo;
        this.numeroMaximoDeparticipantesPorPrueba = numMax;
        this.conjuntoDePruebasAsociadas = con;
    }
    
    protected Deporte(Deporte deporteACopiar){
        this.nombre = deporteACopiar.nombre;
        this.tipo = deporteACopiar.tipo;
        this.numeroMaximoDeparticipantesPorPrueba = deporteACopiar.numeroMaximoDeparticipantesPorPrueba;
        this.conjuntoDePruebasAsociadas = deporteACopiar.conjuntoDePruebasAsociadas;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNumeroMaximoDeparticipantesPorPrueba() {
        return numeroMaximoDeparticipantesPorPrueba;
    }

    public Prueba[] getConjuntoDePruebasAsociadas() {
        return conjuntoDePruebasAsociadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setNumeroMaximoDeparticipantesPorPrueba(int numeroMaximoDeparticipantesPorPrueba) {
        this.numeroMaximoDeparticipantesPorPrueba = numeroMaximoDeparticipantesPorPrueba;
    }

    public void setConjuntoDePruebasAsociadas(Prueba[] conjuntoDePruebasAsociadas) {
        this.conjuntoDePruebasAsociadas = conjuntoDePruebasAsociadas;
    }
    
    
}
