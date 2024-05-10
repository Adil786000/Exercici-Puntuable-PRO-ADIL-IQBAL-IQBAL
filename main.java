public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("personajes.xml");
        Personaje personaje = Personaje.fromXML(file);

        if (personaje != null) {
            System.out.println("Nombre: " + personaje.getNombre());
            System.out.println("Niveles: " + personaje.getNiveles());
            System.out.println("Puntos de vida: " + personaje.getPuntosDeVida());
            System.out.println("Puntos de mana: " + personaje.getPuntosDeMana());
            System.out.println("Arma: " + personaje.getArma());
            System.out.println("Armadura: " + personaje.getArmadura());
        } else {
            System.out.println("No se encontró un personaje en el archivo XML");
        }
    }
}