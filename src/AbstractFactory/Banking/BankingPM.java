package AbstractFactory.Banking;

import AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Банкинг прожект манагер");
    }
}
