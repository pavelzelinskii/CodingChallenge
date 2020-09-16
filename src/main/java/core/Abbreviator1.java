package core;

public class Abbreviator1 {

	public static void main(String[] args) {

		String inpStr = "internationalization ^hdgdg)ydg kguiuygk!g";

		String outputStr = "";

		outputStr = abbreviate(inpStr);

		System.out.println(outputStr);

	}

	private static String abbreviate(String inpStr) {
		
		inpStr = inpStr + " ";
		String resultStr = "";
		String tmpStr = "";
		char tmpChar = 'A';
		int charCnt = 0;

		for (int i = 0; i < inpStr.length(); i++) {

			tmpChar = inpStr.charAt(i);

			if (isLetter(tmpChar)) {
				tmpStr = tmpStr + inpStr.charAt(i);
				charCnt = charCnt + 1;
			} else {
				if (charCnt > 3) {
					resultStr = resultStr + tmpStr.charAt(0);
					resultStr = resultStr + (charCnt - 2);
					resultStr = resultStr + tmpStr.charAt(tmpStr.length() - 1) + inpStr.charAt(i);
					tmpStr = "";
					charCnt = 0;
				} else if (charCnt <= 3) {
					resultStr = resultStr + tmpStr + inpStr.charAt(i);
					tmpStr = "";
					charCnt = 0;
				} else {
					resultStr = resultStr + inpStr.charAt(i);
				}
			}

		}
		return resultStr.trim();
	}

	private static boolean isLetter(char tmpChar) {

		if ((tmpChar >= 'A' && tmpChar <= 'Z') || (tmpChar >= 'a' && tmpChar <= 'z'))

			return true;

		return false;
	}

}
