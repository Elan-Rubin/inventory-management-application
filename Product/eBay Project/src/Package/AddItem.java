/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.io.IOException;

/**
 *
 * @author eland
 */
public class AddItem extends javax.swing.JFrame {
    String name;
    String description;
    double price;
    int amount;
    ItemStatus status;
    ItemFlag flag;
    
    public static ItemManager manager;
    public static ShowItems showItems;
    
    public int multiplier;
    
    /**
     * Creates new form AddItem
     */
    public AddItem() {
        initComponents();
        setLocation(0,245);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ErrorMessage = new javax.swing.JLabel();
        DoneButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NameField = new javax.swing.JTextPane();
        ItemName = new javax.swing.JLabel();
        ItemDescription = new javax.swing.JLabel();
        ItemPrice = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        AmountField = new javax.swing.JSpinner();
        ItemAmount = new javax.swing.JLabel();
        StatusField = new javax.swing.JComboBox<>();
        LItemStatus = new javax.swing.JLabel();
        LItemFlag = new javax.swing.JLabel();
        FlagField = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionField = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ErrorMessage.setBackground(new java.awt.Color(255, 0, 0));
        ErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        DoneButton.setText("Done!");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(NameField);

        ItemName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemName.setText("Item name:");

        ItemDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemDescription.setText("Item description:");

        ItemPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemPrice.setText("Item price:");

        PriceField.setText("00.00");

        AmountField.setModel(new javax.swing.SpinnerNumberModel(1, 0, 100, 1));
        AmountField.setEditor(new javax.swing.JSpinner.NumberEditor(AmountField, ""));
        AmountField.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AmountFieldStateChanged(evt);
            }
        });

        ItemAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemAmount.setText("Amount:");

        StatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Here", "Coming", "Sold" }));
        StatusField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LItemStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LItemStatus.setText("Item status:");

        LItemFlag.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LItemFlag.setText("Flag:");

        FlagField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No flag", "Red", "Orange", "Yellow", "Green" }));
        FlagField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jScrollPane2.setViewportView(DescriptionField);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add a new item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ItemPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LItemStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LItemFlag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(StatusField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PriceField)
                            .addComponent(FlagField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 148, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoneButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(ItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LItemStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LItemFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlagField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
        // TODO add your handling code here:
        //Item item = new Item(0,name,price,"",description,amount,status,flag); NOT DONE HERE!
        if(NameField.getText().equals("")){
            ErrorMessage.setText("Error! Not filled in!");
        }
        else{
            Item newItem = new Item(
                    0,
                    NameField.getText(),
                    Double.parseDouble(PriceField.getText()),
                    "",
                    DescriptionField.getText(),
                    Integer.parseInt(AmountField.getValue().toString()),
                    ItemStatus.stringToStatus(StatusField.getSelectedItem().toString()),
                    ItemFlag.stringToFlag(FlagField.getSelectedItem().toString()));
            System.out.println("Added new item: "+newItem.turnIntoString());
            manager.addItem(newItem);
            try {
                ItemManager.writeData(manager.dataToWrite());
            } 
            catch (IOException e) {
                System.out.println("Oh darn! Not another IO Exception!");
            }
            showItems.refreshTable();
            setVisible(false);
        }
    }//GEN-LAST:event_DoneButtonActionPerformed

    private void AmountFieldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AmountFieldStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountFieldStateChanged

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
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }
    
    public static void setManager(ItemManager newManager){
        manager = newManager;
    }
    public static void setShowItems(ShowItems newShowItems){
        showItems = newShowItems;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AmountField;
    private javax.swing.JTextPane DescriptionField;
    private javax.swing.JButton DoneButton;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JComboBox<String> FlagField;
    private javax.swing.JLabel ItemAmount;
    private javax.swing.JLabel ItemDescription;
    private javax.swing.JLabel ItemName;
    private javax.swing.JLabel ItemPrice;
    private javax.swing.JLabel LItemFlag;
    private javax.swing.JLabel LItemStatus;
    private javax.swing.JTextPane NameField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JComboBox<String> StatusField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}