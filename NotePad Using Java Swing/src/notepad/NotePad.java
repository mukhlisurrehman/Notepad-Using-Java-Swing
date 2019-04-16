 
 
package notepad;

import javax.swing.JFrame;

public class NotePad {

    
    public static void main(String[] args) {
       NotepadForm obj= new NotepadForm();
       obj.setResizable(false);
       obj.setTitle("Notepad");
       obj.setVisible(true);
       obj.setBounds(0, 0, 700, 700);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
