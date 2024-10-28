public class Main {
    public static void main(String[] args) {
        Persona yo = new Persona("Rodrigo", 18);

        int edad = yo.getEdad();

        System.out.println("Tengo " + edad + " años");
    }
}