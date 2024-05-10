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
    //Metodos para cargar el personaje desde XML.
    public static Personaje fromXML(File file) throws  IOException {
        DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element rootElement = document.getDocumentElement();
        NodeList nodeNombre = rootElement .getChildNodes();

        for (int i = 0; i < personajes.getLength(); i++) {
            Element personajeElement = n(Element) personajes.item(i);
            if (personajeElement.getTagName().equals("personaje")) {
                String nombre =
personajeElement.getChildNodes().item(0).getTextContent();
                int niveles =
Integer.parseInt(personajeElement.getChildNodes().item(1).getTextContent());
                int puntosDeVida = 
Integer.parseInt(personajeElement.getChildNodes().item(2).getTextContent());
                int puntosDeMana = 
Integer.parseInt(personajeElement.getChildNodes().item(3).getTextContent());
                String arma =
personajeElement.getChildNodes().item(4).getTextContent();
                String armadura = 
personajeElement getChildNodes().item(5).getTextContent();

                return new Personaje(nombre, niveles, puntosDeVida, 
puntosDeMana, arma, armadura);
            }
        }

        return null;
     }
  }








