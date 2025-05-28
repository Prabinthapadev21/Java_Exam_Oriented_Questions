package Practice;

public class JaggedArraySum {
    public static void main(String[] args) {
        int a[][] ={
                {1,2,3,4},
                {1,2,3},
                {1,2}
        };

//        for finding sum
        for (int  i =0;i<a.length;i++)
        {
            int sum=0;
            System.out.println("Row ="+(i+1) +":");
            for (int j =0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]+ " ");
                sum+=a[i][j];
            }
            System.out.println("Sum = "+sum);
        }
    }
}
