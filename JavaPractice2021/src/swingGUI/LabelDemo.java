package swingGUI;


//JLabel

import javax.swing.*;  
class LabelDemo  
{  
public static void main(String args[])  
{  
    JFrame label_f= new JFrame("Label ==> Label Demo");  
    JLabel label_l1,label_l2;  
    label_l1=new JLabel("Welcome to Label");  
    label_l1.setBounds(50,50, 200,30);  
    label_l2=new JLabel("How are You?");  
    label_l2.setBounds(50,100, 200,30);  
    label_f.add(label_l1); 
    label_f.add(label_l2);  
    label_f.setSize(300,300);  
    label_f.setLayout(null);  
    label_f.setVisible(true);  
    }  
} 
  