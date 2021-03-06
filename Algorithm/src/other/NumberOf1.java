package other;

public class NumberOf1 {
	public int NumberOf1(int n){
		int count = 0;
		int flag = 1;
		while(flag != 0){
			if((n & flag) != 0){
				count ++;
			}
			flag = flag << 1;
		}
		return count;
	}
	
	public int NumberOf2(int n){
		int count = 0;
		while(n != 0){
			count ++;
			n = (n-1)&n;
		}
		return count;
	}
	
	public static void main(String[] args){
		int n = -15;
		NumberOf1 n1 = new NumberOf1();
		System.out.print(n1.NumberOf2(n));
	}
}
