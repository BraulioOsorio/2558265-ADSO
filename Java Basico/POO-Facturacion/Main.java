import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner (System.in);
        Scanner entrada_numeros = new Scanner (System.in);


        Persona clientes[]= new Persona[99];
        Persona vendedores[]= new Persona[99];
        Factura crearFactura[] = new Factura[99];
        Producto productos[] = new Producto[99];
        productos[0] = new Producto(1, "leche", 5000);
        productos[1] = new Producto(2, "pan", 1000);
        productos[2] = new Producto(3, "awacate", 2500);
        productos[3] = new Producto(4, "frijoles", 3800);
        productos[4] = new Producto(5, "chicharron", 4000);


        int posicion_cl = 0;
        int posicion_ve = 0;
        int posicion_fac = 0;
        boolean continuar = true;
        while(continuar){
            System.out.println("||------------------- MENÚ -------------------||");
            System.out.println("|| Seleccione una opción en el menú           ||");
            System.out.println("|| 1. Creación de cliente                     ||");
            System.out.println("|| 2. Creación de vendedor                    ||");
            System.out.println("|| 3. Creación de factura                     ||");
            System.out.println("|| 4. Ver lista de clientes                   ||");
            System.out.println("|| 5. Ver lista de vendedores                 ||");
            System.out.println("|| 6. Ver lista de facturas                   ||");
            System.out.println("|| 7. Ver detalle de factura                  ||");
            System.out.println("|| 8. Salir                                   ||");
            System.out.print("|| ->");
            int seleccion = entrada_numeros.nextInt();
            System.out.println("||--------------------------------------------||");

            if(seleccion == 1 ){
                System.out.println("|-------------- INGRESO CLIENTE ---------------|");
                System.out.print("|  -> Documento: ");
                String doc = entrada_texto.nextLine();
                if(Herramientas.validarPersona(clientes, doc)){
                    System.out.print("|  -> Nombre: ");
                    String nom = entrada_texto.nextLine();
                    System.out.print("|  -> Apellido: ");
                    String ape = entrada_texto.nextLine();
                    System.out.println("|----------------------------------------------|");
                    clientes[posicion_cl] = new Persona(doc, nom, ape);
                    posicion_cl++;
                }else{
                    System.out.println("  La persona ya está registrada");
                }
            }else if(seleccion == 2){
                System.out.println("|-------------- INGRESO VENDEDOR --------------|");
                System.out.print("|  -> Documento: ");
                String doc = entrada_texto.nextLine();
                if(Herramientas.validarPersona(vendedores, doc)){
                    System.out.print("|  -> Nombre: ");
                    String nom = entrada_texto.nextLine();
                    System.out.print("|  -> Apellido: ");
                    String ape = entrada_texto.nextLine();
                    System.out.println("|----------------------------------------------|");
                    vendedores[posicion_ve] = new Persona(doc, nom, ape);
                    posicion_ve++;
                }else{
                    System.out.println("  La persona ya está registrada");
                }
            }else if(seleccion == 3){
                System.out.println();
                System.out.print("   -> Ingrese el documento del cliente: ");
                String docu_cl = entrada_texto.nextLine();
                // Algoritmo de validacion
                if(!Herramientas.validarPersona(clientes, docu_cl)){
                    Persona temp_cl = Herramientas.getPersonById(clientes, docu_cl);
                    System.out.print("   -> Ingrese el documento del vendedor: ");
                    String docu_ve = entrada_texto.nextLine();
                    if(!Herramientas.validarPersona(vendedores, docu_ve)){
                        Persona temp_ve = Herramientas.getPersonById(vendedores, docu_ve);
                        
                        Factura factura = new Factura(temp_cl, temp_ve);
                        factura.setId(Herramientas.generarId(crearFactura));

                        Herramientas.printProductos(productos);
                        boolean seguir = true;
                        while(seguir){
                            System.out.println("Presione 1 para add productos o 2 para salir");
                            int opcion = entrada_numeros.nextInt();
                            
                            if(opcion == 1){
                                System.out.println(" ----- Seleccione el número del producto y la cantidad que desea agregar a la factura ----- ");
                                System.out.print("  ID Producto -> ");
                                int selecProd = entrada_numeros.nextInt();
                                Producto prod_temp = productos[selecProd];

                                System.out.print("  Cantidad -> ");
                                int cant_temp = entrada_numeros.nextInt();

                                ItemsFactura item_temp = new ItemsFactura(prod_temp, cant_temp);
                                factura.agregarProductoComprado(item_temp);
                            }else{
                                seguir = false;
                            }
                        }
                        
                        System.out.println("Id de factura: "+factura.getId());
                        System.out.println("Total a pagar: "+factura.getTotal());
                        crearFactura[posicion_fac] = factura;
                        posicion_fac++;
                    }else{
                        System.out.println("  No hay ningún vendedor registrado con ese documento");
                    }
                }else{
                    System.out.println("  No hay ningún cliente registrado con ese documento");
                }
            }else if(seleccion == 4){
                Herramientas.printArrayPerson(clientes);
            }else if(seleccion == 5){
                Herramientas.printArrayPerson(vendedores);
            }else if(seleccion == 7){
                System.out.print("-> Ingrese el ID de la factura que desea consultar: ");
                int id_consultar = entrada_numeros.nextInt();
                Herramientas.MostrarDetalleFactura(crearFactura, id_consultar); 
            }else if(seleccion == 6){
                Herramientas.listaFacturas(crearFactura);
            }else if(seleccion == 8){
                continuar = false;
            }else{
                System.out.println(" Opción invalida");
            }
        }
    }
}