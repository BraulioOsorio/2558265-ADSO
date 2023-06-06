public class Procesos{
    Clientes arrayClientes[] = new Clientes[5];
    Vendedores arrayVendedores[] = new Vendedores[5];
    Productos arrayProductos[] = new Productos[5];
    public Procesos(){
        Clientes cliente1 = new Clientes("108800", "Oscar Loaiza", "Calle 20");
        Clientes cliente2 = new Clientes("108801", "Daniel Garcia", "Calle 19");
        Clientes cliente3 = new Clientes("108802", "Juan Lopez", "Calle 18");
        Clientes cliente4 = new Clientes("108803", "Catalina Mendez", "Calle 17");
        Clientes cliente5 = new Clientes("108804", "Andres Lopez", "Calle 16");
        arrayClientes[0] = cliente1;
        arrayClientes[1] = cliente2;
        arrayClientes[2] = cliente3;
        arrayClientes[3] = cliente4;
        arrayClientes[4] = cliente5;

        Vendedores Vendedores1 = new Vendedores("109900", "Juan Castillo");
        Vendedores Vendedores2 = new Vendedores("109901", "Ana Segura");
        Vendedores Vendedores3 = new Vendedores("109902", "Julian Perez");
        Vendedores Vendedores4 = new Vendedores("109903", "Carolina Tobon");
        Vendedores Vendedores5 = new Vendedores("109904", "Carlos Perez");
        arrayVendedores[0] = Vendedores1;
        arrayVendedores[1] = Vendedores2;
        arrayVendedores[2] = Vendedores3;
        arrayVendedores[3] = Vendedores4;
        arrayVendedores[4] = Vendedores5;

        Productos Productos1 = new Productos("1010", "Leche");
        Productos Productos2 = new Productos("1011", "Carne 1Kg");
        Productos Productos3 = new Productos("1012", "Carne 1Lb");
        Productos Productos4 = new Productos("1013", "Jabon Barra");
        Productos Productos5 = new Productos("1014", "Detergente 1Kg");
        arrayProductos[0] = Productos1;
        arrayProductos[1] = Productos2;
        arrayProductos[2] = Productos3;
        arrayProductos[3] = Productos4;
        arrayProductos[4] = Productos5;

    }
    
    public ClienteExistente clientesExistentes(String Numcedula) {    
        String nombreC = "";
        String direccionC = "";
        
        for (int i = 0; i < 5; i++) {
            if (arrayClientes[i].getNumcedula().equals(Numcedula)) {
                nombreC = arrayClientes[i].getNombreCliente();
                direccionC = arrayClientes[i].getDirrecion();
                break; 
            }
        }
        
        ClienteExistente clienteExistente = new ClienteExistente(nombreC, direccionC);
        return clienteExistente;
    }

    public String VendedoresExistentes(String Numcedula) {    
        String resultado = "";
        
        for (int i = 0; i < 5; i++) {
            if (arrayVendedores[i].getNumcedula().equals(Numcedula)) {
                resultado = arrayVendedores[i].getNombreVendedor();
                break; 
            }
        }

        return resultado;
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



}