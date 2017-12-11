import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Compiled {
////////////////////////////////////////////////////////////////Angel
	public static void Apartment() {

		Scanner kbd = new Scanner(System.in);

        int a = kbd.nextInt(), b = kbd.nextInt();
        if (b == 0) {
        System.out.println(0 + " " + 0);
        return;
        }
        int min = Math.min(a - b, 1), max;
        if ((a - b)/b >= 2) max =  b*2;
        else max = a-b;
        	System.out.println(min + " " + max);
    }

	public static void SaveTheProblem() {

		Scanner kbd = new Scanner (System.in);

		int a = kbd.nextInt();
		if (a == 1){
			System.out.println("1 1");
			System.out.println("1");
		} else {
			System.out.println((a - 1)*2+ " " +2);
			System.out.println("1 2");

		}
	}

	public static void MaximumSplitting() {

		Scanner kbd = new Scanner(System.in);

		int n = kbd.nextInt();
		for (int i = 0; i < n; i++) {
		int num = kbd.nextInt();
			if (num % 4 == 0) {
				System.out.println(num / 4);
			} else if (num % 4 == 1) {
				if (num < 9) {
					System.out.println(-1);
				} else {
					System.out.println(((num - 9) / 4) + 1);
				}
			} else if (num % 4 == 2) {
				if (num < 6) {
					System.out.println(-1);
				} else {
					System.out.println(((num - 6) / 4) + 1);
				}
			} else if (num % 4 == 3) {
				if (num < 15) {
					System.out.println(-1);
				} else {
					System.out.println(((num - 15) / 4) + 2);
				}
			}
		}
	}

////////////////////////////////////////////////Vinalyn
 static final boolean   ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    private static Scanner inn;
    int                    INF       = -1000 * 1000 * 1000 - 100;
    Random                 rnd       = new Random();
    String                 delimiter = " ";
    BufferedReader         in;
    PrintWriter            out;
    StringTokenizer        tok;

    public static void ChthollyRequest() {
        inn = new Scanner(System.in);

        long k = inn.nextLong();
        long p = inn.nextLong();
        long i = 1;
        long s = 0;

        while (i <= k)
            {
            long m = (i * sq(10, len(i))) + rev(i);

            s += m;
            i++;

            // System.out.println(m);
            }

        System.out.println(s % p);
    }
    		//862A
    public static void MahmoudAndEhabAndTheMEX() {
        int     n, x,
                mex      = -1, req;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();
        x = keyboard.nextInt();

        boolean[] array = new boolean[101];

        Arrays.fill(array, false);
        req = getMex(n, x, mex, keyboard, array);
        System.out.println(req);
    }

    public static void NumberOnBoard() {}

    long binPow(long a, long b) {
        if (b == 0)
            {
            return 1;
            }

        if (b % 2 == 1)
            {
            return a * binPow(a, b - 1);
            }
        else
            {
            long c = binPow(a, b / 2);

            return c * c;
            }
    }

    long checkBit(long mask, int bit) {
        return (mask >> bit) & 1;
    }

    int countPow(int m, int n) {
        int ans = 0;

        while ((m % n == 0) && (m > 0))
            {
            ans++;
            m /= n;
            }

        return ans;
    }

    int gcd(int a, int b) {
        return (b == 0)
               ? a
               : gcd(b, a % b);
    }

    static long len(long a) {
        long t = 0;

        while (a != 0)
            {
            a = a / 10;
            t++;
            }

        return t;
    }

    void numberOnTheBoard() throws FileNotFoundException {
        if (ONLINE_JUDGE)
            {
            in  = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            }
        else
            {
            in  = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
            }

        tok = new StringTokenizer("");
    }

    long pow(long x, long k) {
        long ans = 1;

        for (int i = 0; i < k; ++i)
            {
            ans *= x;
            }

        return ans;
    }

    int[] rA(int b) {
        int a[] = new int[b];

        for (int i = 0; i < b; i++)
            {
            try {
                a[i] = rI();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }

        return a;
    }

    double rD() throws IOException {
        return Double.parseDouble(rS());
    }

    int rI() throws IOException {
        return Integer.parseInt(rS());
    }

    long rL() throws IOException {
        return Long.parseLong(rS());
    }

    String rS() throws IOException {
        while (!tok.hasMoreTokens())
            {
            String nextLine = readLine();

            if (null == nextLine)
                {
                return null;
                }

            tok = new StringTokenizer(nextLine);
            }

        return tok.nextToken(delimiter);
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    int[] readSortedIntArray(int size) throws IOException {
        Integer[] array = new Integer[size];

        for (int index = 0; index < size; ++index)
            {
            array[index] = rI();
            }

        Arrays.sort(array);

        int[] sortedArray = new int[size];

        for (int index = 0; index < size; ++index)
            {
            sortedArray[index] = array[index];
            }

        return sortedArray;
    }

    static long rev(long a) {
        long   n  = len(a);
        long[] ax = new long[100];
        long   m  = n;;

        for (int i = 0; i < n; i++)
            {
            ax[i] = a / sq(10, m - 1);
            a     = a % sq(10, m - 1);
            m--;
            }

        long s = 0;

        // for(dint i=0;i<n;i++)
        // {
        // System.out.print(ax[i]);
        // }
        // System.out.println();
        for (int i = (int) (n - 1); i >= 0; i--)
            {
            s = s + ax[i] * sq(10, (i));
            }

        return s;
    }

    char[] reverseCharArray(char[] arr) {
        char[] ans = new char[arr.length];

        for (int i = 0; i < arr.length; ++i)
            {
            ans[i] = arr[arr.length - i - 1];
            }

        return ans;
    }

    void run() throws IOException {
        out.close();
    }

    void solveD() throws IOException {
        int    k   = rI();
        char[] s   = rS().toCharArray();
        int    n   = s.length;
        int[]  arr = new int[n];
        int    sum = 0;

        for (int i = 0; i < n; ++i)
            {
            sum    += s[i] - '0';
            arr[i] = s[i] - '0';
            }

        Arrays.sort(arr);

        int i = 0;

        while (sum < k)
            {
            sum += 9 - arr[i];
            i++;
            }

        out.println(i);
    }

    int[] sortedIntArray(int size, int[] array) throws IOException {
        for (int index = 0; index < size; ++index)
            {
            array[index] = rI();
            }

        Arrays.sort(array);

        int[] sortedArray = new int[size];

        for (int index = 0; index < size; ++index)
            {
            sortedArray[index] = array[index];
            }

        return sortedArray;
    }

    static long sq(long a, long n) {
        long s = 1;

        for (long i = 0; i < n; i++)
            {
            s = s * a;
            }

        return s;
    }

    int sqrt(double m) {
        int l = 0;
        int r = 1000000000 + 9;

        while (r - l > 1)
            {
            int mid = (r + l) / 2;

            if (mid * mid > m)
                {
                r = mid;
                }
            else
                {
                l = mid;
                }
            }

        return l;
    }

    boolean isLower(char a) {
        return ((int) a) >= 97
               ? true
               : false;
    }

    private static int getMex(int n, int x, int mex, Scanner keyboard, boolean[] array) {
        int num;
        int req;

        for (int i = 0; i < n; i++)
            {
            num        = keyboard.nextInt();
            array[num] = true;
            }

        int len = array.length;

        for (int i = 0; i < len; i++)
            {
            if (array[i] == false)
                {
                mex = i;

                break;
                }
            }

        if (mex == x)
            {
            req = 0;
            }
        else if (mex > x)
            {
            req = 1;
            }
        else
            {
            int count = 0;

            for (int i = mex; i < x; i++)
                {
                if (array[i] == false)
                    {
                    count++;
                    }
                }

            if (array[x] == true)
                {
                count++;
                }

            req = count;
            }

        return req;
    }

/////////////////////////////////////////////////////////Gavin
public boolean isValid(String braces) {
		// Add code here
		if (braces.length() % 2 != 0) {
			return false;
		}

		char[] bracesArray = braces.toCharArray();
		List<Character> bracesList = new ArrayList<>();

		for (char c : bracesArray) {
			bracesList.add(c);
		}

		for (int i = 0; i < bracesList.size() - 1;) {
			if (bracesList.get(i) == '(' && bracesList.get(i + 1) == ')') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			} else if (bracesList.get(i) == '['
					&& bracesList.get(i + 1) == ']') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			} else if (bracesList.get(i) == '{'
					&& bracesList.get(i + 1) == '}') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			}

			i++;
		}

		return (bracesList.isEmpty())
				? true
				: false;
	}

	public static int longestSlideDown(int[][] pyramid) {
		// Code Goes Here..
		int[] interim = null;

		for (int i = pyramid.length - 2; i >= 0; i--) {

			interim = new int[pyramid[i].length];

			for (int j = 0; j < pyramid[i].length; j++) {
				interim[j] += (pyramid[i + 1][j] > pyramid[i + 1][j + 1])
						? (pyramid[i][j] + pyramid[i + 1][j])
						: (pyramid[i][j] + pyramid[i + 1][j + 1]);
			}

			System.arraycopy(interim, 0, pyramid[i], 0, interim.length);
		}

		return interim[0];
	}

    public int loopSize(Node node) {
        HashSet<Node> nodes = new HashSet<>();
        LinkedList<Node> list = new LinkedList<>();

        while (node != null) {
            if (nodes.contains(node)) break;

            nodes.add(node);
            list.offer(node);
            node = node.getNext();
        }

        int tail = 0;
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) == node) {
                tail = i;
                break;
            }
        }

        return nodes.size() - tail;
    }

    private class Node {
        public Node getNext() {
            return null;
        }
   }

