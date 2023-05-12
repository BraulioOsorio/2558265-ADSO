public class Producto{
    String nombre;
    double precio;
    int cantidad;
    int cantidadproductos;

    public Producto(String nombre,double Precio){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadproductos=cantidadproductos;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public int getCantidadProductos(){
        return this.cantidadproductos++;
    }
}