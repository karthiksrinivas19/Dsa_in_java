
import java.util.Arrays;

public class insertionsort {
    public void Insertionsort(int[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args) {
        insertionsort sorter=new insertionsort();
        int array[]={1,4,3,2,5,7,8,6};
        sorter.Insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
}
