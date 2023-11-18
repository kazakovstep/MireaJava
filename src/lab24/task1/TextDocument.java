package lab24.task1;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening text document");
    }

    @Override
    public void newDocument() {
        System.out.println("Creating new text document");
    }

    @Override
    public void save() {
        System.out.println("Saving text document");
    }
}