package Decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Send review to customer....";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReview();
    }
}