////////////////////////////////////////////////////////////////////Graeham
   public void DidYouMean() {

			Scanner in = new Scanner(System.in);

        	String s = in.next();
        	int n = s.length();
        	int count = 0;
        	boolean isEqual = true;

        	for (int i = 0; i < n; i++) {
            	if ((s.charAt(i) == 'a') || (s.charAt(i) == 'o') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'u')) {
                System.out.print(s.charAt(i));
                count = 0;
                isEqual = true;
            	} else {
            		if (count == 0) {
                    System.out.print(s.charAt(i));
                    count++;
            		} else if (count == 1) {
                    	System.out.print(s.charAt(i));
                    	isEqual = isEqual && ((s.charAt(i) == s.charAt(i - 1)));
                    	count++;
            		} else if (count > 1) {
            			if (isEqual && (s.charAt(i) == s.charAt(i - 1))) {
                        System.out.print(s.charAt(i));
                        count++;
                		} else {
                			System.out.print(" " + s.charAt(i));
                    		count=1;
                    		isEqual = true;
                		}
            		}
        		}
    		}
		}
		public void LazySecurityGuard(){

        	Scanner input = new Scanner(System.in);

        	double n = input.nextFloat();
        	double x = Math.ceil(Math.sqrt(n));

        	x += x * (x - 1) < n ? x : x - 1;
        	System.out.println((int) x * 2);
    	}
    	public void Fraction() {
    		
        	Scanner in = new Scanner(System.in);
        	int n = in.nextInt();
        	int x = (n % 2 == 1) ? n / 2 : (n / 2 % 2 == 1) ? n / 2 - 2 : n / 2 - 1;
        	System.out.println(x + " " + (n - x));
    	}

