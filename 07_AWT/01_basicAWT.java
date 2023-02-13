import java.awt.*;
// creating awt application by extending Frame class
class Main extends Frame{
    Main(){
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
        setTitle("Basic AWT Program");
    }
    public static void main(String args[]){
        new Main();
    }
}