package entidad;

public class ExportCobre {
    //Atributos
    private int nroExportacion;
    private String paisDestino;
    private String nombreCliente;
    private int[] toneladasExportadas;

    public ExportCobre(int nroExportacion, String paisDestino, String nombreCliente) {
        this.nroExportacion = nroExportacion;
        this.paisDestino = paisDestino;
        this.nombreCliente = nombreCliente;
        this.toneladasExportadas = new int[12];

        for (int i = 0; i < toneladasExportadas.length; i++) {

            toneladasExportadas[i] = (int) (Math.random() * (1501 - 0) + 1);//RANDOM ENTRE 0 Y 1500
        }


    }

    public ExportCobre() {
    }

    public int getNroExportacion() {

        return nroExportacion;
    }

    public void setNroExportacion(int nroExportacion) {

        this.nroExportacion = nroExportacion;
    }

    public String getPaisDestino() {

        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {

        this.paisDestino = paisDestino;
    }

    public String getNombreCliente() {

        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {

        this.nombreCliente = nombreCliente;
    }

    public int[] getToneladasExportadas() {

        return toneladasExportadas;
    }

    public void setToneladasExportadas(int[] toneladasExportadas) {

        this.toneladasExportadas = new int[12];
    }

    public String correo() {
        String mail = "";
        String[] w = nombreCliente.split(" ");

        if (w[0].length() >= 5) {

            mail = w[0].substring(0, 5);

        } else {
            mail = w[0];
            int diferencia = 5 - w[0].length();
            for (int i = 1; i <= diferencia; i++) {

                mail = mail.concat("x");
            }

        }
        mail = mail.concat("_");

        if (w[1].length()>=4){
            mail = mail + w[1].substring(w[1].length() -4);

        }else {
            mail = mail + w[1];
            int dife = 4 - w[1].length();
            for (int i = 1; i <= dife; i++) {

                mail = mail.concat("x");

            }
        }
        mail= mail + paisDestino.substring(1,2) + "@exportcobre.cl";

        return mail.toLowerCase();
    }
    //mesMayorExportacion: devolvera el numero del mes que hubo mayor exportacion.

    public int mesMayorExportacion() {
        return 0;

    }

    // totalOtoñoInvierno
    public int totalOtonoinvierno() {
        int suma = 0;
        for (int i = 3; i < 9; i++) {
            suma = suma + toneladasExportadas[i];

        }
        return suma;
    }

    //Cantidad Exportada

    public int cantidadExportada(int mesX) {
        return toneladasExportadas[mesX - 1];


    }


}
