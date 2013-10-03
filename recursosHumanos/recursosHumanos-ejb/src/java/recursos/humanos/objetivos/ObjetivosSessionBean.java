/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.objetivos;

import com.sun.swing.internal.plaf.basic.resources.basic;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Virginia
 */
@Stateless
@LocalBean
public class ObjetivosSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public ListaObjetivos objetivos(ConsultaObjetivos idEmpleado) {
        return BaseDeDatos.getObjetivos(idEmpleado.getIdEmpleado());
    }
    
   
}
