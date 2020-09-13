//Usually when you buy something, you're asked whether your credit card 
//number, phone number or answer to your most secret question is still 
//correct. However, since someone could look over your shoulder, you don't 
//want that shown on your screen. Instead, we mask it.
//Your task is to write a function maskify, which changes all but the 
//last four characters into '#'.
//askify.Maskify("4556364607935616");  should return "############5616"
//Maskify.Maskify("64607935616");       should return "#######5616"
package core;

public class CreditCardMask {

	public static String maskify(String str) {

		String newStr = "";
		String a = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.length() <= 4) {
				newStr = str;
				break;
			}
			if (str.length() > 4 && i > str.length() - 5) {
				char b = str.charAt(i);
				a = String.valueOf(b);
			}
			if (str.length() > 4 && i <= str.length() - 5) {
				a = "#";
			}
			newStr = newStr + a;
		}

		return newStr;
	}

	public static void main(String[] args) {

		String str = "2736yvvy87!";
		System.out.println(maskify(str));
	}

}
