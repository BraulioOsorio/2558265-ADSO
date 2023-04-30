public class Personas{
    
    int documento;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;

    public Personas(int documento,String nombres,String apellidos,String direccion, String telefono){
        this.documento=documento;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    public void setDocumento(int documento){
        this.documento=documento;
    }
    public int getDocumento(){
        return this.documento;
    }

    public void imprimir(){
        System.out.print(this.documento+"  ");
        System.out.print(this.nombres+"  ");
        System.out.print(this.apellidos+"  ");
        System.out.println("");
    }
}   