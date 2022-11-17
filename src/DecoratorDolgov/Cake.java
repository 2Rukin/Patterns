package DecoratorDolgov;

public class Cake implements Baking{
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Базовый торт";
    }

    @Override
    public void about() {
        System.out.println(getDescription()+" "+ getPrice() + "рублей");
    }
}
