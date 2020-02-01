import java.io.Console;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TestInter isEven= (x)->x%2==0?true:false;
	System.out.println(isEven.Test(4));
	Function<String, Integer> strlength = (s)->s.length();
	System.out.println(strlength.apply("Hello World"));
	//Consumer<String> consumer = (s)-> System.out.println();
	BiFunction<Integer,Integer,Integer> mr1 = DemoClass::add;
	System.out.println(mr1.apply(10,20)); 
	Consumer<String> consumer = (s)-> System.out.println()
	
	}
	@FunctionalInterface
	interface TestInter
	{
		boolean Test(int a);
		//int add(int a , int b);
	}
	
}
class DemoClass
{
	public static Integer add(int a , int b)
	{
		return a+b;
	}
}
