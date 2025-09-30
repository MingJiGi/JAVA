package sec07_user_define_excption_02;

public class NewExcptionExample {

    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
        } catch (SpaceExcption e) {
            System.out.println("예외 원인 : " + e.getMessage());
        } catch (MemoryException e) {
            e.printStackTrace();
        }finally {
            deletTempFiles();
        }



    }


    public static void startInstall() throws SpaceExcption, MemoryException{
        if(!enoughSpace()){
            throw new SpaceExcption("install 공간부족");
        }
        if (!enoughMemory()){
            throw  new MemoryException("Memory is not enoughMemory");
        }
        System.out.println("정상적으로 인스톨 되었습니다.");
    }

    private static void copyFiles(){} // 파일들을 복사하는 코드를 여기에 작성
    private static void deletTempFiles(){} // 파일들을 삭제하는 코드들을 여기 작성

    private static boolean enoughSpace() {
    return true;
    }

    private static boolean enoughMemory(){
        return false;
    }


}
