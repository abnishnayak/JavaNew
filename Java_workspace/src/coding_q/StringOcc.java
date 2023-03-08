package coding_q;

public class StringOcc
{
	 public static void main(String[] args) {
		 
	        String[] arr = {};
	        String[] a   = {};
	        freqString(arr, a);
	 }

    static int search(String[]arr, String s)
    {
            int counter = 0;
            for (int j = 0; j < arr.length; j++)
 
                if (s.equals(arr[j]))
                    counter++;
 
           return counter;
    }
 
    static void freqString(String[] arr, String a[])
    {
        for (int i=0;i<a.length; i++)
            System.out.print(search(arr, a[i]) + " ");
    }
}