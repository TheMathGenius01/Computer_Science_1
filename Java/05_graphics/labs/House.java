import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class House extends JPanel {
    Random r = new Random();
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Chimney
        g.setColor(Color.green);
        g.fillRect(150, 50, 40, 100);

        // Triangle
        g.setColor(Color.red);
        int[] xPnts = {50, 350, 650};
        int[] yPnts = {200, 10, 200};
        g.fillPolygon(xPnts, yPnts, 3);

        // Main Frame
        Color c = new Color(255, 255, 237);
        g.setColor(c);
        g.fillRect(100,200, 500, 500);

        // Cloud 1
        g.setColor(Color.white);
        g.fillOval(300, 10, 100, 40);
        g.fillOval(250, 20, 100, 40);
        g.fillOval(350, 20, 100, 40);

        // Cloud 2
        g.fillOval(200, 20, 100, 40);
        g.fillOval(150, 30, 100, 40);
        g.fillOval(250, 30, 100, 40);

        /*
        // Creativity
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt( 1500-600+1)+600; // Adjusted to prevent going out of bounds
            int y = r.nextInt(1200-300+1)+300; // Adjusted to prevent going out of bounds
            int width = r.nextInt(50) + 20;
            int height = r.nextInt(50) + 20;

            Color randomColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            g.setColor(randomColor);

            g.fillRect(x, y, width, height);
        }
        */

        // Windows
        c = new Color(0, 150, 255);
        g.setColor(c);
        g.fillRect(150, 225, 100, 100);
        g.fillRect(450, 225, 100, 100);

        // Door
        c = new Color(123,63,0);
        g.setColor(c);
        g.fillRect(300, 500, 100, 200);

        // Door knob
        c = new Color(225, 193, 110);
        g.setColor(c);
        g.fillOval(310, 600, 20, 20);

        // Concrete pathway
        c = new Color(126, 126, 116);
        g.setColor(c);
        g.fillRect(0, 700, 700, 200);

        // Fence
        c = new Color(54, 69, 79);
        g.setColor(c);
        int x = 20, y = 630;
        for (int i = 0; i < 9; i++) {
            int[] xPntsF = {x, x+10, x+20};
            int[] yPntsF = {y, y-20, y};
            g.fillPolygon(xPntsF, yPntsF, 3);
            g.fillRect(x,y, 20, 600);
            x+=80;
        }

        g.fillRect(10, y+15, 685, 25);
        g.fillRect(10, y+60, 685, 25);
        g.fillRect(10, y+105, 685, 25);
        g.fillRect(10, y+150, 685, 25);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        House component = new House();
        component.setPreferredSize(new Dimension(700, 800));    // you may modify this
        component.setOpaque(true);
        Color c = new Color(0, 250, 250);
        component.setBackground(c);                   // you may change the color

        frame.add(component);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame
    }
}
