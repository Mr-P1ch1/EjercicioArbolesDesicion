public class ArbolDecision {
    private Nodo raiz;
    private Nodo nodoActual;

    public ArbolDecision() {
        construirArbol(); // Construir el árbol de decisión
    }

    private void construirArbol() {
        // Nodo raíz
        raiz = new Nodo("¿La gente mantiene este animal en la casa?");

        // Subárbol NO
        Nodo no1 = new Nodo("¿Tiene rayas este animal?"); // Crear un nuevo nodo con una pregunta
        raiz.setNo(no1); // Establecer el nodo como hijo izquierdo
        Nodo cebra = new Nodo(Animal.CEBRA); // Crear un nuevo nodo con una respuesta
        no1.setSi(cebra); // Establecer el nodo como hijo izquierdo

        Nodo no2 = new Nodo("¿Es un animal de granja?");
        no1.setNo(no2);
        Nodo caballo = new Nodo(Animal.CABALLO);
        no2.setSi(caballo);

        Nodo no3 = new Nodo("¿Es un animal salvaje?");
        no2.setNo(no3);
        Nodo leon = new Nodo(Animal.LEON);
        Nodo elefante = new Nodo(Animal.ELEFANTE);
        no3.setSi(leon);
        no3.setNo(elefante);

        // Subárbol SÍ
        Nodo si1 = new Nodo("¿Ladra este animal?");
        raiz.setSi(si1);
        Nodo perro = new Nodo(Animal.PERRO);
        si1.setSi(perro);

        Nodo si2 = new Nodo("¿Tiene bigotes largos?");
        si1.setNo(si2);
        Nodo gato = new Nodo(Animal.GATO);
        si2.setSi(gato);

        Nodo si3 = new Nodo("¿Es un animal pequeño?");
        si2.setNo(si3);
        Nodo conejo = new Nodo(Animal.CONEJO);
        Nodo caballoMiniatura = new Nodo(Animal.CABALLO_MINIATURA);
        si3.setSi(conejo);
        si3.setNo(caballoMiniatura);

        // Nodo inicial
        nodoActual = raiz;
    }
// Método para obtener la pregunta actual
    public String getPreguntaActual() {
        if (nodoActual != null && nodoActual.getPregunta() != null) { // Verificar que el nodo actual no sea nulo
            return nodoActual.getPregunta(); // Retornar la pregunta actual
        }
        return null; // Retornar nulo si no hay pregunta
    }

    public void responderSi() { // Método para responder "Sí"
        if (nodoActual != null) {  // Verificar que el nodo actual no sea nulo
            System.out.println("Pregunta: " + nodoActual.getPregunta() + " - Respuesta: Sí"); // Imprimir la pregunta y la respuesta
            nodoActual = nodoActual.getSi(); // Cambiar al nodo siguiente
        }
    }

    public void responderNo() { // Método para responder "No"
        if (nodoActual != null) { // Verificar que el nodo actual no sea nulo
            System.out.println("Pregunta: " + nodoActual.getPregunta() + " - Respuesta: No"); // Imprimir la pregunta y la respuesta
            nodoActual = nodoActual.getNo(); // Cambiar al nodo siguiente
        }
    }
    // Método para obtener el resultado
    public String getResultado() {
        if (nodoActual != null && nodoActual.getRespuesta() != null) { // Verificar que el nodo actual no sea nulo
            return "Es un(a) " + nodoActual.getRespuesta().getNombre() + ". " + nodoActual.getRespuesta().getDescripcion(); // Retornar el resultado
        }
        return null;
    }
// Método para verificar si el juego ha terminado
    public boolean haTerminado() {
        return nodoActual != null && nodoActual.getRespuesta() != null; // Verificar si el nodo actual no es nulo y si es una respuesta
    }
// Método para reiniciar el juego
    public void reiniciar() {
        nodoActual = raiz; // Reiniciar el nodo actual
    }
}
