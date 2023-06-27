public class Procesos{
    Clientes arrayClientes[] = new Clientes[10];
    public Procesos(){
        Clientes cliente1 = new Clientes(0,"108800", "Oscar","Loaiza","3131" "Calle 20","Loaiza@gmail.com");
        Clientes cliente2 = new Clientes(1,"108801", "Daniel","Garcia","3132" "Calle 19","Garcia@gmail.com");
        Clientes cliente3 = new Clientes(2,"108802", "Juan","Lopez","3133" "Calle 18","Lopez@gmail.com");
        Clientes cliente4 = new Clientes(3,"108803", "Catalina","Mendez","3134" "Calle 17","Mendez@gmail.com");
        Clientes cliente5 = new Clientes(4,"108804", "Andres","Lopez","3135" "Calle 16","Lopez@gmail.com");
        arrayClientes[0] = cliente1;
        arrayClientes[1] = cliente2;
        arrayClientes[2] = cliente3;
        arrayClientes[3] = cliente4;
        arrayClientes[4] = cliente5;
        


    }
    
    public ClienteExistente clientesExistentes(String Numcedula) {    
        String nombreC = "";
        String direccionC = "";
        
        for (int i = 0; i < 10; i++) {
            if (arrayClientes[i].getNumcedula().equals(Numcedula)) {
                nombreC = arrayClientes[i].getNombreCliente();
                direccionC = arrayClientes[i].getDirrecion();
                break; 
            }
        }
        
        ClienteExistente clienteExistente = new ClienteExistente(nombreC, direccionC);
        return clienteExistente;
    }

    public String ProductosExistentes(String codigo) {    
        String resultado = "";
        
        for (int i = 0; i < 5; i++) {
            if ( arrayProductos[i].getIdProducto().equals(codigo)) {
                resultado = arrayProductos[i].getNombreP();
                break; 
            }
        }

        return resultado;
    }

    public int CalculoPrecio(String codigo){
        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            if ( arrayProductos[i].getIdProducto().equals(codigo)) {
                resultado = arrayProductos[i].getPrecio();
                break; 
            }
        }
        return resultado;
        


    }



}