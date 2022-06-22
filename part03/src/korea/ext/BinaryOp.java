package korea.ext;

public class BinaryOp {

	public static void main(String[] args) {
		
		//2진수의 비트 연산 : &, |, ^, ~, >> , << 등등 간단히 테스트
		int data = 0b0101110100100110;
		
		System.out.println("1. ~(비트 반전) 연산 결과"); //참고: !연산은 true와 false를 반대로(boolean 연산)
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		System.out.println("2. >>은 오른쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		// >> 1은 나누기 2한 결과 값.
		
		System.out.println("3. <<은 왼쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1),data<<1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2),data<<2));
		// << 1은 곱하기 2한 결과 값.
		
		data= -2345;
		System.out.println("4. 음수값 >>은 오른쪽 쉬프트 연산(오른쪽 정수값은 쉬프트 동작 횟수)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		//정수 32비트의 맨 왼쪽 비트는 부호를 표시합니다. 오른쪽 쉬프트 연산에서 왼쪽에 추가되는 비트는 부호비트와 같습니다.
		// 참고 : 오른쪽 쉬프트 할때 부호와 상관없이 왼쪽에 추가되는 비트를 0으로 해야될때는 >>>연산으로 합니다.
		System.out.println("5. >>> 오른쪽 쉬프트 연산	");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>1),data>>>1));
		int n = 0xffffffff;		//32비트가 모두 1
		data = 100;
		// 참고 논리연산 and 는 참 and 참 일때만 결과가 참, 논리연산 or는 거짓or거짓 일때만 거짓
		//		비트연산 and는 1 & 1일때만 결과가 1, 비트연산 or는 0or0 일때만 결과가 0
		// 비트 연산 활용 -> x&1은 결과가 x, x&0은 결과가 0, x|1은 결과가 1, x|0은 결과가 0
		System.out.println("6. &는 bit and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		System.out.println("--------------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n),data&n));
		
		n=0;
		System.out.println("7. |는 bit or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		System.out.println("--------------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n),data|n));
	}

}
