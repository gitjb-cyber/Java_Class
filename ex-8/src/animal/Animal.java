package animal;

public class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating(){
        System.out.println("동물이 음식을 먹습니다.");
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

}
