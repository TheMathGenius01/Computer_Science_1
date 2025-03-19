
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingShapes extends JPanel {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(10, 10, 50, 70);

        g.setColor(Color.RED);
        g.fillOval(90, 10, 30, 50);

        g.setColor(Color.CYAN);
        g.drawArc(130, 10, 80, 70, -90, 180);
        
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(220, 10, 50, 70, 30, 30);

        g.setColor(Color.BLACK);
        g.drawLine(10, 90, 290, 90);

        g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 28));
        g.drawString("Hello Graphics!", 10, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Drawing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        DrawingShapes ds = new DrawingShapes();
        ds.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.add(ds);
        frame.pack();
        
        frame.setLocationRelativeTo(null); // centers the frame
    }

}
