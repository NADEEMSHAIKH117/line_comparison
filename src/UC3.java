
public class UC3 {

	public static void main(String[] args) {
System.out.println("Welcome to Line Comparsion program");
		
		int x1,x2,y1,y2,x3,y3;
		
		       int l1,l2;
		       x1=2; y1=2;
		       x2=4; y2=4;
		       x3=5; y3=1;
		       
		       l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		       l2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		       
		       System.out.println("The length of line l1 is :-"+l1);
		       System.out.println("The length of line l2 is :-"+l2);
		       
		      // if(l1==l2) {
		    	//   System.out.println("l1 is equal to l2");}
		       //else if(l1>l2) {
		    	 //  System.out.println("l1 is grater than l2");  
		       //}
		       //else{
		    	//   System.out.println("l1 is less than l2");
		       //}
		       int c= Double.compare(l1,l2);
		       
		        if (c==0)
		        {
		        	System.out.println("l1 and l2 are Equal");
		        }
		        else if (c==1)
		        {
		        	System.out.println("l1 is grater than l2");
		        }
		        else 
		        {
		        	System.out.println("l1 is less than l2");
		        }

	}

}
