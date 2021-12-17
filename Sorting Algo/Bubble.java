class Bubble{
    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j+1]<arr[j]){
                    arr = swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static int[] swap(int[] arr, int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]=temp;
        return arr;
    } 

    public static void main(String[] args){
        int[] arr = {7, 2, 5, 3, 8, 1, 6};
        arr = bubbleSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}