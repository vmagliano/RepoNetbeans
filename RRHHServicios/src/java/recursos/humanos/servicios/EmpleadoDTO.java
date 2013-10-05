/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.servicios;

/**
 *
 * @author Virginia
 */
public class EmpleadoDTO {

    private String idEmpleado= null;
    private String nombre= null;
    private String apellio= null;

    public String getApellio() {
        return apellio;
    }

    public EmpleadoDTO() {
    }

    
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public EmpleadoDTO(String idEmpleado, String nombre, String apellio) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellio = apellio;

    }

    @Override
    public String toString() {
        return "" + idEmpleado + "," + nombre + "," + apellio ;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellio the apellio to set
     */
    public void setApellio(String apellio) {
        this.apellio = apellio;
    }
}
