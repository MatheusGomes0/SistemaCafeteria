/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemaCafeteria;


import java.util.ArrayList;
import java.util.Iterator;
import modelo.Categoria;
import modelo.Produto;
import dao.CategoriaDao;
import dao.ProdutoDao;
/**
 *Tela para cadastrar um produto
 * @author mathe
 */
public class CadastraProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastraProduto
     */
    public CadastraProduto() {
        initComponents();
        btnAdicionar.setEnabled(false);
    }

    /**
     * Verifica se todos os campos estão preenchidos da forma correta
     */
    public void validarCampos(){
        String nome = txtNomeProduto.getText();
        String preco = txtPreco.getText();
        if(!nome.equals("") && !preco.equals("")){
            btnAdicionar.setEnabled(true);
        } else {
             btnAdicionar.setEnabled(false);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JComboBox<>();
        txtPreco = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 135));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Cadastrar Produto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnFechar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 76, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 172, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Categoria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 218, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Preço");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 264, -1, -1));

        txtNomeProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyReleased(evt);
            }
        });
        getContentPane().add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 168, 269, -1));

        txtCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 214, 269, -1));

        txtPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoKeyReleased(evt);
            }
        });
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 260, 269, -1));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 324, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background_Cafeteria.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyReleased
        // TODO add your handling code here:
        validarCampos();
    }//GEN-LAST:event_txtNomeProdutoKeyReleased

    private void txtPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyReleased
        // TODO add your handling code here:
        validarCampos();
    }//GEN-LAST:event_txtPrecoKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        /**
         * Para mostrar as categorias disponíveis em formato de lista
         */
        ArrayList<Categoria> list = CategoriaDao.getAllRecords();
        Iterator<Categoria> itr = list.iterator();
        while(itr.hasNext()){
            Categoria categoriaObj = itr.next();
            txtCategoria.addItem(categoriaObj.getName());
        }
    }//GEN-LAST:event_formComponentShown

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Produto produto = new Produto();
        produto.setNome(txtNomeProduto.getText());
        produto.setCategoria((String) txtCategoria.getSelectedItem());
        produto.setPreco(txtPreco.getText());
        ProdutoDao.adicionar(produto);
        setVisible(false);
        new CadastraProduto().setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnFecharActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
