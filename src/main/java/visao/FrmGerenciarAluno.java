package visao;

import modelo.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmGerenciarAluno extends javax.swing.JFrame {
    
    private Aluno objetoaluno;

    public FrmGerenciarAluno() {
        initComponents();
        this.objetoaluno = new Aluno();
        this.carregaTabela();
    }
    
public void preencherTabela() {
    DefaultTableModel modelo = (DefaultTableModel) JTableAlunos.getModel();
    modelo.setNumRows(0); // limpa a tabela

    ArrayList<Aluno> lista = objetoaluno.getMinhaLista();

    for (Aluno a : lista) {
        modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getIdade(),
            a.getCurso(),
            a.getFase()
        });
    }
}

public void carregaTabela() {
    DefaultTableModel modelo = (DefaultTableModel) this.JTableAlunos.getModel();
    modelo.setNumRows(0); // limpa a tabela

    ArrayList<Aluno> minhaLista = objetoaluno.getMinhaLista();

    for (Aluno a : minhaLista) {
        modelo.addRow(new Object[]{
            a.getId(),
            a.getNome(),
            a.getIdade(),
            a.getCurso(),
            a.getFase()
        });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JTFnome = new javax.swing.JTextField();
        JTFidade = new javax.swing.JTextField();
        JTFcurso = new javax.swing.JTextField();
        JTFfase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Alunos ");

        JTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Curso", "Fase"
            }
        ));
        JTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAlunos);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Curso:");

        jLabel4.setText("Fase:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JTFidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFidade, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTFcurso))
                                .addComponent(JTFnome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFfase, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBCancelar)
                                .addGap(39, 39, 39)))
                        .addComponent(JBAlterar)
                        .addGap(36, 36, 36)
                        .addComponent(JBApagar)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBAlterar)
                    .addComponent(JBApagar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFidadeActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAlunosMouseClicked
        if (this.JTableAlunos.getSelectedRow() != -1) {
            String nome = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 1).toString();
            String idade = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 2).toString();
            String curso = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 3).toString();
            String fase = this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 4).toString();

            this.JTFnome.setText(nome);
            this.JTFidade.setText(idade);
            this.JTFcurso.setText(curso);
            this.JTFfase.setText(fase);
        }    
    }//GEN-LAST:event_JTableAlunosMouseClicked

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        try {
    // recebendo e validando dados da interface gráfica
    int id = 0;
    String nome = "";
    int idade = 0;
    String curso = "";
    int fase = 0;

    if (this.JTFnome.getText().length() < 2) {
        throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
    } else {
        nome = this.JTFnome.getText();
    }

    if (this.JTFidade.getText().length() <= 0) {
        throw new Mensagem("Idade deve ser número e maior que zero.");
    } else {
        idade = Integer.parseInt(this.JTFidade.getText());
    }

    if (this.JTFcurso.getText().length() < 2) {
        throw new Mensagem("Curso deve conter ao menos 2 caracteres.");
    } else {
        curso = this.JTFcurso.getText();
    }

    if (this.JTFfase.getText().length() <= 0) {
        throw new Mensagem("Fase deve ser número e maior que zero.");
    } else {
        fase = Integer.parseInt(this.JTFfase.getText());
    }

    if (this.JTableAlunos.getSelectedRow() == -1) {
        throw new Mensagem("Primeiro selecione um Aluno para Alterar");
    } else {
        id = Integer.parseInt(this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 0).toString());
    }

    // envia os dados para o Aluno processar (Modelo)
    if (this.objetoaluno.updateAlunoBD(id, nome, idade, curso, fase)) {
        // limpa os campos
        this.JTFnome.setText("");
        this.JTFidade.setText("");
        this.JTFcurso.setText("");
        this.JTFfase.setText("");

        JOptionPane.showMessageDialog(rootPane, "Aluno Alterado com Sucesso!");
    }

    // Exibe no console o aluno cadastrado
    System.out.println(this.objetoaluno.getMinhaLista().toString());

} catch (Mensagem erro) {
    JOptionPane.showMessageDialog(null, erro.getMessage());
} catch (NumberFormatException erro2) {
    JOptionPane.showMessageDialog(null, "Informe um número válido.");
} finally {
    // atualiza a tabela
    carregaTabela();
}
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
        // validando dados da interface gráfica
        int id = 0;
        if (this.JTableAlunos.getSelectedRow() == -1) {
            throw new Mensagem("Primeiro selecione um Aluno para APAGAR!");
        } else {
            id = Integer.parseInt(this.JTableAlunos.getValueAt(this.JTableAlunos.getSelectedRow(), 0).toString());
        }

        // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
        int respostaUsuario = JOptionPane.showConfirmDialog(
            null,
            "Tem certeza que deseja apagar este Aluno ?",
            "Apagar",
            JOptionPane.YES_NO_OPTION
        );

        if (respostaUsuario == 0) { // clicou em SIM
            // envia os dados para o Aluno processar
            if (this.objetoaluno.deleteAlunoBD(id)) {
                // limpa os campos
                this.JTFnome.setText("");
                this.JTFidade.setText("");
                this.JTFcurso.setText("");
                this.JTFfase.setText("");

                JOptionPane.showMessageDialog(rootPane, "Aluno Apagado com Sucesso!");
            }
        }

        // exibe no console o aluno cadastrado
        System.out.println(this.objetoaluno.getMinhaLista().toString());

    } catch (Mensagem erro) {
        JOptionPane.showMessageDialog(null, erro.getMessage());
    } finally {
        // atualiza a tabela
        carregaTabela();
   }
    }//GEN-LAST:event_JBApagarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFcurso;
    private javax.swing.JTextField JTFfase;
    private javax.swing.JTextField JTFidade;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTable JTableAlunos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
