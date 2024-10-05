package Animals;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Bowl bowl = new Bowl(2); // Создаем миску с 10 единицами еды

        Cat barsik = new Cat("Барсик");
        Cat murzik = new Cat("Мурзик");
        Cat tom = new Cat("Том");

        // Пробежка и плавание для собаки
        bobik.run(150);
        bobik.swim(5);

        // Пробежка и плавание для котов
        barsik.run(200);
        barsik.swim(10);

        murzik.run(150);
        murzik.swim(5);

        tom.run(100);
        tom.swim(3);

        // Каждый кот пытается покушать из миски
        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            cat.eat(bowl);
        }

        // Выводим информацию о сытости котов
        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            System.out.println(cat.getName() + (cat.isFull() ? " сыт." : " голоден."));
        }

        // Добавление еды в миску
        bowl.addFood(1);
        System.out.println("Добавлено еды в миску. Количество еды в миске: " + bowl.getFoodAmount());

        // Проверяем, может ли кот покушать снова
        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            cat.eat(bowl);
        }

        // Выводим информацию о сытости котов после добавления еды
        for (Cat cat : new Cat[]{barsik, murzik, tom}) {
            System.out.println(cat.getName() + (cat.isFull() ? " сыт." : " голоден."));
        }

        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
    }
}