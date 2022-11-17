    package AbstractFactoryDolgov;

public class Main2 {
    private static GuiFactory guiFactory;

    public static void main(String[] args) {
//        TextArea textArea = new TextArea();
//        ScrollBar scrollBar = new ScrollBar();
//        Button button = new Button();

//        TextArea textArea = new JetBlackTextArea();
//        ScrollBar scrollBar = new JetBlackScrollBar();
//        Button button = new JetBlackButton();

        int style = 1;
        switch (style){
            case 1:
                guiFactory= new JetBlackFactory();
                break;
            case 2:
                guiFactory = new RoseGoldFactory();
                break;


        }


        TextArea textArea = guiFactory.createTextArea();
        Button button = guiFactory.createButton();
        ScrollBar scrollBar = guiFactory.createScrollBar();

        scrollBar.scrollTo(100);
    }
}
