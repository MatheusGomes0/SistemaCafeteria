package sistemaCafeteria;

import dao.CategoriaDao;
import dao.ItensPedidoDao;
import dao.PedidoDao;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import dao.ProdutoDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.TableModel;
import modelo.Categoria;
import modelo.ItensPedido;
import modelo.Pedido;
import modelo.Produto;

/**
 * Tela para fazer o pedido
 *
 * @author mathe
 */
public class FazerPedido extends javax.swing.JFrame {

    public int pedidoId = 1;
    public int totalPedido = 0;
    public int produtoPreco = 0;
    public int produtoTotal = 0;
    public String usuarioEmail;

    /**
     * Creates new form Pagamento
     */
    public FazerPedido() {
        initComponents();
    }

    public FazerPedido(String email) {
        initComponents();
        txtProdutoNome.setEditable(false);
        txtPreco.setEditable(false);
        txtProdutoTotal.setEditable(false);
        btnAddCarrinho.setEnabled(false);
        usuarioEmail = email;

    }

    /**
     * Seleciona os produtos disponíveis de acordo com a categoria escolhida
     *
     * @param categoria
     */
    public void produtoNomeByCategoria(String categoria) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Produto> lista = ProdutoDao.getAllRecordsByCategoria(categoria);
        for (Produto produtoObj : lista) {
            dtm.addRow(new Object[]{produtoObj.getNome()});
        }
    }

    /**
     * Filtra os produtos pelo seu nome
     *
     * @param nome
     * @param categoria
     */
    public void filterProdutoByNome(String nome, String categoria) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Produto> lista = ProdutoDao.filterProdutoByNome(nome, categoria);
        Iterator<Produto> itr = lista.iterator();
        while (itr.hasNext()) {
            Produto produtoObj = itr.next();
            dtm.addRow(new Object[]{produtoObj.getNome()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCliTelefone = new javax.swing.JTextField();
        txtCliNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCliEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtProdutoTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnAddCarrinho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        lblTotalPedido = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        jblID = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Fazer pedido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 34, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 110, 110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID Conta: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Detalhes do cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 137, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 175, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Telefone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 246, -1, -1));

        txtCliTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtCliTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 269, -1));

        txtCliNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtCliNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 269, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        txtCliEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtCliEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 269, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Categoria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Café" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 255, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Capuccino"},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 255, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nome");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        txtProdutoTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProdutoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtProdutoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 249, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Preço");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, -1, -1));

        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 249, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Quantidade");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, null, 5, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 249, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Total");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, -1, -1));

        txtPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 249, -1));

        btnAddCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddCarrinho.setText("Adicionar ao carrinho");
        btnAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 400, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Quantidade", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 550, 290));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Total do pedido: R$");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 800, -1, -1));

        lblTotalPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalPedido.setText("000");
        getContentPane().add(lblTotalPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 800, -1, -1));

        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 800, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Nome");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Pesquisar");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        txtProdutoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProdutoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtProdutoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 249, -1));

        jblID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jblID.setText("1");
        getContentPane().add(jblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackgroundFull_Cafeteria.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoTotalActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Entrada(usuarioEmail).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtProdutoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoNomeActionPerformed


    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        pedidoId = Integer.parseInt(PedidoDao.getId());
        jblID.setText(PedidoDao.getId());
        ArrayList<Categoria> list = CategoriaDao.getAllRecords();
        Iterator<Categoria> itr = list.iterator();
        while (itr.hasNext()) {
            Categoria categoriaObj = itr.next();
            jComboBox1.addItem(categoriaObj.getName());
        }
        String categoria = (String) jComboBox1.getSelectedItem();
        produtoNomeByCategoria(categoria);
    }//GEN-LAST:event_formComponentShown

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:
        String nome = txtPesquisar.getText();
        String categoria = (String) jComboBox1.getSelectedItem();
        filterProdutoByNome(nome, categoria);
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel modelo = jTable1.getModel();
        String produtoNome = modelo.getValueAt(index, 0).toString();
        Produto produto = ProdutoDao.getProdutoByName(produtoNome);
        txtProdutoNome.setText(produto.getNome());
        txtPreco.setText(produto.getPreco());
        jSpinner1.setValue(1);
        txtProdutoTotal.setText(produto.getPreco());
        produtoPreco = (int) Double.parseDouble(produto.getPreco());
        produtoTotal = (int) Double.parseDouble(produto.getPreco());
        btnAddCarrinho.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int quantidade = (Integer) jSpinner1.getValue();

        jSpinner1.setValue(quantidade);

        produtoTotal = produtoPreco * quantidade;
        txtProdutoTotal.setText(String.valueOf(produtoTotal));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String categoria = (String) jComboBox1.getSelectedItem();
        produtoNomeByCategoria(categoria);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarrinhoActionPerformed
        // TODO add your handling code here:
        String nome = txtProdutoNome.getText();
        String preco = txtPreco.getText();
        String quantidade = String.valueOf(jSpinner1.getValue());
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.addRow(new Object[]{nome, preco, quantidade, produtoPreco});
        produtoTotal += produtoPreco;
        lblTotalPedido.setText(String.valueOf(produtoTotal));

    }//GEN-LAST:event_btnAddCarrinhoActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        int quantidade = (Integer) jSpinner1.getValue();

        jSpinner1.setValue(quantidade);
        String clienteNome = txtCliNome.getText();
        String clienteTelefone = txtCliTelefone.getText();
        String clienteEmail = txtCliEmail.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date data = new Date();
        String dataHoje = dFormat.format(data);
        String total = String.valueOf(produtoTotal);
        Pedido pedido = new Pedido();
        pedido.setId(pedidoId);
        pedido.setNome(clienteNome);
        pedido.setTelefone(clienteTelefone);
        pedido.setEmail(clienteEmail);
        pedido.setData(dataHoje);
        pedido.setTotal(total);
        PedidoDao.salvar(pedido);
        ItensPedido itensPedido = new ItensPedido();
        itensPedido.setCod_item(1 + pedidoId);
        itensPedido.setQtn_itens(quantidade);
        ItensPedidoDao.salvar(itensPedido);
        //ir direto para a tela de pagamento
        setVisible(false);
        new TelaPagamento().setVisible(true);
    }//GEN-LAST:event_btnPagarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCarrinho;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jblID;
    private javax.swing.JLabel lblTotalPedido;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField txtCliEmail;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtCliTelefone;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoTotal;
    // End of variables declaration//GEN-END:variables
}
