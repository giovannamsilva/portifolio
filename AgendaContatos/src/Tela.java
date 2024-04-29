
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {

    private List<Contato> listaContatos = new ArrayList<>();

    public Tela() {
        initComponents();
        setTitle("Lista de Contatos");
        setLocationRelativeTo(null);
        jBExcluir.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPNome = new javax.swing.JPanel();
        jTFNome = new javax.swing.JTextField();
        jPNumero = new javax.swing.JPanel();
        jTFNumero = new javax.swing.JTextField();
        jPLista = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAExibirLista = new javax.swing.JTextArea();
        jBAdicionar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPNomeLayout = new javax.swing.GroupLayout(jPNome);
        jPNome.setLayout(jPNomeLayout);
        jPNomeLayout.setHorizontalGroup(
            jPNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPNomeLayout.setVerticalGroup(
            jPNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNomeLayout.createSequentialGroup()
                .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Número:"));

        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPNumeroLayout = new javax.swing.GroupLayout(jPNumero);
        jPNumero.setLayout(jPNumeroLayout);
        jPNumeroLayout.setHorizontalGroup(
            jPNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPNumeroLayout.setVerticalGroup(
            jPNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNumeroLayout.createSequentialGroup()
                .addComponent(jTFNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPLista.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Contatos:"));

        jTAExibirLista.setColumns(20);
        jTAExibirLista.setRows(5);
        jScrollPane2.setViewportView(jTAExibirLista);

        javax.swing.GroupLayout jPListaLayout = new javax.swing.GroupLayout(jPLista);
        jPLista.setLayout(jPListaLayout);
        jPListaLayout.setHorizontalGroup(
            jPListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPListaLayout.setVerticalGroup(
            jPListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBAdicionar.setText("Adicionar");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jBAdicionar)
                .addGap(18, 18, 18)
                .addComponent(jBExcluir)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        String nome = jTFNome.getText();
        String numero = jTFNumero.getText();

        // Verificar se o número contém apenas dígitos
        if (numero.matches("\\d+")) {
            Contato novoContato = new Contato(nome, numero);
            listaContatos.add(novoContato);

            // Limpar os campos após adicionar o contato (opcional)
            jTFNome.setText("");
            jTFNumero.setText("");
            JOptionPane.showMessageDialog(this, "Contato adicionado com sucesso!", "Lista de Tarefas", -1);

            // Exibir automaticamente os contatos na área de texto
            exibirContatos();

            jBExcluir.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            // Limpar o campo de número em caso de erro
            jTFNumero.setText("");
        }
        jBExcluir.setEnabled(true);
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed

    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed

    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        String inputNumero = JOptionPane.showInputDialog(this, "Digite o número do contato a ser excluído:", "Lista de Contatos", JOptionPane.QUESTION_MESSAGE);

        // Verificar se o número foi inserido
        if (inputNumero != null && !inputNumero.isEmpty()) {
            try {
                int numeroContato = Integer.parseInt(inputNumero);

                // Verificar se o número está dentro dos limites da lista de contatos
                if (numeroContato >= 1 && numeroContato <= listaContatos.size()) {
                    Contato contato = listaContatos.get(numeroContato - 1);
                    listaContatos.remove(contato);
                    JOptionPane.showMessageDialog(this, "Contato excluído com sucesso!", "Lista de Tarefas", -1);
                } else {
                    // Exibir mensagem de alerta
                    JOptionPane.showMessageDialog(this, "Número do contato não encontrado.", "Alerta", JOptionPane.WARNING_MESSAGE);

                    // Chamar a caixa de diálogo novamente
                    jBExcluirActionPerformed(evt);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            // Atualizar a lista de contatos exibida
            exibirContatos();
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    // Método para exibir os contatos na área de texto
    private void exibirContatos() {
        jTAExibirLista.setText("");

        for (int i = 0; i < listaContatos.size(); i++) {
            Contato contato = listaContatos.get(i);
            jTAExibirLista.append((i + 1) + ". Nome: " + contato.getNome() + ",\n Número: " + contato.getNumero() + "\n");
        }
    }

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
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSair;
    private javax.swing.JPanel jPLista;
    private javax.swing.JPanel jPNome;
    private javax.swing.JPanel jPNumero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAExibirLista;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    // End of variables declaration//GEN-END:variables
}
