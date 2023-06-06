public class Productos {
    String idProducto;
    String nombre;

    public Productos(String idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombreP(){
        return nombre;
    }
}