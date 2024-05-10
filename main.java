public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("personajes.xml");
        Personaje personaje = Personaje.fromXML(file);

