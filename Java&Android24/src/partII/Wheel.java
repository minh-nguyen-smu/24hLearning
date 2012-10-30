package partII;

public class Wheel {
	public static void main(String[] args) {
		String phrase[] = {
				"A STITCH IN TIME SAVES NINE",
				"DONÕT EAT YELLOW SNOW",
				"JUST DO IT",
				"EVERY GOOD BOY DOES FINE",
				"I WANT MY MTV",
				"I LIKE IKE",
				"PLAY IT AGAIN, SAM",
				"FROSTY THE SNOWMAN",
				"ONE MORE FOR THE ROAD",
				"HOME FIELD ADVANTAGE",
				"VALENTINEÕS DAY MASSACRE",
				"GROVER CLEVELAND OHIO",
				"SPAGHETTI WESTERN",
				"AQUA TEEN HUNGER FORCE",
				"ITÕS A WONDERFUL LIFE"
		};
		int[] letterCount = new int[26];
		//loop through every phrase
		for (int count = 0; count < phrase.length; count++) {
			String current = phrase[count];
			char[] letters = current.toCharArray();
			//loop through the character array
			for (int count2 = 0; count2 < letters.length; count2++) {
				char lett = letters[count2];
				if ( (lett >= 'A') & (lett <= 'Z')) {
					//'A' numeric value = 65, 'Z' numeric value = 90, letterCount starts from 0-25
					letterCount[lett - 'A']++;
				}
			}
		}
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + ": " + letterCount[count - 'A'] + " ");
		}
		System.out.println();
	}
}
