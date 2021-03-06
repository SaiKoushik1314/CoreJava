package com.java.oop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingCopyText
{  public static void main(String[] args)
   {
      TextFrameApp frame = new TextFrameApp(500, 500); //width,height
      frame.setTitle("TEXT COPY PGM");
      frame.setVisible(true);
   }
} //end swing copy text
//******************************************************
class TextFrameApp extends JFrame //textframeapp is a "frame", dont need to new up
                                  //a frame explicitly
{
   //these instance variables are defined outside main
   //so all methods can access..they get filled in the constructor 
   private JTextArea inputAreaTA,outputAreaTA;    // Text area for input,output
   private JButton copyBtn;      // Button to trigger copy action
      
   //constructor
   public TextFrameApp(int width, int height)
   {
      setSize(width, height);  // width and height are passed in
      
    // prepare text area for user input area for typing in text
    // text area  will hold 6 lines deep, 42 characters per line
    // =====================================================
     inputAreaTA = new JTextArea(6, 42);  // Default is editable...
           
    // pick font for the text the user enters
     inputAreaTA.setFont( new Font("SansSerif", Font.BOLD, 30) );
     inputAreaTA.setBackground(Color.yellow);
      
     //add the input JTextArea to a scroll bar/pane object
     JScrollPane inputScrollArea =
     new JScrollPane(inputAreaTA, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
     JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


     //  prepare text area for output text area
     outputAreaTA = new JTextArea(6, 42);
     outputAreaTA.setEditable(false);   // No editing in output area....

     outputAreaTA.setFont( new Font("Monospaced", Font.BOLD, 30) );
     outputAreaTA.setBackground(Color.PINK);
      
     //  Add JTextArea output area to another scroll bar/pane
     JScrollPane outputScrollArea =
     new JScrollPane(outputAreaTA, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      
      
     //  set gridlayout for frame to be 3 rows, 1 column
      setLayout(new GridLayout(3, 1));

      // ======================================================
      // Place the 3 components in grid   -2 scroll areas and 1 panel
      // ======================================================
      getContentPane().add(inputScrollArea); //grid 1 element-scroll
      getContentPane().add(outputScrollArea); //grid 2 element-scroll

      // add a panel with button for grid 3 element
      JPanel Panel1 = new JPanel(); // button
      Panel1.setBackground(Color.blue); //make panel blue
      
      copyBtn = new JButton("Copy Button"); //create a copy button
      copyBtn.setPreferredSize(new Dimension(120, 80)); //width, height of button
      Panel1.add(copyBtn);    //  add copy button to panel..
      getContentPane().add(Panel1);  // add blue panel to frame

      copyBtn.addActionListener(new JLbuttonListener());//add listener class 
   }

   //  inner "class" for the Copy button, nested class
   private class JLbuttonListener implements ActionListener
   { //here the "implement" is on a different class and this class
       //has total access to above class since it is an inner class
       //override
      public void actionPerformed(ActionEvent event)
      {
     String inputtext;
    
     // user has clicked copy button .get user input from text area
     inputtext = inputAreaTA.getText();
    
      //write it to output area
     outputAreaTA.append(inputtext);
     
     } //end action performed method
    } //end class button listener
 }//end class textframe app


