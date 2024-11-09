package Gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {    
    private JTextField display;

    public Calculadora() {
        super("Calculadora");

    
        /** JANELA INTEIRA **/
        Container c = getContentPane();     //Cria o container para a janela inteira        
        c.setLayout(new BorderLayout());    //Define o tipo de Layout da janela inteira


        /** CANTO SUPERIOR DA JANELA **/        
        Container c1 = new JPanel();            //Cria o container superior (dentro da janela)        
        c1.setLayout(new BorderLayout(5,5));  //Define o Layout tipo BorderLayout para esse conteiner de cima        
        display = new JTextField();             //Cria o painel de exibição do resultado dos cálculos dentro do container de cima
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 36));
        display.setHorizontalAlignment(JTextField.RIGHT);
        c1.add(display, BorderLayout.NORTH);   //Adiciona o display com a posição dentro do container de cima     


        /** CANTO DE BAIXO DA JANELA **/        
        Container c2 = new JPanel();            //Cria o container de baixo (dentro da janela)        
        c2.setLayout(new GridLayout(4,4,3,3));  //Define o Layout tipo grid para esse conteiner de baixo e o seta com
                                                //4 linhas e 4 colunas, 3pixels de espaçamentos vertical e 3px horizontal     
        //Adiciona os botoes no container de baixo:
        c2.add(new JButton("7"));               
        c2.add(new JButton("8"));
        c2.add(new JButton("9"));
        c2.add(new JButton("/"));
        c2.add(new JButton("4"));
        c2.add(new JButton("5"));
        c2.add(new JButton("6"));
        c2.add(new JButton("*"));
        c2.add(new JButton("1"));
        c2.add(new JButton("2"));
        c2.add(new JButton("3"));
        c2.add(new JButton("-"));
        c2.add(new JButton("0"));
        c2.add(new JButton("."));
        c2.add(new JButton("="));
        c2.add(new JButton("+"));
        //Adiciona os containers "c1" e "c2" dentro do container principal "c"
        c.add(BorderLayout.NORTH, c1);
        c.add(BorderLayout.CENTER, c2);      


        /** SETA DEFINIÇÕES DO CONTAINER PRINCIPAL **/        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Comportamento padrão ao fechar a janela: O programa tbm fecha.        
        setSize(400, 400);                               //Determina largura e altura do container principal "c"        
        setVisible(true);                                //Permite que a janela esteja visível ao usuário

    }

    public static void main(String[] args) {

        new Calculadora();  //Testa a calculadora
        
    }

}
