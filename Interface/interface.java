package Wednesday;
 interface Interface1
 {
void display1();
}
 interface Interface2 extends Interface1
 {
void display2();
}
 interface Interface3
 {
void display3();
}
 interface Interface4 
 {
void display4();
}
 class InterfaceDemo implements Interface2,Interface3,Interface4
 {
	@Override
	public void display1() {
				System.out.println("display1");	 }
	@Override
	public void display4() {
		System.out.println("display4");		}
	@Override
	public void display3() {
		System.out.println("display3");			}
	@Override
	public void display2() {
		System.out.println("display2");
			}
	 public static void main(String[] args) {
		 InterfaceDemo ob=new InterfaceDemo();
	ob.display1(); ob.display2(); ob.display3();  ob.display4();
	}
 }