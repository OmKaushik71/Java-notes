import java.awt.*;
// another to create awt application is by association

class Main {
    Main(){
        Frame f1 = new Frame("Basic AWT Program");
        Button b = new Button("Click Me");
        b.setBounds(50,100,80,30);
        f1.add(b);
        f1.setSize(300,300);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String args[]){
        new Main();
    }
}