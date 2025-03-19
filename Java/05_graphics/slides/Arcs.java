import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arcs extends JPanel {

    /* 
        drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        imagine the arc makes a full circle/ellipse and is inscribed by a rectangle
        the x and y are the coordinates of the top left of the rectangle
        width and height are the width and height of the rectangle
        startAngle goes from 0 to 360 starting dead east
        arcAngle is in degrees and goes counterclockwise if positive and 
        clockwise if negative
     */
    public void paintComponent(Graphics g) {
        Random r = new Random();
        super.paintComponent(g);
        //int x = 40, y = 20, w = 220, h = 320;

        //g.setColor(Color.PINK);
        //g.fillRect(x, y, w, h);
        //g.setColor(Color.YELLOW);
        //g.fillOval(x, y, w, h);

        //g.setColor(Color.BLUE);
        // comment/uncomment the code below to see different arcs
        //g.fillArc(x, y, w, h, 0, 90);
        //g.fillArc(x, y, w, h, 0, -90);
        //g.fillArc(x, y, w, h, 135, 90);

        g.setColor(Color.yellow);
        g.fillOval(175,200, 200, 200);
        g.setColor(Color.black);
        g.fillOval(200, 200, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Arcs component = new Arcs();
        component.setPreferredSize(new Dimension(300, 350));
        component.setOpaque(true);
        component.setBackground(Color.BLACK);

        frame.add(component);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame
    }
}
