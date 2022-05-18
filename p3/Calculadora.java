
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class Calculadora implements MouseListener {

    Color color3;
    Color color4;
    Color color5;
    Color color6;
    Color color7;
    Color color8;
    JLabel lblVisor;
    Component component;
    String componentName;
    String expression = "";

    public void createGUI() {
        Color color1 = new Color(255, 255, 255);
        Color color2 = new Color(36, 41, 47);
        color3 = new Color(146, 150, 153);
        color4 = new Color(82, 183, 227);
        color5 = new Color(229, 97, 74);
        color6 = new Color(116, 120, 124);
        color7 = new Color(34, 159, 213);
        color8 = new Color(212, 57, 30);
        Font font1 = new Font("Helvetica", Font.BOLD, 30);
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
        setJButtonSettings(btn7, 10, 70, 50, 50, color3, color1, font1, "btn7", "7", bui, false, null, this);
        setJButtonSettings(btn8, 70, 70, 50, 50, color3, color1, font1, "btn8", "8", bui, false, null, this);
        setJButtonSettings(btn9, 130, 70, 50, 50, color3, color1, font1, "btn9", "9", bui, false, null, this);
        setJButtonSettings(btnDiv, 190, 70, 50, 50, color4, color1, font1, "btnDiv", "÷", bui, false, null, this);
        setJButtonSettings(btn4, 10, 130, 50, 50, color3, color1, font1, "btn4", "4", bui, false, null, this);
        setJButtonSettings(btn5, 70, 130, 50, 50, color3, color1, font1, "btn5", "5", bui, false, null, this);
        setJButtonSettings(btn6, 130, 130, 50, 50, color3, color1, font1, "btn6", "6", bui, false, null, this);
        setJButtonSettings(btnMult, 190, 130, 50, 50, color4, color1, font1, "btnMult", "×", bui, false, null, this);
        setJButtonSettings(btn1, 10, 190, 50, 50, color3, color1, font1, "btn1", "1", bui, false, null, this);
        setJButtonSettings(btn2, 70, 190, 50, 50, color3, color1, font1, "btn2", "2", bui, false, null, this);
        setJButtonSettings(btn3, 130, 190, 50, 50, color3, color1, font1, "btn3", "3", bui, false, null, this);
        setJButtonSettings(btnSub, 190, 190, 50, 50, color4, color1, font1, "btnSub", "−", bui, false, null, this);
        setJButtonSettings(btn0, 10, 250, 50, 50, color3, color1, font1, "btn0", "0", bui, false, null, this);
        setJButtonSettings(btnPonto, 70, 250, 50, 50, color3, color1, font1, "btnPonto", ".", bui, false, null, this);
        setJButtonSettings(btnIgual, 130, 250, 50, 50, color5, color1, font1, "btnIgual", "=", bui, false, null, this);
        setJButtonSettings(btnSoma, 190, 250, 50, 50, color4, color1, font1, "btnSoma", "+", bui, false, null, this);
        lblVisor = new JLabel();
        setJLabelSettings(lblVisor, 10, 10, 230, 50, true, color4, color1, font1, "lblVisor", "0.", JLabel.RIGHT, emptyBorder);
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
        component = e.getComponent();
        componentName = e.getComponent().getName();
        switch (componentName) {
            case "btn7":
                expression = expression.concat("7");
                break;
            case "btn8":
                expression = expression.concat("8");
                break;
            case "btn9":
                expression = expression.concat("9");
                break;
            case "btn4":
                expression = expression.concat("4");
                break;
            case "btn5":
                expression = expression.concat("5");
                break;
            case "btn6":
                expression = expression.concat("6");
                break;
            case "btn1":
                expression = expression.concat("1");
                break;
            case "btn2":
                expression = expression.concat("2");
                break;
            case "btn3":
                expression = expression.concat("3");
                break;
            case "btn0":
                expression = expression.concat("0");
                break;
            case "btnPonto":
                expression = expression.concat(".");
                break;
            case "btnDiv":
                expression = expression.concat("÷");
                break;
            case "btnMult":
                expression = expression.concat("×");
                break;
            case "btnSub":
                expression = expression.concat("-");
                break;
            case "btnSoma":
                expression = expression.concat("+");
                break;
            case "btnIgual":                
                ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("graal.js");
                Double res;
                try {
                    res = (Double) scriptEngine.eval(expression.replace("×", "*").replace("÷", "/"));
                    expression = res.toString();
                } catch (ScriptException ex) {
                    expression = "ERROR";
                }
                break;
        }
        lblVisor.setText(expression);
    }    

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.createGUI();
    }

}