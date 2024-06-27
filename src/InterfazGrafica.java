import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica {
    private JPanel InterfazGrafica;
    private JLabel preguntaLabel;
    private JComboBox<String> respuestaComboBox;
    private JButton enviarButton;
    private JTextArea resultadoTextArea;
    private JButton reiniciarButton;

    private ArbolDecision arbolDecision; // Instancia de la clase ArbolDecision

    public InterfazGrafica() {
        arbolDecision = new ArbolDecision(); // Inicialización de la instancia de la clase ArbolDecision

        // Agregar elementos al ComboBox
        respuestaComboBox.addItem("Sí");
        respuestaComboBox.addItem("No");

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarRespuesta(); // Acción del botón enviar
                actualizarPregunta(); // Actualizar la pregunta
            }
        });

        reiniciarButton.addActionListener(new ActionListener() { // Acción del botón reiniciar
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });

        actualizarPregunta();
    }

    private void procesarRespuesta() {
        String respuesta = (String) respuestaComboBox.getSelectedItem(); // Obtener la respuesta seleccionada
        if (respuesta != null) { // Verificar que la respuesta no sea nula
            if (respuesta.equals("Sí")) { // Verificar si la respuesta es "Sí"
                arbolDecision.responderSi();
            } else { // Si la respuesta es "No"
                arbolDecision.responderNo();
            }
        }
    }
// Método para actualizar la pregunta
    private void actualizarPregunta() {
        if (arbolDecision.haTerminado()) { // Verificar si el juego ha terminado
            resultadoTextArea.setText(arbolDecision.getResultado()); // Mostrar el resultado
            preguntaLabel.setText("Fin del juego"); // Mostrar mensaje de fin del juego
            // Deshabilitar los componentes
            respuestaComboBox.setEnabled(false);
            enviarButton.setEnabled(false);
        } else {
            preguntaLabel.setText(arbolDecision.getPreguntaActual());// Mostrar la pregunta actual
        }
    }

    private void reiniciarJuego() {
        arbolDecision.reiniciar(); // Reiniciar el juego
        actualizarPregunta();
        resultadoTextArea.setText(""); // Limpiar el área de texto
        // Habilitar los componentes
        respuestaComboBox.setEnabled(true);
        enviarButton.setEnabled(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego Interactivo - Zoológico");
        frame.setContentPane(new InterfazGrafica().InterfazGrafica);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
