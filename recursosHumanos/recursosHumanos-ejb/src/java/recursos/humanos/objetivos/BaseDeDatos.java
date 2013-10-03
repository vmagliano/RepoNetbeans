/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.humanos.objetivos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Virginia
 */
public class BaseDeDatos {

    private static final Map<String, Empleado> empleados = new TreeMap<String, Empleado>();

    static {
        Objetivo horasExtra = new Objetivo("Horas extras", 
                            "Numero de horas extras realizadas", 
                            TipoMedicion.NUMERO.toString());
        Objetivo lineasDuplicadas = new Objetivo("Lineas duplicadas", 
                            "Lineas de codigo duplicadas. ", 
                            TipoMedicion.NUMERO.toString());
        Objetivo lineasDeCodigo = new Objetivo("Lineas de codigo",
                            "Lineas de codigo introducidas. ", 
                            TipoMedicion.NUMERO.toString());
        Objetivo tareasEnTyF = new Objetivo("Tareas en tiempo y forma", 
                            "Porcentaje de tareas completadas en tiempo y forma. ", 
                            TipoMedicion.PORCENTAJE.toString());
        Objetivo cobertura = new Objetivo("Cobertura de tests",
                            "Porcentaje de cobertura de lineas de codigo agregado por los tests desarrollados. ",
                            TipoMedicion.PORCENTAJE.toString());
        Objetivo cantidadTests = new Objetivo("Cantidad de tests", 
                            "Cantidad de tests escritos. ", 
                            TipoMedicion.NUMERO.toString());
        
        Puesto desarrollador = new Puesto("Desarrollador", 
                "Desarrollador web. ", 
                Arrays.asList(new Objetivo[]{
                    horasExtra, 
                    lineasDuplicadas, 
                    lineasDeCodigo, 
                    tareasEnTyF
                }));
        Puesto tester = new Puesto("QA", 
                "Aseguramiento de calidad a través de tests de unidad y de integración. ", 
                Arrays.asList(new Objetivo[]{
                    horasExtra,
                    tareasEnTyF,
                    cobertura,
                    cantidadTests
                }));

        empleados.put("111", new Empleado("111", "Pepe", "Argento", desarrollador));
        empleados.put("222", new Empleado("222", "Moni", "Argento", tester));
        empleados.put("333", new Empleado("333", "Coqui", "Argento", desarrollador));
        empleados.put("444", new Empleado("444", "Paola", "Argento", tester));

    }

    public static EmpleadoDTO getEmpleado(String idEmpleado) {
        Empleado e = empleados.get(idEmpleado);
        return new EmpleadoDTO(e.getIdEmpleado(), e.getNombre(), e.getApellio());
    }

    public static ListaObjetivos getObjetivos(String idEmpleado) {
        ListaObjetivos lo= new ListaObjetivos();
        List<Objetivo> lista= empleados.get(idEmpleado).getPuesto().getObjetivosDisponibles();
        lo.setLista(lista.toArray(new Objetivo[0]));
        return lo;
    }
}
