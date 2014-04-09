package test;

import static org.junit.Assert.*;

import org.junit.Test;

import yahtzee.Yahtzee;

public class YahtzeeTest {

	@Test
	public void onesTestNoOnes() {
		Yahtzee yahtzee = new Yahtzee(new int[]{2,4,5,6,2,3});
		
		
		int actual = yahtzee.calcOnes();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void onesTestTreeOnes(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,4,1,1,2,3});
		
		int actual = yahtzee.calcOnes();
		int expected = 3;
		assertEquals("Score should be three", expected, actual);
		
	}
	
	@Test
	public void towsTestNoTwos() {
		Yahtzee yahtzee = new Yahtzee(new int[]{1,4,5,6,3,3});
		
		
		int actual = yahtzee.calcTwos();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void twosTestThreeTwos() {
		Yahtzee yahtzee = new Yahtzee(new int[]{2,4,5,2,2,3});
		
		int actual = yahtzee.calcTwos();
		int expected = 6;
		assertEquals("Score should be six", expected, actual);
		
	}
	
	
	@Test
	public void threesTestNoThrees() {
		Yahtzee yahtzee = new Yahtzee(new int[]{1,4,5,6,2,1});
		
		
		int actual = yahtzee.calcThrees();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void threesTestThreeThrees() {
		Yahtzee yahtzee = new Yahtzee(new int[]{2,3,5,2,3,2});
		
		int actual = yahtzee.calcThrees();
		int expected = 6;
		assertEquals("Score should be six", expected, actual);
		
	}
	
	@Test
	public void pairTestZeroPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,2,3,4,5,6});
		
		int actual = yahtzee.calcPair();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void pairTestOnePair(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,3,3,4,5,6});
		
		int actual = yahtzee.calcPair();
		int expected = 6;
		assertEquals("Score should be six", expected, actual);
	}
	
	@Test
	public void pairTestOnePairSpread(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,3,2,4,3,6});
		
		int actual = yahtzee.calcPair();
		int expected = 6;
		assertEquals("Score should be six", expected, actual);
	}
	
	@Test
	public void pairTestTwoPairs() {
		Yahtzee  yahtzee = new Yahtzee(new int[]{1,3,3,3,3,6});
		
		int actual = yahtzee.calcPair();
		int expected = 6;
		assertEquals("Score should be six", expected, actual);
	}
	
	@Test
	public void pairTestTwoDifferentPairs() {
		Yahtzee  yahtzee = new Yahtzee(new int[]{1,3,3,4,4,6});
		
		int actual = yahtzee.calcPair();
		int expected = 8;
		assertEquals("Score should be eight", expected, actual);
	}
	
	@Test
	public void twoPairsTestZeroPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,2,3,4,5,6});
		
		int actual = yahtzee.calcTwoPairs();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void twoPairsTestOnePair(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,2,2,4,5,6});
		
		int actual = yahtzee.calcTwoPairs();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void twoPairsTestTwoPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,2,2,4,4,6});
		
		int actual = yahtzee.calcTwoPairs();
		int expected = 12;
		assertEquals("Score should be twelve", expected, actual);
	}
	
	@Test
	public void twoPairsTestTwoEqualPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,2,2,2,2,6});
		
		int actual = yahtzee.calcTwoPairs();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void threePairsTestZeroPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{1,2,3,4,5,6});
		
		int actual = yahtzee.calcThreePairs();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void threePairsTestTwoPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{2,2,3,3,5,6});
		
		int actual = yahtzee.calcThreePairs();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	
	
	@Test
	public void threePairsTestThreePairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{2,2,3,3,5,5});
		
		int actual = yahtzee.calcThreePairs();
		int expected = 20;
		assertEquals("Score should be twenty", expected, actual);
	}
	
	@Test
	public void threePairsTestThreeEqualPairs(){
		Yahtzee yahtzee = new Yahtzee(new int[]{2,2,2,2,2,2});
		
		int actual = yahtzee.calcThreePairs();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void threeOfAKindZeroThreeOfAKind(){
		Yahtzee yahtzee = new Yahtzee(new int[]{3,4,2,3,5,6});
		
		int actual = yahtzee.calcThreeOfAKind();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
	}
	
	@Test
	public void threeOfAKindOneThreeOfAKind(){
		Yahtzee yahtzee = new Yahtzee(new int[]{3,3,2,3,5,6});
		
		int actual = yahtzee.calcThreeOfAKind();
		int expected = 9;
		assertEquals("Score should be nine", expected, actual);
	}
	
	@Test
	public void threeOfAKindTwoThreeOfAKind(){
		Yahtzee yahtzee = new Yahtzee(new int[]{3,3,2,3,2,2});
		
		int actual = yahtzee.calcThreeOfAKind();
		int expected = 9;
		assertEquals("Score should be nine", expected, actual);
	}
	
	@Test
	public void fourOfAKindZeroFourOfAKind() {
		Yahtzee yahtzee = new Yahtzee(new int[]{3,3,2,3,2,2});
		
		int actual = yahtzee.calcFourOfAKind();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
		
		
	}
	
	@Test
	public void fourOfAKindOneFourOfAKind() {
		Yahtzee yahtzee = new Yahtzee(new int[]{3,3,3,3,2,2});
		
		int actual = yahtzee.calcFourOfAKind();
		int expected = 12;
		assertEquals("Score should be twelve", expected, actual);
		
		
	}
	
	
	@Test
	public void fiveOfAKindZeroFiveOfAKind() {
		Yahtzee yahtzee = new Yahtzee(new int[]{3,3,2,3,2,2});
		
		int actual = yahtzee.calcFiveOfAKind();
		int expected = 0;
		assertEquals("Score should be zero", expected, actual);
		
		
	}
	
	@Test
	public void fiveOfAKindOneFiveOfAKind() {
		Yahtzee yahtzee = new Yahtzee(new int[]{3,3,3,3,3,2});
		
		int actual = yahtzee.calcFiveOfAKind();
		int expected = 15;
		assertEquals("Score should be fifteen", expected, actual);
		
		
	}

}