//////////////////////////////////////////////////////////////////Lester
    	public void Chores() {

			Scanner s = new Scanner(System.in);

			int n = s.nextInt(), k = s.nextInt(), x = s.nextInt();
			int r = x * k;
			for (int i = 0; i < n - k; i++) {
				r += s.nextInt();
    		}

    		System.out.println(r);

  		}
public void NikitaString() {

			Scanner sc = new Scanner(System.in);

			while(sc.hasNext())
			{
			String in = sc.nextLine();
			int part1 = 0;
			int part2 = 0;
			int part3 = 0;
			for(int i = 0;i < in.length();i ++){
				if(in.charAt(i) == 'a'){
					part1 ++;part3 ++;
				}
				if(in.charAt(i) == 'b'){
					part2 ++;
				}
				part2 = Math.max(part1,part2);
				part3 = Math.max(part3,part2);
				//System.out.print(part1 + " ");
				//System.out.print(part2 + " ");
				//System.out.println(part3);
			}

			System.out.println(part3);

			}
		}
				public void TripForMeal() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int dist = 0;
		num--;

		if (num-- > 0) dist += Math.min(a, b);
		if (dist > 0) dist += num * Math.min(Math.min(a, b), c);

		System.out.println(dist);

		}

/////////////////////////////////////////////////////////Mikka
public void ClassroomWatch() {

			Scanner kbd = new Scanner(System.in);
			int n = kbd.nextInt();
			int k = 0;
			int[] array = new int[90];
			int k1 = k;
			for(int i = 1; i <= 81; i++) {

				int x = n - i;
				int sum = 0;

				while(x > 0) {

					sum += x % 10;
					x /= 10;
				}

				if(sum == i) {

					array[k1++] = n - i;
				}
			}

			k = k1;

			System.out.println(k);

			for(int i = k - 1; i >= 0; i--) {

				System.out.println(array[i]);
			}
		}
	      int gcde(int a, int b) {
	          if (b == 0) {
	               return a;
	          } else {
	               return gcde(b, a % b);
	          }
	     }

	     public  void Fraction1() {

	          Scanner s = new Scanner(System.in);
	          int     n = s.nextInt();

	          for (int i = n / 2; i > 0; i--) {
	               if (gcde(i, n - i) == 1) {
	                    System.out.println(i + " " + (n - i));

	                    break;
	               }
	          }
	     }
