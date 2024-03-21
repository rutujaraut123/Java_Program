class This1
{
	void show()
	{
		System.out.println(this);
		//here used keyword "this" refer also to Object of class This1
	}
	public static void main(String[] args) {
		This1 r=new This1();
		System.out.println(r);
		//here r refer to object of This1 Class
		r.show();//for call show()
	}
}