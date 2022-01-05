public class Merge {
    public static void mergeSort(int[] arr, int[] temp, int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(arr, temp, l, mid-1);
            mergeSort(arr, temp, mid, h);
            merge(arr, temp, l, h);
        }
    }

    private static void merge(int[] arr, int[] temp, int l, int h) {
        int lEnd = (l+h)/2;
        int hStart = lEnd+1;
        int left = l;
        int right = hStart;
        int index = l;
        while(left<=lEnd && right<=h){
            if(arr[left]>=arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, temp, index, lEnd-left+1);
        System.arraycopy(arr, right, temp, index, h-right+1);
        System.arraycopy(temp, l, arr, l, h-l+1);
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 15, 8}; 
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
        for(int i: arr){
            System.out.println(i); 
        }
    }
}
