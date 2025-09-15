import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no. of rows in the Matrix:");
        int row=sc.nextInt();
        System.out.println("enter the no. of columns in the Matrix:");
        int col=sc.nextInt();

        int Matrix[][]=new int[row][col];

        System.out.println("input the elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("the Matrix is:-");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        int top=0 , left=0;
        int bottom=row-1 , right=col-1 ;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(" "+Matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(" "+Matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                System.out.print(" "+Matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(" "+Matrix[i][left]);
                }
                left++;
            }
        }
    }
}
