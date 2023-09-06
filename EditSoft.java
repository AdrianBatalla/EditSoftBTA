import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.filechooser.FileSystemView;

public class EditSoft {

    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a window
        JFrame ventana = new JFrame("Modificalo, pue");
        ventana.setSize(800, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().setBackground(new Color(0x6D909F));
        ventana.setLayout(new BorderLayout());

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu opcionesMenu = new JMenu("Opciones");
        JMenu editarMenu = new JMenu("Editar");
        JMenu ayudaMenu = new JMenu("Ayuda");
        // Create sub-menu items
        JMenuItem ejemplo1 = new JMenuItem("Ejemplo1");
        JMenuItem ejemplo11 = new JMenuItem("Ejemplo11");
        JMenuItem ejemplo2 = new JMenuItem("Ejemplo2");
        JMenuItem ejemplo3 = new JMenuItem("Ejemplo3");
        // Add sub-menu items to the parent menus
        opcionesMenu.add(ejemplo1);
        opcionesMenu.add(ejemplo11);
        editarMenu.add(ejemplo2);
        ayudaMenu.add(ejemplo3);
        menuBar.add(opcionesMenu);
        menuBar.add(editarMenu);
        menuBar.add(ayudaMenu);
        ventana.setJMenuBar(menuBar);

        // Create a panel for the folder selection area
        JPanel folderSelectionPanel = new JPanel();
        folderSelectionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel folderLabel = new JLabel("Por favor, seleccione una carpeta:");
        JButton selectButton = new JButton("Seleccionar");

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    String selectedFolder = fileChooser.getSelectedFile().getAbsolutePath();
                    folderLabel.setText("Carpeta seleccionada: " + selectedFolder);
                }
            }
        });
        
        folderSelectionPanel.add(folderLabel);
        folderSelectionPanel.add(selectButton);
        ventana.add(folderSelectionPanel, BorderLayout.NORTH);

        // Create a JSplitPane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        // Create a TextArea with ScrollBar
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setPreferredSize(new Dimension(350, 0));

        // Create a container on the right
        JPanel container = new JPanel();
        container.setPreferredSize(new Dimension(15, 0));

        // Add components to the JSplitPane
        splitPane.setLeftComponent(scrollPane);
        splitPane.setRightComponent(container);

        // Add the JSplitPane to the center of the content pane
        ventana.add(splitPane, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}