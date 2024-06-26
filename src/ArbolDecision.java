public class ArbolDecision {
    private Nodo raiz;
    private Nodo nodoActual;

    public ArbolDecision() {
        construirArbol();
    }

    private void construirArbol() {
        // Nodo raíz
        raiz = new Nodo("¿La gente mantiene este animal en la casa?");

        // Subárbol NO
        Nodo no1 = new Nodo("¿Tiene rayas este animal?");
        raiz.setNo(no1);
        Nodo cebra = new Nodo(Animal.CEBRA);
        no1.setSi(cebra);

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

    public String getPreguntaActual() {
        if (nodoActual != null && nodoActual.getPregunta() != null) {
            return nodoActual.getPregunta();
        }
        return null;
    }

    public void responderSi() {
        if (nodoActual != null) {
            System.out.println("Pregunta: " + nodoActual.getPregunta() + " - Respuesta: Sí");
            nodoActual = nodoActual.getSi();
        }
    }

    public void responderNo() {
        if (nodoActual != null) {
            System.out.println("Pregunta: " + nodoActual.getPregunta() + " - Respuesta: No");
            nodoActual = nodoActual.getNo();
        }
    }

    public String getResultado() {
        if (nodoActual != null && nodoActual.getRespuesta() != null) {
            return "Es un(a) " + nodoActual.getRespuesta().getNombre() + ". " + nodoActual.getRespuesta().getDescripcion();
        }
        return null;
    }

    public boolean haTerminado() {
        return nodoActual != null && nodoActual.getRespuesta() != null;
    }

    public void reiniciar() {
        nodoActual = raiz;
    }
}
