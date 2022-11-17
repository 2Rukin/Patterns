package DecoratorDolgov;

public class Main {
    public static void main(String[] args) {

        Baking baking = new Cake();

//        System.out.println(baking.getDescription()+" "+ baking.getPrice() + "рублей");
        baking.about();

        baking = new Cream(baking);
//        System.out.println(baking.getDescription()+" "+ baking.getPrice() + "рублей");
        baking.about();

        baking = new Chocolate(new Cream(new Cake()));
        baking.about();
//        System.out.println(baking.getDescription()+" "+ baking.getPrice() + "рублей");

    }
}
