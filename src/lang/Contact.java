package lang;

import java.util.Objects;

public class Contact {
	
	String name;
	String phone;
	String email;
	String company;
	
	// 자동완성: 마우스 우클릭 -> Source -> Generate hashcode() and equals()...
	// hashcode()를 재정의하는 이유
	// 두 객체를 비교(동등성 여부)하는데 제일 빠른 방법
	// 두 객체가 같은지 비교할 때 hashcode() 먼저 실행 후 equals() 실행해야 함.
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	// Object로부터 상속받은 toString() 재정의하기
	// 자동완성: 마우스 우클릭 -> Source -> Generate toString()...
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + ", email=" + email + ", company=" + company + "]";
	}
	
//	@Override
//	public String toString() {
//		return name + " - " + phone;
//	}
	
}
