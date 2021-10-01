import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[4]; //Создаем массив котов!
        catArray[0] = new Cat("Барсик", 15, 0);
        catArray[1] = new Cat("Мурзик", 20, 0);
        catArray[2] = new Cat("Шарик", 30 , 0);
        catArray[3] = new Cat("Васька", 50, 0);

        Plate plate = new Plate(100); //Создаем миску с колличеством еды 100 ед.

        for(Cat cat: catArray){
            plate.infoPlate(); // информация по колличеству еды в миске
            cat.eat(plate); // заставляем всех котов поесть из миски
            System.out.println("Кот: " + cat.name + " \nСытость: " + cat.satietyInfo() + " "); // выводим информации о сытости котов!
        }

    }



}
