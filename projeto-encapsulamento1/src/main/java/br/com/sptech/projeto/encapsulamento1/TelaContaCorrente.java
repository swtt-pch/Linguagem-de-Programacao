/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sptech.projeto.encapsulamento1;

import java.awt.Color;

/**
 *
 * @author igrey
 */
public class TelaContaCorrente extends javax.swing.JFrame {
    private ContaCorrente cc;
    
    
    public TelaContaCorrente(ContaCorrente cc) {
        initComponents();
        this.cc = cc;
        lblResultadoNome.setText(cc.getNome());
        lblResultadoSaldo.setText(String.format("%.2f", cc.getSaldo()));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inpValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblResultadoNome = new javax.swing.JLabel();
        lblResultadoSaldo = new javax.swing.JLabel();
        lblOperacao = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inpValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor:");

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome:");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldo.setText("Saldo:");

        lblResultadoNome.setText("opa");

        lblResultadoSaldo.setText("opa");

        lblOperacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSacar)
                        .addGap(51, 51, 51)
                        .addComponent(btnDepositar))
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(inpValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultadoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultadoSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addComponent(lblOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblResultadoNome)
                    .addComponent(lblSaldo)
                    .addComponent(lblResultadoSaldo)
                    .addComponent(lblOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar))
                .addGap(43, 43, 43)
                .addComponent(lblMsg)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpValorActionPerformed
        
    }//GEN-LAST:event_inpValorActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        lblMsg.setText("");
        if (inpValor.getText().equals("")) {
            inpValor.setText("0");
        } 
        if(Double.valueOf(inpValor.getText())< 0){
            lblMsg.setText("Impossível fazer operações com números negativos");
        } else {
            if (cc.getSaldo()<0) {
                lblMsg.setText("O saldo já está em um nível negativo, não da pra sacar");
            } else {
                lblOperacao.setForeground(Color.red);
                lblOperacao.setText(String.format("-%.2f",Double.valueOf(inpValor.getText())));
                cc.sacar(Double.valueOf(inpValor.getText()));
                lblResultadoSaldo.setText(String.format("%.2f", cc.getSaldo()));
                inpValor.setText("");
            }
        }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        lblMsg.setText("");
        if (inpValor.getText().equals("")) {
            inpValor.setText("0");
        } 
        if(Double.valueOf(inpValor.getText())< 0){
            lblMsg.setText("Impossível fazer operações com números negativos");
        } else {
            lblOperacao.setForeground(Color.blue);
            lblOperacao.setText(String.format("+%.2f",Double.valueOf(inpValor.getText())));
            cc.depositar(Double.valueOf(inpValor.getText()));
            lblResultadoSaldo.setText(String.format("%.2f", cc.getSaldo()));
            inpValor.setText("");
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JTextField inpValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblResultadoNome;
    private javax.swing.JLabel lblResultadoSaldo;
    private javax.swing.JLabel lblSaldo;
    // End of variables declaration//GEN-END:variables
}