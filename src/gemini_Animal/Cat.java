package gemini_Animal;

public class Cat extends Animal{

    String catColor;

    public Cat(int age, boolean isAdopted, String name) {
        super(age, isAdopted, name);
    }


    @Override
    String getSpeciesInfo() {
        return "색상 : " + this.catColor;
    }

    // Dog.java에 구현 (힌트)
    @Override
    public String getAdoptionStatus() {
        // 1. Animal의 공통 정보 사용 (name, isAdopted)
        String status = "이름: " + this.name + ", 나이: " + this.age + "살";

        // 2. Dog의 고유 정보 사용 (breed)
        status += ", 색상: " + this.catColor;

        // 3. 입양 가능 상태 정보 추가
        status += " | 입양 가능 여부: " + (this.isAdopted ? "입양됨" : "입양 가능");

        return status;
    }
}
