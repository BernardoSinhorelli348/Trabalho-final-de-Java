/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Score;
import java.util.ArrayList;
import Classes.Jogo;
import Classes.Player;
import Classes.ScorePlayer;
import Classes.ScoreJogo;
import Classes.ScorePlayerJogo;
import DAO.ErpDAOException;
import DAO.JogoDAO;
import DAO.ScoreDAO;
import DAO.ScoreJogoDAO;
import DAO.ScorePlayerDAO;
import DAO.ScorePlayerJogoDAO;
import DAO.playerDAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setResizable(false); //sem tela cheia
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Bem-Vindo(a)");

        jToggleButton1.setText("Sair");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jToggleButton2.setText("Gerar relatório PDF ");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        jMenu1.setText("Jogo");

        jMenuItem1.setText("Inserir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Alterar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Excluir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Player");
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem6.setText("Inserir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem8.setText("Excluir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem12.setText("alterar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Score");

        jMenuItem9.setText("Inserir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem11.setText("Excluir");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem13.setText("Alterar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Listar");

        jMenuItem4.setText("listar players");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem7.setText("listar games");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem10.setText("listar score");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ferramentas");
        jMenu6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu6.setVerifyInputWhenFocusTarget(false);

        jMenuItem5.setText("Configurações");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFrame Ins = new insereplayer();
        Ins.setLocationRelativeTo(rootPane);
        Ins.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFrame Ins = new insereJogo();
        Ins.setLocationRelativeTo(rootPane);
        Ins.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        JFrame Exclui = new excluirScore();
        Exclui.setLocationRelativeTo(rootPane);
        Exclui.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFrame Marcar = new InserirScore();
        Marcar.setLocationRelativeTo(rootPane);
        Marcar.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFrame Exclui = new ExcluirJogo();
        Exclui.setLocationRelativeTo(rootPane);
        Exclui.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFrame Altera = new AlteraJogo();
        Altera.setLocationRelativeTo(rootPane);
        Altera.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JFrame Exclui = new ExcluirPlayer();
        Exclui.setLocationRelativeTo(rootPane);
        Exclui.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFrame Lista = new ListarPlayer();
        Lista.setLocationRelativeTo(rootPane);
        Lista.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFrame Lista = new ListarJogo();
        Lista.setLocationRelativeTo(rootPane);
        Lista.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFrame Conf = new Configuracoes();
        Conf.setLocationRelativeTo(rootPane);
        Conf.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JFrame Lista = new ListarTudo();
        Lista.setLocationRelativeTo(rootPane);
        Lista.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JFrame Lista = new AlteraPlayer();
        Lista.setLocationRelativeTo(rootPane);
        Lista.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JFrame Lista = new AlteraScore();
        Lista.setLocationRelativeTo(rootPane);
        Lista.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        Document document = new Document();
        String msg = "", d = "";
        String msgs = "", msgj = "", msgp = "";
        try {
            msg = JOptionPane.showInputDialog(null, "Digite o nome do PDF\n");
            if (msg == null || msg.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro: nome do arquivo inválido!");
                return;
            }
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Escolha o diretório para salvar o PDF");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File selectedDir = fileChooser.getSelectedFile();
                d = selectedDir.getAbsolutePath();
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.");
                return;
            }
            if (!d.endsWith(File.separator)) {
                d += File.separator;
            }
            msg += ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(new File(d, msg)));
            document.open();
            document.add(new Paragraph("Segue abaixo os dados:\n"));
            document.add(new Paragraph("\n======================================\n"));
            document.add(new Paragraph("Players:\n"));

            // Tenta buscar os dados do banco
            playerDAO playerDao = new playerDAO();
            ArrayList<Player> jogadores;
            try {
                jogadores = playerDao.listar();
            } catch (Exception e) {
                jogadores = new ArrayList<>();
                document.add(new Paragraph("Não foi possível carregar os jogadores (Banco de dados indisponível).\n\n"));
            }

            if (jogadores.isEmpty()) {
                document.add(new Paragraph("Nenhum jogador encontrado.\n"));
            } else {
                for (Player player : jogadores) {
                    msgp += "ID: " + player.getId_player() + "\nNickname: " + player.getNickname()
                            + "\nPlataforma: " + player.getPlataforma() + "\nEmail: " + player.getEmail() + "\n\n";
                }
            }
            document.add(new Paragraph(msgp));

            document.add(new Paragraph("\n======================================\n"));
            document.add(new Paragraph("Jogos:\n"));

            JogoDAO jogoDao = new JogoDAO();
            ArrayList<Jogo> jogos;
            try {
                jogos = jogoDao.listar();
            } catch (Exception e) {
                jogos = new ArrayList<>();
                document.add(new Paragraph("Não foi possível carregar os jogos (Banco de dados indisponível).\n\n"));
            }

            if (jogos.isEmpty()) {
                document.add(new Paragraph("Nenhum jogo encontrado.\n"));
            } else {
                for (Jogo games : jogos) {
                    msgj += "ID: " + games.getId_game() + "\nJogo: " + games.getNome() + "\nTipo: " + games.getTipo() + "\n\n";
                }
            }
            document.add(new Paragraph(msgj));

            document.add(new Paragraph("\n======================================\n"));
            document.add(new Paragraph("Scores:\n"));

            ScorePlayerJogoDAO scoreDao = new ScorePlayerJogoDAO();
            ArrayList<ScorePlayerJogo> scores;
            try {
                scores = scoreDao.listarTodos();
            } catch (Exception e) {
                scores = new ArrayList<>();
                document.add(new Paragraph("Não foi possível carregar os scores (Banco de dados indisponível).\n\n"));
            }

            if (scores.isEmpty()) {
                document.add(new Paragraph("Nenhum score encontrado.\n"));
            } else {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                for (ScorePlayerJogo sc : scores) {
                    String dataFormatada = (sc.getData() != null) ? dateFormat.format(sc.getData()) : "Data não disponível";
                    msgs += "ID do score: " + sc.getId_score() + "\nID do jogo: " + sc.getId_game()
                            + "\nID do player: " + sc.getId_player() + "\nScore: " + sc.getScore()
                            + "\nData: " + dataFormatada + "\n\n";
                }
            }
            document.add(new Paragraph(msgs));
            document.add(new Paragraph("\n======================================\n"));
            document.close();
            JOptionPane.showMessageDialog(null, "PDF gerado com sucesso no diretório:\n" + d);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao gerar o PDF: " + e.getMessage());
        }

    }//GEN-LAST:event_jToggleButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Principal().setVisible(true);
                JFrame Janela = new Principal();
                Janela.setVisible(true);
                Janela.setLocationRelativeTo(null); //Centraliza a Janela
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

}
