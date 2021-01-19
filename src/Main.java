// Java program to find nth ugly number
class Main {

    /*This function divides a by greatest divisible power of b*/
    static final int maxDivide(final int a, final int b)
    {
        if(a%b != 0) return a;
        return maxDivide(a/b, b);
    }

    /* Function to check if a number is ugly or not */
    static final int isUgly(final int no)
    {
        final int a = maxDivide(no, 2);
        final int b = maxDivide(a, 3);
        final int c = maxDivide(b, 5);

        return (c == 1)? 1 : 0;
    }

    /* Function to get the nth ugly number*/
    static final int getNthUglyNo(final int n, final int i, final int count /* ugly number count */)
    {
        /*Check for all integers untill ugly count becomes n*/
        if (n < count) return i-1;
        if (isUgly(i) == 1) return getNthUglyNo(n, i+1, count+1);
        else return getNthUglyNo(n, i+1, count);
    }

	/* Driver program to test above
	functions */
	public static void main(String args[])
	{
		final int input = 10;
		System.out.println("[INPUT] "+ input);
		final int output = getNthUglyNo(input,1,1);
		System.out.println("[OUTPUT] "+ output);
	}
} 
