package lambda;

@FunctionalInterface		//람다형 인터페이스를 위한 어노테이션
public interface MyMaxNumber {		//메소드 두개이상 선언 불가능
	int getMaxNumber(int x, int y);		//익명메소드
}
