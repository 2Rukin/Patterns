package DecoratorDolgov;
// class decorator from base class

// we need to make constructor and save baking in
public abstract class Goodies implements Baking {
    Baking baking;

    public Goodies(Baking baking) {
        this.baking = baking;
    }

    @Override
    public void about() {
        //здесь не нужно указывать переменную т.к. необходимо вывести результат того
        // кто последний переопределял метод
                System.out.println(getDescription()+" "+ getPrice() + "рублей");

    }
}

