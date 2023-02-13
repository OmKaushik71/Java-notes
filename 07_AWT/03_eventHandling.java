import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener{

    TextField tf; // element to which event handling behavior will be applied
    Main(){
        
        tf = new TextField();
        Button b = new Button("click me");
        b.setBounds(50,50,80,30);
        tf.setBounds(50,90,140,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Button clicked!");
    }
    public static void main(String args[]){
        new Main();
    }
}