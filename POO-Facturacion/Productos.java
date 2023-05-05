public class Productos{

    double[] precios;
    String[] nombres;

    public Productos(){
        this.precios = new double[7]; 
        this.nombres = new String[7]; 
    }
    public void PrecioProductos(){
        this.precios[0] = 24.580;
        this.precios[1] = 4.230;
        this.precios[2] = 1.500;
        this.precios[3] = 13.456;
        this.precios[4] = 8.000;
        this.precios[5] = 2.000;
        this.precios[6] = 4.653;
    }

    public void NombreProducto(){
        this.nombres [0] = "Aceite";
        this.nombres [1] = "1 libra de Arroz";
        this.nombres [2] = "Media Libra de queso";
        this.nombres [3] = "Leche en polvo";
        this.nombres [4] = "Zanahoria";
        this.nombres [5] = "Carbe";
        this.nombres [6] = "Bocadillo";
    }
}

