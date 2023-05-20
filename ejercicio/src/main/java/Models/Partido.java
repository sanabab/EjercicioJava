/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Partido extends EquipoRival {
    private int idPartido;
    private final String nombreEquipoLocal = "Colombia";
    private short golesLocal;
    private short golesVisitante;
    private short golesTotales;
    private LocalDate fechaPartido;
    private String lugarPartido;
    private short tarjetasRojasCol;
    private short tarjetasAmarillasCol;
    private short esLocal;

    public Partido(int idPartido, short golesLocal, short golesVisitante, short golesTotales, LocalDate fechaPartido, String lugarPartido, short tarjetasRojas, short tarjetasAmarillas, short esLocal, String nombreRival, String colorCamisetaRival) {
        super(nombreRival, colorCamisetaRival);
        this.idPartido = idPartido;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.golesTotales = golesTotales;
        this.fechaPartido = fechaPartido;
        this.lugarPartido = lugarPartido;
        this.tarjetasRojasCol = tarjetasRojas;
        this.tarjetasAmarillasCol = tarjetasAmarillas;
        this.esLocal = esLocal;
    }
    
   
    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public short getEsLocal() {
        return esLocal;
    }

    public void setEsLocal(short esLocal) {
        this.esLocal = esLocal;
    }

    public String getNombreEquipo() {
        return nombreEquipoLocal;
    }

    public short getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(short golesLocal) {
        this.golesLocal = golesLocal;
    }

    public short getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(short golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getLugarPartido() {
        return lugarPartido;
    }

    public void setLugarPartido(String lugarPartido) {
        this.lugarPartido = lugarPartido;
    }

    public short getTarjetasRojas() {
        return tarjetasRojasCol;
    }

    public void setTarjetasRojas(short tarjetasRojas) {
        this.tarjetasRojasCol = tarjetasRojas;
    }

    public short getTarjetasAmarillas() {
        return tarjetasAmarillasCol;
    }

    public void setTarjetasAmarillas(short tarjetasAmarillas) {
        this.tarjetasAmarillasCol = tarjetasAmarillas;
    }
        
    public short getGolesTotales() {
        return golesTotales;
    }

    public void setGolesTotales(short golesTotales) {
        this.golesTotales = golesTotales;
    }
}
