/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SplashDemo extends JWindow {

    public static void main(String[] args) {
        new SplashDemo();
    }

    public SplashDemo() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (InstantiationException ex) {
                        ex.printStackTrace();
                    } catch (IllegalAccessException ex) {
                        ex.printStackTrace();
                    } catch (UnsupportedLookAndFeelException ex) {
                        ex.printStackTrace();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                showSplash();

            }
        });
    }

    public void showSplash() {

        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.blue);

        // Set the window's bounds, centering the window
        int width = 700;
        int height = 650;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        // Build the splash screen
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/stockmanagement/sms.jpg")));
        JLabel copyrt = new JLabel("", JLabel.CENTER);

        content.add(label, BorderLayout.CENTER);

        label.setLayout(new GridBagLayout());
        Font font = copyrt.getFont();
        copyrt.setFont(font.deriveFont(Font.BOLD, 24f));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        label.add(copyrt, gbc);

        ImageIcon wait = new ImageIcon(getClass().getResource("\\wait.gif"));//"C:\\Users\\Mini\\Documents\\NetBeansProjects\\CollegeManagementSystem\\Icon\\wait.gif");
        //label.add(new JLabel(wait), gbc);

        // Display it
        setVisible(true);
        toFront();

        new ResourceLoader().execute();
    }

    public class ResourceLoader extends SwingWorker<Object, Object> {

        @Override
        protected Object doInBackground() throws Exception {

            // Wait a little while, maybe while loading resources
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }

            return null;

        }

        @Override
        protected void done() {
            //setVisible(false);
            dispose();
            new Welcome().setVisible(true);
        }


    }

}