public class Productos{

    double[] precios;
    String[] nombres;

}
public Productos(){
    precios = new double[10];
    nombres = new String[10];
    
}

public void llenarPrecio(float[] precios) {
    for (int i = 0; i < precios.length; i++) {
        precios[i] = precios[i];
    }
}
public void llenarNombres(String[] nombreLlenar) {
    for (int i = 0; i < nombreLlenar.length; i++) {
        nombres[i] = nombreLlenar[i];
    }
}
public void facturar(){
    System.out.print("aja");
}