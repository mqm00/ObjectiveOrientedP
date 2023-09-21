package Week10;

public class BinarySearch {
    public static int Search(int[] inputArr, int start, int end, int target){
        int middle = (start+end)/2;

        if(inputArr[middle] == target)
            return middle;
        if(inputArr[middle] > target)
            return Search(inputArr, start, middle-1, target);
        if(inputArr[middle] < target)
            return Search(inputArr, middle+1, end, target);

        return -1;
    }
}
