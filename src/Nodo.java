public class Nodo {
    private String pregunta;
    private Animal respuesta;
    private Nodo si;
    private Nodo no;

    public Nodo(String pregunta) {
        this.pregunta = pregunta;
    }

    public Nodo(Animal respuesta) {
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Animal getRespuesta() {
        return respuesta;
    }

    public Nodo getSi() {
        return si;
    }

    public void setSi(Nodo si) {
        this.si = si;
    }

    public Nodo getNo() {
        return no;
    }

    public void setNo(Nodo no) {
        this.no = no;
    }
}
