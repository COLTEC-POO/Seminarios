import java.awt.event.*;
import javax.swing.*;
class text extends JFrame implements ActionListener {
    // JTextField
    static JTextField t;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // área pra mostrar o texto
    static JLabel l;

    text(){}

    // main class
    public static void main(String[] args)
    {
        // cria um frame pra guardar o campo de texto e o botão
        f = new JFrame("JTextField");

        // cria uma área pra mostrar o texto
        l = new JLabel("nada aqui por enquanto...");

        // cria um botão
        b = new JButton("Enviar");

        // cria um objeto do tipo text
        text te = new text();

        // coloca um ActionListener no botão
        b.addActionListener(te);

        // cria um objeto do tipo JTextField tendo o número de colunas como parâmetro
        t = new JTextField(10);

        // // Cria uma área pra adicionar os botões e o campo de texto
        JPanel p = new JPanel();

        // Adiciona o botão e a área de texto a área criada
        p.add(t);
        p.add(b);
        p.add(l);

        // Adiciona o painel ao frame
        f.add(p);

        // Define o tamanho do frame
        f.setSize(300, 300);
        
        //exibe o pop up
        f.show();
    }

    // Se o botão é pressionado
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Enviar")) {
            // Define o texto do painel como o texto escrito
            l.setText(t.getText());

            // Apaga o texto
            t.setText("  ");
        }
    }
}