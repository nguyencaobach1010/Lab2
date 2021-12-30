package lab1.java;

public class SimpleSort {
    int[] a;
    int n;
    SimpleSort(){

    }
    SimpleSort(int []b ){
        int i;
        n = b.length;
        a = new int[n];
        for( i = 0; i < n; i++){
            a[i] = b[i];
        }
    }
    public void display()
    {int i;
        for(i=0;i<n;i++)
            System.out.print("  " + a[i]);
        System.out.println();
    }
    public void swap(int i, int k) {// Hàm hoán vị
     int x;
     x=a[i];
     a[i]=a[k];
     a[k]=x;
    }
    public void bubbleSort(){
            int i;
            boolean doicho;
            do {
                doicho=false;
                for(i=0; i<n-1; i++){
                    if ( a[i]> a[i+1] ) {
                        swap(i,i+1);
                        doicho=true;
                    }
                }
                display();
            }
            while ( doicho);
        }

}
