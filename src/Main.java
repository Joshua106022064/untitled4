import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a;
        char x;
        a=in.next();
        x=in.next().charAt(0);
        System.out.println(a.replace(x,'\n'));
    }
}