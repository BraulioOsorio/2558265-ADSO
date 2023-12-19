import java.util.*;

public class Factura{

    Date fecha;
    int id;
    Persona vendedor;
    Persona cliente;
    int cantidadP;
    ItemsFactura[] items;    
    double total;


    public Factura(Persona cliente, Persona vendedor){
        this.fecha = new Date();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.cantidadP = 0;
        this.items = new ItemsFactura[99];
        this.total = 0;
    }

    public Date getFecha() {
        return fecha;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public Persona getCliente() {
        return cliente;
    }
    
    public int getId(){
        return id;
    }

    public ItemsFactura[] getItems(){
        return items;
    }

    public double getTotal(){
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void agregarProductoComprado(ItemsFactura items){
        this.items[cantidadP] = items;
        cantidadP++;
        total += items.getSubtotal();
    }
}