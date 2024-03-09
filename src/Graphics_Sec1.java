import javax.swing.*;
import java.awt.*;

public class Graphics_Sec1 extends JFrame {
    public static void main(String[] args) {
        Graphics_Sec1 test = new Graphics_Sec1();
        test.setVisible(true);
    }
    Graphics_Sec1() {
        super("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton[] buttons = new JButton[100];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("press me " + (i + 1));
            buttons[i].setSize(100, 100);
            panel.add(buttons[i]);
        }
        GridLayout grid = new GridLayout(10, 10);
        panel.setLayout(grid);
        add(panel);
        setSize(1000, 1000);

        setVisible(true);
    }
}
