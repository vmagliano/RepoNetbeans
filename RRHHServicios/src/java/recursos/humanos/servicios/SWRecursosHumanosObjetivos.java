/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Virginia
 */
@WebService(serviceName = "SWRecursosHumanosObjetivos")
public class SWRecursosHumanosObjetivos {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerObjetivos")
    public ListaObjetivos obtenerObjetivos(@WebParam(name = "idEmpleado") String idEmpleado) {
        //TODO write your implementation code here:
        return BaseDeDatos.getObjetivos(idEmpleado);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DatosEmpleado")
    public EmpleadoDTO DatosEmpleado(@WebParam(name = "idEmpleado") String idEmpleado) {
        //TODO write your implementation code here:
         return BaseDeDatos.getEmpleado(idEmpleado);
    }
}
