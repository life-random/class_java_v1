package swing.ch02;

import javax.swing.*;

public class Main1{
    public static void main(String[] args) {
        MyComponent myComponent = new MyComponent();
        myComponent.run();
        JTextField textField = myComponent.getTextField();
        textField.setText("홍길동");
    } // end of main
} // end of class
