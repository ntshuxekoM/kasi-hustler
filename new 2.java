

(()) true
((()) false
))(( false
(()()) true


public boolean checkCorrect(String brackets) {
	//(())
	String[] bracketsToken = brackets.split("");
	int correct = bracketsToken.lenght / 2;
	int found = 0;
	
	for (int x = 0; x < bracketsToken.lenght(); x++) {
		for (int y = 0; y < bracketsToken.lenght(); y++) {
			if (bracketsToken[x].equals("(")) {
				if (bracketsToken[y].equals(")") {
					found++;
				}
			} else {
				if (bracketsToken[y].equals("(") {
					found++;
				}
			}
		}
	}
	
	if (found == correct ) {
		return true;
	}
	return false;
	
}