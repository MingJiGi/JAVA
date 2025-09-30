package gemini_Animal;

public class ShelterMain {


    public static void main(String[] args) {


        Adoptable[] adoptables = new Adoptable[]{new Dog(3, true, "치즈"), new Cat(3, false, "먀옹이")};

        for(Adoptable a : adoptables){
            a.greet();
        }
        Kennel<Animal> animalKennel = new Kennel<>();

        animalKennel.addAnimal(new Dog(3,true,"c"));
        animalKennel.addAnimal(new Cat(3,true,"a"));

        animalKennel.listAllAnimals();

    }
}
