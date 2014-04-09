package yahtzee;

import java.util.Arrays;

public class Yahtzee {
	
	private int[] dices;
	
	public Yahtzee() {
		dices = new int[]{0,0,0,0,0,0};
	}
	
	public Yahtzee(int[] dices) {
		this.dices = dices;
	}

	public void roll() {
		// TODO Auto-generated method  stub
		
	}

	public int calcOnes() {
		
		return calcSingleNumbers(1);
	}

	public int calcTwos() {
		
		return calcSingleNumbers(2);
	}

	public int calcThrees() {
		
		return calcSingleNumbers(3);
	}
	
	public int calcFours() {
		
		return calcSingleNumbers(4);
	}
	
	public int calcFives() {
		
		return calcSingleNumbers(5);
	}
	
	public int calcSixes() {
		
		return calcSingleNumbers(6);
	}
	
	public int calcSingleNumbers(int diceNumber) {
		int score = 0;
		for (int dice : dices) {
			if(dice == diceNumber) {
				score += diceNumber;
			}
			
		}
		return score;
	}

	public int calcPair() {
		return calcNPairs(1);
	}

	public int calcTwoPairs() {
		return calcNPairs(2);
	}
	
	public int calcThreePairs() {
		return calcNPairs(3);
	}

	public int calcNPairs(int numberOfPairs) {
		int[] pairs = new int[numberOfPairs];
		
		Arrays.sort(dices);
		for(int i = 0; i < dices.length-1; i++){
			// For each pair of dices (dice1 + dice2, dice2 + dice3...)
			if(dices[i] == dices[i+1]){
				// We found a pair!
				int temp = dices[i];
				Arrays.sort(pairs);
				// For each saved pair, does the pair already exist
				for(int j = pairs.length - 1; j >= 0; j--){
					if(temp == pairs[j]) break;
					if(temp > pairs[j])  {
						pairs[0] = temp;
						break;
					}
				}
			}
		}
		int score = 0;
		for (int pair : pairs) {
			if(pair == 0){
				return 0;
			}
			score += pair * 2;
		}
		return score;
	}

	public int calcThreeOfAKind() {
		
		Arrays.sort(dices);
		int threeOfAKind = 0;
		
		
		for(int i = 0; i <= dices.length-3; i++) {
			if(dices[i] == dices[i+1] && dices[i+1] == dices[i+2] && dices[i] > threeOfAKind) {
				threeOfAKind = dices[i];
			}
		}
		
		return threeOfAKind * 3;
	}

	public int calcFourOfAKind() {
		Arrays.sort(dices);
		int fourOfAKind = 0;
		
		
		for(int i = 0; i <= dices.length-4; i++) {
			if(dices[i] == dices[i+1] && dices[i+1] == dices[i+2] && dices[i+2] == dices[i+3] && dices[i] > fourOfAKind) {
				fourOfAKind = dices[i];
			}
		}
		
		return fourOfAKind * 4;
	}

	public int calcFiveOfAKind() {
		
		
		return calcNOfAKind(5);
	}
	
	public int calcNOfAKind(int n){
		Arrays.sort(dices);
		int nOfAKind = 0;
		
		for(int i = 0; i <= dices.length - n-1; i++) {
			int equalInARow = 0;
			for(int j = i; j + i < n; j++) {
				if(dices[j] == dices[j+1]) {
					equalInARow++;
				}
			}
			if(equalInARow == n) {
				nOfAKind = dices[i];
			}
		}
		
		
		return nOfAKind * n;
	}
	
	


}
