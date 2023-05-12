public class ProductoFactura{
    Producto producto;
    int cantidad;
    public ProductoFactura(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
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
    public double Subtotal(){
        return producto.getPrecio()*cantidad;
    }
    public void imprimir(){
        System.out.print(producto.getNombre()+" -> ");
        System.out.print(this.cantidad);
        System.out.print(":$"+Subtotal());
        System.out.println("");
    }
}