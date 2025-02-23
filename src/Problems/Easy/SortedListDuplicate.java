package Problems.Easy;

public class SortedListDuplicate {
//2 pointer technique
    public static void main(String [] args){
        int [] a = {0,0,1,1,1,2,2,3,3,4};
        int j =0;
        int index = 1;
        while(index < a.length){
            if(a[index]!=a[j]){
                j++;
                a[j]=a[index];
            }
            index++;
        }
    }



}
