public class Persona{

    private String documento;
    private String nombre;
    private String apellido;
    public Persona( String documento, String nombre, String apellido){
      this.documento = documento;
      this.nombre = nombre;
      this.apellido = apellido;
    }

  public String getNombre(){
		return this.nombre;
	}

  public String getApellido(){
		return this.apellido;
	}

  public String getDocumento(){
		return this.documento;
	}

  public void setNombre(String nombre){
		this.nombre = nombre;
	}

  public void setApellido(String apellido){
		this.apellido = apellido;
	}
    
  public void setDocumento(String documento){
		this.documento = documento;
	}

}