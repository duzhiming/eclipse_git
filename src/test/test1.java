package test;

public class test1 {

	public static void main(String[] args) {
		System.out.print("1"+" ");
		System.out.print("1"+" ");
		int result = diejia(1,1,20);
		System.out.print(result+" ");
	}

	public static int diejia(int n1,int n2,int n3){
		int num = n1+n2;
		if(num<n3){
			System.out.print(num+" ");
			return diejia(n2,num,n3);
		}else{
			return 0;
		}
		
		
	}
}
