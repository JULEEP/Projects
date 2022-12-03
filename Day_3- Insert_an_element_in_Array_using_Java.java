import java.util.Scanner;
class Ins{
	public static void main(String args[]){

		int size,loc,item,i;
		System.out.print("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();

		int a[] = new int[size+1];
		System.out.println("Enter the no of elements");
		for(i=0;i<size;i++){

			a[i]=sc.nextInt();
		}
		System.out.println("Enter the loction you want to insert");
		loc = sc.nextInt();
		System.out.println("Enter the new item");
		item = sc.nextInt();
		for( i=size;i>loc;i--){

			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
        for(i=0;i<size;i++){

			System.out.println(a[i]+" ");
		}
	}
}