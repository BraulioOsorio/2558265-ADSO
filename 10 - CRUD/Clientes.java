public class Clientes {
    String cedula;
    String nombre;
    String apellidos;
    String telefono;
    String direccion;
    String email;

    public Clientes(String cedula, String nombre,String apellidos,String telefono, String direccion,String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono=telefono;
        this.direccion = direccion;
        this.email=email;
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
    public String getApellido() {
        return apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
}
