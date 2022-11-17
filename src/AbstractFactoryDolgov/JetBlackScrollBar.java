package AbstractFactoryDolgov;

public class JetBlackScrollBar extends ScrollBar{
    @Override
    void scrollTo(int i) {
        System.out.println("JetBlack Scrolling to");
    }
}
