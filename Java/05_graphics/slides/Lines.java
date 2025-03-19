
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lines extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //drawLine(int x1, int y1, int x2, int y2)
        g.setColor(Color.RED);
        g.drawLine(20, 40, 250, 80);

        g.setColor(Color.YELLOW);
        g.drawLine(120, 20, 120, 220);
        
        g.setColor(Color.BLUE);
        g.drawLine(230, 30, 170, 120);
        
        g.setColor(Color.GREEN);
        g.drawLine(50, 300, 250, 300);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Drawing Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Lines component = new Lines();
        component.setPreferredSize(new Dimension(300, 350));
        component.setOpaque(true);
        component.setBackground(Color.BLACK);

        frame.add(component);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame
    }
}
