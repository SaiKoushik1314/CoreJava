import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class TileCanvas extends JPanel {

	public static void main(String[] args) {

		JFrame frame1 = new JFrame();
		frame1.setSize(700, 800);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TileCanvas panel1 = new TileCanvas();
		frame1.setVisible(true);
		// frame1.add(panel1);
		JToolBar toolbar = new JToolBar();
		// toolbar.setRollover(true);

		toolbar.setSize(300, 300);
		Icon warnIcon = new ImageIcon("pat1.gif");
		JButton button = new JButton(warnIcon);
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		button.setSize(100, 100);
		//button.setBorder(new EmptyBorder(0, 0, 0, 0));

		button2.setSize(50, 50);
		button3.setSize(50, 50);
		button4.setSize(50, 50);
		toolbar.add(button);
		toolbar.addSeparator();
		toolbar.add(button2);
		toolbar.addSeparator();
		toolbar.add(button3);
		toolbar.addSeparator();
		toolbar.add(button4);

		Container contentPane = frame1.getContentPane();
		contentPane.add(toolbar, BorderLayout.NORTH);

		TileCanvas panel2 = new TileCanvas();
		panel2.add(new JButton("Reset"), BorderLayout.CENTER);
		frame1.add(panel2, "South");

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(350, 350, 100, 100);
	}
}
