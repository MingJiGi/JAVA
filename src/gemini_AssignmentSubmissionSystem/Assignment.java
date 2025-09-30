package gemini_AssignmentSubmissionSystem;

public abstract class Assignment implements Submittable{
    protected String title, dueDate;
    private boolean isSubmitted;

    public Assignment(String dueDate, boolean isSubmitted, String title) {
        this.dueDate = dueDate;
        this.isSubmitted = isSubmitted;
        this.title = title;
    }


    abstract String getSpecificRequirements();


    @Override
    public void getSubmissionStatus() {

    }

    @Override
    public boolean submit() {
        this.isSubmitted = true;
        return true;
    }
}
