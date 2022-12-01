import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Seminarios extends JFrame implements ActionListener {

    JMenuBar menu;
    JMenu arquivo;
    JMenuItem editar, abrir, salvar, sair;
    JToolBar barraFerramentas;
    JTextField text;
    JButton fonte, estilo, tamanho;
    ImageIcon imgFont, imgStyle, imgSize;


    public static void main(String[] args) {
        JFrame janela = new Seminarios();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    //----------------------------------------- Implementa ActionPerformed -------------------------------------------//
    @Override
    public void actionPerformed(ActionEvent env) {

        if (env.getSource() == abrir) {

            JFrame janela2 = new JFrame("Abrir Pasta");
            JToolBar file = new JToolBar();
            JFileChooser fileabrir = new JFileChooser("Abrir");
            file.add(fileabrir);
            janela2.add(file);
            janela2.setBounds(150,50, 600, 250);

            janela2.setVisible(true);
        } else if (env.getSource() == salvar) {

            JFrame janela2 = new JFrame("Salvar");
            JToolBar file = new JToolBar();
            JFileChooser filesalvar = new JFileChooser("Salvar");
            file.add(filesalvar);
            janela2.add(file);
            janela2.setBounds(300,100, 600, 250);
            janela2.setVisible(true);

        } else if (env.getSource() == sair) {

            System.exit(0);

        } else if (env.getSource() == editar) {

            this.barraFerramentas.setVisible(true);

        }else if(env.getSource() == fonte){

            text.setFont(new Font("Arial", Font.PLAIN, 15));

        }else if(env.getSource() == estilo){
            text.setForeground(Color.blue);
        }else if(env.getSource() == tamanho){
            text.setFont(new Font("Arial", Font.PLAIN, 20));
        }
    }

    // ---------------------------------------- Construtor -----------------------------------------------------------//
    public Seminarios() {
        this.setTitle("Seminario Navegação");
        this.setBounds(150, 50, 700, 450);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

        this.menu = new JMenuBar();
        this.setJMenuBar(menu);

        this.text = new JTextField("Texto Teste Para Apresentacao");
        add(text);

        //-------------------------- Adicionar Imagens aos botões ---------------------------------------------//
        this.imgFont = new ImageIcon(getClass().getResource("edit.png"));
        this.imgStyle = new ImageIcon(getClass().getResource("roda-de-cores.png"));
        this.imgSize = new ImageIcon(getClass().getResource("tamanho-da-fonte.png"));

        this.fonte = new JButton(imgFont);
        this.estilo = new JButton(imgStyle);
        this.tamanho = new JButton(imgSize);

        //-------------------------- Adiciona Botões a barra de ferramentas ------------------------------------//
        this.barraFerramentas = new JToolBar();
        this.barraFerramentas.add(fonte);
        this.barraFerramentas.add(estilo);
        this.barraFerramentas.add(tamanho);

        add(barraFerramentas);
        this.barraFerramentas.setVisible(false);


        this.arquivo = new JMenu("Arquivo");
        this.editar = new JMenuItem("Editar");
        this.abrir = new JMenuItem("Abrir");
        this.salvar = new JMenuItem("Salvar");
        this.sair = new JMenuItem("Sair");

        //-------------------------- Adiciona Menus a barra de navegação ------------------------------------//
        this.menu.add(arquivo);
        this.menu.add(editar);

        this.arquivo.add(abrir);
        this.arquivo.add(salvar);
        this.arquivo.add(sair);

        //----------------------- Adiciona Action a Cada JMenuItem e Buttons --------------------------------//
        this.abrir.addActionListener(this);
        this.salvar.addActionListener(this);
        this.sair.addActionListener(this);
        this.editar.addActionListener(this);
        this.fonte.addActionListener(this);
        this.estilo.addActionListener(this);
        this.tamanho.addActionListener(this);
    }
}
