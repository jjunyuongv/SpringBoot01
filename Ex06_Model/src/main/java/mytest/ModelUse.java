package mytest;

import java.util.HashMap;
import java.util.Map;

public class ModelUse
{
	public static void main(String[] args)
	{
		// 지역 변수라 메서드가 종료되면 메모리에서 제거된다.
		// 힙에 객체가 생성되고 스택에 그 객체의 위치를 저장한 참조변수가 생성된다.
		Map<String, String> model = new HashMap<>();
		// 리퀘스트맵핑 정보에 따라 root() 메서드 호출
		String sReturn = root(model);
		// 리턴받은 뷰 페이지 이름과 모델 객체를 출력을 위해 다시 넘김
		printData(sReturn, model);
	}
	
	// 파라미터 model은 힙 영역에서 생성된 객체를 참조하기 위한 또 다른 참조 변수이다
	public static String root(Map model)
	{
		model.put("name1", "홍길동");
		model.put("name2", "전우치");
		return "Hello";
	}

	private static void printData(String s, Map model)
	{
		String str1 = (String)model.get("name1");
		String str2 = (String)model.get("name2");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("WEB-INF/views/"+ s + ".jsp");
	}
}
