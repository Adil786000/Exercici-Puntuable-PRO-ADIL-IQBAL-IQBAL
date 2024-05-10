public class Personaje {
    // Atributos
    private String nombre;
    private int niveles;
    private int puntosDeVida;
    private int puntosDeMana;
    private String arma;
    private String armadura;

    //Constructor
    public Personaje(String nombre, int niveles, int puntosDeVida, int
    puntosDeMana, String arma, String armadura) {
        this.nombre = nombre;
        this.niveles = niveles;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeMana = puntosDeMana;
        this.arma = arma;
        this.armadura = armadura;
    }
  
}