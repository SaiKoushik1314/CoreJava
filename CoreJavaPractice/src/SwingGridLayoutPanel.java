import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingGridLayoutPanel {
    
 public static void main(String[] args) {
   JFrame frame1 = new JFrame("GRIDLAYOUT LAYOUT IN A PANEL");//set up frame
   frame1.setTitle("FRAME WITH 1 MAIN PANEL SHOWING GRID LAYOUT");
   frame1.setSize(600, 400); //starting size in upper left corner
 //  frame1.setDefaultCloseOperation(EXIT_ON_CLOSE); //needed to close properly
   frame1.setVisible(true); //frames are invisible must set this true   
       
   JPanel MainPanel1 = new JPanel();  //set up the main panel
   MainPanel1.setBackground(Color.yellow); //panel is yellow
       
   MainPanel1.setLayout(new FlowLayout()); //4 rows, 2 col for grid       
       //do 4,2   1,6  3,3..
                         
        //build 6 buttons
   JButton Btn1 = new JButton("BUTTON 1");
   JButton Btn2 = new JButton("BUTTON2");
   JButton Btn3 = new JButton("BUTTON3");
   JButton Btn4 = new JButton("BUTTON 4");
   JButton Btn5 = new JButton("BUTTON 5");
   JButton Btn6 = new JButton("BUTTON 6");
   JButton Btn7 = new JButton("BUTTON 7");
   JButton Btn8 = new JButton("BUTTON 8");
         
    //add them to the panel and you will see the grid
   MainPanel1.add(Btn1);           // Add JButtons using Flow Layout
   MainPanel1.add(Btn2); 
   MainPanel1.add(Btn3);           // Add JButtons using Flow Layout
   MainPanel1.add(Btn4); MainPanel1.add(Btn5); MainPanel1.add(Btn6); MainPanel1.add(Btn7);           // Add JButtons using Flow Layout
   MainPanel1.add(Btn8); 
         
      
   frame1.add(MainPanel1);  // add panel to contentframe    
     //NOTE:WE CAN ALSO USE GRIDLAYOUT ON A FRAME WITH NO PANEL               
    }
   }






