public class Perro{
    // atributos
    int id;
    String nombre;
    String raza;
    int edad;
    float tamanio;
    float peso;
    float energia;
    String color;
    String estado; 
    // Metodos
    public Perro(int id, String nombre, String raza, int edad, float tamanio, float peso, String color, String estado, float energia){
        this.id=id;
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.tamanio=tamanio;
        this.peso=peso;
        this.color=color;
        this.estado=estado;
        this.energia=energia;
    }
    // ladar comer dormir corre popis 
    public void ladrar(){
      System.out.println(" Gau! ");  
    }
    public void comer(float gramos){
        this.peso += gramos;
        this.energia += (gramos*0.01);
    } 
    public void dormir(float tiempo){
        this.energia += (tiempo*0.005);
    } 
    public void correr(float tiempo){
        this.energia -= (tiempo*0.01);
    } 
    public void popis(){
        this.peso -= (this.peso*0.01);
    } 
    public void imprimir(){
        System.out.println("id: "+this.id);
        System.out.println("nombre: "+this.nombre);
        System.out.println("Raza: "+this.raza);
        System.out.println("Edad: "+this.edad);
        System.out.println("Tamano: "+this.tamanio);
        System.out.println("Peso: "+this.peso);
        System.out.println("energia: "+this.energia);
        System.out.println("Color: "+this.color);
        System.out.println("Estado: "+this.estado);
    }
}