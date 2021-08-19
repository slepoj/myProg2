package task2.myTask4;

public class Nod {
    private int a, b;

    public Nod(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int findNod() {
        findMax();
        if (a==0 && b==0){
            return 0;
        }
        if (a==0 || b==0){
            return a;
        }
        int a = this.a;
        int b = this.b;
        int c = 0;
        int nod = this.b;
        while (a%b>0){
            c=a;
            a=b;
            b=c%b;
            nod = b;
        }
        return nod;
    }

    private void findMax() {
        if (b > a) {
            int buf = a;
            a = b;
            b = buf;
        }
    }
}
