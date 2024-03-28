
public class mergesort {
    public void Mergesort(int start, int end, int[] array){
        if(start < end){
            int mid=(start+end)/2;
            Mergesort(start,mid, array);
            Mergesort(mid+1,end,array);
            merge(start,mid,end,array);
        }
    }
    
    public void merge(int start, int mid, int end, int[] array){
        int n1=mid-start+1;
        int n2=end-mid;

        int l[] = new int[n1];
        int r[] = new int[n2];
        
        for(int i=0; i<n1; i++){
            l[i] = array[start+i];
        }
        for(int j=0; j<n2; j++){
            r[j] = array[mid+1+j];
        }
        
        int i=0,j=0,k=start;
        
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                array[k++]=l[i++];
            } else{
                array[k++]=r[j++];
            }
        }
        
        while(i<n1){
            array[k++]=l[i++];
        }
        
        while(j<n2){
            array[k++]=r[j++];
        }
    }
    
    public static void main(String[] args) {
        mergesort sorter = new mergesort();
        int array[]={5,4,7,8,3,2,1,6};
        sorter.Mergesort(0,array.length-1,array);
        for(int i=0; i<array.length; i++){
            System.err.print(array[i] + " ");
        }
    }
}
