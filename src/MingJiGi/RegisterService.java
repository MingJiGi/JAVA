package MingJiGi;

public class RegisterService {
    void checkCredentials(String id, String password) throws InvalidPasswordException, InvoalidIdExcotion{
        if (id.length() < 8 || id.length() > 20){
            throw new InvoalidIdExcotion("아이디는 8자 미만 20자 초과할수 없습니다.");
        } else if (password.length() >= 12 || !password.contains("!")) {
            throw new InvalidPasswordException("비밀번호는 12자미만 특수문자 ! 필수사용");
        }else System.out.println("정상회원가입 완료");
    }
}
