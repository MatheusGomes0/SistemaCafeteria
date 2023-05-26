/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaCafeteria;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Entrada extends javax.swing.JFrame {
public String email;
    /**
     * Creates new form Entrada
     */
    public Entrada() {
        initComponents();
    }

    public Entrada(String clienteEmail) {
        initComponents();
        email = clienteEmail;
        
        /**
         * Se não for o admin logando no sistema 
         * Não mostrar os botões de  cadastrar e deletar produtos 
         */
        if(!email.equals("admin@gmail.com")){
            btnNovoProduto.setVisible(false);
            btnDeletarProduto.setVisible(false);
            btnCategoria.setVisible(false);
        }
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnNovoProduto = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jButton1.setText("Pagamento");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jButton2.setText("Status");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 114, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jButton3.setText("Conta");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 114, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jButton4.setText("Cardápio");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 114, -1));

        btnSair.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jButton6.setText("Conta");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 114, -1));

        btnNovoProduto.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnNovoProduto.setText("Novo produto");
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 190, -1));

        btnDeletarProduto.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDeletarProduto.setText("Deletar Produto");
        getContentPane().add(btnDeletarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 190, -1));

        btnCategoria.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnCategoria.setText("Adicionar Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background_Cafeteria.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        /**
         * Se ele escolher sair, voltar a tela de login
         */
        int sair = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Escolha", JOptionPane.YES_NO_OPTION);
        if (sair == 0) {
            System.exit(0);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        // TODO add your handling code here:
        new CadatraCategoria().setVisible(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
