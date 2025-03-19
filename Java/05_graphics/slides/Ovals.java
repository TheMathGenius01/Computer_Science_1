
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ovals extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.PINK);
        g.drawOval(20, 30, 50, 50);

        g.setColor(Color.CYAN);
        g.drawOval(100, 100, 50, 50);

        g.setColor(Color.BLUE);
        g.fillOval(50, 190, 100, 20);

        g.setColor(Color.YELLOW);
        g.fillOval(20, 250, 90, 20);

        g.setColor(Color.RED);
        g.fillOval(20, 290, 40, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Drawing Ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Ovals component = new Ovals();
        component.setPreferredSize(new Dimension(300, 350));
        component.setOpaque(true);
        component.setBackground(Color.BLACK);

        frame.add(component);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame
    }

}
