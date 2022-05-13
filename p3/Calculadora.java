
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora {

    public static void main(String[] args) {

        JFrame jframe = new JFrame();        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setSize(360, 430);
        jframe.setTitle("Calculadora");
        jframe.getContentPane().setLayout(new FlowLayout());   

        JLabel lblVisor = new JLabel(".0");        
        
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