import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreaMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream s = Stream.of(24,45,6,53,56);
		
		String[] str= {"A","B","C"};
		Stream<String> strStream = Arrays.stream(str);
		List<String> strlist = new ArrayList<>();
		strlist.add("Red");
		strlist.add("Green");
		strlist.add("Brown");
		strlist.add("Purple");
		
		//Consumer c = (a)->System.out.println(a);
		Stream<String> cstream = strlist.stream();
		//cstream.forEach(c);
		//cstream.forEach(System.out::println);
		//cstream.map(s1->s1.length()).forEach(System.out::println);
		//cstream.filter(s1->s1.length()>4?true:false).forEach(System.out::println);
		//List<String> filteredList = cstream.filter(s1->s1.length()>4?true:false).forEach(System.out::println);
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101,"raj",84498));
		empList.add(new Employee(102,"rahul",84455));
		Stream<Employee> empstream = empList.stream();
		//empstream.forEach(System.out::println);
		empstream.filter(e1->e1.getSalary()>1000).forEach(System.out::println);
		empstream.sorted((e1,e2)->e1.getEmpname().compareTo(e2.getEmpname()));
		empstream.sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);
	}

}
