//printing INEURON using pattern programming logic
public class Assignment1_1 
{

	public static void main(String[] args)
	{
	    
	    int m=100;
	   
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==0 && j<7 ||i==6 && j<7 ||j==3|| j==8||j==14 ||j==9&&i==1||j==10&&i==2 ||j==11&&i==3 ||j==12&&i==4 ||j==13&&i==5 
						||j==16||i==0&&j>16&&j<22 ||i==6&&j>16&&j<22 || i==3&&j>16&&j<22
						||j==24&&i!=6 ||j==30&&i!=6 || i==6&&j>24&&j<30
						||j==32||i==0&&j>32&&j<37 ||i==3&&j>32&&j<37 || j==37&&i==1||j==37&&i==2 || j==37&&i>3&&i<7
						||j==39&&i!=0&&i!=6||i==0&&j>39&&j<44|| j==44&&i!=0&&i!=6 || i==6&&j>39&&j<44
						||j==46||j==52 ||j==47&&i==1||j==48&&i==2 ||j==49&&i==3 ||j==50&&i==4 ||j==51&&i==5)
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