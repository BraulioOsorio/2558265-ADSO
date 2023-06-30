import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Objeto arreglo[]=new Objeto[10];
        boolean salir=false;
        int indicador=0;
        while(salir==false){
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("|| --------------------- PERSONAS -------------------- ||");
            System.out.println("|| --------------------------------------------------- ||");
            System.out.println("||                             Personas Registradas:"+indicador+"  ||");
            System.out.println("||                                                     ||");
            System.out.println("|| 1. Registrar Persona.                               ||");
            System.out.println("|| 2. Ver lista de Personas.                           ||");
            System.out.println("|| 3. Ordenar lista Personas.                          ||");
            System.out.println("|| 4. Salir.                                           ||");
            System.out.println("|| --------------------------------------------------- ||");
            int vamos=entrada.nextInt();
            if(vamos==1){
                System.out.print("Ingrese el numero de documento del usuario: ");
                int documento=entrada.nextInt();
                entrada.nextLine();
                System.out.print("Ingrese los nombres: ");
                String nombres=entrada.nextLine();
                System.out.print("Ingrese los apellidos: ");
                String apellidos=entrada.nextLine();
                System.out.print("Ingrese la direccion: ");
                String direccion=entrada.nextLine();
                System.out.print("Ingrese el telefono: ");
                String telefono=entrada.nextLine();
                System.out.print("Ingrese el correo electronico: ");
                String email=entrada.nextLine();
                Objeto temporal= new Objeto(documento,nombres,apellidos,direccion,telefono,email);
                int valido=0;
                for(int i=0;i<indicador;i++){
                    if(arreglo[i].getDocumento() == documento){
                        valido=1;
                        break;
                    }
                } 
                if(valido!=1){
                    arreglo[indicador] = temporal;
                    indicador++;
                }else{
                    System.out.println("el documento ya existe");
                }
                
            }else if(vamos==2){
                for(int i=0;i<arreglo.length;i++){
                    if(arreglo[i]!= null){
                        arreglo[i].imprimir();
                    }else{
                        break;
                    }
                }
            }else if(vamos==3){
                for(int i=0;i<indicador;i++){
                    for(int j=0;j<indicador-1;j++){
                        if(arreglo[j].getDocumento()>arreglo[j+1].getDocumento()){
                            Objeto temporal = arreglo[j];
                            arreglo[j]=arreglo[j+1];
                            arreglo[j+1]=temporal;
                        }
                    }
                }
                System.out.println("Lista Ordenada");
            }else if(vamos==4){
                System.out.println("DE VERDAD QUIERE SALIR?");
                System.out.println("________________________________________");
                System.out.println("Desea salir?");
                System.out.println("SI = 1");
                System.out.println("NO = 2");
                System.out.print("Opcion: ");
                int opcion=entrada.nextInt();
                if(opcion==1){
                    salir=true;
                }
            }
            
            
        }
    }
}