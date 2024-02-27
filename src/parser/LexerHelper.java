package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods

	public static double lexemeToReal(String str){
		try{
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {
		char[] caracteres =text.toCharArray();
		char char1 = caracteres[1];
		if(char1!='\\'){
			return char1;
		}else{
			char char2 = caracteres[2];
			if(char2=='t' || char2=='n'){
				return char2;
			}else{
				String union;
				if (caracteres.length==3)
					return (char) Character.getNumericValue(char2);
				else if(caracteres.length==4){
					union = Character.toString(char2)+ Character.toString(caracteres[3]);
					return (char) Integer.parseInt(union);
				}else{
					union = Character.toString(char2)+ Character.toString(caracteres[3])+Character.toString(caracteres[4]);
					return (char) Integer.parseInt(union);
				}
			}

		}

	}
}