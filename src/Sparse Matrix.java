import java.util.Scanner;

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
        int z=0,nz=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(Matrix[i][j]==0){
                    z++;
                }
                else{
                    nz++;
                }
            }
        }
        System.out.println("no. of non-zero elements in the Matrix="+nz);
        System.out.println("no. of zero elements in the Matrix="+z);

        if(nz>=z){
            System.out.println("not a sparse matrix...");
            return;
        }
        else{
            int Sparse_Matrix[][]=new int[nz][3];
            int k=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(Matrix[i][j] !=0 ){
                        Sparse_Matrix[k][0]=i;
                        Sparse_Matrix[k][1]=j;
                        Sparse_Matrix[k][2]=Matrix[i][j];
                        k++;
                    }
                }
            }

            System.out.println("The sparse Matrix is:-");
            for(int i=0;i<nz;i++){
                for(int j=0;j<3;j++){
                    System.out.print(Sparse_Matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
