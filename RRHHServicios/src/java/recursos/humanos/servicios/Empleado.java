/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.servicios;

/**
 *
 * @author Virginia
 */
class Empleado {
    private String idEmpleado;
    private String nombre;
    private String apellio;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String nombre, String apellio, Puesto puesto) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellio = apellio;
        this.puesto = puesto;
    }

    

    public String getApellio() {
        return apellio;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellio=" + apellio + ", puesto=" + puesto + '}';
    }

    
    
    
}
