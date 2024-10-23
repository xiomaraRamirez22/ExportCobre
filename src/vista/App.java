package vista;

import entidad.ExportCobre;

public class App {
    public static void main(String[] args) {
        ExportCobre exportacion = new ExportCobre(123, "Nicaragua", "Ana Paz Lopez");

        System.out.println("Datos de exportacion");
        System.out.println("Nombre cliente: " + exportacion.getNroExportacion());
        System.out.println("Nro exportacion: " + exportacion.getNroExportacion());
        System.out.println("Pais destino: " + exportacion.getPaisDestino());

        for (int i = 0; i < exportacion.getToneladasExportadas().length; i++) {
            System.out.println("toneladas exportadas mes: " + (i + 1) + ",total: " +
                    exportacion.getToneladasExportadas()[i]);

        }
        System.out.println("El total exportado en junio es: " + exportacion.cantidadExportada(6));

        System.out.println("Total Otono Invierno: " + exportacion.totalOtonoinvierno());

        System.out.println("Correo electronico cliente: "+exportacion.correo());

        System.out.println("El mes con mayor exportacion fue el mes nro.: "+exportacion.mesMayorExportacion());


    }
}
