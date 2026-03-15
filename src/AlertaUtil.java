import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.RenderingHints;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

public final class AlertaUtil {

    private AlertaUtil() {
    }

    public static void mostrarAlerta(Component parent, String mensagem) {
        Window owner = resolverJanelaDona(parent);
        AlertaDialog dialog;
        RootPaneContainer rootPaneContainer = owner instanceof RootPaneContainer
                ? (RootPaneContainer) owner
                : null;
        Component glassPaneAnterior = null;
        boolean glassPaneAnteriorVisivel = false;

        if (owner instanceof Dialog) {
            dialog = new AlertaDialog((Dialog) owner, true);
        } else if (owner instanceof Frame) {
            dialog = new AlertaDialog((Frame) owner, true);
        } else {
            dialog = new AlertaDialog((Frame) null, true);
        }

        if (rootPaneContainer != null) {
            glassPaneAnterior = rootPaneContainer.getGlassPane();
            glassPaneAnteriorVisivel = glassPaneAnterior.isVisible();

            JComponent escurecedor = new JComponent() {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(new java.awt.Color(0, 0, 0, 70));
                    g2.fillRect(0, 0, getWidth(), getHeight());
                    g2.dispose();
                }
            };
            escurecedor.setOpaque(false);
            rootPaneContainer.setGlassPane(escurecedor);
            escurecedor.setVisible(true);
        }

        dialog.definirMensagem(mensagem);
        dialog.setLocationRelativeTo(parent);
        try {
            dialog.setVisible(true);
        } finally {
            if (rootPaneContainer != null && glassPaneAnterior != null) {
                rootPaneContainer.setGlassPane(glassPaneAnterior);
                glassPaneAnterior.setVisible(glassPaneAnteriorVisivel);
            }
        }
    }

    private static Window resolverJanelaDona(Component parent) {
        if (parent instanceof Window) {
            return (Window) parent;
        }

        if (parent == null) {
            return null;
        }

        return SwingUtilities.getWindowAncestor(parent);
    }
}
