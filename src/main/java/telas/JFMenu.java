/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;
import modelo.Ferramenta;

/**
 *
 * @author leand
 */
public class JFMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFMenu
     */
    public JFMenu() {
        initComponents();
        renderEmprestimosTable();
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
        JTEmprestimos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGerenciaCliente = new javax.swing.JMenuItem();
        jMenuItemGerenciaFerramenta = new javax.swing.JMenuItem();
        MIRelatorio = new javax.swing.JMenuItem();
        jMenuItemDevolverFerramentas = new javax.swing.JMenuItem();
        JMConfiguracoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 71, 119));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 550));

        jScrollPane1.setBackground(new java.awt.Color(72, 169, 166));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 252));

        JTEmprestimos.setBackground(new java.awt.Color(204, 204, 204));
        JTEmprestimos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        JTEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ferramenta", "Cliente", "Quantidade", "Desde", "Prazo devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTEmprestimos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTEmprestimos.setGridColor(new java.awt.Color(51, 51, 51));
        JTEmprestimos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JTEmprestimos.setShowGrid(false);
        jScrollPane1.setViewportView(JTEmprestimos);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Alugueis pendentes:");

        jButton1.setBackground(new java.awt.Color(73, 159, 104));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Alugar ferramenta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(186, 63, 29));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Extornar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(73, 159, 104));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Imprimir relatório");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 71, 119));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 252));

        jMenu1.setBackground(new java.awt.Color(255, 255, 252));
        jMenu1.setForeground(new java.awt.Color(255, 255, 252));
        jMenu1.setText("Gerenciamento");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemGerenciaCliente.setText("Gerenciar clientes");
        jMenuItemGerenciaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGerenciaCliente);

        jMenuItemGerenciaFerramenta.setText("Gerenciar ferramentas");
        jMenuItemGerenciaFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciaFerramentaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGerenciaFerramenta);

        MIRelatorio.setText("Relatórios");
        MIRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIRelatorioActionPerformed(evt);
            }
        });
        jMenu1.add(MIRelatorio);

        jMenuItemDevolverFerramentas.setText("Devolver ferramentas");
        jMenuItemDevolverFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDevolverFerramentasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDevolverFerramentas);

        jMenuBar1.add(jMenu1);

        JMConfiguracoes.setForeground(new java.awt.Color(255, 255, 252));
        JMConfiguracoes.setText("Configurações");
        JMConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMConfiguracoesMouseClicked(evt);
            }
        });
        JMConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMConfiguracoesActionPerformed(evt);
            }
        });
        jMenuBar1.add(JMConfiguracoes);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void renderEmprestimosTable() {
        EmprestimoDAO dao = new EmprestimoDAO();
        ArrayList<Emprestimo> ferramentas = dao.getMinhaLista();
        DefaultTableModel model = (DefaultTableModel) JTEmprestimos.getModel();

        for (Emprestimo emp : ferramentas) {
            if (emp.getQuantidade() != 0) {
                model.addRow(new Object[]{emp.getFerramenta(), emp.getAmigo(), emp.getQuantidade(), 999, 999});
            }
        }
    }

    private void jMenuItemGerenciaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciaClienteActionPerformed
        JFGerenciarAmigos objeto = new JFGerenciarAmigos();
        objeto.setLocationRelativeTo(null);
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerenciaClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFCriarAluguel objeto = new JFCriarAluguel();
        objeto.setLocationRelativeTo(null);
        objeto.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemGerenciaFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciaFerramentaActionPerformed
        JFGerenciarFerramentas objeto = new JFGerenciarFerramentas();
        objeto.setLocationRelativeTo(null);
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerenciaFerramentaActionPerformed

    private void MIRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIRelatorioActionPerformed
        JFRelatorios objeto = new JFRelatorios();
        objeto.setLocationRelativeTo(null);
        objeto.setVisible(true);
    }//GEN-LAST:event_MIRelatorioActionPerformed

    private void JMConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMConfiguracoesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JMConfiguracoesActionPerformed

    private void JMConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMConfiguracoesMouseClicked
        // TODO add your handling code here:
                JFConfiguracoes objeto = new JFConfiguracoes();
                objeto.setLocationRelativeTo(null);
                objeto.setVisible(true);
    }//GEN-LAST:event_JMConfiguracoesMouseClicked

    private void jMenuItemDevolverFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDevolverFerramentasActionPerformed
        // TODO add your handling code here:
        JFDevolverFerramenta objeto = new JFDevolverFerramenta();
        objeto.setLocationRelativeTo(null);
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuItemDevolverFerramentasActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMConfiguracoes;
    private javax.swing.JTable JTEmprestimos;
    private javax.swing.JMenuItem MIRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDevolverFerramentas;
    private javax.swing.JMenuItem jMenuItemGerenciaCliente;
    private javax.swing.JMenuItem jMenuItemGerenciaFerramenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
