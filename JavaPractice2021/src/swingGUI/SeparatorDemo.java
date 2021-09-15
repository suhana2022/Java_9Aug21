package swingGUI;
//JSeparator



import javax.swing.*;    
class SeparatorDemo
{    
  JMenu sep_menu, sep_submenu;    
  JMenuItem sep_i1, sep_i2, sep_i3, sep_i4, sep_i5;    
  SeparatorDemo()  
  {    
    JFrame sep_f= new JFrame("Separator Example");    
    JMenuBar sep_mb=new JMenuBar();    
    sep_menu = new JMenu("Menu");    
    sep_i1=new JMenuItem("Black");    
    sep_i2=new JMenuItem("White");       
    sep_menu.add(sep_i1);  
    sep_menu.addSeparator();  
    sep_menu.add(sep_i2);  
    sep_mb.add(sep_menu);    
    sep_f.setJMenuBar(sep_mb);    
    sep_f.setSize(500,500);    
    sep_f.setLayout(null);    
    sep_f.setVisible(true);    
  }    
  public static void main(String args[])    
  {    
    new SeparatorDemo();    
  }
}
  