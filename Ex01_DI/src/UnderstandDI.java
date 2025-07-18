import java.util.Date;

//Member를 사용한다 --> Member의 기능에 의존한다 라는 의미
class Member
{
	String name;
	String nickname;
	public Member() {}
//	private Member() {}		 // 강한 결합이 에러 발생.
}

public class UnderstandDI
{
	public static void main(String[] args)
	{
		// 날짜를 구하기 위해서는 Date 클래스에 의존해야 한다.
		// 이런 강한 결함은 Date와 같이 기존에 만들어져 있는 
		// API나 프레임워크의 기능에도 적용된다.
		Date date = new Date(); 
		System.out.println(date);
	}
	
	public static void getDate(Date d)
	{
		Date date = d;	// 약한 결합	
//		System.out.printf("날짜= ", date);	// 나오지 않음.
	}
	
	public static void memberUse1()
	{
		// 강한 결합 : 직접 생성
		// 생성자가 Private로 바뀌면 에러발생
		Member m1 = new Member();
	}
	
	public static void memberUse2(Member m)
	{
		// 약한 결합 : 생성된 것을 주입 받음 - 의존 주입(Member m) (Dependency Injection)
		/*
			생성자가 private로 바뀌어도 영향을 받지 않는다.
			이처럼 약한 결합을 사용하는 프로그래밍은 다른 클래스의 변화에 더욱 
			안전하고 유연하게 대처할 수 있다. 의존주입을 통해 약한 결합을 사용
			하는 이유이다.
		*/
		Member m2 = m;
	}
}
