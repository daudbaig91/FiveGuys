/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fiveguys;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author daudb
 */
public class FiveGuys {
    CardLayout cardLayout;
     JPanel mainPanel= new JPanel(cardLayout);
      main_menu card1;
      sign_up card2;
     log_in card3;
          

              

     
     
    /**
     * @param args the command line arguments
     */
     public void nextcard(Container cont, String str){
       
     
     
     }
    public void actionPerformed(String str) {
 

        mycards.cl= (CardLayout) (mycards.cards.getLayout());
  
        String cmd =str;
        if (cmd.equals("sign")) {
       ((CardLayout) mycards.cards.getLayout()).show(mycards.cards,"sign");
            //mycards.cl.next(mycards.cards);
            //System.out.println(x);
        } else if (cmd.equals("log")) {
              //System.out.println(x);
            ((CardLayout) mycards.cards.getLayout()).show(mycards.cards,"log");
          
        }
    }
        
     public void load(){
  


        JFrame frame = new JFrame("CardLayout Demo");

        //Create the "".
        card1 = new main_menu();

        card2 = new sign_up();

         card3 = new log_in();
      
        



        mycards.cards = new JPanel(new CardLayout());

        //Create the panel that contains the "".
        mycards.cards = new JPanel(new CardLayout());
       mycards.cards.add(card1, "main");
       mycards.cards.add(card2, "sign");
        mycards.cards.add(  card3, "log");
      

      



        Container pane = frame.getContentPane();
        pane.add(mycards.cards, BorderLayout.CENTER);
    

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setVisible(true);
     }
    public static void main(String[] args) {
        FiveGuys o = new FiveGuys();
        o.load();
         log_in lp = new log_in();
       
    }

}
