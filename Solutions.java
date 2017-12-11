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