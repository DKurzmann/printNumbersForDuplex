package duplexDruck;

import java.util.ArrayList;

public class PageNumbers {
	int pageNumbers = 0;
	int pageNumbersDividedByTwo;
	ArrayList<Integer> arrayOfOdd = new ArrayList<Integer>();
	ArrayList<Integer> arrayOfEven = new ArrayList<Integer>();
	boolean rest = false;
	
	PageNumbers(int i){
		this.pageNumbers = i;
		this.pageNumbersDividedByTwo = pageNumbers/2;
		if ((pageNumbers%2) != 0) 
				rest = true;
	}
	
	ArrayList<Integer> getEvenNumbers() {
	    for (int i = 1; i <= pageNumbersDividedByTwo; i++) {
	    	if( (i % 2) == 0) {
	    		Integer numberToSave = (i*2)-1;
	    		arrayOfEven.add(numberToSave);
	    		arrayOfEven.add(numberToSave + 1);
	    	}
	    	if (i == pageNumbersDividedByTwo && (i % 2) != 0 && rest) {
	    		arrayOfEven.add(pageNumbersDividedByTwo*2+1);
	    	}
	    }
	    return arrayOfEven;
	}
	
	ArrayList<Integer> getOddNumbers() {
    	arrayOfOdd.add(1);
    	arrayOfOdd.add(2);
	    for (int i = 2; i <= pageNumbersDividedByTwo; i++) {
	    	if( (i % 2) != 0) {
	    		Integer numberToSave = (i*2)-1;
	    		arrayOfOdd.add(numberToSave);
	    		arrayOfOdd.add(numberToSave + 1);
	    	}
	    	if (i == pageNumbersDividedByTwo && (i % 2) == 0 && rest) {
	    		arrayOfOdd.add(pageNumbersDividedByTwo*2+1);
	    	}
	    }
	    return arrayOfOdd;
	}
	
	void printArray(ArrayList<Integer> array) {
		int zähler = 0;
		for(int i : array) {
			if (zähler == 0) {
				System.out.print(i +" - ");
				zähler =+ 1;
				continue;
			}
			if (zähler > 0) {
				System.out.print(i +", ");
				zähler =+0;
			}
		}
		System.out.println("");
	}
	
	public static void main(String args[]) {
		
		PageNumbers pageNumbers = new PageNumbers(109);
		pageNumbers.printArray(pageNumbers.getOddNumbers());
		pageNumbers.printArray(pageNumbers.getEvenNumbers());
		System.out.println("juhuu");
	    }

	}

