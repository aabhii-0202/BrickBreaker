import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rnd = new Random();
        for(int i=0;i<10;i++){
            array[i] = rnd.nextInt(100);
        }
        for(int i=0;i<10;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        mergeSort(0,9,array);
        for (int item: array) {
            System.out.print(item+" ");
        }

    }

    public static void mergeSort(int start, int end, int[] arr){

        if(start<end){
            int mid = (start+end)/2;
            mergeSort(start,mid,arr);
            mergeSort(mid+1,end,arr);
            merge(start,mid,end,arr);
        }
    }

    private static void merge(int start, int mid, int end, int[] arr) {
        int[] temp = new int[end-start+1];
        int ind =0;
        int p1 = start;
        int p2 = mid+1;
        while(p1<=mid&&p2<=end){
            if(arr[p1]>arr[p2]) temp[ind++] = arr[p2++];
            else temp[ind++] = arr[p1++];
        }
        while (p1<=mid){
            temp[ind++] = arr[p1++];
        }
        while (p2<=end){
            temp[ind++] = arr[p2++];
        }
        int k=0;
        for(int i=start;i<=end;i++){
            arr[i]=temp[k++];
        }

    }

}
