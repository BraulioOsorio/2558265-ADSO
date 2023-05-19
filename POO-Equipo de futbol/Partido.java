public class Partido{
    String equipoLocal;
    String equipoVisitante;
    String estadio;
    int EquipoLresultado;
    int EquipoVresultado;
    String resultado;


    public Partido(String equipoLocal,String equipoVisitante,String estadio,int EquipoLresultado,int EquipoVresultado){
        this.equipoLocal=equipoLocal;
        this.equipoVisitante=equipoVisitante;
        this.estadio=estadio;
        this.EquipoLresultado=EquipoLresultado;
        this.EquipoVresultado=EquipoVresultado;
        this.resultado=resultado;
    }
    public String getEquipoL(){
        return equipoLocal;
    }   
    public String getEquipoV(){
        return equipoVisitante;
    }
    public String getEstadio(){
        return estadio;
    }
    public String getResultado(){
        return resultado;
    }
    public int getEquipoLresultado(){
        return EquipoLresultado;
    }
    public int getEquipoVresultado(){
        return EquipoVresultado;
    }
    public void setResultado(String resultado){
        this.resultado=resultado;
    }
    public void imprimirDetalle(){
        System.out.println(this.equipoLocal+"    "+this.equipoVisitante+"    "+this.estadio+"    "+this.EquipoLresultado+"    "+this.EquipoVresultado+"    "+this.resultado);
    }
    public void imprimir(){
        System.out.println(this.estadio+"    "+this.equipoLocal+"    "+this.equipoVisitante);
    }
    public void imprimirVS(){
        System.out.println(this.equipoLocal+"  VS  "+this.equipoVisitante);
    }
    
    
}