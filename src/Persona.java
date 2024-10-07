public class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void clasificarEdad(){
        if (edad <= 10) {
            System.out.println(nombre+" es un niño");
        } else if ( edad > 10 && edad <= 19) {
            System.out.println(nombre+" es un adolescente");
        } else if (edad > 19 && edad <= 65){
            System.out.println(nombre+" es un adulto");
        } else {
            System.out.println(nombre+" es un viejo ");
        }
    }
}
