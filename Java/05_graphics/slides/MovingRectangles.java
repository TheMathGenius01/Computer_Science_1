
import java.awt.*;
import javax.swing.*;

public class MovingRectangles extends JPanel {

    private int count = 0;
    private final int STEPS = 50;  // distance between rectangles -> you can change this

    public MovingRectangles() {
        // Don't worry about understanding this code, but it creates a timer
        // that increments count once every 1/2 second and repaints the screen.
        new Timer(1, e -> {
            count++;
            repaint();
        }).start();
    }

    public void paintComponent(Graphics g) {
        // uncomment for a different effect
        g.setColor(Color.yellow);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(Color.BLACK);
        int gaps = count % STEPS;
        int rectWidth = getWidth() - 2 * gaps;
        int rectHeight = getHeight() - 2 * gaps;

        // repeatedly draw concentric rectangles until it's smaller than a pixel
        while (rectWidth >= 2 * STEPS && rectHeight >= 2 * STEPS) {
            g.drawOval(gaps += STEPS, gaps, rectWidth -= 2 * STEPS, rectHeight -= 2 * STEPS);
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Animation with Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        MovingRectangles component = new MovingRectangles();
        component.setPreferredSize(new Dimension(500, 500));
        frame.add(component);
        frame.pack();

        frame.setLocationRelativeTo(null); // centers the frame

    }
}
