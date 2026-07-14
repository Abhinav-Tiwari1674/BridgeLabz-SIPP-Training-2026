package MergeSort;
class patient {

    public static void main(String[] args){

        int[] id={105,101,108,102,104};

        mergeSort(id,0,id.length-1);


        for(int x:id)
            System.out.print(x+" ");
    }


    static void mergeSort(int a[],int l,int r){

        if(l<r){

            int m=(l+r)/2;

            mergeSort(a,l,m);
            mergeSort(a,m+1,r);

            merge(a,l,m,r);
        }
    }


    static void merge(int a[],int l,int m,int r){

        int temp[]=new int[r-l+1];

        int i=l,j=m+1,k=0;


        while(i<=m && j<=r){

            if(a[i]<a[j])
                temp[k++]=a[i++];
            else
                temp[k++]=a[j++];
        }


        while(i<=m)
            temp[k++]=a[i++];


        while(j<=r)
            temp[k++]=a[j++];


        for(i=l;i<=r;i++)
            a[i]=temp[i-l];
    }
}