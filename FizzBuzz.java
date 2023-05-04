class FizzBuzz {
  public static void main (String[] args) {

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}


//It's important to check if a number is divisible by both 3 and 5 first, before checking if it's only divisible by 3 or 5.

//If we put the condition if (i % 3 == 0 && i % 5 == 0) in the else if block after checking if the number is divisible by only 3 or 5, 
  it will never get executed for numbers that are divisible by both 3 and 5. Instead, the program will print "Fizz" or "Buzz" for those numbers, 
  which is not what we want.

//So by putting the if (i % 3 == 0 && i % 5 == 0) condition first, 
  we ensure that the program first checks for numbers that are divisible by both 3 and 5 and prints "FizzBuzz" for those numbers. 
  Then, if the number is not divisible by both 3 and 5, the program will check if it's divisible by only 3 or 5 and print "Fizz" or "Buzz" accordingly.

//This order of the conditions ensures that each number is checked only once and the correct output is printed.
