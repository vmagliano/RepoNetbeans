/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.objetivos;

import java.util.List;

/**
 *
 * @author Virginia
 */
public class Puesto {
    private String nombre;
    private String descripcion;
    private List<Objetivo> objetivosDisponibles;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the objetivosDisponibles
     */
    public List<Objetivo> getObjetivosDisponibles() {
        return objetivosDisponibles;
    }

    /**
     * @param objetivosDisponibles the objetivosDisponibles to set
     */
    public void setObjetivosDisponibles(List<Objetivo> objetivosDisponibles) {
        this.objetivosDisponibles = objetivosDisponibles;
    }

    public Puesto(String nombre, String descripcion, List<Objetivo> objetivosDisponibles) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.objetivosDisponibles = objetivosDisponibles;
    }

    public Puesto() {
    }

    @Override
    public String toString() {
        return "Puesto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", objetivosDisponibles=" + objetivosDisponibles + '}';
    }
    
    
}
