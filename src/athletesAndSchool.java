public class athletesAndSchool {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 5");

        int totalCans = 120;
        System.out.println("Всего для ремонта школы требуется - " + totalCans + " банок краски ");
        int whitePaints = 2;
        System.out.println("На один класс требуется - " + whitePaints + " банки белой краски ");
        int brownPaints = 4;
        System.out.println("Также на один класс требуется - " + brownPaints + " банки коричневой краски ");
        int allPaints = (whitePaints + brownPaints);
        System.out.println("Всего для ремонта 1 класса требуется - " + allPaints + " банок с красками ");
        int totalClasses = (totalCans / allPaints);
        System.out.println("В школе всего - " + totalClasses + " классов ");
        int allWhitePaints = (totalClasses * whitePaints);
        System.out.println("Требуется - " + allWhitePaints + " белой краски на один класс ");
        int allBrownPaints = (totalClasses * brownPaints);
        System.out.println("Требуется - " + allBrownPaints + " коричневой краски на один класс ");
    }
    public static void task2(){
        System.out.println("Задача 6");

    byte banana = 80;
        System.out.println("Один банан весит - " + banana + " грамм ");
    byte milk = 105;
        System.out.println("100 мл молока весят - " + milk + " граммов ");
    byte iceCream = 100;
        System.out.println("Один брикет мороженного пломбир весит - " + iceCream + " грамм ");
    byte rawEggs = 70;
        System.out.println("Одно сырое яйцо весит - " + rawEggs + " грамм ");
    float mixBlender =(5*banana+2*milk+2*iceCream+4*rawEggs);
        System.out.println("Всего в блендере - " + mixBlender + " граммов ");
        float kgBlender = mixBlender/1000;
        System.out.println("Или - " + kgBlender + " кг ");

    }
}




