package lab24.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorWindow extends JFrame {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorWindow(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        setTitle("Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создаем меню File
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Реализуем обработку событий для пунктов меню
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewDocument();
            }
        });
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDocument();
            }
        });
        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDocument();
            }
        });
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Добавляем пункты меню в меню File
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);

        // Создаем главное меню и добавляем меню File
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.newDocument();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("There is no document to save");
        }
    }

    public static void main(String[] args) {
        // Создаем текстовый редактор
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorWindow textEditor = new EditorWindow(textDocumentFactory);

        // Демонстрируем работу каркаса
        textEditor.createNewDocument();
        textEditor.openDocument();
        textEditor.saveDocument();
    }
}