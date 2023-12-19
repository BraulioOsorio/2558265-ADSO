public class Producto{
    String nombre;
    double precio;

    public Producto(String nombre,double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void imprimir(){
        System.out.print(this.nombre+" -> ");
        System.out.print(this.precio+"  ");
        System.out.println("");
    }

}