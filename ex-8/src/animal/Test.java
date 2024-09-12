package animal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {



        Test test = new Test();

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());

        // ~.~.requst => requst 는 변수
        // ~.~.requst() => requst() 는 객체 안 메서드

        for (Animal animal : animalList)
        {
            animal.move();
            test.downCasting(animal);
            System.out.println("-----------");
        }
        /*
        test.downCasting(hAnimal);
        test.downCasting(tAnimal);
        test.downCasting(eAnimal);
        */
    }

    public void moveAnimal(Animal animal)
    {
        animal.move();
    }

    public void downCasting(Animal animal){
        if(animal instanceof Human)
        {
            Human h = (Human) animal; // 자식 자료형으로 형변환 - 다운캐스팅
            h.readBooks();
        }else if(animal instanceof Tiger)
        {
            Tiger t = (Tiger) animal;
            t.hunting();
        }else if(animal instanceof Eagle)
        {
            Eagle e = (Eagle) animal;
            e.flying();
        }

    }
}
