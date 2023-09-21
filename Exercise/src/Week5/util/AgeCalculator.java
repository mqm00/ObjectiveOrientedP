package Week5.util;

import Week5.Person;
import java.util.Date;

public class AgeCalculator {

    public static int calAge(Person p) {
        Date Age_born = p.getborn();
        Date Age_died = p.getDied();

        if(p.getDied() == null) {
            int myAge = 2022 - Age_born.getYear();
            if (Age_born.getMonth() > 4) {
                return --myAge;
            } else if (Age_born.getMonth() == 4) {
                if (Age_born.getDate() <= 13)
                    return myAge;
                else
                    return --myAge;
            } else
                return --myAge;
        }
        else{
            int myAge = Age_died.getYear()-Age_born.getYear();
            if(Age_born.getMonth() > Age_died.getMonth()){
                return --myAge;
            } else if(Age_born.getMonth() == Age_died.getMonth()){
                if(Age_born.getDate() <= Age_died.getDate())
                    return myAge;
                else
                    return --myAge;
            } else
                return --myAge;
        }
    }

    public static int isOlder(Person p1, Person p2){
        int firstAge = AgeCalculator.calAge(p1);
        int secondAge = AgeCalculator.calAge(p2);

        if(firstAge > secondAge)
            return 1;
        else if(firstAge == secondAge)
            return 0;
        else
            return -1;
    }
}