public void TableTennis() {

			Scanner scan = new Scanner(System.in);
			int numOfPeople = scan.nextInt();
			long j = scan.nextInt();
			int numOfWins = scan.nextInt();
			long k = 0;

			for(int i = 1; i < numOfPeople; i++) {
				int c = scan.nextInt();
				if (c > numOfWins) {
					k = 1;
					numOfWins = c;
				}else {
					k++;
				}
				if (k >= j) {
					break;
				}
			}
			System.out.print(numOfWins);
		}
///////////////////////////////////////////////////////////////////////////////Aaron
		private InputStream is;
		private PrintWriter out1;
		int MOD = (int)(1e9+7);
		ArrayList<Integer>[] amp;
		public void searchforPrettyInteger() {
			new Thread(null, new Runnable() {
			public void run() {
				try {
	 } catch (Exception e)
				{
					System.out.println(e);
				}
			}
		}, "1", 1 << 26).start();
			new Compiled().soln();
		}
		char ch[][];
		ArrayList<Integer>[] g;
        ArrayList<Integer> ar[];
		long ok[];
		char a[][];
		int phi[]=new int[500005];
		void solve()
        {
		int n=ni();
		int m=ni();
		int min1=10;
		int min2=10;
		int a[]=na(n);
		int b[]=na(m);
		int ans=100;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int x=a[i]+(10*b[j]);
				int y=(a[i]*10)+b[j];
				if(ans>x)
					ans=x;
				if(ans>y)
					ans=y;
				if(a[i]==b[j])
					if(ans>a[i])
						ans=a[i];
			}
		}
		out.println(ans);

        }



		public int find(int v,int start,int end,int l,int r){
    	    if(r < start || end < l)
    	    {
    	    	return 0;
    	    }
    	    if(l <= start && end <= r)
    	    {
    	        return (tre[v]);
    	    }
    	    int mid = (start + end) / 2;
    	    int p1 = find(2*v, start, mid, l, r);
    	    int p2 = find(2*v+1, mid+1, end, l, r);
    	    return p1+p2;
    	}
		int tre[]=new int[4000005];
		public void Update(int v,int tl,int tr,int index,int val){
    		if(tl==tr)
    		{
    			tre[v]=val;
    		}
    		else
    		{
    			int mid=(tl+tr)/2;
    			if(tl <= index &&index <= mid)
    	        {
    	            Update(2*v,tl, mid, index, val);
    	        }
    	        else
    	        {
    	        	Update(2*v+1,mid+1,tr, index, val);
    	        }
    			tre[v]=((tre[2*v]+tre[2*v+1]));
    		}
    	}

		public int find1(int v,int start,int end,int l,int r)
    	{
    	    if(r < start || end < l)
    	    {
    	    	return 0;
    	    }
    	    if(l <= start && end <= r)
    	    {
    	        return (tre1[v]);
    	    }
    	    int mid = (start + end) / 2;
    	    int p1 = find1(2*v, start, mid, l, r);
    	    int p2 = find1(2*v+1, mid+1, end, l, r);
    	    return Math.max(p1, p2);
    	}
		int tre1[]=new int[8000005];
		public void Update1(int v,int tl,int tr,int index,int val)
    	{
    		if(tl==tr)
    		{
    			tre1[v]=val;
    		}
    		else
    		{
    			int mid=(tl+tr)/2;
    			if(tl <= index &&index <= mid)
    	        {
    	            Update1(2*v,tl, mid, index, val);
    	        }
    	        else
    	        {
    	        	Update1(2*v+1,mid+1,tr, index, val);
    	        }
    			tre1[v]=(Math.max(tre1[2*v],tre1[2*v+1]));
    		}
    	}

            boolean isPrime(int x)
            {
            if(x==0||x==1)
            	return false;
			for(int i = 2;i*1L*i<=x;i++) if(x%i==0) return false;
			return true;
		}
	    int  p ;
	    long modInverse(long a, long mOD2){
	        return  power(a, mOD2-2, mOD2);
		}
		long power(long x, long y, long m)
		{
		if (y == 0)
	    return 1;
		long p = power(x, y/2, m) % m;
		p = (p * p) % m;

		return (y%2 == 0)? p : (x * p) % m;
		}
		public long gcd(long a, long b){
			if(b==0) return a;
			return gcd(b,a%b);
		}
		class Pair1 implements Comparable<Pair1>{
			long a;
			long b;
			long c;
			Pair1(long x,long y,long z){
			this.a=x;
			this.b=y;
			this.c=z;
			}
			public int hashCode() {
				return Objects.hash();
			}

			public int compareTo(Pair1 arg0) {
				return (int)(arg0.c-c);
			}
		}
		long power(long x, long y, int mod){
			long ans = 1;
			while(y>0){
				if(y%2==0){
					x = (x*x)%mod;
					y/=2;
				}
				else{
					ans = (x*ans)%mod;
					y--;
				}
			}
			return ans;
		}
		void soln() {
			is = System.in;
			out = new PrintWriter(System.out);
			long s = System.currentTimeMillis();
			solve();
            out.flush();
		}
 		private byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;
		private int readByte() {
			if (lenbuf == -1)
				throw new InputMismatchException();
			if (ptrbuf >= lenbuf) {
				ptrbuf = 0;
				try {
					lenbuf = is.read(inbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return -1;
			}
			return inbuf[ptrbuf++];
		}
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
		private int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b));
			return b;
		}
		private double nd() {
			return Double.parseDouble(ns());
		}
		private char nc() {
			return (char) skip();
		}
		private String ns() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		private char[] ns(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}
		private int[][] nm(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++){
				for(int j=0;j<m;j++)
					map[i][j]=ni();
			}
			return map;
		}
		private int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = ni();
			return a;
		}
		private int ni() {
			int num = 0, b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}
		private long nl() {
			long num = 0;
			int b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}	b = readByte();
			}
		}
		private boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		private void tr(Object... o) {
			if (!oj)
				System.out.println(Arrays.deepToString(o));
		}

