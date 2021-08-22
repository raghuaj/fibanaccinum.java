mport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int v1=1;
	int v2=1;
	int result;
		Scanner input=new Scanner(System.in);
		System.out.println("enter a positive integer");
		int n=input.nextInt();
		for(int i=1;i<=n-2;i++){
			result=v1+v2;
			v1=v2;
			v2=result;
			System.out.println("result="+(result==0? 1:result));
		}


    }
    }
