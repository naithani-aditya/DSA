import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is empty, We can't find average.");
            return;
        }
        int sum=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The Array is;-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe sum of all numbers of the array is = "+sum);
        double avg=(double) sum/n;  //here we are converting the sum to double so that we can get the decimal value bcoz (int/int=int & double/int=double)
        System.out.println("The average of all elements of the array is = "+avg);
    }
}
