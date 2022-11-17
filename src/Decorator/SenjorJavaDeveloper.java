package Decorator;

public class SenjorJavaDeveloper extends DeveloperDecorator{
    public SenjorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review...";

    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
