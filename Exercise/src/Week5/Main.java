package Week5;

import java.util.Date;
import Week5.util.*;

public class Main {
    public static void main(String[] args){
        Date myDate1 = new Date(1997, 8, 13);
        Date myDate2 = new Date(2022, 4, 13);
        Date myDate3 = new Date(2000, 05, 01);
        Date myDate4 = null;

        Person p1 = new Person("Jack", myDate1, myDate2);
        Person p2 = new Person("Sean", myDate3, myDate4);

        System.out.println(p2.toString());
        System.out.println(p1.toString());

        int i = AgeCalculator.calAge(p1);
        int k = AgeCalculator.calAge(p2);
        System.out.printf("%s's Age = %d\n", p1.getName(), i);
        System.out.printf("%s's Age = %d\n", p2.getName(), k);

        if(AgeCalculator.isOlder(p1, p2) == 1)
            System.out.println(p1.getName()+" is older than "+ p2.getName());
        else if(AgeCalculator.isOlder(p1, p2) == 0)
            System.out.println("They are Friends !");
        else if(AgeCalculator.isOlder(p1, p2) == -1)
            System.out.println(p2.getName() +" is older than "+ p1.getName());

    }
}
