
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        JFrame jframe = new JFrame();        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setSize(143, 216);
        jframe.setTitle("Calculadora");
        jframe.getContentPane().setLayout(new FlowLayout());   

        // JLabel lblVisor = new JLabel();        
        
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
        
        btn0.setSize(50, 50);
        btn1.setSize(50, 50);
        btn2.setSize(50, 50);
        btn3.setSize(50, 50);
        btn4.setSize(50, 50);
        btn5.setSize(50, 50);
        btn6.setSize(50, 50);
        btn7.setSize(50, 50);
        btn8.setSize(50, 50);
        btn9.setSize(50, 50);
        btnPonto.setSize(50, 50);
        btnIgualdade.setSize(50, 50);
        btnSoma.setSize(50, 50);
        btnSubtracao.setSize(50, 50);
        btnMultiplicacao.setSize(50, 50);
        btnDivisao.setSize(50, 50);
        
        

        // jframe.getContentPane().add(lblVisor);         
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