import java.awt.*;  
import java.awt.event.*;  

class AEvent3 extends Frame {  
    TextField tf;  

    AEvent3() {  
        // Create a TextField
        tf = new TextField();  
        tf.setBounds(60, 50, 170, 20);  
        
        // Create a Button
        Button b = new Button("Click Me");  
        b.setBounds(50, 120, 80, 30);  
        
        // Add ActionListener to the Button
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                tf.setText("Hello");  
            }  
        });  
        
        // Add components to the Frame
        add(b);  
        add(tf);  
        
        // Frame properties
        setSize(300, 300);  
        setLayout(null);  
        setVisible(true);  
    }  

    public static void main(String args[]) {  
        new AEvent3();  
    }  
}  

