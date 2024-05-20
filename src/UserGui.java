import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class UserGui {

    private JPanel MainPanel;
    private JButton exit_button;
    private JTable table1;
    private JButton sortButton;
    DefaultTableModel tableModel;

    public UserGui() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(MainPanel);
        frame.setVisible(true);
        showStones();
        exit_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Auth auth = new Auth();
                frame.dispose();
            }
        });
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            SortStoneDialog a = new SortStoneDialog();
            a.setVisible(true);
            showStones();
            }
        });
    }

    private void showStones() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Price");
        tableModel.addColumn("Alpha");
        tableModel.addColumn("Weight");
        for(Stone i : Main.stoneList)
        {
            Vector<Object> a = new Vector<Object>();
            a.add(i.getName());
            a.add(i.getPrice());
            a.add(i.getAlpha());
            a.add(i.getWeight());
            tableModel.addRow(a);

        }
        table1.setModel(tableModel);
    }
}
