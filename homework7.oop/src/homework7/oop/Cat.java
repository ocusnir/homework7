package homework7.oop;

public class Cat {
     String name;
     int appetite;
     int full; //сытость

    public Cat(String name, int appetite, int full) {
        if(appetite>100) {
            System.out.print("\nАппетит " + name + " превышает кол-во еды в тарелке: " + appetite);
            this.name = name;
            this.full = full; // сытость
        }else {
            this.name = name;
            this.appetite = appetite;
            this.full = full; // сытость
        }

    }

    public void eat(Plate p){
        p.decreasedFood(appetite);
        full += appetite; // прибавляем к сытости кол-во потребляемой еды
    }

    public void catInfo(){
        System.out.printf("\n%s, %d, %d", name, appetite, full);
    }
}