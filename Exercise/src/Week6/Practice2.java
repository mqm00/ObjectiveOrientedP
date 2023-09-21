package Week6;
import Week5.*;
import Week5.util.AgeCalculator;

import java.util.Date;

public class Practice2 {
    public static void main(String[] args) {
        Person[] arrPerson = new Person[10];
        Date myDate1 = new Date(2000,05,01);
        Date myDate2 = new Date(2001, 8, 13);
        Date myDate3 = new Date(2002, 03, 14);
        Date myDate4 = new Date(2003, 07, 07);
        Date myDate5 = new Date(2004, 07, 17);
        Date myDate6 = new Date(2005, 9, 25);
        Date myDate7 = new Date(2006, 1, 14);
        Date myDate8 = new Date(2007, 9, 04);
        Date myDate9 = new Date(2008,01,04);
        Date myDate10 = new Date(1999, 05, 01);

        arrPerson[0] = new Person("Sean", myDate1, null);
        arrPerson[1] = new Person("Jack", myDate2, null);
        arrPerson[2] = new Person("Leo", myDate3, null);
        arrPerson[3] = new Person("Tom", myDate4, null);
        arrPerson[4] = new Person("Alice", myDate5, null);
        arrPerson[5] = new Person("Erin", myDate6, null);
        arrPerson[6] = new Person("Tiffany", myDate7, null);
        arrPerson[7] = new Person("Holland", myDate8, null);
        arrPerson[8] = new Person("Lian", myDate9, null);
        arrPerson[9] = new Person("Veck", myDate10, null);

        for(int i=0; i<10; i++)
            System.out.printf("%s ",arrPerson[i].getName());

        sort(arrPerson);
        System.out.println();
        for(int i=0; i<10; i++)
            System.out.printf("%s ", arrPerson[i].getName());
    }

    public static void sort(Person[] PersonArr) {

        int index, indexOfNextSmallest;
        for(index = 0; index < 9; index++){
            indexOfNextSmallest = indexOfSamllest(index, PersonArr);
            interChange(index, indexOfNextSmallest, PersonArr);
        }
    }

    private static int indexOfSamllest(int start, Person[] p){
        Person min = p[start];
        int index;
        int indexOfMin = start;
        for(index = start+1; index < 10; index++)
            if(AgeCalculator.isOlder(p[index], min) == -1){
                min = p[index];
                indexOfMin = index;
            }
        return indexOfMin;
    }

    private static void interChange(int i, int j, Person[] p){
        Person tmp;
        tmp = p[i];
        p[i] = p[j];
        p[j] = tmp;
    }
}