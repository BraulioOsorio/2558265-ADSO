public class Procesos{
    Clientes arrayClientes[] = new Clientes[20];
    public Procesos(){
        Clientes cliente1 = new Clientes("108800", "Oscar","Loaiza","3131","Calle 20","Loaiza@gmail.com");
        Clientes cliente2 = new Clientes("108801", "Daniel","Garcia","3132", "Calle 19","Garcia@gmail.com");
        Clientes cliente3 = new Clientes("108802", "Juan","Lopez","3133", "Calle 18","Lopez@gmail.com");
        Clientes cliente4 = new Clientes("108803", "Catalina","Mendez","3134" ,"Calle 17","Mendez@gmail.com");
        Clientes cliente5 = new Clientes("108804", "Andres","Lopez","3135", "Calle 16","Lopez@gmail.com");
        arrayClientes[0] = cliente1;
        arrayClientes[1] = cliente2;
        arrayClientes[2] = cliente3;
        arrayClientes[3] = cliente4;
        arrayClientes[4] = cliente5;
    }


    public void CrearUsuario(String cedula,String nombres,String apellidos,String telefono,String direccion,String email) {   
        int posicion = 0;
        for (int i = 0; i < 20; i++) {
            if (arrayClientes[i]==null) {
                break;
                
                
            }else{
                posicion++;
            }
        }

        Clientes clienteNuevo = new Clientes(cedula, nombres,apellidos,telefono,direccion,email);
        arrayClientes[posicion-1] = clienteNuevo;
        System.out.println(arrayClientes[posicion-1].getNumcedula()+" - "+posicion);
        
    }
    public void ModificarUsuuario(String cedula,String nombres,String apellidos,String telefono,String direccion,String email) {   
        Clientes temporal = new Clientes(cedula, nombres,apellidos,telefono,direccion,email);
        for (int i = 0; i < 20; i++) {
            if (arrayClientes[i].getNumcedula().equals(cedula)) {
                arrayClientes[i] = temporal;
                break;
            }
        }
        
    }
    public ClienteExistente clientesExistentes(String Numcedula) {    
        String cedula ="";
        String nombreC = "";
        String apellidoC = "";
        String telefonoC = "";
        String direccionC = "";
        String emailC = "";
        
        for (int i = 0; i < 20; i++) {
            if (arrayClientes[i].getNumcedula().equals(Numcedula)) {
                cedula = arrayClientes[i].getNumcedula();
                nombreC = arrayClientes[i].getNombreCliente();
                direccionC = arrayClientes[i].getDirrecion();
                apellidoC = arrayClientes[i].getApellido();
                telefonoC = arrayClientes[i].getTelefono();
                emailC = arrayClientes[i].getEmail(); 
            }else{
                break;
            }
        }
        
        ClienteExistente clienteExistente = new ClienteExistente(cedula,nombreC,apellidoC,telefonoC ,direccionC,emailC);
        return clienteExistente;
    }

    public ClienteExistente buscarCliente(int arreglo) {    
        String cedula ="";
        String nombreC = "";
        String apellidoC = "";
        String telefonoC = "";
        String direccionC = "";
        String emailC = "";
        
        for (int i = arreglo; i <=arreglo; i++) {
            if (arrayClientes[i]!=null) {
                cedula = arrayClientes[i].getNumcedula();
                nombreC = arrayClientes[i].getNombreCliente();
                direccionC = arrayClientes[i].getDirrecion();
                apellidoC = arrayClientes[i].getApellido();
                telefonoC = arrayClientes[i].getTelefono();
                emailC = arrayClientes[i].getEmail(); 
            }else{
                break;
            }
        }
        
        ClienteExistente clienteExistente = new ClienteExistente(cedula,nombreC,apellidoC,telefonoC ,direccionC,emailC);
        return clienteExistente;
    }
}