package cap05;

public class ContinueTest {

	public static void main(String[] args) {
		for (int count = 0; count <= 10; count++) { // Faz o loop 10 vezes

			if (count == 5) continue; // Pula o código restante no corpo do loop se a contagem for 5

			System.out.printf("%d ", count);

		}

		System.out.printf("%nUsed continue to skip printing 5%n");
	}

}
