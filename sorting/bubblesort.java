
import java.util.Arrays;
public class bubblesort {
    public void Bubblesort(int[] array){
        boolean flag= false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }            
        }
    }
    public static void main(String[] args) {
        bubblesort sorter= new bubblesort();
        int array[]={2,3,8,4,7,1,6,5};
        sorter.Bubblesort(array);
        System.out.println(Arrays.toString(array));
    }
}
