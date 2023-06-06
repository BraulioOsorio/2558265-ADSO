public class Clientes {
    String cedula;
    String nombre;
    String direccion;

    public Clientes(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNumcedula() {
        return cedula;
    }

    public String getNombreCliente(){
        return nombre;
    }

    public String getDirrecion(){
        return direccion;
    }
}
