package gemini_AssignmentSubmissionSystem;

public class CodingAssignment extends Assignment{

    String programingLanguage;


    public CodingAssignment(String dueDate, boolean isSubmitted, String title, String programingLanguage) {
        super(dueDate, isSubmitted, title);
        this.programingLanguage = programingLanguage;
    }


    @Override
    String getSpecificRequirements() {
        return "과제명 : " +this.programingLanguage + "제출 기한 : " + this.dueDate +
                title;
    }
}
