import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QUI {
    private JButton minus;
    private JButton plus;
    private JLabel count;
    public javax.swing.JPanel JPanel;
    private int countInt = 0;

    public QUI() {
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countInt--;
                count.setText(countInt+"");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countInt++;
                count.setText(countInt+"");
            }
        });
    }
}
