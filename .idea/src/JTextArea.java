
import java.awt.event.*;
import javax.swing.*;
class JTextArea extends JFrame implements ActionListener {

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // area pra mostrar o texto
    static JLabel l;

    // area de texto
    static javax.swing.JTextArea jt;

    JTextArea(){}

    public static void main(String[] args)
    {
        // cria um frame para guardar a área de texto e o botão
        f = new JFrame("JTextArea");

        // cria uma area para mostrar o texto
        l = new JLabel("Nada escrito por enquanto...");

        // cria um botão
        b = new JButton("Enviar");

        // cria um objeto do tipo text
        JTextArea te = new JTextArea();

        // coloca um ActionListener no botão
        b.addActionListener(te);

        // cria uma área de texto tendo linhas e colunas como parâmetro
        jt = new javax.swing.JTextArea(25, 25);

        JPanel p = new JPanel();

        // adiciona a área de texto e o botão ao painel
        p.add(jt);
        p.add(b);
        p.add(l);

        f.add(p);
        // define o tamanho do frame, largura e altura como parâmetros
        f.setSize(300, 300);

        //exibe o pop up
        f.setVisible(true);
    }

    // se o botão é pressionado
    public void actionPerformed(ActionEvent e)
    {
        //captura a ação do botão
        String s = e.getActionCommand();
        if (s.equals("Enviar")) {
            // define o texto da área como o texto escrito
            l.setText(jt.getText());
        }
    }
}