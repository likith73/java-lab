import java.awt.event.*;
public class UserPassValidation extends Frame implements ActionListener
{
TextField nameField, passField, resultField;
Label lab1, lab2, lab3;
public UserPassValidation()
{                       // set layout
setLayout(new GridLayout(3, 2, 0, 10));
setBackground(Color.pink);  // fill the gap with color
// create components
nameField = new TextField(15);
passField = new TextField(15);
resultField = new TextField(15);
lab1 = new Label("Enter User Name");
lab2 = new Label("Enter Password");
lab3 = new Label("Display Result");
// register the listener
passField.addActionListener(this);
// beautification
passField.setEchoChar('*');
resultField.setEditable(false);

add(lab1);   add(nameField);
add(lab2);   add(passField);
add(lab3);   add(resultField);

setTitle("User Name & Password Validation");
setSize(300, 300);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{                   // get the values entered by the user
String str1 = nameField.getText();
String str2 = passField.getText();
// some validation code
if(str1.equals("snrao") && str2.equals("java"))
{
resultField.setText("VALID");
}
else
{
resultField.setText("INVALID, TRY AGAIN");
}
}
public static void main(String args[])
{
new UserPassValidation();
}
}
