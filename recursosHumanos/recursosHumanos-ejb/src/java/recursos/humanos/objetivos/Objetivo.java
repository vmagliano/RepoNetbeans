/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.objetivos;

/**
 *
 * @author Virginia
 */
public class Objetivo {
    private String nombre = null;
    private String descripcion = null;
    private String tipoMedicion = null;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipoMedicion() {
        return tipoMedicion;
    }

    public Objetivo() {
    }

    
    
    public Objetivo(String nombre, String descripcion, String tipoMedicion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoMedicion = tipoMedicion;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param tipoMedicion the tipoMedicion to set
     */
    public void setTipoMedicion(String tipoMedicion) {
        this.tipoMedicion = tipoMedicion;
    }
    
    
}
