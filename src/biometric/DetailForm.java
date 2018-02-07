/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biometric;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vibodha
 */
public class DetailForm extends javax.swing.JFrame {

    /**
     * Creates new form DetailForm
     */
    //DefaultTableModel tableModel;
            
    private String state="";
    private BiometricModel biometricModel = new BiometricModel();
    private Message message;
    private int unLoginCount=0;
    
    public DetailForm() {
        initComponents();
        //tableModel = new DefaultTableModel();
        //table_detail.setModel(tableModel);
        
        txt_name.setVisible(false);
        lbl_name.setVisible(false);
        lbl_heading.setVisible(false);
    }
    
    public void setLogin(){
        lbl_heading.setText("Log In");
        lbl_heading.setVisible(true);
        btn_ok.setText("Log In");
        state="l";
    }
    
    public void setSighUp(){
        lbl_heading.setText("Sign Up");
        lbl_heading.setVisible(true);
        txt_name.setVisible(true);
        lbl_name.setVisible(true);
        btn_ok.setText("Sign In");
        state="s";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_heading = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_detail = new javax.swing.JTable();
        lbl_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_name.setText("Name");

        lbl_heading.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_heading.setMaximumSize(new java.awt.Dimension(197, 22));
        lbl_heading.setMinimumSize(new java.awt.Dimension(197, 22));
        lbl_heading.setPreferredSize(new java.awt.Dimension(197, 22));

        txt_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_name.setMaximumSize(new java.awt.Dimension(160, 23));
        txt_name.setMinimumSize(new java.awt.Dimension(160, 23));
        txt_name.setPreferredSize(new java.awt.Dimension(160, 23));

        btn_ok.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        table_detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Thumb", null, null, null},
                {"Index Finger", null, null, null},
                {"Middle Finger", null, null, null},
                {"Ring Finger", null, null, null},
                {"Pincki", null, null, null}
            },
            new String [] {
                "", "Length of the Finget", "Width of the Finger", "Length from tip of the finger to first division"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_detail);
        if (table_detail.getColumnModel().getColumnCount() > 0) {
            table_detail.getColumnModel().getColumn(0).setMinWidth(100);
            table_detail.getColumnModel().getColumn(0).setPreferredWidth(100);
            table_detail.getColumnModel().getColumn(0).setMaxWidth(100);
            table_detail.getColumnModel().getColumn(1).setMinWidth(150);
            table_detail.getColumnModel().getColumn(1).setPreferredWidth(150);
            table_detail.getColumnModel().getColumn(1).setMaxWidth(150);
            table_detail.getColumnModel().getColumn(2).setMinWidth(150);
            table_detail.getColumnModel().getColumn(2).setPreferredWidth(150);
            table_detail.getColumnModel().getColumn(2).setMaxWidth(150);
            table_detail.getColumnModel().getColumn(3).setMinWidth(300);
            table_detail.getColumnModel().getColumn(3).setPreferredWidth(300);
            table_detail.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        lbl_message.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_message.setMaximumSize(new java.awt.Dimension(197, 22));
        lbl_message.setMinimumSize(new java.awt.Dimension(197, 22));
        lbl_message.setPreferredSize(new java.awt.Dimension(197, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_name)
                                .addGap(113, 113, 113)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbl_message, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here:
        
     
       Finger finger = null;
       ArrayList<Finger> fingers = new ArrayList<Finger>();
       User user;
        
       if(state.equals("s")){
          // System.out.println(table_detail.getRowCount());
       for(int i=0;i<5;i++){
           
           //System.out.println((String)table_detail.getValueAt(0, 0));
          try{  
              if(Float.valueOf((String)table_detail.getValueAt(i, 1))<0 || Float.valueOf((String)table_detail.getValueAt(i, 2))<0 || Float.valueOf((String)table_detail.getValueAt(i, 3))<0){
              lbl_message.setText("Input Can Not Be Negative!");
              //System.out.println(i);
              return;
          }
              else{
            finger = new Finger(Float.valueOf((String)table_detail.getValueAt(i, 1)),Float.valueOf((String)table_detail.getValueAt(i, 2)),Float.valueOf((String)table_detail.getValueAt(i, 3)));  
          }
          } 
          catch(NullPointerException e){
              lbl_message.setText("Input Can Not Be Empty!");
              //System.out.println(i);
              return;
          }
          catch(NumberFormatException e){
              lbl_message.setText("Input Format Invalied!");
              //System.out.println(i);
              return;
          }
          fingers.add(finger);
       } 
       if(txt_name.getText().equals(null) || txt_name.getText().equals("")){
           lbl_message.setText("Enter The name of the User!");
           return;
       }
      else{
       user = new User(txt_name.getText(),fingers);
       biometricModel.saveUser(user);
       message = new  Message();
       message.setSign();
       message.setVisible(true);
       this.setVisible(false);
       }
        }
       else if(state.equals("l")){
           for(int i=0;i<5;i++){
           
           //System.out.println((String)table_detail.getValueAt(0, 0));
          try{  
            if(Float.valueOf((String)table_detail.getValueAt(i, 1))<0 || Float.valueOf((String)table_detail.getValueAt(i, 2))<0 || Float.valueOf((String)table_detail.getValueAt(i, 3))<0){
              lbl_message.setText("Input Can Not Be Negative!");
              //System.out.println(i);
              return;
          }
              else{
            finger = new Finger(Float.valueOf((String)table_detail.getValueAt(i, 1)),Float.valueOf((String)table_detail.getValueAt(i, 2)),Float.valueOf((String)table_detail.getValueAt(i, 3)));  
          }
          } 
          catch(NullPointerException e){
              lbl_message.setText("Input Can Not Be Empty!");
              System.out.println(i);
              return;
          }
          catch(NumberFormatException e){
              lbl_message.setText("Input Format Invalied!");
              System.out.println(i);
              return;
          }
          fingers.add(finger);
       } 
           user = new User(txt_name.getText(),fingers);
           user=biometricModel.getBestConfidanceUser(user);
           if(user==null){
               if(unLoginCount<3){
                   unLoginCount++;
                   lbl_message.setText("Values you entered does not matched! "+(3-unLoginCount)+" tries available.");
                   return;
               }
               else{
           message = new  Message();
           message.setLogin("");
           message.setVisible(true);
           this.setVisible(false);
               }
           }
           else{
               message = new  Message();
           message.setLogin(user.getName());
           message.setVisible(true);
           this.setVisible(false);
           }
          
       }
    }//GEN-LAST:event_btn_okActionPerformed

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
            java.util.logging.Logger.getLogger(DetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JTable table_detail;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
