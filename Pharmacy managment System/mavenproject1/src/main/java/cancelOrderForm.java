
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pc
 */
public class cancelOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form cancelOrderForm
     */
    public cancelOrderForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        orderIdTextField = new javax.swing.JTextField();
        cancelOrderbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnOrderMedicine = new javax.swing.JButton();
        btnViewOrders = new javax.swing.JButton();
        logOutbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Enter Order ID:");

        orderIdTextField.setBackground(new java.awt.Color(204, 204, 204));
        orderIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextFieldActionPerformed(evt);
            }
        });

        cancelOrderbtn.setBackground(new java.awt.Color(204, 204, 255));
        cancelOrderbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cancel Order", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cancelOrderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        btnOrderMedicine.setBackground(new java.awt.Color(204, 204, 255));
        btnOrderMedicine.setToolTipText("");
        btnOrderMedicine.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Place Order", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        btnOrderMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMedicineActionPerformed(evt);
            }
        });

        btnViewOrders.setBackground(new java.awt.Color(204, 204, 255));
        btnViewOrders.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Orders", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        logOutbtn.setBackground(new java.awt.Color(204, 204, 255));
        logOutbtn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log Out", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        logOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnOrderMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnOrderMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(logOutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("Cancel Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelOrderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(234, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(orderIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelOrderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextFieldActionPerformed

    private void btnOrderMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMedicineActionPerformed
        // TODO add your handling code here:
        PlaceOrderForm orderFrame = new PlaceOrderForm();
        orderFrame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnOrderMedicineActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        viewOrdersFrame viewFrame = new viewOrdersFrame() ;
        viewFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void cancelOrderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderbtnActionPerformed
        // TODO add your handling code here:
        String orderIdText = cancelOrderbtn.getText().trim();
    
    if (orderIdText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an Order ID", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        int orderId = Integer.parseInt(orderIdText);
        Client currentClient = Client.currentClient;
        
        if (currentClient == null) {
            JOptionPane.showMessageDialog(this, "No client logged in", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        Order orderToCancel = null;
        
        
        for (Order order : currentClient.getOrderHistory()) {
            if (order.getOrderID() == orderId) {
                orderToCancel = order;
                break;
            }
        }
        
        if (orderToCancel == null) {
            JOptionPane.showMessageDialog(this, "Order ID not found in your orders", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        for (Medicine med : orderToCancel.getMedicines()) {
            Medicine originalMed = Medicine.getMedbyName(med.getName());
            if (originalMed != null) {
                originalMed.setQuantity(originalMed.getQuantity() + med.getQuantity());
            }
        }
        
        
        currentClient.getOrderHistory().remove(orderToCancel);
        
        // Remove from allOrders list
        Order.getAllOrders().removeIf(order -> order.getOrderID() == orderId);
        
        
        Medicine.saveToFile("medicines.txt");
        
        String filenam = "C:\\Users\\pc\\OneDrive - The British University in Egypt\\Desktop\\java final project\\pharmacy system final\\pharmacy system\\mavenproject1\\src\\main\\java\\order.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filenam,true))) {
            for (Order order : Order.getAllOrders()) {
                writer.write(order.getOrderID() + "," + order.getClientID() + "," + order.getStatus() + ",");
                List<Medicine> meds = order.getMedicineList();
                for (int i = 0; i < meds.size(); i++) {
                    Medicine m = meds.get(i);
                    writer.write(m.getName() + ":" + m.getQuantity() + ":" + m.getPrice());
                    if (i < meds.size() - 1) {
                        writer.write(";");
                    }
                }
                writer.newLine();
            }
        }
        
        JOptionPane.showMessageDialog(this, 
            "Order #" + orderId + " has been completely removed from the system.",
            "Order Cancelled", 
            JOptionPane.INFORMATION_MESSAGE);
        
        cancelOrderbtn.setText("");
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid Order ID (numbers only)", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving changes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_cancelOrderbtnActionPerformed

    private void logOutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutbtnActionPerformed
        // TODO add your handling code here:
        LoginFrame login = new LoginFrame() ; 
        login.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_logOutbtnActionPerformed

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
            java.util.logging.Logger.getLogger(cancelOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cancelOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cancelOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cancelOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancelOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderMedicine;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JButton cancelOrderbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutbtn;
    private javax.swing.JTextField orderIdTextField;
    // End of variables declaration//GEN-END:variables
}
