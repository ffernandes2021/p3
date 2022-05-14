
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora {

    public static void main(String[] args) {

        JFrame jframe = new JFrame();        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setSize(250, 250);
        jframe.setTitle("Calculadora");
        jframe.getContentPane().setLayout(null);   

        JLabel lblVisor = new JLabel();
        lblVisor.setBounds(10, 10, 230, 50); // x, y, width, height
        lblVisor.setBackground(new Color(255, 0, 0)); // r, g, b   
        /*
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnPonto = new JButton(".");
        JButton btnIgualdade = new JButton("=");
        JButton btnSoma = new JButton("+");
        JButton btnSubtracao = new JButton("-");
        JButton btnMultiplicacao = new JButton("x");
        JButton btnDivisao = new JButton("÷"); 
        
        


        
        btn1.setPreferredSize(new Dimension(50,50));
        btn2.setPreferredSize(new Dimension(50,50));
        btn3.setPreferredSize(new Dimension(50,50));
        btn4.setPreferredSize(new Dimension(50,50));
        btn5.setPreferredSize(new Dimension(50,50));
        btn6.setPreferredSize(new Dimension(50,50));
        btn7.setPreferredSize(new Dimension(50,50));
        btn8.setPreferredSize(new Dimension(50,50));
        btn9.setPreferredSize(new Dimension(50,50));
        btnPonto.setPreferredSize(new Dimension(50,50));
        btnIgualdade.setPreferredSize(new Dimension(50,50));
        btnSoma.setPreferredSize(new Dimension(50,50));
        btnSubtracao.setPreferredSize(new Dimension(50,50));
        btnMultiplicacao.setPreferredSize(new Dimension(50,50));
        btnDivisao.setPreferredSize(new Dimension(50,50));
        
        */

        jframe.getContentPane().add(lblVisor);         
        /*jframe.getContentPane().add(btn7);
        jframe.getContentPane().add(btn8);
        jframe.getContentPane().add(btn9);
        jframe.getContentPane().add(btnDivisao);
        jframe.getContentPane().add(btn4);
        jframe.getContentPane().add(btn5);
        jframe.getContentPane().add(btn6);
        jframe.getContentPane().add(btnMultiplicacao);
        jframe.getContentPane().add(btn1);
        jframe.getContentPane().add(btn2);
        jframe.getContentPane().add(btn3);
        jframe.getContentPane().add(btnSubtracao);
        jframe.getContentPane().add(btn0);
        jframe.getContentPane().add(btnPonto);
        jframe.getContentPane().add(btnIgualdade);
        jframe.getContentPane().add(btnSoma);*/
        jframe.setVisible(true);

        

        

    }

}