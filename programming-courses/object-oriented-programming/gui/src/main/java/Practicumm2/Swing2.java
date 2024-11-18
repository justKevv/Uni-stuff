package Practicumm2;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.tree.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTree tree1;
    private JTextField textField1;
    private JButton tambahButton;
    private JTable table1;
    private JTable table2;

    public Swing2() {
        initComponents();
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nodeName = textField1.getText();
                if (!nodeName.isEmpty()) {
                    DefaultTreeModel model = (DefaultTreeModel) tree1.getModel();
                    DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(nodeName);
                    root.add(newNode);
                    model.reload();
                }
            }
        });
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void initComponents() {
        // Initialize components from the .form file
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        tree1 = new JTree();
        textField1 = new JTextField();
        tambahButton = new JButton("Tambah");
        table1 = new JTable(new CustomTableModel());
        table2 = new JTable(new CustomTableModel());

        // Set up the layout and add components
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(tabbedPane1);

        // Page 1 with table1
        JPanel page1 = new JPanel();
        page1.setLayout(new BoxLayout(page1, BoxLayout.Y_AXIS));
        JScrollPane table1ScrollPane = new JScrollPane(table1);
        page1.add(table1ScrollPane);
        tabbedPane1.addTab("Page 1", page1);

        // Page 2 with table2
        JPanel page2 = new JPanel();
        page2.setLayout(new BoxLayout(page2, BoxLayout.Y_AXIS));
        JScrollPane table2ScrollPane = new JScrollPane(table2);
        page2.add(table2ScrollPane);
        tabbedPane1.addTab("Page 2", page2);

        // Page 3 with tree1 and other components
        JPanel page3 = new JPanel();
        page3.setLayout(new BoxLayout(page3, BoxLayout.Y_AXIS));
        JScrollPane treeScrollPane = new JScrollPane(tree1);
        page3.add(treeScrollPane);
        page3.add(new JLabel("Masukkan Pewaris/Turunan"));
        page3.add(textField1);
        page3.add(tambahButton);
        tabbedPane1.addTab("Page 3", page3);

        // Initialize the tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel treeModel = new DefaultTreeModel(root);
        treeModel.setAsksAllowsChildren(true);
        tree1.setModel(treeModel);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new Swing2();
                frame.setTitle("Swing2");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    // Custom table model class
    class CustomTableModel extends AbstractTableModel {
        private String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        private Object[][] data = {
                {"Data 1", "Data 2", "Data 3"},
                {"Data 4", "Data 5", "Data 6"},
                {"Data 7", "Data 8", "Data 9"}
        };

        @Override
        public int getRowCount() {
            return data.length;
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return data[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            data[rowIndex][columnIndex] = aValue;
            fireTableCellUpdated(rowIndex, columnIndex);
        }
    }
}