package com.suman.java;

public class EvenOddThread {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread even_thread = new Thread(new TaskEvenOdd(printer,10, true));
		Thread odd_thread = new Thread(new TaskEvenOdd(printer, 10, false));
		even_thread.start();
		odd_thread.start();
	}
}

class TaskEvenOdd implements Runnable{
	private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {

        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }

    }
}

class Printer{
	boolean isOdd = false;
	
	public synchronized void printEven(int number){
		while(isOdd == false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing Even Number:: " + number);
		isOdd = false;
		notifyAll();
	}
	
	public synchronized void printOdd(int number){
		while(isOdd == true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing Odd Number:: " + number);
		isOdd = true;
		notifyAll();
	}
}
