package korea.ext;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		String uuid;
		//16진수 32자리 + 하이픈 기호 4개로 만들어지는 랜덤문자열
		for(int i=0;i<10;i++) {
			uuid= UUID.randomUUID().toString();
			System.out.println(uuid);
		}
		
		for(int i=0;i<10;i++) {
			uuid= UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", ""));
		}
		for(int i=0;i<10;i++) {
			uuid= UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0,12));
		}
		/*git 토큰값 : 토큰 인증
		 * 웹사이트에서 회원가입시 비밀번호를 설정합니다.(패스워드 인증)비밀번호는 서버에서 관리가 될까요?
		 * 		-> 해싱(복호화가 암되는 함수) 함수를 이용해서 문자열에 대한 식별값을 만들어내고 저장합니다.
		 * 		-> 비밀번호 1234에 대한 해싱함수 값을 저장. 로그인 1234
		 * 		-> 대표적인 해싱함수 sha256(자바에서 직접구현 MessageDigest 클래스 사용)
		 * 암호화 : 평문 -> 암호문, 복호화: 암호문 -> 평문(공개키와 개인키를 이용)
		 * 
		 */

	}

}
