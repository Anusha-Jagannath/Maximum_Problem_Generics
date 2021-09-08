package com.maximum;

public class TestMaximum {
	private Integer firstNumber;
	private Integer secondNumber;
	private Integer thirdNumber;

	private Float floatNumber1;
	private Float floatNumber2;
	private Float floatNumber3;

	private String firstWord;
	private String secondWord;
	private String thirdWord;

	public TestMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public TestMaximum(Float floatNumber1, Float floatNumber2, Float floatNumber3) {
		super();
		this.floatNumber1 = floatNumber1;
		this.floatNumber2 = floatNumber2;
		this.floatNumber3 = floatNumber3;
	}

	public TestMaximum(String firstWord, String secondWord, String thirdWord) {
		super();
		this.firstWord = firstWord;
		this.secondWord = secondWord;
		this.thirdWord = thirdWord;
	}

	public Integer getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(Integer firstNumber) {
		this.firstNumber = firstNumber;
	}

	public Integer getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(Integer secondNumber) {
		this.secondNumber = secondNumber;
	}

	public Integer getThirdNumber() {
		return thirdNumber;
	}

	public void setThirdNumber(Integer thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	public Float getFloatNumber1() {
		return floatNumber1;
	}

	public void setFloatNumber1(Float floatNumber1) {
		this.floatNumber1 = floatNumber1;
	}

	public Float getFloatNumber2() {
		return floatNumber2;
	}

	public void setFloatNumber2(Float floatNumber2) {
		this.floatNumber2 = floatNumber2;
	}

	public Float getFloatNumber3() {
		return floatNumber3;
	}

	public void setFloatNumber3(Float floatNumber3) {
		this.floatNumber3 = floatNumber3;
	}

	public String getFirstWord() {
		return firstWord;
	}

	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}

	public String getSecondWord() {
		return secondWord;
	}

	public void setSecondWord(String secondWord) {
		this.secondWord = secondWord;
	}

	public String getThirdWord() {
		return thirdWord;
	}

	public void setThirdWord(String thirdWord) {
		this.thirdWord = thirdWord;
	}

	/*
	 * method to find maximum of 3 integers
	 */
	public void findMaximum() {
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
			System.out.println("Maximum: " + firstNumber);
		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0)
			System.out.println("Maximum: " + secondNumber);
		else
			System.out.println("Maximum: " + thirdNumber);
	}

	/*
	 * method to find maximum of 3 float
	 */
	public void findMaxOfFloat() {
		if (floatNumber1.compareTo(floatNumber2) > 0 && floatNumber1.compareTo(floatNumber3) > 0)
			System.out.println("Maximum: " + floatNumber1);
		else if (floatNumber2.compareTo(floatNumber1) > 0 && floatNumber2.compareTo(floatNumber3) > 0)
			System.out.println("Maximum: " + floatNumber2);
		else
			System.out.println("Maximum: " + floatNumber3);
	}
	/*
	 * method to find maximum of 3 words
	 */
	
	public void findMaxOfString() {
		if (firstWord.compareTo(secondWord) > 0 && firstWord.compareTo(thirdWord) > 0)
			System.out.println("Maximum: " + firstWord);
		else if (secondWord.compareTo(firstWord) > 0 && secondWord.compareTo(thirdWord) > 0)
			System.out.println("Maximum: " + secondWord);
		else
			System.out.println("Maximum: " + thirdWord);
	}
	
}
