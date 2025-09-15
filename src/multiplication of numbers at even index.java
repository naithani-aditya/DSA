import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is empty, no multiplication or sum possible.");
            return;
        }
        long mul=1;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i%2==0){
                mul=mul*arr[i];
            }
        }
        System.out.println("The Array is;-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        /*
        //we can do using any method:-

        for(int i=0;i<n;i=i+2){
            mul=mul*arr[i];
        }
         */
        
        System.out.println("\nThe multiplication of all numbers at even index of the array is = "+mul);
    }
}
