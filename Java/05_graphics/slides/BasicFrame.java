import javax.swing.JFrame;

 public class BasicFrame {

    public static void main(String[] args) {
        // instantiate an object
        JFrame frame = new JFrame();
        
        // Set the title(optional).
        frame.setTitle("Basic Frame");
        
        // Set the size - size is zero by default
	frame.setSize(250, 250);
        
        // Stop the program when exiting(when you close the frame)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make it visible.
        frame.setVisible(true);

    }

}
