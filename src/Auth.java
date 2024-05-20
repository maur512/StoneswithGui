import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Auth {

    private JButton admin_button;
    private JButton user_button;
    private JPanel MainPanel;

    public Auth() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(MainPanel);
        frame.setVisible(true);
        admin_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminGui adminGui = new AdminGui();
                frame.dispose();
            }
        });
        user_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserGui userGui = new UserGui();
                frame.dispose();
            }
        });
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                Main.saveSer();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

}
