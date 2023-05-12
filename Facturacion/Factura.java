import java.util.Date;
public class Factura{
    int id;
    Date fecha;
    Vendedor vendedor;
    Clientes cliente;
    ProductoFactura productos[];
    int contadoProductos;
    public Factura(Vendedor vendedor,Clientes cliente){
        this.id++;
        this.fecha= new Date();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.productos = new ProductoFactura[99];
        this.contadoProductos=0;
    }
    public int getId(){
        return id;
    }
    public Date getFecha(){
        return fecha;
    }
    public Vendedor getVendedor(){
        return vendedor;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public ProductoFactura[] getProductos(){
        return productos;
    }
    public double getTotal(){
        double total = 0;
        for(ProductoFactura producto : productos){
            total += producto.getPrecio() * producto.getCantidad();
        return total;
    }
    public String toString(){
        return "Fecha:"+fecha+" ID FACTURA:"+id+" VENDEDOR:"+vendedor.getNombre()+" CLIENTE:"cliente.getNombre()+" TOTAL: $"+getTotal();
    } 
  
    public void imprimirDetalle(){
        System.out.println("---DETALLE FACTURA---");
        System.out.println("ID: "+this.id);
        System.out.println("FECHA: "+this.fecha.toString());
        System.out.println("VENDEDOR: "+this.vendedor.getNombre());
        System.out.println("CLIENTE: "+this.cliente.getNombre());
        System.out.println("---PRODUCTOS---");
        for(ProductoFactura pf : productos){
            System.out.println("NOMBRE:"+pf.getNombre()+" PRECIO: "+pf.getPrecio()+" CANTIDAD "+pf.getCantidad());   
        }
    }
    public void imprimir(){
        System.out.println("ID: "+this.id);
        System.out.println("FECHA: "+this.fecha.toString());
        System.out.println("VENDEDOR: "+this.vendedor.getNombre());
        System.out.println("CLIENTE: "+this.cliente.getNombre());
    }
}