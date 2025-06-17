public class Sumofarrays
{
    public int fun(int [] a,int i,int s)
    {
        if (i == a.length)
        {
            return s;
        }
        s=s+a[i];
        return fun(a,i+1,s);
    }
	public static void main(String[] args) {
	    Main m = new Main();
	    int a[] = {1,2,3,4,5};
	    int sum= 0;
	    int i= 0;
	   System.out.println(m.fun(a,i,sum));
	}
}