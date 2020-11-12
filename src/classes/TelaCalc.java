
package classes;

import static java.lang.Math.pow;

/**
 * @author anton_000
 */
public class TelaCalc extends javax.swing.JFrame {
    public TelaCalc() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIn1 = new javax.swing.JTextField();
        txtIn2 = new javax.swing.JTextField();
        btnLimp1 = new javax.swing.JButton();
        btnLimp2 = new javax.swing.JButton();
        txtRes = new javax.swing.JTextArea();
        btnCut = new javax.swing.JButton();
        btnCop = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSoma = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnPot = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPrim = new javax.swing.JLabel();
        lblCalc = new javax.swing.JLabel();
        lblSeg = new javax.swing.JLabel();
        btnRes = new javax.swing.JButton();
        btnInsert1 = new javax.swing.JButton();
        btnInsert2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA JAVA");

        txtIn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIn1.setText("Primeiro Valor");
        txtIn1.setToolTipText("");
        txtIn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIn1MouseClicked(evt);
            }
        });
        txtIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIn1ActionPerformed(evt);
            }
        });

        txtIn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIn2.setText("Segundo Valor");
        txtIn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIn2MouseClicked(evt);
            }
        });
        txtIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIn2ActionPerformed(evt);
            }
        });

        btnLimp1.setText("Limpar");
        btnLimp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimp1ActionPerformed(evt);
            }
        });

        btnLimp2.setText("Limpar");
        btnLimp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimp2ActionPerformed(evt);
            }
        });

        txtRes.setColumns(20);
        txtRes.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtRes.setRows(5);
        txtRes.setText("Resultado");

        btnCut.setText("copiar");

        btnCop.setText("copiar");

        btnClean.setText("limpar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnSoma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSoma.setText("+");
        btnSoma.setMaximumSize(new java.awt.Dimension(40, 25));
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSub.setText("-");
        btnSub.setMaximumSize(new java.awt.Dimension(40, 25));
        btnSub.setMinimumSize(new java.awt.Dimension(41, 23));
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnMult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMult.setText("*");
        btnMult.setMaximumSize(new java.awt.Dimension(40, 25));
        btnMult.setMinimumSize(new java.awt.Dimension(41, 23));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setMaximumSize(new java.awt.Dimension(40, 25));
        btnDiv.setMinimumSize(new java.awt.Dimension(41, 23));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnPot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPot.setText("Exp");
        btnPot.setMaximumSize(new java.awt.Dimension(40, 25));
        btnPot.setMinimumSize(new java.awt.Dimension(41, 23));
        btnPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblPrim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrim.setText("Primeiro Valor");

        lblCalc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalc.setText("Ação");

        lblSeg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeg.setText("Segundo Valor");

        btnRes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRes.setText("Calcular");
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnInsert1.setText("Inserir");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });

        btnInsert2.setText("Inserir");
        btnInsert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimp2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimp1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClean)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCut))
                            .addComponent(txtRes, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIn1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnLimp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(btnLimp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClean)
                            .addComponent(btnCop)
                            .addComponent(btnCut)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIn1ActionPerformed

    private void txtIn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIn2ActionPerformed

    }//GEN-LAST:event_txtIn2ActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        double soma1;
        double soma2;
        double somaRes;
        
        lblCalc.setText("+");
        soma1 = Double.parseDouble(txtIn1.getText());
        soma2 = Double.parseDouble(txtIn2.getText());
        somaRes = soma1+soma2;
        txtRes.setText(Double.toString(somaRes));
        
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        double sub1;
        double sub2;
        double subRes;
        
        lblCalc.setText("-");
        sub1 = Double.parseDouble(txtIn1.getText());
        sub2 = Double.parseDouble(txtIn2.getText());
        subRes = sub1-sub2;
        txtRes.setText(Double.toString(subRes));
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        double mut1;
        double mut2;
        double mutRes;
        
        lblCalc.setText("*");
        mut1 = Double.parseDouble(txtIn1.getText());
        mut2 = Double.parseDouble(txtIn2.getText());
        mutRes = mut1*mut2;
        txtRes.setText(Double.toString(mutRes));
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        double div1;
        double div2;
        double divRes;
        
        lblCalc.setText("/");
        div1 = Double.parseDouble(txtIn1.getText());
        div2 = Double.parseDouble(txtIn2.getText());
        divRes = div1/div2;
        txtRes.setText(Double.toString(divRes));
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotActionPerformed
       double exp1;
       double exp2;
       double expRes;
       
       lblCalc.setText("Exp");
       exp1 = Double.parseDouble(txtIn1.getText());
       exp2 = Double.parseDouble(txtIn2.getText());
       expRes = pow(exp1, exp2);
       txtRes.setText(Double.toString(expRes));
    }//GEN-LAST:event_btnPotActionPerformed

    private void txtIn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIn1MouseClicked
        txtIn1.setText("");
    }//GEN-LAST:event_txtIn1MouseClicked

    private void txtIn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIn2MouseClicked
        txtIn2.setText("");
    }//GEN-LAST:event_txtIn2MouseClicked

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtRes.setText("Resultado");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        // TODO add your handling code here:
        String valor1 = txtIn1.getText();
        
        lblPrim.setText(valor1);
    }//GEN-LAST:event_btnInsert1ActionPerformed

    private void btnLimp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimp1ActionPerformed
        txtIn1.setText("Primeiro Valor");
        lblPrim.setText("Primeiro Valor");
    }//GEN-LAST:event_btnLimp1ActionPerformed

    private void btnLimp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimp2ActionPerformed
        txtIn2.setText("Segundo Valor");
        lblSeg.setText("Segundo Valor");
    }//GEN-LAST:event_btnLimp2ActionPerformed

    private void btnInsert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert2ActionPerformed
        String valor2 = txtIn2.getText();
        
        lblSeg.setText(valor2);
    }//GEN-LAST:event_btnInsert2ActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        
    }//GEN-LAST:event_btnResActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCop;
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JButton btnInsert2;
    private javax.swing.JButton btnLimp1;
    private javax.swing.JButton btnLimp2;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPot;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCalc;
    private javax.swing.JLabel lblPrim;
    private javax.swing.JLabel lblSeg;
    protected static javax.swing.JTextField txtIn1;
    protected static javax.swing.JTextField txtIn2;
    protected static javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
