package AbstractFactoryDolgov;

public class Main {
    private static GuiFactory guiFactory = new JetBlackFactory();

    public static void main(String[] args) {
//        TextArea textArea = new TextArea();
//        ScrollBar scrollBar = new ScrollBar();
//        Button button = new Button();

//        TextArea textArea = new JetBlackTextArea();
//        ScrollBar scrollBar = new JetBlackScrollBar();
//        Button button = new JetBlackButton();

        TextArea textArea = guiFactory.createTextArea();
        Button button = guiFactory.createButton();
        ScrollBar scrollBar = guiFactory.createScrollBar();

        scrollBar.scrollTo(100);
    }
}
