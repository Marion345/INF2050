package src;

import java.io.FileNotFoundException;
import java.io.IOException;

public class lab1 {
    public static void main(String[] args) {
        System.out.println("Hello Word");  

        int x = 5 ;
        int y = 6 ;
        int temp = x;

        System.out.printf("X avent switch : %d \nY avant switch : %d\n" , x, y);
        
        x = y;
        y = temp;

        System.out.printf("X apres switch : %d \nY apres switch : %d\n" , x, y);

        Read.print();

    }


}
