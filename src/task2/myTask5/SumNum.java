package task2.myTask5;

public class SumNum {
    private int num;

    public SumNum(int num) {
        this.num = num;
    }

    public int sum (){
        int s = 0;
        while (num>0){
            s+= num%10;
            num = num/10;
        }
        return s;
    }

}
