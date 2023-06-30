public class ItemsFactura{

    Producto producto;
    int cantidad;
    double subTotal;


    public ItemsFactura(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = cantidad * producto.getPrecio();
    }

    public double getSubtotal(){
        return subTotal;
    }

    public Producto getProducto(){
        return producto;
    }

    public int getCantidad(){
        return cantidad;
    }

}