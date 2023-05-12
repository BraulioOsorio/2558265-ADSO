import java.util.Date;
public class Factura{
    int contadorFactura=0;
    int id;
    Date fecha;
    Vendedor vendedor;
    Clientes cliente;
    ProductoFactura productos[];
    int numProductos;
    Producto producto;
    public Factura(int id,Vendedor vendedor,Clientes cliente){
        this.id=id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.fecha= new Date();
        this.productos = new ProductoFactura[99];
        this.numProductos=0;
        this.id=++contadorFactura;
        this.producto=producto;
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
    public Clientes getCliente(){
        return cliente;
    }
    public ProductoFactura[] getProductos(){
        return productos;
    }
    public double getTotal(){
        double total = 0;
        for(int i=0;i<numProductos;i++){
            total+=productos[i].getCantidad()*producto.getPrecio();
        }
        return total;
    }
    public void agregarProducto(Producto producto,int cantidad){
        if(numProductos<productos.length){
            productos[numProductos]=new ProductoFactura(producto,cantidad);
            numProductos++;
        }else{
            System.out.println("No se pueden agregar mas productos");
        }
    }
    public String toString(){
        return "Fecha:"+fecha+" ID FACTURA:"+id+" VENDEDOR:"+vendedor.getNombre()+" CLIENTE:"+cliente.getNombre()+" TOTAL: $"+getTotal();
    } 
    public static void listaFacturas(Factura[] facturas){
        for(Factura f : facturas){
            System.out.println(f.toString());
        }
    }
}
