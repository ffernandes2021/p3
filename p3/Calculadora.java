
import javax.swing.JFrame;

public class Calculadora {

    public static void main(String[] args) {

        // Cria uma janela
        JFrame jframe = new JFrame();
        // Define que a janela ao ser fechada deve encerrar a aplicação
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define que a janela será aberta no centro da tela
        jframe.setLocationRelativeTo(null);
        // Define que a janela não será redimensionável
        jframe.setResizable(false);
        // Define as dimensões (largura e altura) da janela
        jframe.setSize(150, 220);
        // Define o título da janela
        jframe.setTitle("Calculadora");
        // Define que a janela será visível
        jframe.setVisible(true);

    }

}