
public class PracSorting {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11, 45, 23, 44, 56, 56};

        //BUBLESORT
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        //SELECTIONSORT
        // for(int i=0;i<arr.length;i++){
        //     int minindex=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[minindex]){
        //             minindex=j;
        //         }
        //     }
        //     int temp=arr[i];
        //     arr[i]=arr[minindex];   
        //     arr[minindex]=temp;
        // }

        //INSERTIONSORT
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
