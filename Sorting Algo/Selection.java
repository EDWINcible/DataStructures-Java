public class Selection {
    public static int[] selectSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(arr[i] != min)
                arr=swap(arr, min, i);
        }
        return arr;
    }

    public static int[] swap(int[] arr, int min, int i){
        int temp = arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 15, 8}; 
        int[] arr1 = selectSort(arr);
        for(int i: arr1){
            System.out.println(i); 
        }
    }
}
