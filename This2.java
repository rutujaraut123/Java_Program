class This2
{
	int a; //Instances Variable
	This2(int a) //Local Variable
	{
     this.a=a;
     // if we dont write this.a then it print default value 
     //of int i.e 0 JVM will confused because instance and locla variable have same name
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		This2 r=new This2(100);
		r.show();
	}

}