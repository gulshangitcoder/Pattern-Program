import java.util.Scanner;
public class Pattern {
    public static void printB(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==0 && j<(n+1)/2 || i==(n-1)/2 && j<(n+1)/2 || i==(n-1) && j<(n+1)/2 || j==(n+1)/2 && i>0 && i<(n-1)/2 || j==(n+1)/2 && i>(n-1)/2 && i<(n-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number: ");
       int n = sc.nextInt();
      printB(n);
       
        
        
    }
}
    

