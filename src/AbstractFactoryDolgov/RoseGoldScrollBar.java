package AbstractFactoryDolgov;

public class RoseGoldScrollBar extends ScrollBar{
    @Override
    void scrollTo(int i) {
        System.out.println("RoseGold Scrolling to ");
    }
}
