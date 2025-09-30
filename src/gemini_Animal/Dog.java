package gemini_Animal;

public class Dog extends Animal{

    String breed;

    public Dog(int age, boolean isAdopted, String name) {
        super(age, isAdopted, name);
    }


    @Override
    String getSpeciesInfo() {
        return "품종 : " + this.breed;
    }

    // Dog.java에 구현 (힌트)
    @Override
    public String getAdoptionStatus() {
        // 1. Animal의 공통 정보 사용 (name, isAdopted)
        String status = "이름: " + this.name + ", 나이: " + this.age + "살";

        // 2. Dog의 고유 정보 사용 (breed)
        status += ", 품종: " + this.breed;

        // 3. 입양 가능 상태 정보 추가
        status += " | 입양 가능 여부: " + (this.isAdopted ? "입양됨" : "입양 가능");

        return status;
    }
}
