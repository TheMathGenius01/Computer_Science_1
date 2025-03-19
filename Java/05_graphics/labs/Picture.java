// Import everything required for all programs
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.io.*;


/**
* The Picture program shows what happens in a library at night
 * This program also warns the users not to get stuck in the library after night
 * It informs the masses about the were-books, cousins of werewolves
*
* @author  Parth Zanwar
* @version 1.0
* @since   2024 - 02 - 06
*/

public class Picture extends JPanel {

    // CCalls the random class to randomize rgb
    Random r = new Random();

    // These are parameters for the moon animation
    private int countForMoon = 420;
    private int directionForMoonAnimation = 1; // 1 for moving forward, -1 for moving backward
    private final int SPEED_FOR_MOON_ANIMATION = 1;  // speed of the moving circle

    // These are parameters for the were_book animation
    private int countForWereBooksAndStrings = 0;
    private final int BOOK_SPEED = 1;

    //Array List to save the random colors for the books
    ArrayList<Color> random_color = new ArrayList<>();

    public Picture() {
        // It creates a timer for the moon animation
        // that increments every 5 milliseconds
        new Timer(5, e -> {
            // Adds to countForMoon
            countForMoon += directionForMoonAnimation * SPEED_FOR_MOON_ANIMATION;
            // Changes the direction when countForMoon hits reset point
            if (countForMoon >= 900 || countForMoon <= 420) {
                directionForMoonAnimation *= -1; // Change direction when reaching the reset point or 0
            }
        }).start();

        // This creates a timer for the books moving at the bottom and the string below the books
        // that increments every second
        new Timer(1000, e->{
            // Adds to countForWereBooksAndStrings every second
            countForWereBooksAndStrings += BOOK_SPEED;
            // Repaints the screen
            repaint();
        }).start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        background(g);

        // Window (Arc 1)
        // Set color to black
        g.setColor(Color.BLACK);
        makeArc(g, 330, 10, 800, 700, 180, -180, true);

        // Moon Animation
        int circleY = 100;
        int circleDiameter = 130; // Diameter of the circle
        MoonAnimation(g, 650, circleY, circleDiameter);

        // Book Shelf 1
        book_shelves(g, 350, 30, 50);

        // Book Shelf 2
        book_shelves(g, 440, 30, 50);

        // Stars
        drawStar(g, 500, 100);
        drawStar(g, 900, 210);
        drawStar(g, 700, 250);

        // Were-Books
        were_books(g, 0, 600);

        // String Animation

        try {
            // Tries to implement method string animation
            stringAnimation(g);
        } catch (IOException | FontFormatException e) {
            // Catches if there is an error while running
            throw new RuntimeException(e);
        }

        // Name in Picture Frame
        nameInFrame(g);
    }

    public void MoonAnimation(Graphics g, int x, int y, int diameter){

        //  Fixed Oval for white part of moon
        Color c = new Color(194, 197, 204);
        // Sets the color to white
        g.setColor(c);
        // Makes the white oval
        g.fillOval(x, y, diameter, diameter);

        // Sets the color to black
        g.setColor(Color.BLACK);
        // Makes the black moving oval
        g.fillOval(countForMoon, y, diameter, diameter);
    }

    public void book_shelves(Graphics g, int y, int width, int height){
        random_colors(30);
        // This code makes the books and randomly assigns them each a color
        for (int i = 0; i < random_color.size(); i+=width) {
            // Sets the color
            g.setColor(random_color.get(i));
            // Draws and fills the rectangle
            g.fillRect(i, y, width, height);
        }
        // This code sets the color brown and uses lines to make shelves
        for (int i = y+height; i <= y+height+20; i+=3) {
            // Makes a new brown color
            Color shelf_brown = new Color(233, 116, 81);
            // Changes pen to new color brown
            g.setColor(shelf_brown);
            // Draws the line
            g.drawLine(0,i, width*random_color.size(), i);
        }
    }

    public void random_colors(int num_of_colors){
        for (int i = 0; i < num_of_colors; i++) {
            // Makes a random number in the range [0-255] for r
            int red = r.nextInt(256);
            // Makes a random number in the range [0-255] for g
            int green = r.nextInt(256);
            // Makes a random number in the range [0-255] for b
            int blue = r.nextInt(256);
            // Adds the new random color into the random color list
            random_color.add(new Color(red, green, blue));
        }
    }

    public void drawStar(Graphics g, int x, int y) {
        // Makes the x coordinates for the star based on x input
        int[] xPoints = {x + 30, x + 42, x + 60, x + 48, x + 54, x + 30, x + 6, x + 12, x, x + 18};
        // Makes the y coordinate for star based on y input
        int[] yPoints = {y, y + 18, y + 18, y + 30, y + 54, y + 42, y + 54, y + 30, y + 18, y + 18};
        // Changes the color to yellow
        g.setColor(Color.yellow);
        // Makes the star shape and fills it
        g.fillPolygon(xPoints, yPoints, 10);

        int centerX = x + 30; // Calculate the center x-coordinate of the star
        int centerY = y + 27; // Calculate the center y-coordinate of the star

        if (countForMoon % 2 == 1){
            for (int i = 0; i < xPoints.length; i++) {
                // Calculate the endpoint of the line extending outwards from each point
                int endX = centerX + (xPoints[i] - centerX) * 2;
                int endY = centerY + (yPoints[i] - centerY) * 2;
                g.drawLine(centerX, centerY, endX, endY); // Draw lines extending outwards from each point
            }
        }
    }

