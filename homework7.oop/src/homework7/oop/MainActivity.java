package homework7.oop;

public class MainActivity {
    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Mickey", 5, 0);
        cat[1] = new Cat("Layla",  2000, 0);
        cat[2] = new Cat("Musa", 50, 0);
        cat[3] = new Cat("Robert", 300, 0);
        catEat(cat);

    }

    static void catEat(Cat[] cats){

        Plate plate = new Plate(10); // кол-воо еды в тарелке
        plate.plateInfo();
        for (Cat cat: cats) {
            cat.eat(plate);
            cat.catInfo();
            plate.plateInfo();
        }
    }
}