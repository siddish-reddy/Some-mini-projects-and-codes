package calculator;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


 
public class Calculator extends JFrame
{
	
    //Declaring Object

    
    Calculator()
    {
    	JFrame f = new JFrame();
        
    
        f.setTitle("Calculator");
        f.setLayout(new GridLayout(0,2));
        JLabel l1=new JLabel("First Number:");
    JLabel l2=new JLabel("Second Number:");
    JLabel l3=new JLabel("Results:");
    JLabel l4 = new JLabel(" ");
  
    
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    
    JButton b1=new JButton("Add");
    JButton b2=new JButton("Subtract");
    JButton b3=new JButton("Multiply");
    JButton b4=new JButton("Compare");
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);     
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
		f.add(l3);
		f.add(l4);
        b1.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e)
        	    {
        		 	int n1=Integer.parseInt(t1.getText());
        	        int n2=Integer.parseInt(t2.getText());
        	        
        	        l4.setText(String.valueOf(n1+n2));
        	    }
        });
        b2.addActionListener(new ActionListener() {
       	 public void actionPerformed(ActionEvent e)
 	    {
 		 	int n1=Integer.parseInt(t1.getText());
 	        int n2=Integer.parseInt(t2.getText());
 	        
 	        l4.setText(String.valueOf(n1-n2));
 	    }
 });
        b3.addActionListener(new ActionListener() {
       	 public void actionPerformed(ActionEvent e)
 	    {
 		 	int n1=Integer.parseInt(t1.getText());
 	        int n2=Integer.parseInt(t2.getText());
 	        
 	        l4.setText(String.valueOf(n1*n2));
 	    }
 });
        b4.addActionListener(new ActionListener() {
       	 	public void actionPerformed(ActionEvent e)
 	    {
 		 	int n1=Integer.parseInt(t1.getText());
 	        int n2=Integer.parseInt(t2.getText());
 	       String s = "";
 	  	if(n1>n2){
 	  s = String.valueOf(n1)+ " is greater";
 	  }
 	  else if(n1<n2){
 	  s = String.valueOf(n2)+ " is greater";
 	  }
 	  else { s = "Both are equal";
 	  }
 	              l4.setText(s);
 	              }
       	 	
        });
        f.setVisible(true);
        f.setSize(450,250);
    }
    
    
    public static void main(String...s)
    {
        new Calculator();
    }
}

