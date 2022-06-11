package homework7.oop;
public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreasedFood(int n){
        //уменьшаем кол-во еды с тарелки
        if(n<100 && food > n ) {
            food -= n;
        }
        //добавляем еду в тарелку в случае её нехватки
        if(food<n && food <100 ){
            food += n/2;
        }
    }

    public void plateInfo(){
        System.out.print("\nPlate: " + food);
    }
}