package Test;

public class Test {
	public static void main(String args[]) {

		String bankOnBoardingReqDto = "P.n.patti (tp)";

		Test b = new Test("a", "b", "b");

		bankOnBoardingReqDto = bankOnBoardingReqDto.replace(".", "");
		bankOnBoardingReqDto = bankOnBoardingReqDto.replace("(", "");
		bankOnBoardingReqDto = bankOnBoardingReqDto.replace(")", "");

		System.out.println(bankOnBoardingReqDto);

		String bankOnBoardingReqDto1 = "NAe";

		if (!bankOnBoardingReqDto1.equalsIgnoreCase("NA")) {
			System.out.println(bankOnBoardingReqDto);
		}

	}
}
