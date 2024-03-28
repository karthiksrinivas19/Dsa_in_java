
public class quicksort {
    public void Quicksort(int array[],int low ,int high){
        if(low<high){
            int loc=partition(array,low,high);
            Quicksort(array,low,loc-1);
            Quicksort(array,loc+1,high);

        }
    }
    public int partition(int a[],int low,int high){
        int pivot=a[low];
        int i=low+1,j=high;
        while(i<j){
            while(a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        quicksort sorter1= new quicksort();
        int array[]={1,84,6,3,8,0,100,57,32};
        sorter1.Quicksort(array, 0, 8);
        for(int i=0;i<9;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
