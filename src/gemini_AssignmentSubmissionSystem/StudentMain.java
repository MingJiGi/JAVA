package gemini_AssignmentSubmissionSystem;

public class StudentMain {
    public static void main(String[] args) {


        Submittable[] submittables = new Submittable[]{new CodingAssignment("A",true,"X","a"),
        new EssayAssignment("a",true,"x",10)};

        for (Submittable a : submittables){
            a.submit();
        }







    }
}
