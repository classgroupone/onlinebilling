/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupone;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author KAMWANA
 */
public class Groupone extends JFrame{
    public Groupone(){
    setTitle("Billing System");
    JPanel panel=new JPanel(new BorderLayout());
    JPanel top = new JPanel();
    top.setBackground(Color.gray);
    top.setPreferredSize(new Dimension(250,150));
    panel.add(top);
    panel.setBorder(new EmptyBorder(new Insets(20,20,20,20)));
    add(panel);
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
}
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Groupone();
        // TODO code application logic here
    }

   

    
}
