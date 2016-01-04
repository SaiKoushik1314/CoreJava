

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JToolBar;

public class JavaUI {
	

	public static void main(String[] args) {

		JFrame frame1 = new JFrame();

//		JPanel Panel1 = new JPanel(); // result panel to show answer
//		Panel1.setBackground(Color.yellow); // make it yellow
//		Panel1.setPreferredSize(new Dimension(400, 400));// setting the size of
//															// panel
		Container contentPane1 = frame1.getContentPane();
		// Panel1.add(inputTA);
contentPane1.setLayout(new BorderLayout());
//		JPanel Panel2 = new JPanel(new BorderLayout());
//		Panel2.setBackground(Color.blue);
		//Panel2.setPreferredSize(new Dimension(80, 80));
		JToolBar toolBar = new JToolBar("Still draggable");
        toolBar.setPreferredSize(new Dimension(450, 130));
       
        //ImageIcon water = new ImageIcon("IMG_0236.JPG");
        Button button1 = new Button();
        
       // Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
//        Icon warnIcon = new ImageIcon("IMG_0236.JPG");
//        JButton button2 = new JButton(warnIcon);
       
        toolBar.add(button1);
     //  toolBar.add(button2);
        toolBar.add(button3);
        toolBar.add(button4);
       
        
        
		
		

		//
	//	Panel1.add(, BorderLayout.NORTH);
		// Panel2.add(outputTextPanel, BorderLayout.CENTER);

		//frame1.getContentPane().add(Panel1, "West");
	//	frame1.getContentPane().add(Panel2, "North");
		//frame1.getContentPane().add(resultsPanel);
		frame1.setVisible(true);

	}

}
