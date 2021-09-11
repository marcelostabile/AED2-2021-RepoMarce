package appGCI;

import java.util.ArrayList;

import com.graphbuilder.struc.LinkedList;

import archivos.ManejadorArchivosExcel;

public class SeguridadGCI {
    
    static LinkedList listaUsuarios = new LinkedList();
    static LinkedList listaPermisos = new LinkedList();


    /**
     * main de seguridad GCI.
     */
    public static void armarReportePermisos() {

        ArrayList<String[]> arrUsuarios = ManejadorArchivosExcel.leerArchivoExcel("CltaGCI_1_Usuarios.xlsx");
        ArrayList<String[]> arrTareas =ManejadorArchivosExcel.leerArchivoExcel("CltaGCI_2_Tareas.xlsx");
        ArrayList<String[]> arrTransacciones =ManejadorArchivosExcel.leerArchivoExcel("CltaGCI_3_Transacciones.xlsx");
        ArrayList<String[]> arrFranjas =ManejadorArchivosExcel.leerArchivoExcel("CltaGCI_4_Franjas.xlsx");

        System.out.println("Usuarios: " + arrUsuarios.size());
        System.out.println("Tareas: " + arrTareas.size());
        System.out.println("Transacciones: " + arrTransacciones.size());
        System.out.println("Franjas: " + arrFranjas.size());

        // Crear usuarios.
        for (String[] reg : arrUsuarios) {
            Usuario usuario = new Usuario(reg[0], reg[1]);
            listaUsuarios.addToTail(usuario);
        }
        System.out.println("Lista Usuarios: " + listaUsuarios.size());

        for (String[] reg : arrTareas) {
            Permiso tarea = new Permiso(reg[0], reg[1], reg[2], reg[4]);
            listaPermisos.addToTail(tarea);
        }
        System.out.println("Lista Permisos: " + listaPermisos.size());

        for (String[] reg : arrTransacciones) {
            Permiso transaccion = new Permiso(reg[0], reg[1], reg[2], reg[4]);
            listaPermisos.addToTail(transaccion);
        }
        System.out.println("Lista Permisos: " + listaPermisos.size());
        
    }

}
