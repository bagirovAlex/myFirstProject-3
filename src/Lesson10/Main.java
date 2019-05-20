package Lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.setAge(12);

        Cat cat = new Cat();
        cat.setAge(22);

        Animal[] animalsMassive = new Animal[2];
        animalsMassive[0] = cat;
        animalsMassive[1] = dog;

        for (int i=0; i<animalsMassive.length;i++){
            animalsMassive[i].printToConsol();
        }

    }
}
