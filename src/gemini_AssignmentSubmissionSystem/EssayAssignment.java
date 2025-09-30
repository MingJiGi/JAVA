package gemini_AssignmentSubmissionSystem;

public class EssayAssignment extends Assignment{

    int worldCountLimit;


    public EssayAssignment(String dueDate, boolean isSubmitted, String title, int worldCountLimit) {
        super(dueDate, isSubmitted, title);
        this.worldCountLimit = worldCountLimit;
    }

    @Override
    String getSpecificRequirements() {
        return "" + worldCountLimit;
    }
}
