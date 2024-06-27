public class Animal {
    private String nombre;
    private String descripcion;

    private Animal(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
// Lista de animales con descripciones
    public static final Animal CEBRA = new Animal("Cebra", "La cebra es un animal con rayas blancas y negras.");
    public static final Animal CABALLO = new Animal("Caballo", "El caballo es un animal grande que suele vivir en granjas.");
    public static final Animal LEON = new Animal("León", "El león es conocido como el rey de la selva.");
    public static final Animal ELEFANTE = new Animal("Elefante", "El elefante es el animal terrestre más grande.");
    public static final Animal PERRO = new Animal("Perro", "El perro es conocido como el mejor amigo del hombre.");
    public static final Animal GATO = new Animal("Gato", "El gato es un animal doméstico muy ágil.");
    public static final Animal CONEJO = new Animal("Conejo", "El conejo es un pequeño mamífero con orejas largas.");
    public static final Animal CABALLO_MINIATURA = new Animal("Caballo Miniatura", "El caballo miniatura es una versión pequeña del caballo.");
}
