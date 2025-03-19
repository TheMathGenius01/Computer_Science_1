
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Decomposition extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        paintHello(g);
        
        g.setColor(Color.RED);
        paintThickRectangle(g, 10, 10, 100, 100);
        paintThickRectangle(g, 30, 50, 30, 30);
        paintThickRectangle(g, 210, 10, 100, 100);
        paintThickRectangle(g, 230, 50, 30, 20);
        paintThickRectangle(g, 150, 80, 20, 100);
        paintThickRectangle(g, 75, 200, 200, 70);
        
       
        
    }
    
    
    
    // draws a thick rectangel at (x,y) with width w and height h
    private void paintThickRectangle(Graphics g, int x, int y, int w, int h) {
        for (int i = 0; i < 5; i++) {
            g.drawRect(x+=1, y+=1, w-=2, h-=2);
        }
    }

    private void paintHello(Graphics g) {
        g.setColor(Color.YELLOW);
        g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
        g.drawString("Hello World!", 100, 240);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Method Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Decomposition component = new Decomposition();
        component.setPreferredSize(new Dimension(350, 350));
        component.setOpaque(true);
        component.setBackground(Color.BLACK);

        frame.add(component);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame
    }
}
