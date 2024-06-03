/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.FerramentaDAO;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;

/**
 *
 * @author leand
 */
public class JFGerenciarFerramentas extends javax.swing.JFrame {

    /**
     * Creates new form JFGerenciarFerramentas
     */
    public JFGerenciarFerramentas() {
        initComponents();
        renderFerramentasTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTFerramentas = new javax.swing.JTable();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFRemoverId = new javax.swing.JTextField();
        JBAplicar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar ferramentas");

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        JTFerramentas.setBackground(new java.awt.Color(204, 204, 204));
        JTFerramentas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JTFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Preço de Aquisição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTFerramentas.setGridColor(new java.awt.Color(51, 51, 51));
        JTFerramentas.setShowGrid(false);
        jScrollPane1.setViewportView(JTFerramentas);

        JBAdicionar.setBackground(new java.awt.Color(73, 159, 104));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBRemover.setBackground(new java.awt.Color(186, 63, 29));
        JBRemover.setText("Remover");
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço de Aquisição");

        JTFPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade");

        JTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Id");

        JTFRemoverId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFRemoverIdActionPerformed(evt);
            }
        });

        JBAplicar.setBackground(new java.awt.Color(54, 70, 125));
        JBAplicar.setText("Aplicar Mudanças");
        JBAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(JBAplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFRemoverId)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(JTFNome)
                    .addComponent(JTFPreco)
                    .addComponent(JTFQuantidade)
                    .addComponent(JBRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFRemoverId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBAplicar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 71, 119));

        jMenu1.setBackground(new java.awt.Color(255, 255, 252));
        jMenu1.setForeground(new java.awt.Color(255, 255, 252));
        jMenu1.setText("Gerenciamento");

        jMenuItem1.setText("Gerenciar clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Gerenciar ferramentas");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 252));
        jMenu2.setForeground(new java.awt.Color(255, 255, 252));
        jMenu2.setText("Configurações");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void renderFerramentasTable() {
        FerramentaDAO dao = new FerramentaDAO();
        DefaultTableModel model = (DefaultTableModel) JTFerramentas.getModel();
        while (model.getRowCount() != 0) {
            model.removeRow(0);
        }
        for (Ferramenta ferros : dao.getMinhaLista()) {
            model.addRow(new Object[]{ferros.getId(), ferros.getNome(), ferros.getPreco_de_aquisicao(), ferros.getQuantidade()});
        }
    }

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        FerramentaDAO dao = new FerramentaDAO();
        String nome = JTFNome.getText();
        int quant = Integer.parseInt(JTFQuantidade.getText());
        double preco = Double.parseDouble(JTFPreco.getText());
        dao.insertFerramentaBD(new Ferramenta(nome, dao.maiorID() + 1, preco, quant));
        
        renderFerramentasTable();
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JTFPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPrecoActionPerformed

    private void JTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuantidadeActionPerformed

    private void JTFRemoverIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFRemoverIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFRemoverIdActionPerformed

    private void JBAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAplicarActionPerformed
        FerramentaDAO dao = new FerramentaDAO();
        for (int i = 0; i < JTFerramentas.getRowCount(); i++) {
            String id = JTFerramentas.getModel().getValueAt(i, 0).toString();
            String nome = JTFerramentas.getModel().getValueAt(i, 1).toString();
            String preco = JTFerramentas.getModel().getValueAt(i, 2).toString();
            String quant = JTFerramentas.getModel().getValueAt(i, 3).toString();
            dao.updateFerramentaBD(new Ferramenta(nome, Integer.parseInt(id), Double.parseDouble(preco), Integer.parseInt(quant)));
        }
        renderFerramentasTable();
    }//GEN-LAST:event_JBAplicarActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
        int id = Integer.parseInt(JTFRemoverId.getText());
        FerramentaDAO dao = new FerramentaDAO();
        dao.deleteFerramentaBD(id);
        renderFerramentasTable();
    }//GEN-LAST:event_JBRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(JFGerenciarFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBAplicar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JTextField JTFRemoverId;
    private javax.swing.JTable JTFerramentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
