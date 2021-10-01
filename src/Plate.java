public class Plate {
    protected int food;
    public Plate (int food){
        this.food = food;
    }

    public int getFood() {
        if (food <= 0){
            System.out.println("В миске нет еды!");
        }
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void infoPlate(){
        System.out.println("Колличество еды в миске: " + getFood());
    }

    public void decriesFood(int n){
        if (food < n){
            System.out.println("Накормить кота нельзя, не хватает корма!");
        } else if (food == 0){
            System.out.println("Миска пустая!");
        }
        else {
            food -= n;
        }
    }
    // Проверка, есть ли достаточное колличество еды в миске! Если true, то в методе eat() у нас кот получает насыщение.
     public boolean checkFoodAmount (int n){
        return n <= food;
     }
}
