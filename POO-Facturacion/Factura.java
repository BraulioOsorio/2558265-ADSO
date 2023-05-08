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

    public void Star(Personas arreglo[],Personas arregloVendedor[]){
        System.out.println("|| ---------------------  WELCOME  ------------------- ||");
        System.out.println("LISTA DE CLIENTES");
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]!= null){
                System.out.print((i+1)+"- ");
                arreglo[i].imprimir();
            }else{
                break;
            }
        }
        System.out.print("Ingrese el numero del cliente para elegirlo: ");
        int numeroCliente = this.entrada.nextInt();
        this.cliente=arreglo[numeroCliente-1];
        System.out.println("---------------------------------------------------------------");
        System.out.println("LISTA DE VENDEDORES");
        for(int i=0;i<arregloVendedor.length;i++){
            if(arregloVendedor[i]!= null){
                System.out.print((i+1)+"- ");
                arregloVendedor[i].imprimir();
            }else{
                break;
            }
        }
        System.out.print("Ingrese el numero del vendedor para elegirlo: ");
        int numeroVendedor = this.entrada.nextInt();
        this.vendedor=arregloVendedor[numeroVendedor-1];
        
        System.out.println(this.vendedor.toString()+" - "+this.cliente.toString());
    }

}