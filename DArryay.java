public class DArryay {
 
    
    public int[] T ;
    public int length = 0;
    public int capacity = 0;


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
}
