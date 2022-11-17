package AbstractFactory.Banking;

import AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.printf("Java developer Writes Java Code");
    }
}
