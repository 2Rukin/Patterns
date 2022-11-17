package Decorator;

public class Task {

    public static void main(String[] args) {

        Developer developer =  new JavaTeamLead (new SenjorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
