/**
   Mohammed Raza
   CSC 236 - Lab4 #3 (class2)
*/

public class StackOverflowException extends StackException
{
	public StackOverflowException()
	{
		super("Stack Overflow");
	}

	public StackOverflowException(String msg)
	{
		super(msg);
	}
}