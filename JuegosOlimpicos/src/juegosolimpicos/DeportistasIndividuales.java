/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosolimpicos;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class DeportistasIndividuales extends Participante{
    private String especialidad;
    
    public DeportistasIndividuales(){
        super();
        this.especialidad="";
    }
    
    public DeportistasIndividuales(String especialidad, String nombre, String pais, int edad, int numeroDeIdentificacionOlimpico, int numeroTotalDeMedallasObtenidas){
        super(nombre, pais, edad, numeroDeIdentificacionOlimpico, numeroTotalDeMedallasObtenidas);
        this.especialidad = especialidad;
        
    }
    
    public DeportistasIndividuales(DeportistasIndividuales c){
        super(c);
        this.especialidad= c.especialidad;
    }
    
    
    
    
}
