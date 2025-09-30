package sec05_throw;

public class ThrowExample01 {
    public static void main(String[] args) {
        String file1 = ThrowExample01.createFile("test. txt");
        String file2 = ThrowExample01.createFile("");
        System.out.println(file1 + " 파일이 성공적으로 생성되었습니다.");
        System.out.println(file2 + " 파일이 성공적으로 생성되었습니다.");

    }

    public static String createFile(String fileName){
        try {
            if(fileName == null || fileName.equals("")){
                throw  new Exception("파일이름이 유요하지 않습니다. ");
            }
        }catch (Exception e){
            fileName = "제목없음.txt";
        }
        return fileName;
    }

}
