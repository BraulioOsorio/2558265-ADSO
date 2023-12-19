public class Iniciar{
    public static void main(String[]args){
        

        Clientes arrayClientes[] = new Clientes[20];
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

        
        Respaldo arragloMain = new Respaldo(arrayClientes);
        
    }
}