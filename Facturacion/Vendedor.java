
public class Vendedor{

	int documento;
	String nombre;

	public Vendedor(int documento, String nombre){
		this.documento = documento;
		this.nombre = nombre;
	}

	public int getDocumento(){
		return documento;
	}
	public String getNombre(){
		return nombre;
	}
	public void imprimir(){
        System.out.print(this.documento+" -> ");
        System.out.print(this.nombre+"  ");
        System.out.println("");
    }
}