
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora {

    public static void main(String[] args) {

        Color color1 = new Color(255, 255, 255);
        Color color2 = new Color(36, 41, 47);
        Color color3 = new Color(82, 183, 227);
        Color color4 = new Color(146, 150, 153);
        Color color5 = new Color(229, 97, 74);

        Font font1 = new Font("Helvetica", Font.BOLD, 30);

        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setSize(250, 345);
        jframe.setTitle("Calculadora");
        jframe.getContentPane().setLayout(null);
        jframe.getContentPane().setBackground(color2);  

        JLabel jlabelVisor = new JLabel();
        jlabelVisor.setBounds(10, 10, 230, 50);
        jlabelVisor.setOpaque(true);
        jlabelVisor.setBackground(color3);
        jlabelVisor.setForeground(color1);
                
        JButton jbutton7 = new JButton("7");
        jbutton7.setBounds(10, 70, 50, 50);
        jbutton7.setBackground(color4);
        jbutton7.setForeground(color1);
        jbutton7.setFont(font1);
        jbutton7.setFocusPainted(false);
        jbutton7.setBorder(null);        
        
        JButton jbutton8 = new JButton("8");
        jbutton8.setBounds(70, 70, 50, 50);
        jbutton8.setBackground(color4);
        jbutton8.setForeground(color1);
        jbutton8.setFont(font1);
        jbutton8.setFocusPainted(false);
        jbutton8.setBorder(null);

        JButton jbutton9 = new JButton("9");
        jbutton9.setBounds(130, 70, 50, 50);
        jbutton9.setBackground(color4);
        jbutton9.setForeground(color1);
        jbutton9.setFont(font1);
        jbutton9.setFocusPainted(false);
        jbutton9.setBorder(null);

        JButton jbuttonDivisao = new JButton("÷"); 
        jbuttonDivisao.setBounds(190, 70, 50, 50);
        jbuttonDivisao.setBackground(color3);
        jbuttonDivisao.setForeground(color1);
        jbuttonDivisao.setFont(font1);
        jbuttonDivisao.setFocusPainted(false);
        jbuttonDivisao.setBorder(null);

        JButton jbutton4 = new JButton("4");
        jbutton4.setBounds(10, 130, 50, 50);
        jbutton4.setBackground(color4);
        jbutton4.setForeground(color1);
        jbutton4.setFont(font1);
        jbutton4.setFocusPainted(false);
        jbutton4.setBorder(null);

        JButton jbutton5 = new JButton("5");
        jbutton5.setBounds(70, 130, 50, 50);
        jbutton5.setBackground(color4);
        jbutton5.setForeground(color1);
        jbutton5.setFont(font1);
        jbutton5.setFocusPainted(false);
        jbutton5.setBorder(null);

        JButton jbutton6 = new JButton("6");
        jbutton6.setBounds(130, 130, 50, 50);
        jbutton6.setBackground(color4);
        jbutton6.setForeground(color1);
        jbutton6.setFont(font1);
        jbutton6.setFocusPainted(false);
        jbutton6.setBorder(null);

        JButton jbuttonMultiplicacao = new JButton("x");
        jbuttonMultiplicacao.setBounds(190, 130, 50, 50);
        jbuttonMultiplicacao.setBackground(color3);
        jbuttonMultiplicacao.setForeground(color1);
        jbuttonMultiplicacao.setFont(font1);
        jbuttonMultiplicacao.setFocusPainted(false);
        jbuttonMultiplicacao.setBorder(null);

        JButton jbutton1 = new JButton("1");
        jbutton1.setBounds(10, 190, 50, 50);
        jbutton1.setBackground(color4);
        jbutton1.setForeground(color1);
        jbutton1.setFont(font1);
        jbutton1.setFocusPainted(false);
        jbutton1.setBorder(null);

        JButton jbutton2 = new JButton("2");
        jbutton2.setBounds(70, 190, 50, 50);
        jbutton2.setBackground(color4);
        jbutton2.setForeground(color1);
        jbutton2.setFont(font1);
        jbutton2.setFocusPainted(false);
        jbutton2.setBorder(null);

        JButton jbutton3 = new JButton("3");
        jbutton3.setBounds(130, 190, 50, 50);
        jbutton3.setBackground(color4);
        jbutton3.setForeground(color1);
        jbutton3.setFont(font1);
        jbutton3.setFocusPainted(false);
        jbutton3.setBorder(null);

        JButton jbuttonSubtracao = new JButton("-");
        jbuttonSubtracao.setBounds(190, 190, 50, 50);
        jbuttonSubtracao.setBackground(color3);
        jbuttonSubtracao.setForeground(color1);
        jbuttonSubtracao.setFont(font1);
        jbuttonSubtracao.setFocusPainted(false);
        jbuttonSubtracao.setBorder(null);

        JButton jbutton0 = new JButton("0");
        jbutton0.setBounds(10, 250, 50, 50);
        jbutton0.setBackground(color4);
        jbutton0.setForeground(color1);
        jbutton0.setFont(font1);
        jbutton0.setFocusPainted(false);
        jbutton0.setBorder(null);

        JButton jbuttonPonto = new JButton(".");
        jbuttonPonto.setBounds(70, 250, 50, 50);
        jbuttonPonto.setBackground(color4);
        jbuttonPonto.setForeground(color1);
        jbuttonPonto.setFont(font1);
        jbuttonPonto.setFocusPainted(false);
        jbuttonPonto.setBorder(null);

        JButton jbuttonIgualdade = new JButton("=");
        jbuttonIgualdade.setBounds(130, 250, 50, 50);
        jbuttonIgualdade.setBackground(color5);
        jbuttonIgualdade.setForeground(color1);
        jbuttonIgualdade.setFont(font1);
        jbuttonIgualdade.setFocusPainted(false);
        jbuttonIgualdade.setBorder(null);

        JButton jbuttonSoma = new JButton("+");
        jbuttonSoma.setBounds(190, 250, 50, 50);
        jbuttonSoma.setBackground(color3);
        jbuttonSoma.setForeground(color1);
        jbuttonSoma.setFont(font1);
        jbuttonSoma.setFocusPainted(false);
        jbuttonSoma.setBorder(null);

        jframe.getContentPane().add(jlabelVisor);         
        jframe.getContentPane().add(jbutton7);
        jframe.getContentPane().add(jbutton8);
        jframe.getContentPane().add(jbutton9);
        jframe.getContentPane().add(jbuttonDivisao);
        jframe.getContentPane().add(jbutton4);
        jframe.getContentPane().add(jbutton5);
        jframe.getContentPane().add(jbutton6);
        jframe.getContentPane().add(jbuttonMultiplicacao);
        jframe.getContentPane().add(jbutton1);
        jframe.getContentPane().add(jbutton2);
        jframe.getContentPane().add(jbutton3);
        jframe.getContentPane().add(jbuttonSubtracao);
        jframe.getContentPane().add(jbutton0);
        jframe.getContentPane().add(jbuttonPonto);
        jframe.getContentPane().add(jbuttonIgualdade);
        jframe.getContentPane().add(jbuttonSoma);

        jframe.setVisible(true);

    }

}