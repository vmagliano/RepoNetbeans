/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.servicios;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import recursos.humanos.objetivos.ConsultaObjetivos;
import recursos.humanos.objetivos.ListaObjetivos;
import recursos.humanos.objetivos.ObjetivosSessionBean;

/**
 *
 * @author Virginia
 */
@WebService(serviceName = "SWRecursosHumanosObjetivos")
public class SWRecursosHumanosObjetivos {
    @EJB
    private ObjetivosSessionBean ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "objetivos")
    public ListaObjetivos objetivos(@WebParam(name = "idEmpleado") ConsultaObjetivos idEmpleado) {
        return ejbRef.objetivos(idEmpleado);
    }
    
}
