package koreait06;
// �ۼ��� : ����ȫ
import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {

	public static void main(String[] args) {
		int[] numbers = new int[45]; 
		Random r = new Random();
		
		for (int i=0;i<45;i++) // �ε��� ���� : 0~44
			numbers[i]=i+1; // �� ���� : 1~45
		
		System.out.println("numbers �迭 �ʱ�ȭ-------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-----------------------------------------");
		
		int[] lotto = new int[6]; 
		int k; 
		for(int cnt=0;cnt<6;cnt++) {
			k=r.nextInt(45-cnt);// k�� ó���� 0<=k<45 -> 0<=k<44 -> ... 0<=k<40(***�ε��� ����***) ������ ���� 6�� �̱�
			                    // ������ ���� �ڿ� �ִ� �ε��� ���� �ߺ��� ������ for�� �������� ������ 1�� ���̱�
			System.out.println("k="+k+", number =" + numbers[k]); // �����ϰ� ���� k�� numbers�� �ε��� k�� ��� 6�� �ݺ�
			lotto[cnt]=numbers[k]; // lotto ��Ʈ�� �迭�� ���� ���� ����
			
			for(int i=k;i<numbers.length-1;i++) {
				numbers[i]=numbers[i+1]; // ���� �ϳ��� ���������� numbers�� ����� ���� �����ϰ� ������ ���� �����ʿ� �ִ� ���� 
				                         // ��ĭ�� �������� �۾� (for�� �ȿ� for���� ����� ���� ���������� �ݺ�)
			}System.out.println(Arrays.toString(numbers)); // numbers�ȿ� ���� �ϳ��� ������ �� �� �迭�� ���
		} 
		System.out.print("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto); // lotto �迭���� ũ�� ������� ��ġ�� �����մϴ�.
	    System.out.println(Arrays.toString(lotto)); // ������������ ���
		
		
			

	}

}
