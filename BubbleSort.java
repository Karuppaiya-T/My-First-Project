package Basic;

public class BubbleSort{
	
	public static void main(String args[]) {
		
		int [] ar = {90,60,30,20,22,15,7};
		
		for(int j=1; j<ar.length; j++) {
			
			for(int i=0; i<ar.length-j; i++)
			{
				if(ar[i]>ar[i+1])
				{
					int temp = ar[i];
					ar[i] = ar[i+1];
					ar[i+1] = temp;
				}
			}
			
		}

		System.out.println("Given Array sort by Asscending order: ");
		
		for(int x:ar) {
			System.out.print(x+" ");
		}
	
	}
	
}