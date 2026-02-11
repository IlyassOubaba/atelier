import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {

    private int compteur = 0;
    private JLabel label;
    private JButton plus, moins;

    public Counter() {

        // Configuration de la fenêtre
        setTitle("Counter");
        setSize(200, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label du compteur
        label = new JLabel("Compteur : 0", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));

        // Panneau des boutons
        JPanel panelBoutons = new JPanel();
        panelBoutons.setLayout(new FlowLayout());

        plus = new JButton("+");
        moins = new JButton("-");

        plus.addActionListener(this);
        moins.addActionListener(this);

        panelBoutons.add(moins);
        panelBoutons.add(plus);

        // Ajout des composants
        add(label, BorderLayout.CENTER);
        add(panelBoutons, BorderLayout.SOUTH);

        // Affichage
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == plus) {
            compteur++;
        } else if (e.getSource() == moins) {
            compteur--;
        }

        // Mise à jour du label
        label.setText("Compteur : " + compteur);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
