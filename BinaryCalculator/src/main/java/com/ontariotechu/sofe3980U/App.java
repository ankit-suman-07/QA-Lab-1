package com.ontariotechu.sofe3980U;
//import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * Main program: The entry point of the program. It creates two binary variables, adds them and print the result.
     *
     * @param args: not used
     */
    public static void main( String[] args )
    {
//        LocalTime currentTime = new LocalTime();
//        System.out.println("THe new current time is: " + currentTime);
//        Binary binary1=new Binary("00010001000");
//        System.out.println( "First binary number is "+binary1.getValue());
//        Binary binary2=new Binary("111000");
//        System.out.println( "Second binary number is "+binary2.getValue());
//        Binary sum= Binary.add(binary1,binary2);
//        System.out.println( "Their summation is "+sum.getValue());

        demonstrateOperations("1000", "1111");
        demonstrateOperations("1010", "11");
        demonstrateOperations("0", "1010");
    }
    private static void demonstrateOperations(
            String firstNumber,
            String secondNumber)
    {
        Binary binary1 = new Binary(firstNumber);
        Binary binary2 = new Binary(secondNumber);

        Binary orResult = Binary.or(binary1, binary2);
        Binary andResult = Binary.and(binary1, binary2);
        Binary multiplicationResult = Binary.multiply(binary1, binary2);

        System.out.println("--------------------------------");
        System.out.println("First binary number    : " + binary1.getValue());
        System.out.println("Second binary number   : " + binary2.getValue());
        System.out.println("OR result              : " + orResult.getValue());
        System.out.println("AND result             : " + andResult.getValue());
        System.out.println("Multiplication result  : " + multiplicationResult.getValue());
    }
}