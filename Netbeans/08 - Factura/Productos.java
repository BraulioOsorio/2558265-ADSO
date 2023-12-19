public class Productos {
    String idProducto;
    String nombre;
    int precio;

    public Productos(String idProducto, String nombre,int precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombreP(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
}