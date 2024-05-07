
public class Tela extends javax.swing.JFrame {

    private ValoresInteiros matriz;

    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Matriz 3x3");
        jBCalcularMedia.setEnabled(false);
        jBTrocarElementos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jBGerarMatriz = new javax.swing.JButton();
        jBCalcularMedia = new javax.swing.JButton();
        jBTrocarElementos = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null));

        jTAResultado.setEditable(false);
        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jScrollPane1.setViewportView(jTAResultado);

        javax.swing.GroupLayout jPResultadoLayout = new javax.swing.GroupLayout(jPResultado);
        jPResultado.setLayout(jPResultadoLayout);
        jPResultadoLayout.setHorizontalGroup(
            jPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPResultadoLayout.setVerticalGroup(
            jPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBGerarMatriz.setText("Gerar Matriz 3x3");
        jBGerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarMatrizActionPerformed(evt);
            }
        });

        jBCalcularMedia.setText("Calcular Média");
        jBCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularMediaActionPerformed(evt);
            }
        });

        jBTrocarElementos.setText("Trocar Elementos");
        jBTrocarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrocarElementosActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBGerarMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCalcularMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTrocarElementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBGerarMatriz)
                        .addGap(18, 18, 18)
                        .addComponent(jBCalcularMedia)
                        .addGap(18, 18, 18)
                        .addComponent(jBTrocarElementos)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarMatrizActionPerformed
        matriz.armazena(matriz);
        jTAResultado.setText("Valores da Matriz:\n" + matriz.dados());

        jBCalcularMedia.setEnabled(true);
        jBTrocarElementos.setEnabled(true);
    }//GEN-LAST:event_jBGerarMatrizActionPerformed

    private void jBCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularMediaActionPerformed
        jTAResultado.setText(matriz.dados() + "\n");
        int retorno[][] = matriz.mediaLinhas();
        jTAResultado.append("Media das linhas da matriz: " + matriz.dados(retorno));
    }//GEN-LAST:event_jBCalcularMediaActionPerformed

    private void jBTrocarElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTrocarElementosActionPerformed
        jTAResultado.setText(matriz.dados() + "\n");
        jTAResultado.append("Soma dos valores da matriz: " + matriz.trocarElementos());
    }//GEN-LAST:event_jBTrocarElementosActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcularMedia;
    private javax.swing.JButton jBGerarMatriz;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBTrocarElementos;
    private javax.swing.JPanel jPResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultado;
    // End of variables declaration//GEN-END:variables
}
