import java.util.Scanner;
class PatternT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                if(i==0 || j==(num-1)/2)
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
}