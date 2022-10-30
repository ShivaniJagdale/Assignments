public class Assignment1_4 {

	public static void main(String[] args) {
		int n=14;
	    for(int i=n;i>=0;i--)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    	 if(i+j<=n/2||j-i+1>=n/2)
	         {	
	    	  System.out.print("*");
	    	 }
	    	
	    	 else 
	    	 {
	    		 System.out.print(" ");
	    	 }
	        }
	    	System.out.println();
	    }
	}

}
