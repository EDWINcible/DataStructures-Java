public class Insertion {
    public static int[] insertSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            } 
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 15, 8}; 
        int[] arr1 = insertSort(arr);
        for(int i: arr1){
            System.out.println(i); 
        }
    }
}
