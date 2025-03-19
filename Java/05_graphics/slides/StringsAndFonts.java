
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StringsAndFonts extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        Font serif = new Font(Font.SERIF, Font.PLAIN, 42);
        g.setFont(serif);
        g.drawString("PLAIN", 10, 40);

        g.setColor(Color.GREEN);
        Font sansSerif = new Font(Font.SANS_SERIF, Font.BOLD, 42);
        g.setFont(sansSerif);
        g.drawString("BOLD", 10, 120);
        
        g.setColor(Color.YELLOW);
        Font mono = new Font(Font.MONOSPACED, Font.BOLD + Font.ITALIC, 42);
        g.setFont(mono);
        g.drawString("BOLD+ITALIC", 10, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Strings and Fonts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        StringsAndFonts component = new StringsAndFonts();
        component.setPreferredSize(new Dimension(300, 350));
        component.setOpaque(true);
        component.setBackground(Color.BLACK);

        frame.add(component);
        frame.pack();
        frame.setLocationRelativeTo(null); // centers the frame
    }
}
