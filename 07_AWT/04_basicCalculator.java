import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener{
//creating three textfield elements, two for taking input and last one to display result.
TextField tf1, tf2, tf3;

    Button sum = new Button("+");
    Button sub = new Button("-");
    Button mul = new Button("x");
    Button div = new Button("/");
    Button exit = new Button("Exit");
Main(){

    setTitle("Basic Calculator");
    Label l1 = new Label("Enter First Number");
    Label l2 = new Label("Enter Second Number");
    Label l3 = new Label("Result");
    tf1 = new TextField();
    tf2 = new TextField();
    tf3 = new TextField();
    l1.setBounds(30,50,130,30);
    tf1.setBounds(170,50,50,30);

    l2.setBounds(30,90,130,30);
    tf2.setBounds(170,90,50,30);

    sum.setBounds(30,130,20,20);
    sub.setBounds(60,130,20,20);
    mul.setBounds(90,130,20,20);
    div.setBounds(120,130,20,20);

    l3.setBounds(30,160,50,30);
    tf3.setBounds(170,160,50,30);

    exit.setBounds(100,200,40,40);

    add(l1);
    add(l2);
    add(l3);

    add(tf1);
    add(tf2);
    add(tf3);

    add(sum);
    add(sub);
    add(mul);
    add(div);

    add(exit);

    setSize(500,500);
    setLayout(null);
    setVisible(true);

    sum.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);

    exit.addActionListener(this);

}
public void actionPerformed(ActionEvent e){
    int n1 = Integer.parseInt(tf1.getText());
    int n2 = Integer.parseInt(tf2.getText());

    if(e.getSource()== sum){
        tf3.setText(String.valueOf(n1+n2));
    }
    else if(e.getSource() == sub){
        tf3.setText(String.valueOf(n1-n2));
    }
    else if(e.getSource() == mul){
        tf3.setText(String.valueOf(n1*n2));
    }
    else if(e.getSource() == div){
        tf3.setText(String.valueOf(n1/n2));
    }
    else if(e.getSource() == exit){
        System.exit(0);
    }
}
public static void main(String args[]){
    new Main();
}
}