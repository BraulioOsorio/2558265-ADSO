import java.util.*;

public abstract class Herramientas{

	public static boolean validarPersona(Persona array[], String document){
		boolean valido = true;
        for(int i=0; i<array.length; i++){
            if(array[i]!=null && array[i].getDocumento().equals(document)){
                valido = false;
                break;
            }
        }
        if(valido){
            return true;
        }else{
            return false;
        }
	}

	public static void printArrayPerson(Persona array[]){
        System.out.println();
        System.out.println(" || Lista  ||");
		for(int i=0; i<array.length; i++){
			if(array[i]!=null){
				System.out.println("   => "+array[i].getDocumento()+" - "+array[i].getNombre()+" "+array[i].getApellido() );
			}
        }
        System.out.println(" ||  Lista  ||");
	}

	public static int findIndexPerson(Persona array[], String document){
		int index = -1;
		for(int i=0; i<array.length; i++){
            if(array[i]!=null && array[i].getDocumento().equals(document)){
                index = i;
            }
        }
        return index;
	}

	public static Persona getPersonById(Persona array[], String document){
		int index = -1;
		for(int i=0; i<array.length; i++){
            if(array[i]!=null && array[i].getDocumento().equals(document)){
                index = i;
            }
        }
        if(index!=-1){
        	return array[index];
        }else{
			return null;
        }
	}

    public static void MostrarDetalleFactura(Factura array[], int id){
        for(int i=0; i<array.length; i++){
            if(array[i]!=null && array[i].getId() == id){
                ItemsFactura items[] = array[i].getItems();
                System.out.println();
                System.out.println("|------------------ FACTURA -------------------|");
                System.out.println("+ Id factura: "+array[i].getId());
                System.out.println("+ Fecha: "+array[i].getFecha());
                System.out.println("+ Vendedor: "+array[i].getVendedor().getNombre()+ " "+array[i].getVendedor().getApellido());
                System.out.println("+ Cliente: "+array[i].getCliente().getNombre()+ " "+array[i].getCliente().getApellido());
                System.out.println("+ Productos comprados: ");
                for(int j=0; j<items.length; j++){
                    if(items[j]!=null){
                        System.out.println();
                        System.out.println("    "+(j+1)+" -> "+items[j].getProducto().getNombreProducto()+" - cantidad: "+items[j].getCantidad()+" - "+items[j].getSubtotal());
                    }
                }
                System.out.println();
                System.out.println("+ Total de factura: "+array[i].getTotal());
                System.out.println("|------------------ FACTURA -------------------|");
                System.out.println();
            }
        }
    }

    public static void listaFacturas(Factura array[]){
        System.out.println();
        System.out.println("|------------- LISTA FACTURAS -------------|");
        for(int i=0; i<array.length; i++){
            if(array[i]!=null){
                System.out.println("| "+(i+1)+".  FECHA: "+array[i].getFecha()+" =>  ID_FACTURA: "+array[i].getId()+" => VENDEDOR: "+array[i].getVendedor().getNombre()+ " "+array[i].getVendedor().getApellido()+" => CLIENTE: "+array[i].getCliente().getNombre()+ " "+array[i].getCliente().getApellido()+" => TOTAL: "+array[i].getTotal());
            }
        }
    }

    
    public static void printProductos(Producto[] productos){
        System.out.println("------ PRODUCTOS ------ ");
        for(int i=0; i<productos.length; i++){
            if(productos[i]!=null){
                System.out.print(i+" - Nombre: "+productos[i].getNombreProducto());
                System.out.println("  - Precio: "+productos[i].getPrecio());
            }
        }
        System.out.println("------ PRODUCTOS ------ ");
    }  

/*     public static void almacenarProductos( arrayProducto[], int arrayCantidad[]){
        Producto guardarprod[] = new Producto[99];
    }
 */
    public static void limpiarArreglos(int arrayCantidad[]){
        for(int i=0; i<arrayCantidad.length; i++){
            arrayCantidad[i] = 0;
        }   
    }   

    public static int generarId(Factura[] crearFactura){
        boolean continuar = true;
        while(continuar){
            Random random = new Random();
            int idAleatorio = random.nextInt(100)+1;
            boolean noRepetido = true;
            for(int i=0; i<crearFactura.length; i++){
                if(crearFactura[i]!=null && crearFactura[i].getId() == idAleatorio){
                    noRepetido = false;
                    break;
                }
            }
            if(noRepetido){
                return idAleatorio;
            }else{
                continuar = true;
            }
        }
        return -1;
    }

    public static Producto capturarProducto(int posicion, Producto productos[]){
        return productos[posicion];
    }

 
}