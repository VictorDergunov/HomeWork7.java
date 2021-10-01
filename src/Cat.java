public class Cat {
    protected String name;
    protected int appetite;
    protected int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    public void eat(Plate plate) {
        if (plate.checkFoodAmount(appetite)) {
            plate.decriesFood(appetite);
            System.out.println(getName() + " есть из миски " + " аппетит кота: " + getAppetite());
            satiety += appetite;
        } else{
            System.out.println(getName() + " пытается поесть из миски, но не хватает еды." + " Аппетит кота: " + getAppetite());
        }
    }

    //Проверка кота на сытость!
    public boolean satietyInfo() {
       if(appetite == satiety)
        return true;
        return false;
    }
}
