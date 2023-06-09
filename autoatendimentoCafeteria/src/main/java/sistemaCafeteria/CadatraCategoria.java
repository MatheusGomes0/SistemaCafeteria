package sistemaCafeteria;

import modelo.Categoria;
import dao.CategoriaDao;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 * Tela para cadastrar uma categoria nova
 *
 * @author mathe
 */
public class CadatraCategoria extends javax.swing.JFrame {

    /**
     * Creates new form CadatraProduto
     */
    public CadatraCategoria() {
        initComponents();
        btnAdicionar.setEnabled(false);
    }

    /**
     * Verifica se todos os campos estão preenchidos da forma correta E se caso
     * estiver habilita o botão
     */
    public void validarCampo() {
        String categoria = txtNomeCategoria.getText();
        if (!categoria.equals("")) {
            btnAdicionar.setEnabled(true);
        } else {
            btnAdicionar.setEnabled(false);
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

        btnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCategoria = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 134));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadatrar Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Ver Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Categoria"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 291, 261));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Adicionar Categoria");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtNomeCategoria.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNomeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCategoriaActionPerformed(evt);
            }
        });
        txtNomeCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeCategoriaKeyReleased(evt);
            }
        });
        getContentPane().add(txtNomeCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 236, -1));

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        btnApagar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnApagar.setText("Apagar");
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background_Cafeteria.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        /**
         * Fecha a página de cadastrar categoria
         */

        setVisible(false);

    }//GEN-LAST:event_btnFecharActionPerformed

    private void txtNomeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCategoriaActionPerformed

    }//GEN-LAST:event_txtNomeCategoriaActionPerformed

    private void txtNomeCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeCategoriaKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        validarCampo();
    }//GEN-LAST:event_txtNomeCategoriaKeyReleased

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Categoria categoria = new Categoria();

        categoria.setName(txtNomeCategoria.getText());
        CategoriaDao.adicionar(categoria);
        setVisible(false);
        new CadatraCategoria().setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        /**
         * Escreve as categorias adicionadas na tabela
         */
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        ArrayList<Categoria> lista = CategoriaDao.getAllRecords();
        Iterator<Categoria> itr = lista.iterator();

        while (itr.hasNext()) {
            Categoria categoriaObj = itr.next();
            dtm.addRow(new Object[]{categoriaObj.getId(), categoriaObj.getName()});

        }
    }//GEN-LAST:event_formComponentShown

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadatraCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtNomeCategoria;
    // End of variables declaration//GEN-END:variables
}
