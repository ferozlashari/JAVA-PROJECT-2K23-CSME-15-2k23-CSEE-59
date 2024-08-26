package chechking.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Server extends JFrame implements ActionListener {

    
    Server(){
        
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/4.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLebel back = new JLebel(i3);
        
        back.setBounds(5,20,25,25);
           p1.add(back);
        
        back.addMouseListner(new MouseAapter(){
          public void mouseClicked(MouseEvent ae)  {
              System.exit(0);
          }
            
            
        });   
        
            
        
                
                
        
        
        setSize(450,  700);
        setLocation(200,  50);
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        
    }
    
    public void actionPerform(ActionEvent ae){
        
    }
    
    
    
    
    public static void main (String []args){
        Server server = new Server();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class MouseAapter {

        public MouseAapter() {
        }
    }

   

       

      
       
   

    
    }
    

