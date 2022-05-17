
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class Calculadora implements MouseListener {

    Color color1 = new Color(255, 255, 255); 
    Color color2 = new Color(36, 41, 47); 
    Color color3 = new Color(146, 150, 153); 
    Color color4 = new Color(82, 183, 227); 
    Color color5 = new Color(229, 97, 74); 
    Color color6 = new Color(116, 120, 124); 
    Color color7 = new Color(34, 159, 213); 
    Color color8 = new Color(212, 57, 30); 
    Component component;
    String componentName;

    public void createComponents() {
        Font f1 = new Font("Helvetica", Font.BOLD, 30);
        BasicButtonUI bui = new BasicButtonUI();
        Border emptyBorder = new EmptyBorder(10, 10, 10, 10);
        JButton btn7 = new JButton();
        JButton btn8 = new JButton();
        JButton btn9 = new JButton();
        JButton btnDiv = new JButton();
        JButton btn4 = new JButton();
        JButton btn5 = new JButton();
        JButton btn6 = new JButton();
        JButton btnMult = new JButton();
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JButton btn3 = new JButton();
        JButton btnSub = new JButton();
        JButton btn0 = new JButton();
        JButton btnPonto = new JButton();
        JButton btnIgual = new JButton();
        JButton btnSoma = new JButton();
        setJButtonSettings(btn7, 10, 70, 50, 50, color3, color1, f1, "btn7", "7", bui, false, null, this);
        setJButtonSettings(btn8, 70, 70, 50, 50, color3, color1, f1, "btn8", "8", bui, false, null, this);
        setJButtonSettings(btn9, 130, 70, 50, 50, color3, color1, f1, "btn9", "9", bui, false, null, this);
        setJButtonSettings(btnDiv, 190, 70, 50, 50, color4, color1, f1, "btnDiv", "÷", bui, false, null, this);
        setJButtonSettings(btn4, 10, 130, 50, 50, color3, color1, f1, "btn4", "4", bui, false, null, this);
        setJButtonSettings(btn5, 70, 130, 50, 50, color3, color1, f1, "btn5", "5", bui, false, null, this);
        setJButtonSettings(btn6, 130, 130, 50, 50, color3, color1, f1, "btn6", "6", bui, false, null, this);
        setJButtonSettings(btnMult, 190, 130, 50, 50, color4, color1, f1, "btnMult", "×", bui, false, null, this);
        setJButtonSettings(btn1, 10, 190, 50, 50, color3, color1, f1, "btn1", "1", bui, false, null, this);
        setJButtonSettings(btn2, 70, 190, 50, 50, color3, color1, f1, "btn2", "2", bui, false, null, this);
        setJButtonSettings(btn3, 130, 190, 50, 50, color3, color1, f1, "btn3", "3", bui, false, null, this);
        setJButtonSettings(btnSub, 190, 190, 50, 50, color4, color1, f1, "btnSub", "−", bui, false, null, this);
        setJButtonSettings(btn0, 10, 250, 50, 50, color3, color1, f1, "btn0", "0", bui, false, null, this);
        setJButtonSettings(btnPonto, 70, 250, 50, 50, color3, color1, f1, "btnPonto", ".", bui, false, null, this);
        setJButtonSettings(btnIgual, 130, 250, 50, 50, color5, color1, f1, "btnIgual", "=", bui, false, null, this);
        setJButtonSettings(btnSoma, 190, 250, 50, 50, color4, color1, f1, "btnSoma", "+", bui, false, null, this);
        JLabel lblVisor = new JLabel();
        setJLabelSettings(lblVisor, 10, 10, 230, 50, true, color4, color1, f1, "lblVisor", "0.", JLabel.RIGHT, emptyBorder);
        JFrame frame = new JFrame();
        Component co[] = {lblVisor, btn7, btn8, btn9, btnDiv, btn4, btn5, btn6, btnMult, btn1, btn2, btn3, btnSub, btn0, btnPonto, btnIgual, btnSoma};
        setJFrameSettings(frame, 250, 345, JFrame.EXIT_ON_CLOSE, false, "Calculadora", null, color2, co, null, true);
    }

    public void setJButtonSettings(JButton btn, int x, int y, int width, int height, Color cBg, Color cFg, Font f, String name, String text, ButtonUI bui, boolean fp, Border bo, MouseListener ml) {
        btn.setLocation(x, y);
        btn.setSize(width, height);
        btn.setBackground(cBg);
        btn.setForeground(cFg);
        btn.setFont(f);
        btn.setName(name);
        btn.setText(text);
        btn.setUI(bui);
        btn.setFocusPainted(fp);
        btn.setBorder(bo);
        btn.addMouseListener(ml);
    }

    public void setJLabelSettings(JLabel lbl, int x, int y, int width, int height, boolean op, Color cBg, Color cFg, Font f, String name, String text, int align, Border bo) {
        lbl.setLocation(x, y);
        lbl.setSize(width, height);
        lbl.setOpaque(op);
        lbl.setBackground(cBg);
        lbl.setForeground(cFg);
        lbl.setFont(f);
        lbl.setName(name);
        lbl.setText(text);
        lbl.setHorizontalAlignment(align);
        lbl.setBorder(bo);
    }

    public void setJFrameSettings(JFrame frame, int width, int height, int dco, boolean r, String title, LayoutManager lm, Color cBg, Component[] components, Component c, boolean v) {
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(dco);
        frame.setResizable(r);
        frame.setTitle(title);
        frame.getContentPane().setLayout(lm);
        frame.getContentPane().setBackground(cBg);
        for (Component comp : components) {
            frame.getContentPane().add(comp);
        }
        frame.setLocationRelativeTo(c);
        frame.setVisible(v);
    }

    public void setNormalColorMode(MouseEvent e) {
        component = e.getComponent();
        componentName = e.getComponent().getName();
        switch (componentName) {
            case "btn7":
            case "btn8":
            case "btn9":
            case "btn4":
            case "btn5":
            case "btn6":
            case "btn1":
            case "btn2":
            case "btn3":
            case "btn0":
            case "btnPonto":
                component.setBackground(color3);
                break;
            case "btnDiv":
            case "btnMult":
            case "btnSub":
            case "btnSoma":
                component.setBackground(color4);
                break;
            case "btnIgual":
                component.setBackground(color5);
                break;
        }
    }

    public void setDarkColorMode(MouseEvent e) {
        component = e.getComponent();
        componentName = e.getComponent().getName();
        switch (componentName) {
            case "btn7":
            case "btn8":
            case "btn9":
            case "btn4":
            case "btn5":
            case "btn6":
            case "btn1":
            case "btn2":
            case "btn3":
            case "btn0":
            case "btnPonto":
                component.setBackground(color6);
                break;
            case "btnDiv":
            case "btnMult":
            case "btnSub":
            case "btnSoma":
                component.setBackground(color7);
                break;
            case "btnIgual":
                component.setBackground(color8);
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setDarkColorMode(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setNormalColorMode(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setDarkColorMode(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setNormalColorMode(e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.createComponents();
    }

}