import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.plaf.synth.SynthToggleButtonUI;

/**
 * Quicktest
 */
public class Quicktest {

    public static void main(String[] args) {
        System.out.println("lmao");
    final byte year = 12;
    final byte percent = 100;

    Scanner scan = new Scanner(System.in);

    System.out.print("Principal :");
    float principal = scan.nextFloat();
    
    Timepass tp = new Timepass();
    tp.geta();

    DynamicArray itemy = new DynamicArray();
    itemy.add(4);
    itemy.add(44);


    DArryay op = new DArryay(2);
    System.out.println(Arrays.toString(op.T));
    System.out.println(op.length);
    System.out.println(op.capacity);
    op.add(1);

    System.out.println(Arrays.toString(op.T));
    System.out.println(op.length);
    System.out.println(op.capacity);
    op.add(2);

    System.out.println(Arrays.toString(op.T));
    System.out.println(op.length);
    System.out.println(op.capacity);
    op.add(3);

    System.out.println(Arrays.toString(op.T));
    System.out.println(op.length);
    System.out.println(op.capacity);
    op.add(4);
//    System.out.println(itemy.toString());
    System.out.println(Arrays.toString(op.T));
    System.out.println(op.length);
    System.out.println(op.capacity);


    }
}