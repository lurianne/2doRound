
package vista;

import Controlador.ControlInterfaz;

public interface InterfazVista {
   
    void setControlador(ControlInterfaz c);
    void init();
    
    //////////VARIABLES SOLO PARA ABRIR VENTANAS
    static final String ABRIREGISTROSALIDA="Abrir registro salida";
    static final String ABRIREGISTROINGRESO="Abrir registro ingreso";
    static final String ABRIREGISTROPERSONAL="Abrir registro personal";
    static final String ABRIRHABILITADOSISTANCIA="Abrir habilitados instancia";
    static final String ABRIREGISTROCOMEDOR="Abrir registro comedor";
    static final String ABRIRUBICACIONCUSTODIABIENES="Abrir ubicacion custodia bienes";
    static final String ABRIRMATERIALESCONSUMIBLES="Abrir materiales consumibles";
    static final String ABRIRCOMPUTADORASMANTENIMIENTO="Abrir computadoras mantenimiento";
    static final String ABRIREGISTROVACACION="Abrir registro vacacion";
    static final String ABRIRCRONOGRAMAMANTENIMIENTO="Abrir cronograma mantenimiento";
    static final String ABRIRPRODUCTOSSINUSAR="Abrir productos sin usar";
    static final String ABRIRREGISTROSINGRESO="Abrir registro ingreso almacen";
    static final String ABRIRREGISTROSSALIDA="Abrir registro salida almacen";
    ////////////////////////////////////////////////
    
    static final String SALETRABAJADOR="Sale trabajador";
    static final String LIMPIARSALIDA="Limpiar registro salida";
    static final String ACEPTAINGRESO="Acepta registro ingreso";
    static final String CANCELAINGRESO="Acepta registro ingreso almacen";
    static final String ACEPTASALIDA="Acepta registro salida";
    static final String CANCELASALIDA="Acepta registro salida almacen";
    static final String CONSULTAEMPLEADO="Realiza consulta empleado vigente";
    static final String BUSCARDIASVACACION="Buscar dias vacacion";
    static final String OTORGARVACACION="Otorgar vacacion";
    static final String SALIRVENTANAVACACION="Salir ventana vacacion";
    static final String SOLICITACOMIDA="Solicita comida";
    static final String CANCELARCOMIDA="Cancela comida";

    
}
