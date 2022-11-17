package AbstractFactory.wesite;

import AbstractFactory.Banking.QATester;
import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override


    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTeter();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePm();
    }
}
