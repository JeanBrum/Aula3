/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import javax.swing.JOptionPane;

/**
 *
 * @author jean.brum
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Pessoa pessoa1;
    Pessoa pessoa2;    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        pessoa1 = new Pessoa();
        pessoa2 = new Pessoa();
        
        pessoa1.setCodigo(1);
        pessoa1.setNome("Juca");
        pessoa1.setEndereco("Lajeado");
        pessoa1.setTelefone("190");
        pessoa1.setValorConta(500);
        pessoa1.setChequeEspecial(1000);
       
        
        pessoa2.setCodigo(2);
        pessoa2.setNome("João");
        pessoa2.setValorConta(1000);
        pessoa2.setChequeEspecial(1000);
        
        
        // Nome
        lblNome.setText(pessoa1.getNome());
        lblNome2.setText(pessoa2.getNome());
        
        // Saldo
        lblSaldo.setText(Double.toString(pessoa1.getValorConta()));
        lblSaldo2.setText(Double.toString(pessoa2.getValorConta()));
        
        // Cheque especial
        lblChequeEspecial.setText(Double.toString(pessoa1.getChequeEspecial()));
        lblChequeEspecial2.setText(Double.toString(pessoa2.getChequeEspecial()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblChequeEspecial = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblChequeEspecial2 = new javax.swing.JLabel();
        lblSaldo2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        txtTrans2 = new javax.swing.JTextField();
        txtTrans1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Transferência");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        lblChequeEspecial.setText("Cheque especial:");
        getContentPane().add(lblChequeEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        lblSaldo.setText("Saldo:");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblNome.setText("Nome:");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton2.setText("Transferência");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, -1));

        lblChequeEspecial2.setText("Cheque especial:");
        getContentPane().add(lblChequeEspecial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, -1));

        lblSaldo2.setText("Saldo:");
        getContentPane().add(lblSaldo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        lblNome2.setText("Nome:");
        getContentPane().add(lblNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
        getContentPane().add(txtTrans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, -1));
        getContentPane().add(txtTrans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(pessoa1.credito(Double.parseDouble(txtTrans1.getText())) == true){
            pessoa2.debito(Double.parseDouble(txtTrans1.getText()));           
            
            }
            lblSaldo.setText(Double.toString(pessoa1.getValorConta()));
            lblSaldo2.setText(Double.toString(pessoa2.getValorConta()));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inválido!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if(pessoa2.credito(Double.parseDouble(txtTrans2.getText())) == true){
                pessoa1.debito(Double.parseDouble(txtTrans2.getText()));           
            
            }
            lblSaldo.setText(Double.toString(pessoa1.getValorConta()));
            lblSaldo2.setText(Double.toString(pessoa2.getValorConta()));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inválido!");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblChequeEspecial;
    private javax.swing.JLabel lblChequeEspecial2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldo2;
    private javax.swing.JTextField txtTrans1;
    private javax.swing.JTextField txtTrans2;
    // End of variables declaration//GEN-END:variables
}