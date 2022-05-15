
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora {

    public static void main(String[] args) {

        Color color1 = new Color(255, 255, 255);
        Color color2 = new Color(85, 85, 85);
        Color color3 = new Color(82, 183, 227);
        Color color4 = new Color(146, 150, 153);
        Color color5 = new Color(229, 97, 74);

        JFrame jframe = new JFrame();               
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setSize(250, 350);
        jframe.setTitle("Calculadora");
        jframe.getContentPane().setLayout(null);  // ver omitir
        jframe.getContentPane().setBackground(color2);

        JLabel lblVisor = new JLabel();
        lblVisor.setBounds(10, 10, 230, 50);
        lblVisor.setOpaque(true);
        lblVisor.setBackground(color3);
        lblVisor.setForeground(color1);
                
        JButton btn7 = new JButton("7");
        btn7.setBounds(10, 70, 50, 50);
        JButton btn8 = new JButton("8");
        btn8.setBounds(70, 70, 50, 50);
        JButton btn9 = new JButton("9");
        btn9.setBounds(130, 70, 50, 50);
        JButton btnDivisao = new JButton("÷"); 
        btnDivisao.setBounds(190, 70, 50, 50);
        JButton btn4 = new JButton("4");
        btn4.setBounds(10, 130, 50, 50);
        JButton btn5 = new JButton("5");
        btn5.setBounds(70, 130, 50, 50);
        JButton btn6 = new JButton("6");
        btn6.setBounds(130, 130, 50, 50);
        JButton btnMultiplicacao = new JButton("x");
        btnMultiplicacao.setBounds(190, 130, 50, 50);
        JButton btn1 = new JButton("1");
        btn1.setBounds(10, 190, 50, 50);
        JButton btn2 = new JButton("2");
        btn2.setBounds(70, 190, 50, 50);
        JButton btn3 = new JButton("3");
        btn3.setBounds(130, 190, 50, 50);
        JButton btnSubtracao = new JButton("-");
        btnSubtracao.setBounds(190, 190, 50, 50);
        JButton btn0 = new JButton("0");
        btn0.setBounds(10, 250, 50, 50);
        JButton btnPonto = new JButton(".");
        btnPonto.setBounds(70, 250, 50, 50);
        JButton btnIgualdade = new JButton("=");
        btnIgualdade.setBounds(130, 250, 50, 50);
        JButton btnSoma = new JButton("+");
        btnSoma.setBounds(190, 250, 50, 50);

        jframe.getContentPane().add(lblVisor);         
        jframe.getContentPane().add(btn7);
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
        jframe.getContentPane().add(btnSoma);

        jframe.setVisible(true);

    }

}