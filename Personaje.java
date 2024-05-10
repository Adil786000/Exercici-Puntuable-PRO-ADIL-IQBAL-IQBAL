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
    //Metodos para cargar el personaje desde XML
    public static Personaje fromXML(File file) throws  IOException {
        DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element rootElement = document.getDocumentElement();
        NodeList nodeNombre = rootElement .getChildNodes();

        for (int i = 0; i < personajes.getLength(); i++) {
            Element personajeElement = n(Element) personajes.item(i);
            if (personajeElement.getTagName().equals("personaje")) {
                String 
            }








}