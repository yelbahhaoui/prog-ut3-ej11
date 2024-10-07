public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", 9);
        Persona pedro = new Persona("Pedro", 15 );
        Persona joxemi = new Persona("Joxemi", 27);
        Persona mikel = new Persona("Mikel", 83);

        juan.clasificarEdad();
        pedro.clasificarEdad();
        joxemi.clasificarEdad();
        mikel.clasificarEdad();
    }
}
