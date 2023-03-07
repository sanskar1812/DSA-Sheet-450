//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i] < 0)
            {
                l2.add(arr[i]);
            }
            else
            {
                l1.add(arr[i]);
            }
        }
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l3.addAll(l1);
        l3.addAll(l2);
        for(int i=0;i<n;i++)
        {
            arr[i]=l3.get(i);
        }
    }
}