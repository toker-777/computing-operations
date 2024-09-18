public class computingOperations {
    public static void main(String[] args){

        System.out.println("Сложение,вычитание, деление и умножение");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4.0;
        System.out.println(dog);
        cat = cat + 4.0;
        System.out.println(cat);
        paper = paper  + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4.0;
        System.out.println(frog);

        System.out.println("Боксёры");

        var oneBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeightBoxer = oneBoxer + secondBoxer;
        System.out.println("Первый боксер весит - " + oneBoxer + " кг ");
        System.out.println("Второй боксер весит - " + secondBoxer + " кг ");
        System.out.println("Общий вес двух боксеров - " + totalWeightBoxer + " кг ");
        var weightDifference = (secondBoxer * 2)%totalWeightBoxer;
        System.out.println("Разница в вессе боксеров - " + weightDifference + " кг ");

        System.out.println("Сотрудники");

        var totalHoursOfOperations = 640;
        System.out.println("Всего часов работы поделено между всеми сотрудниками - " + totalHoursOfOperations + " часов ");
        var oneEmployee = 8;
        System.out.println("Один сотрудник уделяет работе - " + oneEmployee + " часа(ов) ");
        var totalEmployees = (totalHoursOfOperations / oneEmployee)%totalHoursOfOperations;
        System.out.println("Всего сотрудников - " + totalEmployees + " человек ");
        var increaseInEmployees = totalEmployees + 94;
        System.out.println("Сотрудники работали бы по " + (totalHoursOfOperations / increaseInEmployees) + " часа(ов)в день, если бы их было - " + (increaseInEmployees) + " сотрудника(ов) ");
    }
}