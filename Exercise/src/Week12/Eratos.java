package Week12;

import java.util.*;

public class Eratos {

    private static ArrayList<Integer> allNumber = new ArrayList<Integer>();
    private static ArrayList<Integer> primeNumber = new ArrayList<Integer>();

    public static ArrayList<Integer> sieve(int n){
        for(int i=2; i<=n; i++){ //n-1개 element
            allNumber.add(i);
        }
        while(allNumber.size() != 0){ //remove 안된 것들은 0번째에 있을 것이니까
            int prime = allNumber.get(0);
            primeNumber.add(prime);
            allNumber.remove(0);
            for(int i=2; i*prime<=n; i++){
                allNumber.remove((Integer)(i*prime));
            }
        }
        return primeNumber;
    }
}
