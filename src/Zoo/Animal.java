package Zoo;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract void eat();
    abstract void makeSound();
}

interface Flyable{
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird extends Animal implements Flyable{

    public Bird(String name){
        super(name);
    }

    void eat() {
        System.out.println("\t" + getName() + " eat worms!");
    }
    void makeSound(){
        System.out.println("\t" + getName() + " chirps!");
    }
    public void fly(){
        System.out.println("\t" + getName() + " is flying!");
    }
}

class Fish extends Animal implements Swimmable {

    public Fish(String name){
        super(name);
    }
    void eat(){
        System.out.println("\t" + getName() + " eats ocean grass, worms and smaller fishes!");
    }
    void makeSound(){
        System.out.println("\t" + getName() + " make sounds at low frequency!");
    }
    public void swim() {
        System.out.println("\t" + getName() + " is swimming!");
    }
}

class Lion extends Animal {
    public Lion(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("\t" + getName() + " roars!");
    }
    public void eat(){
        System.out.println("\t" + getName() + " eats flesh!");
    }
}

class Zoo {
    public Animal [] animals;
    public int counter;

    public Zoo(int Max){
        animals = new Animal[Max];
        counter = 0;
    }

    public void addAnimal(Animal animal) {
        if (counter < animals.length){
            animals[counter] = animal;
            counter++;
        } else {
            System.out.println("The zoo is full. Can not add more animals!");
        }
    }

    public void showFlyingAnimals() {
        System.out.println("\n->Animals that can fly: ");
        for (int i = 0; i < counter; i++){
            if(animals[i] instanceof Flyable){
                ((Flyable) animals[i]).fly();
            }
        }
    }

    public void showSwimmableAnimals() {
        System.out.println("\n->Animals that can swim: ");
        for (int i = 0; i < counter; i++) {
            if(animals[i] instanceof Swimmable){
                ((Swimmable) animals[i]).swim();
            }
        }
    }

    public void animalMakingSound() {
        System.out.println("\n->Animal sounds: ");
        for (int i=0; i< counter; i++) {
            animals[i].makeSound();
        }
    }

    public void eatingAnimal() {
        System.out.println("\n->Animal eats: ");
        for (int i = 0; i< counter; i++) {
            animals[i].eat();
        }
    }

    public void allAnimals() {
        System.out.println("->Animals we have in our Zoo: ");
        for (int i=0; i< counter; i++) {
            System.out.println("\t" + animals[i].getName());
        }
    }
}

class zooManagementSystem{
    public static void main(String[] args){
        Zoo zoo = new Zoo(5);

        Animal bird = new Bird("Parrot");
        Animal fish = new Fish("GoldFish");
        Animal lion = new Lion("Lion");

        zoo.addAnimal(bird);
        zoo.addAnimal(fish);
        zoo.addAnimal(lion);

        zoo.allAnimals();
        zoo.showFlyingAnimals();
        zoo.showSwimmableAnimals();
        zoo.animalMakingSound();
        zoo.eatingAnimal();
    }
}