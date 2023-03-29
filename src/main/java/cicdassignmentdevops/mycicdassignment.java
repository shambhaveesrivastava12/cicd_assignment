package cicdassignmentdevops;

public class mycicdassignment {

	
		public int add(int a, int b)
		{
			return a+b;
		}
		public int sub(int a, int b)
		{
			return a-b;
		}
		public int mul(int a, int b)
		{
			return a*b;
		}
		public int div(int a, int b)
		{
			return a/b;
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	mycicdassignment obj = new mycicdassignment();
	System.out.println(obj.add(12, 6));
	System.out.println(obj.sub(15,9));
	System.out.println(obj.mul(2, 10));
	System.out.println(obj.div(10, 2));
		}

	}

