package dom2;

public class Main {
    public static void main(String[] args) {
        Fruit apple1 = new Apple();
        Fruit orange1 = new Orange();

        System.out.println("apple weight: " + apple1.getWeight());
        System.out.println("orange weight: " + orange1.getWeight());
        System.out.println();

        Box box1 = new Box<>();
        Box box2 = new Box<>();
        System.out.println("empty box weight: " + box1.getWeight());
        System.out.println();

        // добавление 1 фрукта в коробку
        box1.addOne(apple1);
        box1.addOne(orange1);

        // проверка количества фруктов в коробке
        System.out.println("fruits in box1: " + box1.getNumOfFruits());
        System.out.println(box1.toString());
        System.out.println();

        // создание нескольки фруктов
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit apple4 = new Apple();
        Fruit orange2 = new Orange();

        // добавление нескольки яблок и 1 апельсина в коробку с яблоками
        box1.addFew(apple2, apple3, apple4, orange2);
        // добавились только яблоки
        System.out.println(box1);
        // добавление яблока и апельсина в коробку  с яблоками
        Fruit[] apples = {new Apple(), new Orange()};
        box1.addFew(apples);
        System.out.println(box1);
        // добавилось только яблоко
        System.out.println();

        // проверка типа фруктов в коробке
        System.out.println("fruits in box1: " + box1.getBoxType());
        System.out.println();

        // добавление апельсин в коробку box2
        box2.addFew(orange1, orange2, apple1);
        // добавились только апельсины
        System.out.println(box2);
        System.out.println();

        // вес фруктов в коробке
        System.out.println("fruits weight in box1: " + box1.getWeight());
        System.out.println("fruits weight in box2: " + box2.getWeight());
        System.out.println();

        // сравнение коробок по весу
        // 3 яблока и 2 апельсина
        System.out.println("create 2 new boxes box3: 3 apples, box4: 2 oranges");
        Box box3 = new Box<>(new Apple(), new Apple(), new Apple());
        Box box4 = new Box<>(new Orange(), new Orange());
        System.out.println("compare() : " + box3.compare(box4));
        System.out.println();

        // сравнение коробок по весу
        // 2 яблока и 3 апельсина
        System.out.println("create 2 new boxes box5: 2 apples, box6: 3 oranges");
        Box box5 = new Box<>(new Apple(), new Apple());
        Box box6 = new Box<>(new Orange(), new Orange(), new Orange());
        System.out.println("compare(): " + box5.compare(box6));
        System.out.println();

        // пересыпание однотипных фруктов в другую коробку
        // merge()
        // apples -> apples
        System.out.println("box1: " + box1);
        System.out.println("box3: " + box3);
        System.out.println("merge(): add to box1 (5 aples) from box3 (3 apples)");
        box1.merge(box3);
        System.out.println("box1: " + box1);
        System.out.println("box3: " + box3);
        System.out.println();

        // пересыпание фруктов другого типа в коробку
        // merge()
        // oranges -> apples
        System.out.println("2 oranges from box2 -> box5 apples");
        System.out.println("box2: " + box2);
        System.out.println("box5: " + box5);
        System.out.println("merge(): add to box5 (5 aples) from box2 (2 oranges)");
        box5.merge(box2);
        System.out.println("box2: " + box2);
        System.out.println("box5: " + box5);
        System.out.println();
        // апельсины к яблокам не добавились

        // удаление фруктов из коробки
        System.out.println("box1: " + box1);
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        box1.removeOne("print");
        System.out.println("box1: " + box1);
        System.out.println(box1.getFruitsBox());
    }
}
