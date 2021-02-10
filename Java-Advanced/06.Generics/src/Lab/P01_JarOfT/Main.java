package Lab.P01_JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar <String> jar = new Jar<>();
        Jar <Integer> jarJar = new Jar<>();

        jar.add("asd");
        jar.add("");
        jarJar.add(12);
        jarJar.add(69);
        jar.remove();

        System.out.println(jar);
    }
}
