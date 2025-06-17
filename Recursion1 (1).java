public class Recursion1
{
    public void fun(int n){
        if (n==10)return;
        System.out.println(n);
        fun(n+1);
    }
	public static void main(String[] args) {
	    Main m=new Main();
	     m.fun(1);
	}
}