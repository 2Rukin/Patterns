package DecoratorDolgov;

public class Chocolate extends Goodies{
    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public void about() {
        System.out.println(getDescription()+" "+ getPrice() + "рублей");

    }

    @Override
    public int getPrice() {
        return 20 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + "Шоколадная присыпка";
    }
}
