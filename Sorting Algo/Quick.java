public class Quick {
    public static int partition(int[] arr, int l, int h){
        int pivot = arr[(l+h)/2];
        int i = l;
        int j = h;
        while(i<j){
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<j)
                swap(arr, i, j);    
        }
        swap(arr, l, j);
        return j;
    }

    public static int[] quickSort(int[] arr, int l, int h){
        if(l<h){
            int pivot = partition(arr, l, h);
            quickSort(arr, l, (pivot-1));
            quickSort(arr, (pivot+1), h);
        }
        return arr;
    }

    public static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 15, 8, 9}; 
        int[] arr1 = quickSort(arr, 0, (arr.length-1));
        for(int i: arr1){
            System.out.println(i); 
        }
    } 
}
