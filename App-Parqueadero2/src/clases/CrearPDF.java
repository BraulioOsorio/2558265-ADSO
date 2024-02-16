package clases;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import com.itextpdf.text.Image;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class CrearPDF {

    public static void generarPDF(String contenido, String nombreArchivo, String ubicacion) {
        Document documento = new Document();

        try {
            // Especifica la ubicación y el nombre del archivo PDF que deseas crear
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));

            // Abre el documento para comenzar a escribir en él
            documento.open();

            // Agrega el contenido proporcionado al documento
            Paragraph parrafo = new Paragraph(contenido);
            parrafo.setAlignment(Element.ALIGN_CENTER);
            //parrafo.setSpacingBefore(50); // Establece el margen superior en 20 unidades
            documento.add(parrafo);

            // Agrega una imagen al PDF
            // Agrega una imagen al PDF, ajusta el tamaño y la posición
            Image imagen = Image.getInstance("src/imagenes/parqueadero-logo.png");
            imagen.scaleToFit(50, 50); // Ajusta el tamaño de la imagen (ancho x alto)
            imagen.setAbsolutePosition((documento.getPageSize().getWidth() - imagen.getScaledWidth()) / 2, documento.getPageSize().getTop() - 100);

            documento.add(imagen);
            // Cierra el documento
            documento.close();

            System.out.println("El archivo PDF se ha creado correctamente." + nombreArchivo);

            // Abre el archivo PDF automáticamente
            File archivoPDF = new File(ubicacion);
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(archivoPDF);
            } else {
                System.out.println("No se pudo abrir el archivo PDF automáticamente.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    int min = 1; // Valor mínimo (inclusive)
//    int max = 10000; // Valor máximo (inclusive)
//    Genera un número aleatorio en el rango del 1 al 10,000
//    int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
//    String numRamdon = Integer.toString(numeroAleatorio);
//    String contenido = "\n\n\n\n TICKET INGRESO \n "+horaIngreso+"\n "+propietario+" \n "+placaCarro.toUpperCase()+" \n "+tipoCarro+" \n "+vendedor+"";
//    CrearPDF.generarPDF(contenido,""+numRamdon+id_p+placaCarro+".pdf",""+numRamdon+id_p+placaCarro+".pdf");
}
