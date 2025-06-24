import javax.swing.*;
import java.awt.*;

public class MainSwing {

    public static String concat(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //On crée une nouvelle instance de notre JWindow
                JFrame dialog = new JFrame();
                dialog.setTitle("Première fenêtre"); //On lui donne un titre
                dialog.setVisible(true);//On la rend visible
                dialog.setSize(300, 200);
                dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel jPanel = new JPanel();
                jPanel.setBackground(Color.BLACK);
                jPanel.setOpaque(true);
                jPanel.setLayout(null);


                JLabel Text = new JLabel();
                Text.setText("");
                Text.setForeground(Color.YELLOW);
                Text.setVisible(true);
                Text.setBounds(20, 100, 200, 28);
                jPanel.add(Text);

                JLabel Text2 = new JLabel();
                Text2.setText("");
                Text2.setForeground(Color.BLUE);
                Text2.setVisible(true);
                Text2.setBounds(20, 120, 200, 28);
                jPanel.add(Text2);


                dialog.add(jPanel);

                JTextField text1 = new JTextField();
                text1.setBounds(20, 40, 200, 28);
                text1.addActionListener(actionListener -> {
                    Text.setText(text1.getText());
                });

                JTextField text2 = new JTextField();
                text2.setBounds(20, 80, 200, 28);
                text2.addActionListener(actionListener -> {
                    Text2.setText(text2.getText());
                });

                jPanel.add(text1);
                jPanel.add(text2);
                jPanel.setSize(250, 250);

                String concat = concat(text1.getText(), text2.getText());


            }
        });
    }
}
