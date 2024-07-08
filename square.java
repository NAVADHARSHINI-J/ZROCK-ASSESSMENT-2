import java.util.Scanner;

public class square {
    static int squ(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int res=squ(s);
        System.out.println(res);
    }
}
