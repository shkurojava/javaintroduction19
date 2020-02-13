package SelfStudy;

public class Methods {
	public static void main(String args[]) {
		int i = 0;
		i = count(i);
		int j = 2;
		j = count(j);
		System.out.println(i);
		System.out.println(j);
	}
	
	private static int count(int x) {
		x++;
		return x;
		
	}

}
