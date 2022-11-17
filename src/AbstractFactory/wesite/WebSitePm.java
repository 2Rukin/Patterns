package AbstractFactory.wesite;

import AbstractFactory.ProjectManager;

public class WebSitePm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web site manges web site project");
    }
}
