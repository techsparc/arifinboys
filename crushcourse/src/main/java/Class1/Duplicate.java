package Class1;

public class Duplicate {

public static void main(String[] args) {

		int duplicate[] = { 1, 4, 3, 7, 1, 4 };

		for (int i = 0; i < duplicate.length - 1; i++) {

			for (int j = 1; j < duplicate.length; j++) {

				if ((duplicate[i] == duplicate[j]) && (i != j));{
					
				}
					
			System.out.println("duplicate num:"+duplicate[j]);
		}

			
			
			
			
		int a[] = { 1, 31, 33, 40, 45 };

		int max = a[0];
		for (int i1 = 0; i1 < a.length - 1; i1++) {
			if (a[i1] > max)
				max = a[i1];
			{

			}
			

		}System.out.println("maximum num:"+max);
	}

	
//	String s = "rotator";
//
//	char c[] = s.toCharArray();
//	 
//	for(int i = c.length-1; i>=0; i--) {
//		System.out.println(c[i]);
//	}
}}

