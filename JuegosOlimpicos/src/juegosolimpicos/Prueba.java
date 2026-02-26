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
public class Prueba {
    private String nombre;
    private String fechaDeCelebracion;
    private Participante[] listaDeParticipantes;
    private Participante[] resultados;
    private Medalla medallasAsignadas;
    
    public Prueba(){
        this.nombre = "";
        this.fechaDeCelebracion="";
        this.listaDeParticipantes = new Participante[0];
    }
    public Prueba( Participante[] resultados, Medalla medallasAsignadas, String nombre, String fechaDeCelebracion, Participante[] listaDeParticipantes){
        this.nombre = nombre;
        this.listaDeParticipantes= listaDeParticipantes;
        this.fechaDeCelebracion = fechaDeCelebracion;
        this.resultados = resultados;
        this.medallasAsignadas = medallasAsignadas;
    }
    public Prueba(Prueba copia){
        this.nombre = copia.nombre;
        this.fechaDeCelebracion = copia.fechaDeCelebracion;
        this.listaDeParticipantes = copia.listaDeParticipantes;
        this.resultados = copia.resultados;
        this.medallasAsignadas = copia.medallasAsignadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeCelebracion() {
        return fechaDeCelebracion;
    }

    public Participante[] getListaDeParticipantes() {
        return listaDeParticipantes;
    }

    public Participante[] getresultados() {
        return resultados;
    }

    public Medalla getMedallasAsignadas() {
        return medallasAsignadas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCelebracion(String fechaDeCelebracion) {
        this.fechaDeCelebracion = fechaDeCelebracion;
    }

    public void setListaDeParticipantes(Participante[] listaDeParticipantes) {
        this.listaDeParticipantes = listaDeParticipantes;
    }

    public void setresultados(Participante[] resultados) {
        this.resultados = resultados;
    }

    public void setMedallasAsignadas(Medalla medallasAsignadas) {
        this.medallasAsignadas = medallasAsignadas;
    }
    
    
    public void registrarParticipante(Participante p) {
        for(int i = 0; i < this.listaDeParticipantes.length; i++) {
            if(this.listaDeParticipantes[i] == null) {
                this.listaDeParticipantes[i] = p;
                break;
            }
        }
        
    }
    
    
    
    public String mostrarClasificacionFinal() {
        String imprimir =  "Resultados: ";
            for(int i = 0; i < this.resultados.length; i++) {
                if(this.resultados[i] != null) {
                    imprimir += "\n - " + this.resultados[i].toString();
                }
            }
        return imprimir;
    }
    
    //toString

    @Override
    public String toString() {
        return "Prueba{" + "nombre=" + nombre + ", fechaDeCelebracion=" + fechaDeCelebracion + ", listaDeParticipantes=" + listaDeParticipantes + ", resultados=" + resultados + ", medallasAsignadas=" + medallasAsignadas + '}';
    }
   
    
}
