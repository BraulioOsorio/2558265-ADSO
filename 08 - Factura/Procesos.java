public class Procesos{
    Clientes arrayClientes[] = new Clientes[5];
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
    }
    
    public String clientesExistentes(String Numcedula) {
    String resultado = "";
    for (int i = 0; i < 5; i++) {
        if (arrayClientes[i].getNumcedula().equals(Numcedula)) {
            resultado = arrayClientes[i].getimprimirClientes();
            break; 
        }
    }
    return resultado;
}

}