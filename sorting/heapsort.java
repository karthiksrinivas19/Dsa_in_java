import java.util.Arrays;

public class heapsort{
    
    public void build_maxheap(int[] array, int heapsize){
        for(int i = array.length / 2; i >= 0; i--){
            max_heapify(array, i, heapsize);
        }
    }
    
    public void max_heapify(int[] array, int i, int heapsize){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        
        if(left <= heapsize && array[left] > array[i]){
            largest = left;
        }
        if(right <= heapsize && array[right] > array[largest]){
             largest = right;
        }
        if(largest != i){
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
            max_heapify(array, largest, heapsize);
        }
    }
    
    public void Heapsort(int[] array){
        int heapsize = array.length - 1; 
        build_maxheap(array, heapsize);
        for(int i = array.length - 1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapsize--;
            max_heapify(array, 0, heapsize);
        }
    }
    
    public static void main(String[] args) {
        heapsort sorter = new heapsort();
        int array[] = {1, 6, 7, 4, 8, 3, 5, 2};
        sorter.Heapsort(array);
        System.out.println(Arrays.toString(array)); 
    }
}
