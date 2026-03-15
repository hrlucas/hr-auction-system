import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class AlertaDialog extends javax.swing.JDialog {

    private static final int LARGURA_MENSAGEM = 230;
    private static final int RAIO_CANTO = 18;

    public AlertaDialog(Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        configurarDialogo();
    }

    public AlertaDialog(Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        configurarDialogo();
    }

    public void definirMensagem(String mensagem) {
        mensagemLabel.setText(formatarMensagemHtml(mensagem));
        pack();
    }

    private void configurarDialogo() {
        java.awt.Color corBase = UIManager.getColor("Panel.background");
        if (corBase == null) {
            corBase = new java.awt.Color(238, 238, 238);
        }

        setTitle("Alerta!");
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        iconeLabel.setIcon(UIManager.getIcon("OptionPane.warningIcon"));
        painelPrincipal.setBackground(corBase);
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 12, 10, 12));
        tituloLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14));
        mensagemLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        okButton.setBackground(new java.awt.Color(200, 200, 200));
        setBackground(new java.awt.Color(0, 0, 0, 0));
        getRootPane().setDefaultButton(okButton);
        getRootPane().registerKeyboardAction(
                e -> {
                },
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW
        );
    }

    private String formatarMensagemHtml(String mensagem) {
        String mensagemSegura = mensagem
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
        return "<html><table cellpadding='0' cellspacing='0'><tr><td width='" + LARGURA_MENSAGEM + "'>"
                + mensagemSegura
                + "</td></tr></table></html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new RoundedPanel();
        tituloLabel = new javax.swing.JLabel();
        iconeLabel = new javax.swing.JLabel();
        mensagemLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tituloLabel.setText("Alerta!");

        mensagemLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mensagemLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mensagemLabel.setText("Mensagem de alerta");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(iconeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloLabel)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(okButton)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tituloLabel)
                .addGap(14, 14, 14)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensagemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconeLabel;
    private javax.swing.JLabel mensagemLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    private static final class RoundedPanel extends javax.swing.JPanel {

        private RoundedPanel() {
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            java.awt.Color corBase = UIManager.getColor("Panel.background");
            if (corBase == null) {
                corBase = new java.awt.Color(238, 238, 238);
            }
            g2.setColor(corBase);
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, RAIO_CANTO, RAIO_CANTO);
            g2.setColor(new java.awt.Color(160, 160, 160));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, RAIO_CANTO, RAIO_CANTO);
            g2.dispose();
            super.paintComponent(g);
        }
    }
}
