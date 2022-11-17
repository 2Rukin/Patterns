package AbstractFactory.wesite;

import AbstractFactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("PHp developer writes Php code");
    }
}
