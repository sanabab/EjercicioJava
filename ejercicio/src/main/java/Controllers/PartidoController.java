/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Partido;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PartidoController {
    ArrayList<Partido> listaPartidos = new ArrayList<>();
    
    
    public ArrayList<Partido> obtenerInformacionPartidos(){
        
        return listaPartidos;
    } 
    
    public void agregarInformacionPartidos(Partido partido){
        listaPartidos.add(partido);
    }
    
    public int obtenerCantidadPartidosJugados(){
        int cantidadPartidos = 0;
        
        for (Partido partido : listaPartidos) {
            cantidadPartidos++;
        } 
        
        return cantidadPartidos;
    }
    
    //agregar validación de fecha
    public boolean modificarPartido(Partido partido){
        for(Partido listaPartido : listaPartidos){
            if(partido.getIdPartido() == listaPartido.getIdPartido()){
                listaPartido = partido;
                break;
            }
        }
        return true;
    }
    
    public ArrayList<Partido> obtenerInformacionPartidosConRoja(){
        ArrayList<Partido> listaPartdidosConroja = new ArrayList<>();
        
           for(Partido partido : listaPartidos) {
               if(partido.getTarjetasRojas() > 0)
                   listaPartdidosConroja.add(partido);
           }
           
           return listaPartdidosConroja;
    }
    
    public double calcularPromedioGoles(){
        int golesPartido = 0;
        double promedioGoles = 0;
        for(Partido partido : listaPartidos){
            golesPartido = partido.getGolesLocal()+ partido.getGolesVisitante();
            promedioGoles += golesPartido;
        }
        
        if(promedioGoles > 0)
            promedioGoles = promedioGoles / listaPartidos.size();
        
        return promedioGoles;
    }
    
    public String obtenerEquipoGanador(Partido partido){
        String ganador = "Empate";
        if((partido.getGolesLocal() > partido.getGolesVisitante() && partido.getEsLocal() == 1) 
        || partido.getGolesLocal() < partido.getGolesVisitante() && partido.getEsLocal() == 2){
            ganador = partido.getNombreEquipo();
        }
        
        if((partido.getGolesLocal() < partido.getGolesVisitante() && partido.getEsLocal() == 1) 
        || partido.getGolesLocal() > partido.getGolesVisitante() && partido.getEsLocal() == 2){
            ganador = partido.getNombreRival();
        }
        
        return ganador;
    }
    
    public double obtenerPorcentajeGanadosColombia(){
        double porcentaje = 0;
        for(Partido partido : listaPartidos){
            if((partido.getGolesLocal() > partido.getGolesVisitante() && partido.getEsLocal() == 1) 
            || (partido.getGolesLocal() < partido.getGolesVisitante() && partido.getEsLocal() == 2)){
                porcentaje++;
            }
        }
        
        if(porcentaje > 0){
            porcentaje = porcentaje * 100 / listaPartidos.size();
        }
        
        return porcentaje;
    }
    
    /*public ArrayList<Partido> ordenarPorGolesColombia(){
        ArrayList<Partido> listaOrdenada = new ArrayList<>();
        return 
    }*/
    
}




