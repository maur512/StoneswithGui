import javax.swing.*;
import javax.swing.text.Utilities;
import java.awt.event.*;

public class addStoneDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField name;
    private JTextField price;
    private JTextField alpha;
    private JTextField weight;
    private JCheckBox semiPrecCheckBox;

    public addStoneDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(640,480);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        if (Main.isNumeric(price.getText()) && Main.isNumeric(alpha.getText()) && Main.isNumeric(weight.getText())) {
            if (semiPrecCheckBox.isSelected()) {
                Main.stoneList.add(new SemiPreciousStone(name.getText(), Double.valueOf(price.getText()), Double.valueOf(alpha.getText()), Double.valueOf(weight.getText())));
            } else {
                Main.stoneList.add(new PreciousStone(name.getText(), Double.valueOf(price.getText()), Double.valueOf(alpha.getText()), Double.valueOf(weight.getText())));
            }
        } else System.out.println("Not numeric");
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        addStoneDialog dialog = new addStoneDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
