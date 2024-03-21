class StaticBlock
{
	public static void main(String[] args)
	{
     StaticBlock r1=new StaticBlock();
	}
	StaticBlock()
	{
     // Default COnstructor
		System.out.println("Deafult Constructor");
	}
	{
		//Instance Block
		System.out.println("Instances Block");

	}
	static 
	{
     // Static Block
		System.out.println("Static Block");
	}
}