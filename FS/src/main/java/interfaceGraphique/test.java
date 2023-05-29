package interfaceGraphique;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {
    private DefaultTableModel model;
    private JTable table;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;

    public test() {
        setTitle("Editable Table Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        model = new DefaultTableModel();
        model.addColumn("Nom ingrédient");
        model.addColumn("Quantité ingrédient");

        table = new JTable(model);

        textField1 = new JTextField();
        textField2 = new JTextField();

        addButton = new JButton("Ajouter");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data1 = textField1.getText();
                String data2 = textField2.getText();

                model.addRow(new Object[]{data1, data2});

                textField1.setText("");
                textField2.setText("");
            }
        });

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Nom ingrédient:"));
        inputPanel.add(textField1);
        inputPanel.add(new JLabel("Quantité ingrédient:"));
        inputPanel.add(textField2);
        inputPanel.add(addButton);

        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new test();
            }
        });
    }
}
