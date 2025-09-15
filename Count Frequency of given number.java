import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array is:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter a No. to check its frequency:-");
        int num=sc.nextInt();
        int freq=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                freq++;
            }
        }
        System.out.println("the frequency of "+num+" in the array is = "+ freq);
    }
}
