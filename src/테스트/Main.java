package 테스트;

//문제 : 사람을 말하게 해주세요.

class Main {
	public static void main(String[] args) {

		
		사람 a사람1 = new 사람();
		//사람타입의 a사람1이라는 변수에 사람이라는 객체를 넣겠다
		
		a사람1.말하다();
		//a사람1을 조종할수 있는 말하다라는 리모컨을 작동시킨다
	}
}

class 사람 {
// 사람은 `말하다` 라는 기능을 가지고 있습니다.
	void 말하다() {
		//사람 설계도 안에 말하다라는 메서드이다
		System.out.println("사람이 말합니다.");
	}
}