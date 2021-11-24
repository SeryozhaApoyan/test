import java.util.Random;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        int num = 798;
        int x = 0;
        int y = 0;
        int z = 0;
        int n = 0;
               /* z = num % 10;
                x = num / 100;
                y = num % 100;
                num = y / 10;
                y = num;
                System.out.println(z+""+ y +""+x); sa konkret 798-i hamar karch u angraget tarberak)))*/
        for (int i = 0; num > 0; i++){
            n = num % 10;
            num = num / 10;
            System.out.print(n);
        }

    }


}
