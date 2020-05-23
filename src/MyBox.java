import javax.swing.*;
import java.awt.*;

public class MyBox {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

    static class MyFrame extends JFrame{

        public MyFrame(){

            setTitle("My Box");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(800,300,200,200);
            setResizable(false);


            JLabel nameLabel = new JLabel("Name");
            JTextField nameField = new JTextField(10);
            nameField.setMaximumSize(nameField.getPreferredSize());

            Box box1 = Box.createHorizontalBox();
            box1.add(nameLabel);
            box1.add(Box.createHorizontalStrut(10));
            box1.add(nameField);

            JLabel passLabel = new JLabel("Password");
            JTextField passField = new JTextField(10);
            passField.setMaximumSize(nameField.getPreferredSize());

            Box box2 = Box.createHorizontalBox();
            box2.add(passLabel);
            box2.add(Box.createHorizontalStrut(10));
            box2.add(passField);

            JButton okButton = new JButton("OK");
            JButton cancelButton = new JButton("Cancel");

            Box box3 = Box.createHorizontalBox();
            box3.add(okButton);
            box3.add(Box.createGlue());
            box3.add(cancelButton);

            Box boxVertical = Box.createVerticalBox();
            boxVertical.add(box1);
            boxVertical.add(box2);
            boxVertical.add(box3);

            add(boxVertical, BorderLayout.CENTER);

            setVisible(true);
        }
    }
}
