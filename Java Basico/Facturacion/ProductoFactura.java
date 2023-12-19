public class ProductoFactura{
    Producto producto;
    int cantidad;
    int numProductos;
    public ProductoFactura(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
        int numProductos=0;
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
    public int getNumproductos(){
        return numProductos;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public double getSubtotal(){
        this.numProductos++;
        return producto.getPrecio()*cantidad;
    }
    public void imprimir(){
        System.out.print(producto.getNombre()+" -> ");
        System.out.print(this.cantidad);
        System.out.print(":$"+getSubtotal());
        System.out.println("");
    }
}