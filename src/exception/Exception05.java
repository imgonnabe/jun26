package exception;

public class Exception05 {
	public static void main(String[] args) {
		int[] arr01 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		try {
			System.out.println(arr01[arr01.length - 1]);
			try {
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println("0으로 나누면 안됩니다.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 밖으로");
		}
	}
}
