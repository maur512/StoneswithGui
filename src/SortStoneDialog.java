import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;

public class SortStoneDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox sortType;

    public SortStoneDialog() {
        setContentPane(contentPane);
        sortType.addItem("Name");
        sortType.addItem("Price");
        sortType.addItem("Alpha");
        sortType.addItem("Weight");
        setSize(640,480);
        setModal(true);

        getRootPane().setDefaultButton(buttonOK);

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
        switch ((String)sortType.getSelectedItem()) {
            case "Name":
                System.out.println("Name");
                break;
            case "Price":
                System.out.println("Price");
                break;
            case "Weight":
                System.out.println("Weight");
                break;
            case "Alpha":
                System.out.println("Alpha");
                break;
        }
        Collections.sort(Main.stoneList);
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        SortStoneDialog dialog = new SortStoneDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
