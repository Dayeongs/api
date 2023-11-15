package lang;

public class StringApp2 {
	
	public static void main(String[] args) {
		
		// String 클래스의 주요 메소드
		
		/*
		 * int length()
		 * 	- 문자열의 길이를 반환한다.
		 * 	- 공백을 포함한 문자열의 길이를 반환한다.
		 */
		String str1 = "안녕하세요";
		String str2 = "abc abc abc";
		System.out.println("길이1: " + str1.length());
		System.out.println("길이2: " + str2.length());
		System.out.println();
		
		/*
		 * boolean isEmpty()
		 * 	- 빈 문자열인 경우 true를 반환한다.
		 * 	- 빈 문자열 -> ""
		 * 	- 빈 문자열은 길이가 0인 문자열이다.
		 */
		String str3 = "";
		String str4 = "    ";
		String str5 = "안녕하세요";
		System.out.println("빈 문자열인가? " + str3.isEmpty());	// true
		System.out.println("빈 문자열인가? " + str4.isEmpty());	// false
		System.out.println("빈 문자열인가? " + str5.isEmpty());	// false
		System.out.println();
		
		/*
		 * boolean isBlank()
		 * 	- 빈 문자열이거나 white space로만 구성된 문자열인 경우 true를 반환한다.
		 */
		System.out.println("빈 문자열인가? " + str3.isBlank());	// true
		System.out.println("빈 문자열인가? " + str4.isBlank());	// true
		System.out.println("빈 문자열인가? " + str5.isBlank());	// false
		System.out.println();
		
		/*
		 * boolean contains(CharSequence s)
		 * 	- 문자열이 지정된 문자열을 포함하고 있으면 true를 반환한다.
		 */
		String str6 = "중앙HTA학원 주식회사";
		System.out.println("문자열을 포함하는가? " + str6.contains("중앙"));	// true
		System.out.println();
		
		/*
		 * boolean startsWith(String prefix);
		 * 	- 문자열이 지정된 prefix로 시작하면 true를 반환한다.
		 */
		String str7 = "http://www.daum.net";
		String str8 = "https://localhost/index.html";
		String str9 = "https://google.com";
		
		System.out.println("문자열이 https로 시작하는가? " + str7.startsWith("https"));	// false
		System.out.println("문자열이 https로 시작하는가? " + str8.startsWith("https"));	// true
		System.out.println("문자열이 https로 시작하는가? " + str9.startsWith("https"));	// true
		System.out.println();
		
		/*
		 * boolean endsWith(String suffix)
		 * 	- 문자열이 지정된 suffix로 끝나면 true를 반환한다.
		 */
		String str10 = "Sample.hwp";
		String str11 = "Sample2,xlsx";
		String str12 = "Sample3.xlsx";
		
		System.out.println("엑셀파일인가? " + str10.endsWith("xlsx"));	// false
		System.out.println("엑셀파일인가? " + str11.endsWith("xlsx"));	// true
		System.out.println("엑셀파일인가? " + str12.endsWith("xlsx"));	// true
		
	}

}