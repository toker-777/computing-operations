public class teachersAndCars {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int ludmilaPavlovna = 23;
        System.out.println("У Людмилы Петровны - " + ludmilaPavlovna + " ученика ");
        int annaSergeevna = 27;
        System.out.println("У Анны Сергеевны - " + annaSergeevna + " учеников ");
        int ekaterinaAndreevna = 30;
        System.out.println("У Екатерины Андреевной - " + ekaterinaAndreevna + " учеников ");
        short paper = 480;
        System.out.println("Всего закуплено - " + paper + " листов бумаги ");
        int sheetsOfPaper = paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На одного ученика рассчитано - " + sheetsOfPaper + " листов бумаги ");
    }

    public static void task2 () {
        System.out.println("Задача 2");

        byte machine = 16;
        System.out.println("Производительность машины для изготовления бутылок за 2 минуты - " + machine + " бутылок ");
        byte productionOnTime = 2;
        int oneMinuteProduction = (machine / productionOnTime);
        System.out.println("За 1 минуту производится - " + oneMinuteProduction + " бутылок ");
        int twentyMinute = oneMinuteProduction * 20;
        System.out.println("За 20 минут производится - " + twentyMinute + " бутылок ");
        int oneDay = (oneMinuteProduction * 60) * 24;
        System.out.println("В сутки производится - " + oneDay + " бутылок ");
        int threeDays = oneDay*3;
        System.out.println("За три дня производится - " + threeDays + " бутылок ");
        int oneMonth = threeDays*10;
        System.out.println("В месяц производится - " + oneMonth + " бутылок ");



    }
}