    public void were_books(Graphics g, int x, int y){
        int width = 30;
        int height = 50;
        int xChange = x;
        random_colors(30);
        if (countForWereBooksAndStrings%2==0){
            for (int j = 0; j < getWidth(); j+=width) {
                //Sets the color randomly from the list of random color
                g.setColor(random_color.get(r.nextInt(random_color.size())));
                // makes rectangle that is standing up
                g.fillRect(xChange, y, width, height);
                //Sets the color randomly from the list of random color
                g.setColor(random_color.get(r.nextInt(random_color.size())));
                // Makes rectangle that has long side on the floor
                g.fillRect(xChange+30, y+20, height , width);
                // Changes the x coordinate
                xChange+=80;
            }
        }
        if (countForWereBooksAndStrings%2==1){
            for (int j = 0; j < getWidth(); j+=width) {
                //Sets the color randomly from the list of random color
                g.setColor(random_color.get(r.nextInt(random_color.size())));
                // Makes rectangle that has long side on the floor
                g.fillRect(xChange, y+20, height, width);
                //Sets the color randomly from the list of random color
                g.setColor(random_color.get(r.nextInt(random_color.size())));
                // Makes rectangle that is standing up
                g.fillRect(xChange+50, y, width, height);
                // Changes the x coordinate
                xChange+=80;
            }

        }
    }

    public void background(Graphics g){
    // Cool background design
    int width = getWidth();
    int height = getHeight();
    int step = 20;
        // i loop for x values
        for (int i = 0; i < width; i += step) {
            // j loop for y values
            for (int j = 0; j < height; j += step) {
                // changes the red color
                int red = (i * 255) / width;
                // changes the green color
                int green = (j * 255) / height;
                // Keeps the blue color the same
                int blue = 128;
                // makes a new color
                Color colorForBackgroundTiles = new Color(red, green, blue);
                g.setColor(colorForBackgroundTiles);
                g.fillRect(i, j, step, step);
            }
    }
    }

    public void stringAnimation(Graphics g) throws IOException, FontFormatException {
        // Load the custom font
        File fontFile = new File("Melted Monster.ttf");
        // Makes a new object using custom font
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(Font.ITALIC, 40);
        // makes a new object using custom font with bigger size
        Font customFontForWarning = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(Font.ITALIC, 70);

        // Register the font with the graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(customFont);

        // Set font color to red
        g.setColor(Color.RED);
        // Change which font object to use depending on the countForWereBooksAndStrings variable value at the moment
        if (countForWereBooksAndStrings%10==5){
            g.setFont(customFontForWarning);
        } else {
            g.setFont(customFont);
        }
        // Prints out a different string depending on how much the timer has elapsed
        if (countForWereBooksAndStrings % 10 == 0) {
            g.drawString("WereBook 101", getWidth()/2-150, 700);
        } else if (countForWereBooksAndStrings%10==1) {
            g.drawString("WereBooks exist everywhere in the country", getWidth()/2-350, 700);
        } else if (countForWereBooksAndStrings%10==2){
            g.drawString("They live in libraries and come out after the library closes", getWidth()/2-500, 700);
        } else if (countForWereBooksAndStrings%10==3){
            g.drawString("Never get stuck in a library after closing time", getWidth()/2-400, 700);
        } else if (countForWereBooksAndStrings%10==4){
            g.drawString("If you do....", getWidth()/2-175, 700);
        } else if (countForWereBooksAndStrings%10==5){
            g.drawString("RUN FOR IT!!!", getWidth()/2-225, 700);
        } else if (countForWereBooksAndStrings%10==6){
            g.drawString("Written By Lycan Literati", getWidth()/2-300, 700);
        } else if (countForWereBooksAndStrings%10==7 || countForWereBooksAndStrings%10==8){
            g.drawString("\"He gave everything to inform the masses, even his life in the bloody end.\"", getWidth()/2-700, 700);
        } else if (countForWereBooksAndStrings%10==9){
            g.drawString("Take the warning", getWidth()/2-200, 700);
        }
    }

    public void makeArc(Graphics g, int x, int y, int width, int height, int startAngle, int endAngle, boolean fill){
        // If I want to fill the arc
        if (fill) {
            // Draws and fills the arc
            g.fillArc(x, y, width, height, startAngle, endAngle);
        }
        // If arc doesn't need to be filled
        else{
            // Just draws the arc
            g.drawArc(x, y, width, height, startAngle, endAngle);
        }
    }

    public void nameInFrame(Graphics g){
        // Arrays for the xPnts and yPnts
        int[] xPntsForHexagon  = {150, 250, 300, 250, 150, 100};
        int[] yPntsForHexagon = {50, 50, 100, 150, 150, 100};
        // Makes a hexagon for the frame of picture
        g.fillPolygon(xPntsForHexagon, yPntsForHexagon, 6);
        // Makes a new font and changes the original font to new font
        Font fontForFrame = new Font(Font.SANS_SERIF, Font.BOLD, 20);
        g.setFont(fontForFrame);
        // Changes the color to yellow
        g.setColor(Color.yellow);
        // Prints out new font onto the screen
        g.drawString("Parth Zanwar", 145, 100);
        // Changes color to gray
        g.setColor(Color.GRAY);
        // Makes arc for frame to seem to hang onto
        makeArc(g, 150, 20, 100, 50, 180, -180, false);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Moonlight madness");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Picture component = new Picture();
        component.setPreferredSize(new Dimension(1500, 1000));
        frame.add(component);
        frame.pack();

        frame.setLocationRelativeTo(null); // centers the frame
    }
}
