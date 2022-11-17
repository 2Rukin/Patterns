package DecoratorDolgov;

public class Cream extends Goodies {

    // 1 .могли бы объявить переменную Предка
    //     Baking baking;
    public Cream(Baking baking) {
        super(baking);   // 3. В итоге после создания в декораторе  обратимся к ней.


        // 2 .  и тут вернуть эту переменную , но минус в том
        // что так пришлось бы делать с каждой оберткой
        // this.baking= baking;
        // поэтому объявим  в декораторе  Goodies


    }

    @Override
    public int getPrice() {
        return 10 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription()+ "с кремом";
    }

    @Override
    public void about() {
        System.out.println(getDescription()+" "+ getPrice() + "рублей");

    }
}
