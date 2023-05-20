/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Usuario
 */
public class EquipoRival {
    private String nombreRival;
    private String colorCamisetaRival;


    public EquipoRival(String nombreRival, String colorCamisetaRival) {
        this.nombreRival = nombreRival;
        this.colorCamisetaRival = colorCamisetaRival;
    }

    public String getNombreRival() {
        return nombreRival;
    }

    public void setNombreRival(String nombreRival) {
        this.nombreRival = nombreRival;
    }

    public String getColorCamisetaRival() {
        return colorCamisetaRival;
    }

    public void setColorCamisetaRival(String colorCamisetaRival) {
        this.colorCamisetaRival = colorCamisetaRival;
    }
    
    
}
