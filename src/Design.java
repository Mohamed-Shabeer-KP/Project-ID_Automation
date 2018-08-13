
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOHAMED SHABEER KP
 */
public class Design extends javax.swing.JFrame {

     File pdf_location;
     String pdf_name;
     
     Main obj= new Main();
    /**
     * Creates new form Design
     */
    public Design() {
        initComponents();
    }
    
    public Design(String name,String roll,String course)
    {
        initComponents();
        name_label.setText(name);
        roll_label.setText(roll);
        course_label.setText(course);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display_panel = new javax.swing.JPanel();
        welcome_panel = new javax.swing.JPanel();
        welcome_label = new javax.swing.JLabel();
        preview_panel = new javax.swing.JPanel();
        preview_label = new javax.swing.JLabel();
        go_back_panel = new javax.swing.JPanel();
        go_back_label = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        save_panel = new javax.swing.JPanel();
        pdf_path_choose = new javax.swing.JButton();
        pdf_path_info_label = new javax.swing.JLabel();
        pdf_name_textfield = new javax.swing.JTextField();
        pdf_name_label = new javax.swing.JLabel();
        pdf_confirm_button = new javax.swing.JButton();
        wel_label = new javax.swing.JLabel();
        pdf_panel = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        roll_label = new javax.swing.JLabel();
        course_label = new javax.swing.JLabel();
        print_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ID CARD AUTOMATED GENERATION - BETA 1.0");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1630, 820));

        display_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 150, 221), 4, true));
        display_panel.setMinimumSize(new java.awt.Dimension(1506, 700));
        display_panel.setPreferredSize(new java.awt.Dimension(1510, 715));
        display_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(160, 34, 160), 4, true));
        welcome_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        welcome_label.setText("ID CARD GENERATOR");
        welcome_panel.add(welcome_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 240, 30));

        display_panel.add(welcome_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1480, 50));

        preview_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        preview_label.setText("PDF Preview");

        javax.swing.GroupLayout preview_panelLayout = new javax.swing.GroupLayout(preview_panel);
        preview_panel.setLayout(preview_panelLayout);
        preview_panelLayout.setHorizontalGroup(
            preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preview_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preview_label, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        preview_panelLayout.setVerticalGroup(
            preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preview_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preview_label, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        display_panel.add(preview_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 500, 40));

        go_back_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 3, true));

        go_back_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        go_back_label.setText("HOME PAGE");

        back_button.setBackground(new java.awt.Color(51, 153, 255));
        back_button.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("Home");
        back_button.setToolTipText("Click here to go to home page.");
        back_button.setMaximumSize(new java.awt.Dimension(75, 32));
        back_button.setMinimumSize(new java.awt.Dimension(75, 32));
        back_button.setPreferredSize(new java.awt.Dimension(75, 32));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout go_back_panelLayout = new javax.swing.GroupLayout(go_back_panel);
        go_back_panel.setLayout(go_back_panelLayout);
        go_back_panelLayout.setHorizontalGroup(
            go_back_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, go_back_panelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(go_back_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(go_back_label, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        go_back_panelLayout.setVerticalGroup(
            go_back_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(go_back_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(go_back_label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        display_panel.add(go_back_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 330, 240));

        save_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 3, true));
        save_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pdf_path_choose.setBackground(new java.awt.Color(51, 153, 255));
        pdf_path_choose.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        pdf_path_choose.setForeground(new java.awt.Color(255, 255, 255));
        pdf_path_choose.setText("Path");
        pdf_path_choose.setToolTipText("Click here to select the location to were the file should be saved.");
        pdf_path_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdf_path_chooseActionPerformed(evt);
            }
        });
        save_panel.add(pdf_path_choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 72, 90, 40));

        pdf_path_info_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pdf_path_info_label.setText("Choose location to save :");
        save_panel.add(pdf_path_info_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pdf_name_textfield.setVisible(false);
        pdf_name_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pdf_name_textfieldKeyPressed(evt);
            }
        });
        save_panel.add(pdf_name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, -1));

        pdf_name_label.setVisible(false);
        pdf_name_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pdf_name_label.setText("Enter the file name          :");
        save_panel.add(pdf_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        pdf_confirm_button.setVisible(false);
        pdf_confirm_button.setBackground(new java.awt.Color(51, 153, 255));
        pdf_confirm_button.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        pdf_confirm_button.setForeground(new java.awt.Color(255, 255, 255));
        pdf_confirm_button.setText("Submit");
        pdf_confirm_button.setToolTipText("Click here to Submit the location and name of the file to be saved.");
        pdf_confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdf_confirm_buttonActionPerformed(evt);
            }
        });
        save_panel.add(pdf_confirm_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, 50));

        wel_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        wel_label.setText("SAVE AS PDF");
        save_panel.add(wel_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        display_panel.add(save_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 290));

        pdf_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pdf_panel.setPreferredSize(new java.awt.Dimension(500, 500));
        pdf_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_label.setText("NAME");
        pdf_panel.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 85, 420, 61));

        roll_label.setText("ROLL");
        pdf_panel.add(roll_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 158, 430, 61));

        course_label.setText("COURSE");
        pdf_panel.add(course_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 231, 440, 61));

        display_panel.add(pdf_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        print_button.setVisible(false);
        print_button.setBackground(new java.awt.Color(51, 153, 255));
        print_button.setForeground(new java.awt.Color(255, 255, 255));
        print_button.setText("SAVE AS PDF");
        print_button.setToolTipText("Click here to save the above preview as a PDF file.");
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });
        display_panel.add(print_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 180, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(display_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(display_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
        Document document = new Document();
    try {
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdf_location+"\\"+pdf_name+".pdf"));
      document.open();
      PdfContentByte contentByte = writer.getDirectContent();
      PdfTemplate template = contentByte.createTemplate(500, 500);
      Graphics2D g2 = template.createGraphics(500, 500);
      pdf_panel.print(g2);
      g2.dispose();
      contentByte.addTemplate(template, 30, 300);
       
      JOptionPane.showMessageDialog(null, "PDF File successfully generated", " Successfull " , JOptionPane.INFORMATION_MESSAGE);
} catch (Exception e) {
    e.printStackTrace();
}
    
finally {
    if(document.isOpen())
        document.close();
        }
    }//GEN-LAST:event_print_buttonActionPerformed

    private void pdf_path_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdf_path_chooseActionPerformed
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        int result = f.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) 
        {
              pdf_location=f.getSelectedFile();
              pdf_name_label.setVisible(true);
              pdf_name_textfield.setVisible(true);
        } 
    
     
    }//GEN-LAST:event_pdf_path_chooseActionPerformed

    private void pdf_confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdf_confirm_buttonActionPerformed
        pdf_name = pdf_name_textfield.getText();
        if(!pdf_name.equals(""))
            print_button.setVisible(true);
        else
        { 
            JOptionPane.showMessageDialog(null, "Enter a valid file name", "Invalid File Name" , JOptionPane.INFORMATION_MESSAGE);
            print_button.setVisible(false);
        }
    }//GEN-LAST:event_pdf_confirm_buttonActionPerformed

    private void pdf_name_textfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pdf_name_textfieldKeyPressed
        pdf_confirm_button.setVisible(true);  
    }//GEN-LAST:event_pdf_name_textfieldKeyPressed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel course_label;
    private javax.swing.JPanel display_panel;
    private javax.swing.JLabel go_back_label;
    private javax.swing.JPanel go_back_panel;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton pdf_confirm_button;
    private javax.swing.JLabel pdf_name_label;
    private javax.swing.JTextField pdf_name_textfield;
    private javax.swing.JPanel pdf_panel;
    private javax.swing.JButton pdf_path_choose;
    private javax.swing.JLabel pdf_path_info_label;
    private javax.swing.JLabel preview_label;
    private javax.swing.JPanel preview_panel;
    private javax.swing.JButton print_button;
    private javax.swing.JLabel roll_label;
    private javax.swing.JPanel save_panel;
    private javax.swing.JLabel wel_label;
    private javax.swing.JLabel welcome_label;
    private javax.swing.JPanel welcome_panel;
    // End of variables declaration//GEN-END:variables
}
