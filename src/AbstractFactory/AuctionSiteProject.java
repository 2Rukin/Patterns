package AbstractFactory;

import AbstractFactory.wesite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();

        System.out.println(" Creating auction website....");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
