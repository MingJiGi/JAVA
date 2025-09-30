package gemini_Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * T extends Animal: 제네릭 경계 설정 완료. (매우 잘했습니다!)
 */
public class Kennel <T extends Animal>{
    private List<T> animalList;

    public Kennel() {
        this.animalList = new ArrayList<>();
    }

    // List 메서드 사용법 정확합니다.
    public void addAnimal(T animal){
        animalList.add(animal);
    }

    public void listAllAnimals(){
        System.out.println("--- 보호소 동물 목록 ---");
        for(T animal : animalList){
            // greet()이 반환한 String을 출력합니다.
            System.out.println(animal.greet());
        }
    }

    public List<T> getAnimalList() {
        return animalList;
    }
}