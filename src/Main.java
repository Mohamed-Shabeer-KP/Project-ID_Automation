
import com.sun.glass.ui.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOHAMED SHABEER KP
 */
public class Main extends javax.swing.JFrame {

    String path;
    File file;
    DefaultTableModel display_table_model;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        selection_panel = new javax.swing.JPanel();
        welcome_label = new javax.swing.JLabel();
        select_button = new javax.swing.JButton();
        header_panel = new javax.swing.JPanel();
        file_name_label = new javax.swing.JLabel();
        main_table_panel = new javax.swing.JPanel();
        main_table_scroll_panel = new javax.swing.JScrollPane();
        main_table = new javax.swing.JTable();
        reg_selection_panel = new javax.swing.JPanel();
        reg_textfield = new javax.swing.JTextField();
        select_dropdown = new javax.swing.JComboBox<>();
        reg_button = new javax.swing.JButton();
        reg_dropdown_label = new javax.swing.JLabel();
        reg_heading_label = new javax.swing.JLabel();
        student_info_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        result_display_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_tabel = new javax.swing.JTable();
        submit_panel = new javax.swing.JPanel();
        submit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ID CARD AUTOMATED GENERATION - BETA 1.0");
        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(1630, 820));
        setResizable(false);
        setSize(new java.awt.Dimension(1630, 820));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 150, 221), 4, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1510, 715));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selection_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 3, true));
        selection_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        welcome_label.setText("ID CARD GENERATOR");
        selection_panel.add(welcome_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, -1));

        select_button.setBackground(new java.awt.Color(51, 153, 255));
        select_button.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        select_button.setForeground(new java.awt.Color(255, 255, 255));
        select_button.setText("SELECT CSV FILE");
        select_button.setToolTipText("Click here to select the excel file (.csv).");
        select_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_buttonActionPerformed(evt);
            }
        });
        selection_panel.add(select_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 170, 50));

        jPanel1.add(selection_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 283, 190));

        header_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(160, 34, 160), 4, true));
        header_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        file_name_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        file_name_label.setText("WELCOME TO ID CARD GENERATOR");
        header_panel.add(file_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, -1, 30));

        jPanel1.add(header_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 7, 1200, 39));

        main_table_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 192, 197), 2, true));
        main_table_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    main_table.getTableHeader().setReorderingAllowed(false);
    main_table_scroll_panel.setViewportView(main_table);

    main_table_panel.add(main_table_scroll_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 430));

    jPanel1.add(main_table_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 58, -1, -1));

    reg_selection_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 3, true));
    reg_selection_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    reg_textfield.setVisible(false);
    reg_selection_panel.add(reg_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 90, 150, 32));

    select_dropdown.setVisible(false);
    select_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>());

    org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, reg_textfield, org.jdesktop.beansbinding.ELProperty.create("${text}"), select_dropdown, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
    bindingGroup.addBinding(binding);

    select_dropdown.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            select_dropdownActionPerformed(evt);
        }
    });
    reg_selection_panel.add(select_dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 140, 150, -1));

    reg_button.setVisible(false);
    reg_button.setBackground(new java.awt.Color(51, 153, 255));
    reg_button.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
    reg_button.setForeground(new java.awt.Color(255, 255, 255));
    reg_button.setText("CONFIRM");
    reg_button.setToolTipText("Click here to confirm the selected student.");
    reg_button.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            reg_buttonActionPerformed(evt);
        }
    });
    reg_selection_panel.add(reg_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 120, 40));

    reg_dropdown_label.setVisible(false);
    reg_dropdown_label.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
    reg_dropdown_label.setText("Register no :");
    reg_selection_panel.add(reg_dropdown_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

    reg_heading_label.setVisible(false);
    reg_heading_label.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
    reg_heading_label.setText("SELECT  STUDENT");
    reg_selection_panel.add(reg_heading_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, 20));

    jPanel1.add(reg_selection_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 209, 283, 413));

    student_info_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
    jLabel1.setText("Selected Student Information");
    student_info_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 40));

    jPanel1.add(student_info_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 494, 1210, 52));

    result_display_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 192, 197), 2, true));
    result_display_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    display_tabel.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {}
        },
        new String [] {

        }
    )
    {public boolean isCellEditable(int row, int column){return false;}}
    );
    display_tabel.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(display_tabel);

    result_display_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

    jPanel1.add(result_display_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 552, -1, -1));

    submit_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    submit_button.setVisible(false);
    submit_button.setBackground(new java.awt.Color(51, 153, 255));
    submit_button.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
    submit_button.setForeground(new java.awt.Color(255, 255, 255));
    submit_button.setText("SUBMIT");
    submit_button.setToolTipText("Click this button for generating the ID card of the selected student.");
    submit_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    submit_button.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            submit_buttonActionPerformed(evt);
        }
    });
    submit_panel.add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 200, 64));

    jPanel1.add(submit_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 1490, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(44, 44, 44)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(76, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(65, Short.MAX_VALUE))
    );

    bindingGroup.bind();

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void select_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_buttonActionPerformed
        JFileChooser jfc = new JFileChooser(); 
        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
                File selectedSourceFile = jfc.getSelectedFile();
                String fname=selectedSourceFile.getName();
                int typePos =fname.lastIndexOf(".");
                String ftype=fname.substring(typePos,fname.length());
               
                if(".csv".equals(ftype))
                {
                   file_name_label.setText(fname);
                   path=selectedSourceFile.getAbsolutePath();
                
                   file =new File(path);
        try {
           
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
             
            DefaultTableModel model =(DefaultTableModel)main_table.getModel();
            model.setRowCount(0);
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
           
            for(int i =0;i<tableLines.length;i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                   }
            reg_dropdown_label.setVisible(true);
            reg_heading_label.setVisible(true);
            reg_textfield.setVisible(true);
            select_dropdown.setVisible(true);
            reg_button.setVisible(true);
                 }
                 else
                      JOptionPane.showMessageDialog(null, "Select A Valid CSV file", "Invalid File " , JOptionPane.INFORMATION_MESSAGE);
                
            DefaultTableModel model1 =(DefaultTableModel)main_table.getModel();
            String[] regArr =  new String[model1.getRowCount()];
            for(int i=0;i<model1.getRowCount();i++)
            {
                regArr[i] = String.valueOf(model1.getValueAt(i,0));
                select_dropdown.addItem(regArr[i]);
            }   

        }
    }//GEN-LAST:event_select_buttonActionPerformed

    private void reg_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_buttonActionPerformed
        DefaultTableModel main_table_model =(DefaultTableModel)main_table.getModel();
        display_table_model =(DefaultTableModel)display_tabel.getModel();
        String regno = reg_textfield.getText();
        int flag=0;
        
        for(int i=0;i<main_table_model.getRowCount();i++)
        {
        if(main_table_model.getValueAt(i, 0) .equals(regno))
         {
                BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine().trim();
                String[] columnsName = firstLine.split(",");
                display_table_model.setRowCount(0);
                display_table_model.setColumnIdentifiers(columnsName);
                
                Object[] tableLines = br.lines().toArray();
       
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                display_table_model.addRow(dataRow);
            
                } catch (Exception ex) 
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
     
           flag=1;
         }
      
        }
        if(flag!=1)
                JOptionPane.showMessageDialog(null, "No match Found", " ERROR " , JOptionPane.INFORMATION_MESSAGE);
        
        submit_button.setVisible(true);
        
    }//GEN-LAST:event_reg_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        this.dispose();
        String name=String.valueOf(display_table_model.getValueAt(0, 0));
        String roll=String.valueOf(display_table_model.getValueAt(0, 1));
        String course=String.valueOf(display_table_model.getValueAt(0, 2));
        new Design(name,roll,course).setVisible(true);
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void select_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_dropdownActionPerformed

 
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable display_tabel;
    private javax.swing.JLabel file_name_label;
    private javax.swing.JPanel header_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable main_table;
    private javax.swing.JPanel main_table_panel;
    private javax.swing.JScrollPane main_table_scroll_panel;
    private javax.swing.JButton reg_button;
    private javax.swing.JLabel reg_dropdown_label;
    private javax.swing.JLabel reg_heading_label;
    private javax.swing.JPanel reg_selection_panel;
    private javax.swing.JTextField reg_textfield;
    private javax.swing.JPanel result_display_panel;
    private javax.swing.JButton select_button;
    private javax.swing.JComboBox<String> select_dropdown;
    private javax.swing.JPanel selection_panel;
    private javax.swing.JPanel student_info_panel;
    private javax.swing.JButton submit_button;
    private javax.swing.JPanel submit_panel;
    private javax.swing.JLabel welcome_label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
