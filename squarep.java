import java.util.*;

public class squarep {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        for (int i = 1 ; i<= 4; i++) {
            System.out.print("\n");
            for (int j = 1 ; j<=4; j++) {
                System.out.print("*");
            }
        }

        scan.close();
    }
}