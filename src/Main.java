public class Main {
    public static void main(String[] args) {
    //Задача 1
    System.out.println("Задача 1");
    int amount = 15_000;
    int summPayments = 0;
    int month = 0 ;
    while (summPayments < 2_459_000 ){
        summPayments = summPayments + amount;
        month = month+1;
        System.out.println("Месяц "+month+ ", сумма накоплений равна "+summPayments+" рублей");
    }
        System.out.println();
    //Задача 2
    System.out.println();
    System.out.println("Задача 2");
    int i = 0;
    while (i<10){
        i=i+1;
        System.out.print(" "+i+" ");
    }
        System.out.println();
    for (int y = 10; y>0; y--){
        System.out.print(" "+y+" ");
    }
        System.out.println();
        System.out.println();
    //Задача 3
    System.out.println("Задача 3");
    int peopleBornPerThousand = 17;
    int peopleDiePerThousand= 8;
    int population=  12_000_000;
    for (int z=1;z<=10;z++){
        population += population*peopleBornPerThousand/1000- population*peopleDiePerThousand/1000 ;
        System.out.println("Год "+z+", численность населения составляет " +population+" человек");
        }
    //Задача 4
        System.out.println();
        System.out.println("Задача 4");
    double percent = 7D/100;
    int desiredSum = 12_000_000;
    int amount1 = 15_000;
    int sum = amount1;
    month=0;
    while (sum<desiredSum){
        sum = (int) (sum*(1+percent));
        month++;
        System.out.println("Месяц "+month+", сумма накоплений равно "+sum+" рублей");
    }
    //Задача 5
        System.out.println();
        System.out.println("Задача 5");
        sum = amount1;
        month=0;
        while (sum<desiredSum){
            sum = (int) (sum*(1+percent));
            month++;
            if(month%6==0){
                System.out.println("Месяц"+month+", сумма накоплений равно "+sum+" рублей");
            }
        }
    //Задача 6
        System.out.println();
        System.out.println("Задача 6");
    int payment = 15000;
    percent = 7D/100;
    sum = payment;
    month = 0;
    int monthsToSave = 9*12;
    while (month<monthsToSave){
       sum = (int) (sum * (1+percent));
       month++;
       if (month %6 == 0 ){
           System.out.println("Месяц "+month+" ,сумма накоплений равно "+ sum +" рублей");
       }
      }
    //Задача 7
        System.out.println();
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day=firstFriday;day<=31;day+=7){
            System.out.println("Сегодня пятница "+day+"-е число. Необходимо подготовить отчёт");
        }
    //Задача 8
        System.out.println();
        System.out.println("Задача 8");
        int period = 79;
        int startSeeing = 0;
        int currentyear = 2024;
        int start = currentyear -200;
        int end = currentyear + 100;
        for (int year = startSeeing; year<end; year+=period){
            if (year>start){
                System.out.println(year);
            }
        }
    }
}