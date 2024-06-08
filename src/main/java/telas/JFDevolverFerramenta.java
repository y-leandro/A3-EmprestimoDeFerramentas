/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.AmigoDAO;
import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import javax.swing.JOptionPane;
import modelo.Amigo;

/**
 *
 * @author busin
 */
public class JFDevolverFerramenta extends javax.swing.JFrame {

    /**
     * Creates new form JFDevolverFerramenta
     */
    public JFDevolverFerramenta() {
        initComponents();
        initAmigoComboBox();
    }
    private void initAmigoComboBox() {
        AmigoDAO dao = new AmigoDAO();
        
        JCBAmigo.removeAllItems();
        for (Amigo amg : dao.getMinhaLista()) {
            JCBAmigo.addItem(amg.getId() + " - " + amg.getNome());
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

        jPanel1 = new javax.swing.JPanel();
        JLAmigo = new javax.swing.JLabel();
        JCBAmigo = new javax.swing.JComboBox<>();
        JLEmprestimo = new javax.swing.JLabel();
        JCBEmprestimo = new javax.swing.JComboBox<>();
        JLQuantidadeDevolver = new javax.swing.JLabel();
        JSQuantidade = new javax.swing.JSpinner();
        JBDevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolver Ferramentas");

        jPanel1.setBackground(new java.awt.Color(54, 70, 125));

        JLAmigo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        JLAmigo.setForeground(new java.awt.Color(242, 242, 242));
        JLAmigo.setText("Amigo");

        JCBAmigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBAmigo.setPreferredSize(new java.awt.Dimension(72, 27));
        JCBAmigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBAmigoItemStateChanged(evt);
            }
        });
        JCBAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAmigoActionPerformed(evt);
            }
        });

        JLEmprestimo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        JLEmprestimo.setForeground(new java.awt.Color(242, 242, 242));
        JLEmprestimo.setText("Empréstimo");

        JCBEmprestimo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCBEmprestimo.setPreferredSize(new java.awt.Dimension(72, 27));
        JCBEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBEmprestimoActionPerformed(evt);
            }
        });

        JLQuantidadeDevolver.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        JLQuantidadeDevolver.setForeground(new java.awt.Color(242, 242, 242));
        JLQuantidadeDevolver.setText("Quantidade a devolver");

        JSQuantidade.setPreferredSize(new java.awt.Dimension(64, 27));
        JSQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSQuantidadeStateChanged(evt);
            }
        });
        JSQuantidade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JSQuantidadePropertyChange(evt);
            }
        });

        JBDevolver.setBackground(new java.awt.Color(73, 159, 104));
        JBDevolver.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        JBDevolver.setForeground(new java.awt.Color(240, 240, 240));
        JBDevolver.setText("Devolver");
        JBDevolver.setPreferredSize(new java.awt.Dimension(120, 28));
        JBDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JLQuantidadeDevolver)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(JLAmigo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(JLEmprestimo)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JCBEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(JSQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JLQuantidadeDevolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
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

    private void JBDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDevolverActionPerformed
        // TODO add your handling code here:
        if (JCBAmigo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Não há nenhum amigo selecionado");
            return;
        }
        if (JCBEmprestimo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Não há nenhum empréstimo selecionado");
            return;
        }
        if ((int)JSQuantidade.getValue() == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhum empréstimo selecionado");
            return;
        }
        
        int idAmg = Integer.parseInt(((String)JCBAmigo.getSelectedItem()).split(" ")[0]);
        int idFer = Integer.parseInt(((String)JCBEmprestimo.getSelectedItem()).split(" ")[0]);
        int praDevolver = (int)JSQuantidade.getValue();
        
        EmprestimoDAO dao = new EmprestimoDAO();
        dao.devolverEmprestimos(idAmg, idFer, praDevolver);
        JSQuantidade.setValue(0);        
        JCBEmprestimo.setSelectedItem(null);
    }//GEN-LAST:event_JBDevolverActionPerformed

    private void JCBAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBAmigoActionPerformed

    private void JCBAmigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBAmigoItemStateChanged
        EmprestimoDAO dao = new EmprestimoDAO();
        FerramentaDAO ferDao = new FerramentaDAO();
        JCBEmprestimo.removeAllItems();
        if (JCBAmigo.getSelectedIndex() != -1) {
            int id = Integer.parseInt(((String)JCBAmigo.getSelectedItem()).split(" ")[0]);
            for (int ferId : dao.getFerramentasAlugadasPorAmigo(id)) {
                JCBEmprestimo.addItem(ferId + " - " + ferDao.carregaFerramenta(ferId).getNome());
            }
        }
    }//GEN-LAST:event_JCBAmigoItemStateChanged

    private void JCBEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBEmprestimoActionPerformed

    private void JSQuantidadePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JSQuantidadePropertyChange
        
    }//GEN-LAST:event_JSQuantidadePropertyChange

    private void JSQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSQuantidadeStateChanged
        EmprestimoDAO dao = new EmprestimoDAO();
        if ((int)JSQuantidade.getValue() < 0) {
            JSQuantidade.setValue(0);
        }
        int idAmg = Integer.parseInt(((String)JCBAmigo.getSelectedItem()).split(" ")[0]);
        int idFer = Integer.parseInt(((String)JCBEmprestimo.getSelectedItem()).split(" ")[0]);
        int maxPraRetornar = dao.getQuantidadeClienteAlugouDeFerramenta(idAmg, idFer);
        if ((int)JSQuantidade.getValue() > maxPraRetornar) {
            JSQuantidade.setValue(maxPraRetornar);
        }
    }//GEN-LAST:event_JSQuantidadeStateChanged

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
            java.util.logging.Logger.getLogger(JFDevolverFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDevolverFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDevolverFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDevolverFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDevolverFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDevolver;
    private javax.swing.JComboBox<String> JCBAmigo;
    private javax.swing.JComboBox<String> JCBEmprestimo;
    private javax.swing.JLabel JLAmigo;
    private javax.swing.JLabel JLEmprestimo;
    private javax.swing.JLabel JLQuantidadeDevolver;
    private javax.swing.JSpinner JSQuantidade;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
