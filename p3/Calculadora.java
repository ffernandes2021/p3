
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculadora implements MouseListener {

    Component comp;
    String compName;
    Color color3;
    Color color4;
    Color color5;
    Color color6;
    Color color7;
    Color color8;
    String expression = "";
    JLabel lblVisor;
    JScrollPane scroll;
    Point point;
    boolean resultComplete = false;

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.createGUI();
    }

    public void createGUI() {
        Color color1 = new Color(255, 255, 255);
        Color color2 = new Color(36, 41, 47);
        color3 = new Color(146, 150, 153);
        color4 = new Color(82, 183, 227);
        color5 = new Color(229, 97, 74);
        color6 = new Color(116, 120, 124);
        color7 = new Color(34, 159, 213);
        color8 = new Color(212, 57, 30);
        Font font1 = new Font("Helvetica", Font.BOLD, 24);
        Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
        BasicButtonUI bbui = new BasicButtonUI();
        Border emptyBorder = new EmptyBorder(10, 10, 10, 10);
        point = new Point();
        lblVisor = new JLabel();
        setJLabelSettings(lblVisor, true, color4, color1, font1, JLabel.RIGHT);
        scroll = new JScrollPane();
        setJScrollPaneSettings(scroll, 230, 50, 10, 10, color4, null, lblVisor, emptyBorder, color4, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JButton btnParEsq = new JButton();
        setJButtonSettings(btnParEsq, "(", 50, 50, 10, 70, color3, color1, font1, bbui, false, null, cursor1, "btnParEsq", this);
        JButton btnParDir = new JButton();
        setJButtonSettings(btnParDir, ")", 50, 50, 70, 70, color3, color1, font1, bbui, false, null, cursor1, "btnParDir", this);
        JButton btnBack = new JButton();
        setJButtonSettings(btnBack, "←", 50, 50, 130, 70, color4, color1, font1, bbui, false, null, cursor1, "btnBack", this);
        JButton btnClear = new JButton();
        setJButtonSettings(btnClear, "C", 50, 50, 190, 70, color4, color1, font1, bbui, false, null, cursor1, "btnClear", this);
        JButton btn7 = new JButton();
        setJButtonSettings(btn7, "7", 50, 50, 10, 130, color3, color1, font1, bbui, false, null, cursor1, "btn7", this);
        JButton btn8 = new JButton();
        setJButtonSettings(btn8, "8", 50, 50, 70, 130, color3, color1, font1, bbui, false, null, cursor1, "btn8", this);
        JButton btn9 = new JButton();
        setJButtonSettings(btn9, "9", 50, 50, 130, 130, color3, color1, font1, bbui, false, null, cursor1, "btn9", this);
        JButton btnDiv = new JButton();
        setJButtonSettings(btnDiv, "÷", 50, 50, 190, 130, color4, color1, font1, bbui, false, null, cursor1, "btnDiv", this);
        JButton btn4 = new JButton();
        setJButtonSettings(btn4, "4", 50, 50, 10, 190, color3, color1, font1, bbui, false, null, cursor1, "btn4", this);
        JButton btn5 = new JButton();
        setJButtonSettings(btn5, "5", 50, 50, 70, 190, color3, color1, font1, bbui, false, null, cursor1, "btn5", this);
        JButton btn6 = new JButton();
        setJButtonSettings(btn6, "6", 50, 50, 130, 190, color3, color1, font1, bbui, false, null, cursor1, "btn6", this);
        JButton btnMult = new JButton();
        setJButtonSettings(btnMult, "×", 50, 50, 190, 190, color4, color1, font1, bbui, false, null, cursor1, "btnMult", this);
        JButton btn1 = new JButton();
        setJButtonSettings(btn1, "1", 50, 50, 10, 250, color3, color1, font1, bbui, false, null, cursor1, "btn1", this);
        JButton btn2 = new JButton();
        setJButtonSettings(btn2, "2", 50, 50, 70, 250, color3, color1, font1, bbui, false, null, cursor1, "btn2", this);
        JButton btn3 = new JButton();
        setJButtonSettings(btn3, "3", 50, 50, 130, 250, color3, color1, font1, bbui, false, null, cursor1, "btn3", this);
        JButton btnSub = new JButton();
        setJButtonSettings(btnSub, "−", 50, 50, 190, 250, color4, color1, font1, bbui, false, null, cursor1, "btnSub", this);
        JButton btn0 = new JButton();
        setJButtonSettings(btn0, "0", 50, 50, 10, 310, color3, color1, font1, bbui, false, null, cursor1, "btn0", this);
        JButton btnPonto = new JButton();
        setJButtonSettings(btnPonto, ".", 50, 50, 70, 310, color3, color1, font1, bbui, false, null, cursor1, "btnPonto", this);
        JButton btnIgual = new JButton();
        setJButtonSettings(btnIgual, "=", 50, 50, 130, 310, color5, color1, font1, bbui, false, null, cursor1, "btnIgual", this);
        JButton btnSoma = new JButton();
        setJButtonSettings(btnSoma, "+", 50, 50, 190, 310, color4, color1, font1, bbui, false, null, cursor1, "btnSoma", this);
        JFrame frame = new JFrame();
        Component[] co = {
            scroll, btnParEsq, btnParDir, btnBack, btnClear, btn7, btn8, btn9, btnDiv, btn4, btn5, btn6, btnMult, btn1, btn2, btn3, btnSub, btn0, btnPonto, btnIgual, btnSoma
        };
        setJFrameSettings(frame, 250, 405, JFrame.EXIT_ON_CLOSE, false, "Calculadora", null, color2, co, null, true);
    }

    public void setJLabelSettings(JLabel lbl, boolean val, Color col1, Color col2, Font fon, int align) {
        lbl.setOpaque(val);
        lbl.setBackground(col1);
        lbl.setForeground(col2);
        lbl.setFont(fon);
        lbl.setHorizontalAlignment(align);
    }

    public void setJScrollPaneSettings(JScrollPane scroll, int width, int height, int x, int y, Color col1, Border bor1, Component c, Border bor2, Color col2, int val) {
        scroll.setSize(width, height);
        scroll.setLocation(x, y);
        scroll.setBackground(col1);
        scroll.setBorder(bor1);
        scroll.setViewportView(c);
        scroll.setViewportBorder(bor2);
        scroll.getViewport().setBackground(col2);
        scroll.setHorizontalScrollBarPolicy(val);
    }

    public void setJButtonSettings(JButton btn, String text, int width, int height, int x, int y, Color col1, Color col2, Font fon, ButtonUI bui, boolean val, Border bor, Cursor cur, String name, MouseListener ml) {
        btn.setText(text);
        btn.setSize(width, height);
        btn.setLocation(x, y);
        btn.setBackground(col1);
        btn.setForeground(col2);
        btn.setFont(fon);
        btn.setUI(bui);
        btn.setFocusPainted(val);
        btn.setBorder(bor);
        btn.setCursor(cur);
        btn.setName(name);
        btn.addMouseListener(ml);
    }

    public void setJFrameSettings(JFrame frame, int width, int height, int val1, boolean val2, String title, LayoutManager lm, Color col, Component[] components, Component c, boolean val3) {
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(val1);
        frame.setResizable(val2);
        frame.setTitle(title);
        frame.getContentPane().setLayout(lm);
        frame.getContentPane().setBackground(col);
        for (Component component : components) {
            frame.getContentPane().add(component);
        }
        frame.setLocationRelativeTo(c);
        frame.setVisible(val3);
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
        compName = e.getComponent().getName();
        switch (compName) {
            case "btnParEsq":
                expression = getClearExpression(expression, "(");
                break;
            case "btnParDir":
                expression = getClearExpression(expression, ")");
                break;
            case "btnBack":
                expression = getBack(expression);
                break;
            case "btnClear":
                expression = getClear(expression);
                break;
            case "btn7":
                expression = getClearExpression(expression, "7");
                break;
            case "btn8":
                expression = getClearExpression(expression, "8");
                break;
            case "btn9":
                expression = getClearExpression(expression, "9");
                break;
            case "btn4":
                expression = getClearExpression(expression, "4");
                break;
            case "btn5":
                expression = getClearExpression(expression, "5");
                break;
            case "btn6":
                expression = getClearExpression(expression, "6");
                break;
            case "btn1":
                expression = getClearExpression(expression, "1");
                break;
            case "btn2":
                expression = getClearExpression(expression, "2");
                break;
            case "btn3":
                expression = getClearExpression(expression, "3");
                break;
            case "btn0":
                expression = getClearExpression(expression, "0");
                break;
            case "btnPonto":
                expression = getClearExpression(expression, ".");
                break;
            case "btnDiv":
                expression = getClearExpression(expression, "÷");
                break;
            case "btnMult":
                expression = getClearExpression(expression, "×");
                break;
            case "btnSub":
                expression = getClearExpression(expression, "−");
                break;
            case "btnSoma":
                expression = getClearExpression(expression, "+");
                break;
            case "btnIgual":
                expression = getResultExpression(expression);
                break;
        }
        lblVisor.setText(expression);
        moveScroll();
    }

    public void setDarkColorMode(MouseEvent e) {
        comp = e.getComponent();
        compName = e.getComponent().getName();
        switch (compName) {
            case "btnParEsq":
            case "btnParDir":
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
                comp.setBackground(color6);
                break;
            case "btnBack":
            case "btnClear":
            case "btnDiv":
            case "btnMult":
            case "btnSub":
            case "btnSoma":
                comp.setBackground(color7);
                break;
            case "btnIgual":
                comp.setBackground(color8);
                break;
        }
    }

    public void setNormalColorMode(MouseEvent e) {
        comp = e.getComponent();
        compName = e.getComponent().getName();
        switch (compName) {
            case "btnParEsq":
            case "btnParDir":
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
                comp.setBackground(color3);
                break;
            case "btnBack":
            case "btnClear":
            case "btnDiv":
            case "btnMult":
            case "btnSub":
            case "btnSoma":
                comp.setBackground(color4);
                break;
            case "btnIgual":
                comp.setBackground(color5);
                break;
        }
    }

    public void moveScroll() {
        point.setLocation(scroll.getViewport().getViewSize().width + 50 - scroll.getWidth(), -10);
        scroll.getViewport().setViewPosition(point);
    }

    public String getClear(String exp) {
        exp = "";
        return exp;
    }

    public String getBack(String exp) {
        if (!exp.isEmpty()) {
            if (!exp.equals("ERROR")) {
                exp = exp.substring(0, exp.length() - 1);
            } else {
                exp = "";
            }
        }
        return exp;
    }

    public String getResultExpression(String exp) {
        try {
            Double result = new ExpressionBuilder(exp.replace("−", "-").replace("×", "*").replace("÷", "/")).build().evaluate();
            exp = result.toString();
            int posicaoPonto = exp.indexOf(".");
            String parteInteira = exp.substring(0, posicaoPonto);
            String parteReal = exp.substring(posicaoPonto + 1, exp.length());
            if (parteReal.equals("0")) {
                exp = parteInteira;
            } else {
                if (parteReal.length() > 5) {
                    exp = parteInteira.concat(".").concat(parteReal.substring(0, 5));
                }
            }
            resultComplete = true;
        } catch (Exception exception) {
            exp = "ERROR";
        }
        return exp;
    }

    public String getClearExpression(String exp, String car) {
        if (resultComplete == false) {
            if (exp.isEmpty() || exp.equals("ERROR")) {
                if (!car.matches("[×|÷|)]")) {
                    exp = car;
                } else {
                    exp = "";
                }
            } else {
                if (car.matches("[0-9|(|)]")) {
                    exp = exp.concat(car);
                } else {
                    String ultCar = exp.substring(exp.length() - 1);
                    if (car.equals(".")) {
                        String[] expPart = exp.split("[+|−|×|÷]");
                        if ((ultCar.matches("[+|−|×|÷]")) || (!expPart[expPart.length - 1].contains(car))) {
                            exp = exp.concat(car);
                        }
                    } else {
                        if (ultCar.matches("[+|−|×|÷]")) {
                            exp = exp.substring(0, exp.length() - 1).concat(car);
                        } else {
                            exp = exp.concat(car);
                        }
                    }
                }
            }
        } else {
            if (car.matches("[0-9|.|(]")) {
                exp = car;
            } else {
                if (!car.matches("[)]")) {
                    exp = exp.concat(car);
                } else {
                    exp = "";
                }
            }
            resultComplete = false;
        }
        return exp;
    }

}