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
import recursos.humanos.objetivos.EmpleadoDTO;
import recursos.humanos.objetivos.datosEmpleadoSessionBean;

/**
 *
 * @author Virginia
 */
@WebService(serviceName = "SWRHDatosEmpleado")
public class SWRHDatosEmpleado {
    @EJB
    private datosEmpleadoSessionBean ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "datosEmpleado")
    public EmpleadoDTO datosEmpleado(@WebParam(name = "idEmpleado") ConsultaObjetivos idEmpleado) {
        return ejbRef.datosEmpleado(idEmpleado);
    }
    
}
