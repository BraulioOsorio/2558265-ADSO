public class Producto{

    //atributos
    int id_producto;
    String nombreProducto;
    float precio;

    public Producto(int id_producto,String nombreProducto, float precio) {
        this.id_producto = id_producto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public int getId_producto(){
        return id_producto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public float getPrecio(){
        return precio;
    }

    

}                   