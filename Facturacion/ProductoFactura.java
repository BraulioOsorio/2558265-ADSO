public class ProductoFactura{
    Producto producto;
    int cantidad;
    double Subtotal;
    public ProductoFactura(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
        this.Subtotal = cantidad* producto.getPrecio();
    }
    public Producto getProducto(){
        return producto;
    }
    public void setProducto(Producto producto){
        this.producto=producto;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantiadad){
        this.cantidad = cantidad;
    }
    public double getSubtotal(){
        return Subtotal;
    }
}