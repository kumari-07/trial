import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
class AW{
     public static void main(String args[]){
     Frame f=new Frame("sk");
  Label l1=new Label("Enter temp in celcius");
  Label l2=new Label();
  TextField t1=new TextField(10);
/*TextField t2=new TextField(10);
Label l3=new Label("Ans:");
TextField t3=new TextField(10);*/
Choice c=new Choice();
Button b=new Button("submit");
l1.setBounds(40, 50, 100, 30);
        t1.setBounds(160, 50, 150, 30);
        l2.setBounds(50, 100, 100, 30);
        c.setBounds(50,150,50,50);
   
        c.add("Fahrenheit");    
        c.add("Kelvin");    
       
 /*t2.setBounds(160, 100, 150, 30);
l3.setBounds(50,150,100,30);
t3.setBounds(160,150,100,30);*/

b.setBounds(150, 150, 100, 30);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(c);
/*f.add(t2);
f.add(l3);
f.add(t3);*/
f.add(b);

b.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e) {         
         String data = c.getItem(c.getSelectedIndex());    
         int x=Integer.parseInt(t1.getText()) ;
double ans;
   switch(data){
    case "Fahrenheit": 
              ans=x*(9.0/5)+32;
              l2.setText(Double.toString(ans));
              break;
  case "Kelvin":
             
     ans=(x+273.15);
              l2.setText(Double.toString(ans));
              break;

}   
        }    
        });             


f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Exit the application
                System.exit(0);
            }
        });





/*  b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
    int t=Integer.parseInt(t1.getText());
    int x=Integer.parseInt(t2.getText());
    t3.setText(Integer.toString(t+x));

 try {    
        String host = t1.getText();    
        String ip = java.net.InetAddress.getByName(host).getHostAddress();    
        t3.setText("IP of "+host+" is: "+ip);    
        }   
        catch (Exception ex) {  
            System.out.println(ex);  
        }    

}});   */

f.setLayout(null);
f.setSize(400,300);
f.setVisible(true);
}


}