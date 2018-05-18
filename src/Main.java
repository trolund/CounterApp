import javax.swing.*;

public class Main {
    private static JFrame frame;

    public static void main(String[] args) {



        frame = new JFrame("The mini stopWatch! 2018 V0.2");
        frame.setContentPane(new QUI().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);



    }
}
