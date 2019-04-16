
package notepad;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class NotepadForm extends javax.swing.JFrame {

    String filename;
    public NotepadForm() {
        initComponents();
        setIcon();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jsearch = new javax.swing.JButton();
        searchtextFiled = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintext = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jnew = new javax.swing.JMenuItem();
        jopen = new javax.swing.JMenuItem();
        jsave = new javax.swing.JMenuItem();
        jexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jcopy = new javax.swing.JMenuItem();
        jpaste = new javax.swing.JMenuItem();
        jcut = new javax.swing.JMenuItem();
        jselectall = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        searchtextFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextFiledActionPerformed(evt);
            }
        });

        maintext.setColumns(20);
        maintext.setRows(5);
        jScrollPane1.setViewportView(maintext);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchtextFiled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsearch)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchtextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jMenu1.setText("File");

        jnew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jnew.setText("New");
        jnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnewActionPerformed(evt);
            }
        });
        jMenu1.add(jnew);

        jopen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jopen.setText("Open");
        jopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jopenActionPerformed(evt);
            }
        });
        jMenu1.add(jopen);

        jsave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jsave.setText("Save");
        jsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsaveActionPerformed(evt);
            }
        });
        jMenu1.add(jsave);

        jexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        jMenu1.add(jexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jcopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jcopy.setText("Copy");
        jcopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcopyActionPerformed(evt);
            }
        });
        jMenu2.add(jcopy);

        jpaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jpaste.setText("Paste");
        jpaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasteActionPerformed(evt);
            }
        });
        jMenu2.add(jpaste);

        jcut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jcut.setText("Cut");
        jcut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcutActionPerformed(evt);
            }
        });
        jMenu2.add(jcut);

        jselectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jselectall.setText("Select All");
        jselectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jselectallActionPerformed(evt);
            }
        });
        jMenu2.add(jselectall);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jopenActionPerformed
        FileDialog filedialog = new FileDialog(NotepadForm.this, "Open File",FileDialog.LOAD);
        filedialog.setFile("*.txt");
        filedialog.setVisible(true);
        
        if(filedialog.getFile() !=null){
            filename=filedialog.getDirectory()+filedialog.getFile();
            setTitle(filename);
        }
        try{
            BufferedReader reader= new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line=null;
            
            while((line=reader.readLine())!=null){
                sb.append(line+"\n");
                maintext.setText(sb.toString());
            }
            reader.close(); 
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "File Not Found", "Invalid File", JOptionPane.ERROR_MESSAGE);
           
       }
        /*JFileChooser chooser= new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = chooser.showOpenDialog(this);
        
        if(result==JFileChooser.CANCEL_OPTION){
            System.exit(1);
        }
        File fileName=chooser.getSelectedFile();
        if((fileName==null)||(fileName.getName().equals(""))){
            JOptionPane.showMessageDialog(this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
            try {
                BufferedReader br= new BufferedReader(new FileReader(fileName));
                StringBuilder sb = new StringBuilder();
                String line=null;
                
                while((line=br.readLine())!=null){
                    sb.append(line + "\n");
                }
                
                   br.close();
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(this,"File Not Found","Invalid File",JOptionPane.ERROR_MESSAGE);
            }
        }*/
        
        
        
        
        
    
    }//GEN-LAST:event_jopenActionPerformed

    private void jnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnewActionPerformed
         maintext.setText("");
         setTitle(filename);
    }//GEN-LAST:event_jnewActionPerformed

    private void jsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsaveActionPerformed
       FileDialog filed= new FileDialog(NotepadForm.this,"Save File",FileDialog.SAVE);
       filed.setVisible(true);
       
       
       if(filed.getFile()!=null){
           filename=filed.getDirectory()+filed.getFile();
           setTitle(filename);
       }
       try{
           FileWriter filewriter= new FileWriter(filename);
           filewriter.write(maintext.getText());
           setTitle(filename);
           filewriter.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Please Specify The File Type\n For Example(filename.txt)", "Invalid File Name", JOptionPane.ERROR_MESSAGE);
                 
       }
    }//GEN-LAST:event_jsaveActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jexitActionPerformed

    private void jcopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcopyActionPerformed
        maintext.copy();;
    }//GEN-LAST:event_jcopyActionPerformed

    private void jpasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasteActionPerformed
        maintext.paste();
    }//GEN-LAST:event_jpasteActionPerformed

    private void jcutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcutActionPerformed
        maintext.cut();
        
    }//GEN-LAST:event_jcutActionPerformed

    private void jselectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jselectallActionPerformed
        maintext.selectAll();
    }//GEN-LAST:event_jselectallActionPerformed

    private void searchtextFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextFiledActionPerformed
        
    }//GEN-LAST:event_searchtextFiledActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
        searchTextArea(maintext,searchtextFiled.getText()); 
           /* String inputValue = searchtextFiled.getText();
            int a1= maintext.getText().indexOf(inputValue);
            int a2=inputValue.length();
            if(a1!=-1){
                JOptionPane.showMessageDialog(this, "File Not Found", "Invalid Input", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                maintext.select(a1, a2+a1);
            }*/
        
    }//GEN-LAST:event_jsearchActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         this.setResizable(false);
         this.setTitle("Notepad");
         this.setVisible(true);
         this.setBounds(0, 0, 700, 700);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }//GEN-LAST:event_formWindowActivated

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("image.png")));
    }
      class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter{
          
        public myHighlighter(Color c) {
            super(c);
        }
          
      }
      DefaultHighlighter.HighlightPainter highlighter = new myHighlighter(Color.yellow);
      
      public void removeHighlight(JTextComponent textComp){
        Highlighter removeHighlighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removeHighlighter.getHighlights();
        
        for(int i=0; i<remove.length;i++){
        if(remove[i].getPainter() instanceof myHighlighter){
            removeHighlighter.removeHighlight(remove[i]);
        }    
        }
        
      }
      public void searchTextArea(JTextComponent textcomp, String textString){
            removeHighlight(textcomp);
          try {
              Highlighter hilight = textcomp.getHighlighter();
              Document doc = textcomp.getDocument();
              String text= doc.getText(0, doc.getLength());
              
              int pos=0;
              while((pos=text.toUpperCase().indexOf(textString.toUpperCase(),pos))>=0){
              hilight.addHighlight(pos, pos+textString.length(), highlighter);
              pos+=textString.length();
          }
              
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "Nothing Found", "Not Found", JOptionPane.ERROR_MESSAGE);
          }
      }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jcopy;
    private javax.swing.JMenuItem jcut;
    private javax.swing.JMenuItem jexit;
    private javax.swing.JMenuItem jnew;
    private javax.swing.JMenuItem jopen;
    private javax.swing.JMenuItem jpaste;
    private javax.swing.JMenuItem jsave;
    private javax.swing.JButton jsearch;
    private javax.swing.JMenuItem jselectall;
    private javax.swing.JTextArea maintext;
    private javax.swing.JTextField searchtextFiled;
    // End of variables declaration//GEN-END:variables

    
}