public void LostinTransliteration(){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=Integer.valueOf(s);
        int co=n;
        String[] str=new String[n];
        for (int i = 0; i <n ; i++) {
            str[i]=in.nextLine();
        }
        int indexi=0,indexj=0;
        for (int i = 0; i <n ; i++) {
            if(str[i]==null){
                continue;
            }
            for (int j = i+1; j <n ; j++) {
                if(str[j]==null){
                    continue;
                }
                    indexi=0;
                    indexj=0;
                boolean demarkhoz=true;
                    while (true){
                        boolean markhoz=true;
                        if(indexi>=str[i].length()&&indexj>=str[j].length()){
                            break;
                        }
                        else if(indexi>=str[i].length()&&!(indexj>=str[j].length())){
                            demarkhoz=false;
                            break;
                        }
                        if(str[i].charAt(indexi)==str[j].charAt(indexj)){
                            indexi++;
                            indexj++;
                            continue;
                        }
                        else if(str[i].charAt(indexi)=='u'&&str[j].charAt(indexj)=='o'){
                            int coi=2;
                            int coj=1;
                            indexj++;
                            indexi++;
                            while (true){
                                if(indexj>=str[j].length()){
                                    break;
                                }
                                if(str[j].charAt(indexj)=='u'){
                                    coj+=2;
                                    indexj++;
                                }else if(str[j].charAt(indexj)=='o'){
                                    coj++;
                                    indexj++;
                                }else{
                                    break;
                                }
                            }
                            while (true){
                                if(indexi>=str[i].length()){
                                 //   markhoz=false;
                                    break;
                                }
                                if(str[i].charAt(indexi)=='u'){
                                    coi+=2;
                                    indexi++;
                                }else if(str[i].charAt(indexi)=='o'){
                                    coi++;
                                    indexi++;
                                }else{
                                    break;
                                }
                            }
                            if(coi==coj){
                                continue;
                            }else{
                                demarkhoz=false;
                                break;
                            }
                        }
                        else if(str[j].charAt(indexj)=='u'&&str[i].charAt(indexi)=='o'){
                            int coj=2;
                            int coi=1;
                            indexj++;
                            indexi++;
                            while (true){
                                if(indexj>=str[j].length()){

                                    break;
                                }
                                if(str[j].charAt(indexj)=='u'){
                                    coj+=2;
                                    indexj++;
                                }else if(str[j].charAt(indexj)=='o'){
                                    coj++;
                                    indexj++;
                                }else{
                                    break;
                                }
                            }
                            while (true){
                                if(indexi>=str[i].length()){
                                    //   markhoz=false;
                                    break;
                                }
                                if(str[i].charAt(indexi)=='u'){
                                    coi+=2;
                                    indexi++;
                                }else if(str[i].charAt(indexi)=='o'){
                                    coi++;
                                    indexi++;
                                }else{
                                    break;
                                }
                            }
                            if(coi==coj){
                                continue;
                            }else{
                                demarkhoz=false;
                                break;
                            }

                        }
                        else if(str[i].charAt(indexi)=='h'&&str[j].charAt(indexj)=='k'){
                            indexi++;
                            indexj++;
                            while (true){
                                if(indexj>=str[j].length()){
                                    markhoz=false;
                                    break;
                                }
                                if(str[j].charAt(indexj)=='k'){
                                    indexj++;
                                    continue;
                                }else if(str[j].charAt(indexj)=='h'){
                                    indexj++;
                                    break;
                                }else{
                                    markhoz=false;
                                    break;
                                }
                            }
                            if(markhoz){
                                continue;
                            }else{
                                demarkhoz=false;
                                break;
                            }
                        }
                        else if(str[j].charAt(indexj)=='h'&&str[i].charAt(indexi)=='k'){
                            indexi++;
                            indexj++;
                            while (true){
                                if(indexi>=str[i].length()){
                                    markhoz=false;
                                    break;
                                }
                                if(str[i].charAt(indexi)=='k'){
                                    indexi++;
                                    continue;
                                }else if(str[i].charAt(indexi)=='h'){
                                    indexi++;
                                    break;
                                }else{
                                    markhoz=false;
                                    break;
                                }
                            }
                            if(markhoz){
                                continue;
                            }else{
                                demarkhoz=false;
                                break;
                            }
                        }
                        else{
                            demarkhoz=false;
                            break;
                        }
                    }
                    if(demarkhoz){
                        str[j]=null;
                        co--;
                    }
            }
        }
        System.out.println(co);
    }
 
