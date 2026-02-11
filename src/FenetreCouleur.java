import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreCouleur extends JFrame implements ActionListener {

    JComboBox<String> combo;

    public FenetreCouleur() {
        // Titre de la fenêtre
        setTitle("Changement de couleur");

        // Taille de la fenêtre
        setSize(400, 300);

        // Fermeture du programme
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création de la boîte combo
        String[] couleurs = {"Rouge", "Vert", "Bleu", "Jaune", "Gris"};
        combo = new JComboBox<>(couleurs);

        // Ajouter un écouteur
        combo.addActionListener(this);

        // Ajouter la combo à la fenêtre
        add(combo, BorderLayout.NORTH);

        // Afficher la fenêtre
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choix = (String) combo.getSelectedItem();

        switch (choix) {
            case "Rouge":
                getContentPane().setBackground(Color.RED);
                break;
            case "Vert":
                getContentPane().setBackground(Color.GREEN);
                break;
            case "Bleu":
                getContentPane().setBackground(Color.BLUE);
                break;
            case "Jaune":
                getContentPane().setBackground(Color.YELLOW);
                break;
            case "Gris":
                getContentPane().setBackground(Color.GRAY);
                break;
        }
    }

    public static void main(String[] args) {
        new FenetreCouleur();
    }
}
