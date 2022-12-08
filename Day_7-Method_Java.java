class A{
	A(){

		System.out.print("Kulsum");

	}
	A(int a){
          this();
		System.out.print(a);
	}
	public static void main(String args[]){
		A r = new A(200);
	}
}