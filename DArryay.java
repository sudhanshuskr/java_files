import java.util.Arrays;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class DArryay {
 
    
    private int[] T ;
    private int length = 0;
    private int capacity = 0;


    public DArryay(int capacity){
        this.capacity = capacity;
        int[] newT = new int[capacity];
        this.T = newT;
    }

    public void add(int value){
        if (length < capacity) {
            this.T[length++] = value;
        
        }
        else {
            int[] newT = new int[++capacity];
            for (int i = 0;i<length;i++){
                newT[i] = this.T[i];
            }
            newT[length++] = value;
            this.T = newT;


        }

    }
    public int getLength(){
        return this.length;
    }
    public int getCapacity(){
        return this.capacity;

    }
    public int[] array(){
        return this.T;

    }
    public void printArr(){
        System.out.println(Arrays.toString(this.T));
    }
}
