public class Procesos{
    Clientes arrayClientes[];
    
    public Procesos( Clientes arrayClientesM[]){
        
        this.arrayClientes = arrayClientesM; 
    }

    public void CrearUsuario(String cedula,String nombres,String apellidos,String telefono,String direccion,String email) {   
        for (int i = 0; i < 20; i++) {
            if (arrayClientes[i]==null) {
                Clientes clienteNuevo = new Clientes(cedula, nombres,apellidos,telefono,direccion,email);
                arrayClientes[i] = clienteNuevo;
                break;
            }
        }
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
    public void EliminarUsuario(String cedula) {   
        for (int i = 0; i < 20; i++) {
            if (arrayClientes[i].getNumcedula().equals(cedula)) {
                arrayClientes[i] = null;
                break;
            }
        }
        for(int i=0;i<arrayClientes.length;i++){
            for(int j=0;j<arrayClientes.length-1;j++){
                if(arrayClientes[j]==null){
                    Clientes
                     temporal = arrayClientes[j];
                    arrayClientes[j]=arrayClientes[j+1];
                    arrayClientes[j+1]=temporal;
                }
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
            if (arrayClientes[i]!=null && arrayClientes[i].getNumcedula().equals(Numcedula)) {
                cedula = arrayClientes[i].getNumcedula();
                nombreC = arrayClientes[i].getNombreCliente();
                direccionC = arrayClientes[i].getDirrecion();
                apellidoC = arrayClientes[i].getApellido();
                telefonoC = arrayClientes[i].getTelefono();
                emailC = arrayClientes[i].getEmail(); 
                break;
            }

            if (arrayClientes[i]==null){
                break;
            }
        }
        
        ClienteExistente clienteExistente = new ClienteExistente(cedula,nombreC,apellidoC,telefonoC ,direccionC,emailC);
        return clienteExistente;
    }

    public int VerificarUsuario(String Numcedula) {    
        int resultado = 0;
        for (int i = 0; i < 20; i++) {
            if (arrayClientes[i]!=null && arrayClientes[i].getNumcedula().equals(Numcedula)) {
                return resultado = 1;
            }
        }
        return resultado;
    }  
}