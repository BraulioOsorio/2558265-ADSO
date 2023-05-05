public class Personas{
    
    int documento;
    String nombres;
    String apellidos;
   

    public Personas(int documento,String nombres,String apellidos){
        this.documento=documento;
        this.nombres=nombres;
        this.apellidos=apellidos;
        
    }
    public void setDocumento(int documento){
        this.documento=documento;
    }
    public int getDocumento(){
        return this.documento;
    }

    public void imprimir(){
        System.out.print(this.documento+"->  ");
        System.out.print(this.nombres+"  ");
        System.out.print(this.apellidos+"  ");
        System.out.println("");
    }

    public String toString(){
        return this.documento+"-> "+this.nombres+"  "+this.apellidos;
    }
    
}   