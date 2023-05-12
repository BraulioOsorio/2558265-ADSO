import java.util.Date;
public class Factura{
    int contadorFactura;
    Date fecha;
    Vendedor vendedor;
    Clientes cliente;
    Producto productos[];
    int contadoProductos;
    public Factura(Vendedor vendedor,Clientes cliente){
        this.contadorFactura++;
        this.fecha= new Date();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.productos = new Producto[99];
        this.contadoProductos=0;
    }
    public void agregarPro(Producto producto,int cantidad){
        this.contadoProductos++;
        producto.setCantidad(cantidad);
        this.productos[contadoProductos]=producto;
    }
    public double getTotal(){
        double total = 0;
        for(Producto producto : productos){
            total = total + producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    public int getcontadorFactura(){
        return this.contadorFactura;
    }

    public Date getFecha(){
        return this.fecha;
    }
    public void detalleFactura(){
        System.out.println("---DETALLE FACTURA---");
        System.out.println("ID: "+this.contadorFactura);
        System.out.println("FECHA: "+this.fecha.toString());
        System.out.println("VENDEDOR: "+this.vendedor.getNombre());
        System.out.println("CLIENTE: "+this.cliente.getNombre());
        System.out.println("---PRODUCTOS---");
        for(Producto producto : productos){
            System.out.println(producto.getNombre()+" PRECIO: "+producto.getPrecio()+" CANTIDAD "+producto.getCantidad());   
        }
    }
    public void imprimir(){
        System.out.println("ID: "+this.contadorFactura);
        System.out.println("FECHA: "+this.fecha.toString());
        System.out.println("VENDEDOR: "+this.vendedor.getNombre());
        System.out.println("CLIENTE: "+this.cliente.getNombre());
    }
}