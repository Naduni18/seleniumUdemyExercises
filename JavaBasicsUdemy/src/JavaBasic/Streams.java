/**
 * 
 */
package JavaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * @author Naduni
 *
 */
public class Streams {
	
	@Test
	public void noStreams() {
	ArrayList<String> a = new ArrayList();
	a.add("Adfdg");
	a.add("fdgfdg");
	a.add("Afgfhfgh");
	a.add("Agfgdh");
	a.add("jhghhgf");
	int count = 0;
	for(int i=0;i<a.size();i++) {
		
		if(a.get(i).startsWith("A")) {
			count++;
		}
	}
	System.out.println(count);
	System.out.println("----------------------------------------");
	}
	
	@Test
	public void withStreams1() {
	ArrayList<String> b = new ArrayList();
	b.add("Adfdg");
	b.add("fdgfdg");
	b.add("Afgfhfgh");
	b.add("Agfgdh");
	b.add("jhghhgf");
	Long count = b.stream().filter(s->s.startsWith("A")).count();
	System.out.println(count);
	System.out.println("----------------------------------------");
	}
	
	@Test
	public void withStreams2() {
	
	Long coun = Stream.of("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf").filter(s->
	{
		s.startsWith("A");
		return true;
	}).count();
	System.out.println(coun);
	System.out.println("----------------------------------------");
	}
	@Test
	public void withStreams3() {
	
	Stream.of("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf").filter(s->s.length()>6).forEach(s->System.out.println(s));
	System.out.println("----------------------------------------");
	}
	@Test
	public void withStreams4() {
	
	Stream.of("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf").filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
	System.out.println("----------------------------------------");
	}
	@Test
	public void withStreams5() {
	
	Stream.of("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf").filter(s->s.endsWith("g")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println("----------------------------------------");
	}
	
	@Test
	public void withStreams6() {
	
	List<String> c= Arrays.asList("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf");
	c.stream().filter(s->s.endsWith("g")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	System.out.println("----------------------------------------");
	}
	
	@Test
	public void withStreams7() {
	
	List<String> c= Arrays.asList("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf");
	List<String> d= Arrays.asList("Adfdg","uyiuyiy","mkhk","ewrewr");
	Stream<String> str = Stream.concat(c.stream(),d.stream());
	str.forEach(s->System.out.println(s));
	System.out.println("----------------------------------------");
	
	// stream can't use again after modifying 
	}
	@Test
	public void withStreams8() {
		
		List<String> c= Arrays.asList("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf");
		List<String> d= Arrays.asList("Adfdg","uyiuyiy","mkhk","ewrewr");
		Stream<String> str = Stream.concat(c.stream(),d.stream());
		boolean flag = str.anyMatch(s->s.equalsIgnoreCase("uyiuyiy"));
		Assert.assertTrue(flag);
		System.out.println("----------------------------------------");
		// stream can't use again after modifying 
		}
	@Test
      public void withStreams9() {
		
	List<String> li = Stream.of("Adfdg","fdgfdg","Afgfhfgh","Agfgdh","jhghhgf").filter(s->s.length()>6).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(li.get(0));
	System.out.println("----------------------------------------");
	
		}
	@Test
    public void withStreams10() {
		
	List<Integer> values = Arrays.asList(4,3,6,7,2,9,1);
	List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));
	System.out.println("----------------------------------------");
	
		}
	
}
