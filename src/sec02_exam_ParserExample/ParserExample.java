package sec02_exam_ParserExample;

public class ParserExample {
    public static void main(String[] args) {
       Parseble parser = ParserManager.getParser("XML");
       parser.parse("문서1.xml");


       parser = ParserManager.getParser("HTML");
       parser.parse("문서2");

    }
}
