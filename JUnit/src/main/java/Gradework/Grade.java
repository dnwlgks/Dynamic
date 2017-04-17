package Gradework;

public class Grade {

	char c;
	public char score(int i, int j, int k) {
		int sum=0;
		try{
			if(i<0 || i>35 ||j<0 || j>35 ||k<0 || k>30 );
		}catch(Exception e){
			//System.out.println(e.getMessage());
		}
		sum=i+j+k;
		if(sum>=80)
			c='A';
		else if(80>sum&&sum>=70)
			c='B';
		else if(70>sum&&sum>=60)
			c='C';
		else
			c='F';
		return c;
	}

	
}
