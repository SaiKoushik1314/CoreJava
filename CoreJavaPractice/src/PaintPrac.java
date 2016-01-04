import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintPrac extends JPanel {

	public static void main(String[] args) {

		JFrame frame1 = new JFrame();
		PaintPrac panel1 = new PaintPrac();

		frame1.add(panel1);
		frame1.setSize(700, 800);
		System.out.println(frame1.getHeight() + "  " + frame1.getWidth());

//		Dimension framedim = frame1.getSize();
//		System.out.println("height is: " + framedim.getWidth());
//
//		Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println("SCREEN DIMENSIONS from toolkit " + screenDim.width + " x " + screenDim.height);
//		frame1.setLocation((screenDim.width / 2 - framedim.width / 2), (screenDim.height / 2 - framedim.height / 2));
		frame1.setVisible(true);
	}
	public void paintComponent(Graphics g){
		int width, height; // integers used for graphing at bottom

		super.paintComponent(g); // java recommends a call to base constructor

		// change size of frame with mouse and see this routine called over and
		// over
		
		//System.out.println("paintComponent called by Java counter is " + counter);
		Graphics2D g2 = (Graphics2D) g; // cast down so one can access methods
										// of graphics 2d

		g2.setStroke(new BasicStroke(14)); // make lines thicker
		// draw a horizontal line
		g.setColor(Color.red);
		g.drawLine(250, 100, 650, 100); // x ->,y of start x,y of stop point
		
		g2.setStroke(new BasicStroke(12));
		g.setColor(Color.BLUE);
		g.drawRect(40, 59, 100, 100);
		g.setColor(Color.yellow);
		g.drawOval(20, 30, 65, 70);

	}

}
