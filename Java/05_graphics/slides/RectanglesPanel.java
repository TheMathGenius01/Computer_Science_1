
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RectanglesPanel extends JPanel {

    public void paintComponent(Graphics g) {
        int sideLength = 50;
        for (int i = 0; i < 1000; i++) {
            // generates a random color in the range of [0, 255]
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            
            // pick a random spot
            int x = (int)(Math.random() * getWidth());      // getWidth/getHeight from parent class
            int y = (int)(Math.random() * getHeight());
            
            // draw the square
            g.fillRect(x, y, sideLength, sideLength);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Drawing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        RectanglesPanel component = new RectanglesPanel();
        component.setPreferredSize(new Dimension(500,500));
        frame.add(component);
        frame.pack();
        
        frame.setLocationRelativeTo(null); // centers the frame
    }

}
