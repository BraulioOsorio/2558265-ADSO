import java.util.Scanner;
public class Factura{
    int numeroFactura;
    String fecha;
    Personas cliente;
    Personas vendedor;
    Productos listaProductos[];
    double total;
    Scanner entrada;

    public Factura(){
        this.entrada = new Scanner(System.in);
        this.numeroFactura=numeroFactura;
        this.cliente=cliente;
        this.vendedor=vendedor;
        this.total=total;
        this.listaProductos = new Productos[200];
        this.fecha=fecha;
    }

    public void Star(){
        System.out.println("|| ---------------------  WELCOME  ------------------- ||");
        System.out.print("Ingrese la cedula del Cliente: ");
        int cedula = this.entrada.nextInt();
        
    }

}