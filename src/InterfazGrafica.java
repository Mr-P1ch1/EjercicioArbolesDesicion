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

    private ArbolDecision arbolDecision;

    public InterfazGrafica() {
        arbolDecision = new ArbolDecision();

        respuestaComboBox.addItem("Sí");
        respuestaComboBox.addItem("No");

        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesarRespuesta();
                actualizarPregunta();
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
        String respuesta = (String) respuestaComboBox.getSelectedItem();
        if (respuesta != null) {
            if (respuesta.equals("Sí")) {
                arbolDecision.responderSi();
            } else {
                arbolDecision.responderNo();
            }
        }
    }

    private void actualizarPregunta() {
        if (arbolDecision.haTerminado()) {
            resultadoTextArea.setText(arbolDecision.getResultado());
            preguntaLabel.setText("Fin del juego");
            respuestaComboBox.setEnabled(false);
            enviarButton.setEnabled(false);
        } else {
            preguntaLabel.setText(arbolDecision.getPreguntaActual());
        }
    }

    private void reiniciarJuego() {
        arbolDecision.reiniciar();
        actualizarPregunta();
        resultadoTextArea.setText("");
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
