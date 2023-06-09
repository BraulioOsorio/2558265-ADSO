public class Procesos{
    Clientes arrayClientes[] = new Clientes[10];
    Productos arrayProductos[] = new Productos[5];
    public Procesos(){
        Clientes cliente1 = new Clientes("108800", "Oscar Loaiza", "Calle 20");
        Clientes cliente2 = new Clientes("108801", "Daniel Garcia", "Calle 19");
        Clientes cliente3 = new Clientes("108802", "Juan Lopez", "Calle 18");
        Clientes cliente4 = new Clientes("108803", "Catalina Mendez", "Calle 17");
        Clientes cliente5 = new Clientes("108804", "Andres Lopez", "Calle 16");
        Clientes clientes6 = new Clientes("109900", "Juan Castillo", "calle 1");
        Clientes clientes7 = new Clientes("109901", "Ana Segura", "calle 10");
        Clientes clientes8 = new Clientes("109902", "Julian Perez", "calle 11");
        Clientes clientes9 = new Clientes("109903", "Carolina Tobon", "calle 12");
        Clientes clientes10 = new Clientes("109904", "Carlos Perez", "calle 13");
        arrayClientes[0] = cliente1;
        arrayClientes[1] = cliente2;
        arrayClientes[2] = cliente3;
        arrayClientes[3] = cliente4;
        arrayClientes[4] = cliente5;
        arrayClientes[5] = clientes6;
        arrayClientes[6] = clientes7;
        arrayClientes[7] = clientes8;
        arrayClientes[8] = clientes9;
        arrayClientes[9] = clientes10;

        Productos Productos1 = new Productos("1010", "Leche",1500);
        Productos Productos2 = new Productos("1011", "Carne 1Kg",15550);
        Productos Productos3 = new Productos("1012", "Carne 1Lb",7060);
        Productos Productos4 = new Productos("1013", "Jabon Barra",3800);
        Productos Productos5 = new Productos("1014", "Detergente 1Kg",20890);
        arrayProductos[0] = Productos1;
        arrayProductos[1] = Productos2;
        arrayProductos[2] = Productos3;
        arrayProductos[3] = Productos4;
        arrayProductos[4] = Productos5;

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