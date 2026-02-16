import java.util.*;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("marks of phy " + marks[0]);
        System.out.println("marks of chem " + marks[1]);
        System.out.println("marks of math " + marks[2]);

        // we can update marks
        marks[2] = 77;
        System.out.println("after updation marks of math is :" + marks[2]);
        marks[1] = marks[1] + 13;
        System.out.println("after updation marks of che is :" + marks[2]);

    }
}