public String sortGiftCode(String code){
      List<String> list = new ArrayList();

      for(int i = 0; i < code.length(); i++){
        list.add(code.charAt(i)+"");
      }

      Collections.sort(list, ALPHABETICAL_ORDER);

      String otp = "";

      for(int i = 0; i < list.size(); i++){
        otp += list.get(i);
      }

      return otp;
  }
    private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
        public int compare(String str1, String str2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
            if (res == 0) {
                res = str1.compareTo(str2);
            }
            return res;
        }
    };

///////////////////////////////////////////////////////////////////Sunshine
	public void tripForMeal876A (){
		Scanner ab   = new Scanner(System.in);
        int     num  = ab.nextInt();
        int     a    = ab.nextInt();
        int     b    = ab.nextInt();
        int     c    = ab.nextInt();
        
        int     dist = 0;

        num--;

        if (num-- > 0) {
        	dist += Math.min(a, b);
        }

        if (dist > 0) {
        	dist += num * Math.min(Math.min(a, b), c);
        }

        System.out.println(dist);
	}
		public static void FairGame () {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        fairGame solver = new fairGame();
        solver.solve(1, in, out);
        out.close();
	}
	
    static class fairGame {
        public void solve(int testNumber, InputReader scan, OutputWriter out) {
            int array[] = new int[105];
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                } else {
                    map.put(a, 1);
                }
                array[a]++;
            }
            if (map.size() != 2) {
                out.println("NO");
                return;
            } else {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    list.add(entry.getKey());
                }
                if (map.get(list.get(0)) != map.get(list.get(1))) {
                    out.println("NO");
                } else {
                    out.println("YES");
                    out.println(list.get(0), list.get(1));
                }
            }
        }

    }
	
    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
    
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }
    }
        static int n, start[], end[], a1[];
    static List<Integer> list[] ;
    static ArrayList<Integer> order = new ArrayList<>();
    
    public void DanilPartTimeJob () {
	    
	    
	    
	    //******************
	    
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        n = in.nextInt();
        start = new int[n+1];
        end = new int[n+1];
        a1 = new int[n+1];
        list = new List[n+1];
        
        for(int i = 0; i <= n; i++){
            list[i] = new ArrayList<>();
        }


        for(int i = 2; i <= n; i++){
            int u = in.nextInt(), v = i;
            list[u].add(v);
            list[v].add(u);
        }

        for(int i = 1; i <= n; i++){
            a1[i] = in.nextInt();
        }
        
        dfs(0, 1);
        
        SegTree seg = new SegTree(time);
        seg.build();

        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            String s = in.next();
            int x = in.nextInt();
            if(s.charAt(0) == 'p') seg.update(x);
            else pw.println(seg.query(x));
        }
        
        pw.close();
    }
    
    static class SegTree{
        int size = (int)2e6;
        int n, seg[] = new int[size], lazy[] = new int[size], tot[] = new int[size];
        SegTree(int N){
            n = N;
        }

        void build(){
            build(1, 1, n);
        }

        void build(int p, int s, int e){
            if(s == e){
                seg[p] = a1[order.get(s-1)];
                tot[p] = 1;
                return;
            }
            if(s > e) return;
            int m = (s+e)/2, l = 2*p, r = l+1;
            build(l, s, m);
            build(r, m+1, e);
            seg[p] = seg[l] + seg[r];
            tot[p] = tot[l] + tot[r];
        }

        void push_down(int p, int l, int r){
            if(lazy[p] == 0) return;
            lazy[p] = 0;
            lazy[l] ^= 1;
            lazy[r] ^= 1;
            seg[l] = tot[l] - seg[l];
            seg[r] = tot[r] - seg[r];
        }

        void update(int p){
            update(1, 1, n, start[p], end[p]);
        }

        void update(int p, int s, int e, int a1, int b){
            if(s >= a1 && e <= b){
                lazy[p] ^= 1;
                seg[p] = tot[p] - seg[p];
                return;
            }
            if(s > e || s > b || e < a1) return;
            int m = (s+e)/2, l = 2*p, r = l+1;
            push_down(p, l, r);
            update(l, s, m, a1, b);
            update(r, m+1, e, a1, b);
            seg[p] = seg[l] + seg[r];
        }

        int query(int p){
            return query(1, 1, n, start[p], end[p]);
        }

        int query(int p, int s, int e, int a1, int b){
            if(s >= a1 && e <= b){
                return seg[p];
            }
            if(s > e || s > b || e < a1) return 0;
            int m = (s+e)/2, l = 2*p, r = l+1;
            push_down(p, l, r);
            return query(l, s, m, a1, b) + query(r, m+1, e,  a1, b);
        }

    }
    
    static int time = 0;
    static void dfs(int p, int u){
        start[u] = ++time;
        order.add(u);
        for(int v : list[u]){
            if(v != p) dfs(u, v);
        }
        end[u] = time;
    }
    
    static void debug(Object...obj) {
    	System.err.println(Arrays.deepToString(obj));
    }
    
    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;
        static final int ints[] = new int[128];
        
        public FastReader(InputStream is){
            for(int i='0';i<='9';i++) ints[i]=i-'0';
            this.is = is;
        }
        
        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
                if(lenbuf <= 0)return -1;
            }
            return inbuf[ptrbuf++];
        }
        
        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        
        public int skip() {
            int b;
            while((b = readByte()) != -1 && isSpaceChar(b));
            return b;
        }
        
        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        
        public int nextInt(){
            int num = 0, b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        
        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        
        public char[] next(int n){
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while(p < n && !(isSpaceChar(b))){
                buf[p++] = (char)b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }
    }

///////////////////////////////////////////////////////////////////////////////Trisha

		private static int[] array;
		private static boolean[] visited;
		private static ArrayList<Integer> components = new ArrayList<Integer>();

		public void BufferedReader() throws IOException {
			BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(f.readLine());
			array = new int[N];
			visited = new boolean[N];
			StringTokenizer st = new StringTokenizer(f.readLine());
			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(st.nextToken()) - 1;
			}
			for (int i = 0; i < N; i++) {
				if (!visited[i])
					dfs(i);
			}
			Collections.sort(components);
			int size = components.size();
			long result = 0L;
			if (size != 1) {
				int[] results = new int[size - 1];
				for (int i = 0; i < size - 2; i++) {
					results[i] = components.get(i);
				}
				results[size - 2] = components.get(size - 2) + components.get(size - 1);
				for (int i : results) {
					result += (long) i * (long) i;
				}
			} else {
				result = (long) components.get(0) * (long) components.get(0);
			}
			System.out.println(result);
		}

		public static void dfs(int start) {
			int index = start;
			int count = 0;
			while (true) {
				count++;
				visited[index] = true;
				int next = array[index];
				if (next == start)
					break;
				index = next;
			}
			components.add(count);
		}

		public static void printArray(int[] array) {
			for (int i : array)
				System.out.print(i + " ");
			System.out.println();
		}

		public static void printArrayListInteger(ArrayList<Integer> array) {
			for (int i : array)
				System.out.print(i + " ");
			System.out.println();
		}
	    public void KRounding() {
	    		Scanner s = new Scanner(System.in);
	    		long a, b;
	    		a = s.nextLong();
	    		b = s.nextLong();
	    		for(long i=0; i<b; i++){
	    				if(a%2==0){
	    					a/=2;
	    				}
	    				if (a%5==0){
	    					a/=5;
	    				}
	    		}
	    		System.out.print((int)a);
	    		for(long i=0; i<b; i++){
	    				System.out.print("0");
	    	}
	    }
	    public  void Eternal() {

	       long x;
	       long y;
	       long result = 1;
	       Scanner sc = new Scanner(System.in);
	       x = sc.nextLong();
	       y = sc.nextLong();
	       long count = y-x;

	       if (x == 0){
			   x = 1;
	       }

	       for (int i=0; i<count; i++){
	       	   if (result == 0){
	       	   		break;
	       	   }
	       	   result *= (y%10);
	       	   result %= 10;
	       	   y--;
	       }

	       System.out.println(result%10);
	       sc.close();
	    }