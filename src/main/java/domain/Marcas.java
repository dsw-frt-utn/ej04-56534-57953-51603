/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
/**
 *
 * @author tomas
 */
public class Marcas {
    private String nombre;
    private String pais; // País de origen

    // Constructor para inicializar los datos
    public Marcas (String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // Getters y Setters (necesarios para el punto 6)
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getPais() { 
        return pais; 
    }
    public void setPais(String pais) { 
        this.pais = pais; 
    }
}
