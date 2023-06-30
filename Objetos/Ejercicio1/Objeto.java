public class Objeto{
    
    private int documento;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;

    public Objeto(int documento,String nombres,String apellidos,String direccion, String telefono,String email){
        this.documento=documento;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }
    public void setDocumento(int documento){
        this.documento=documento;
    }
    public int getDocumento(){
        return this.documento;
    }

    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public String getNombres(){
        return this.nombres;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return this.apellidos;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }

    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void imprimir(){
        System.out.print(this.documento+"  ");
        System.out.print(this.nombres+"  ");
        System.out.print(this.apellidos+"  ");
        System.out.print(this.direccion+"  ");
        System.out.print(this.telefono+"  ");
        System.out.print(this.email);
        System.out.println("");
    }
}   