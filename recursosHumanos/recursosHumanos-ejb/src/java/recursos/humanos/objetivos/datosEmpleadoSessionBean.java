/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.objetivos;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Virginia
 */
@Stateless
@LocalBean
public class datosEmpleadoSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     public EmpleadoDTO datosEmpleado(ConsultaObjetivos idEmpleado){
       return BaseDeDatos.getEmpleado(idEmpleado.getIdEmpleado());
    }
}
