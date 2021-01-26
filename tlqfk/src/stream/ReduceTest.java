package stream;

import java.util.*;
import java.util.function.*;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}
public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings = {
				"안농", "hewwo", "good mronginge", "방구"
		};
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
		}));
		
		//CompareString클래스의 apply메소드 적용
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
