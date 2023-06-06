public class Vendedores {
    String cedula;
    String nombre;

    public Vendedores(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNumcedula() {
        return cedula;
    }

    public String getNombreVendedor(){
        return nombre;
    }
}