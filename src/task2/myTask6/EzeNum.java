package task2.myTask6;

public class EzeNum {
    private int[] mac;

    public EzeNum(int c) {
        mac = new int[c];
    }
    public void findEzeNum (){
        init();
        int start = 3;
        for (int i = 1; i < mac.length; i++) {
            for (int j = 0; j < i; j++) {
                if (start%mac[j]==0){
                    start++;
                    i--;
                    break;
                }
                if (j==i-1){
                mac[i] = start;
                start++;}
            }

        }
    }

    public void init(){
        for (int i = 0; i < mac.length; i++) {
            mac[i] = 2;
        }
    }
    public void output (){
        for (int a:
             mac) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
