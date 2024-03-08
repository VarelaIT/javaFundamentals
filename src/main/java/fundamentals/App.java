package fundamentals;

import referenceTypes.LongestCommonPrefix;

public class App {

    public static void main ( String[] args ) {

        System.out.println( "\tJava Fundamentals\n\n" );

        PrimitiveTypes.primitiveTypes();

        System.out.println(
            "March 7th 2024\n\n" +
            "\tReference types: String manipulation.\n\n" +
            "\t\tTo test the string methods, we decided to solve a Leetcode: Longest Common Prefix.\n" +
            "\t\tGiven a string array find the longest common prefix, where the array is equal to: [\"flower\",\"flow\",\"flight\"]."
        );
        String[] stringInput = {"flower","flow","flight"};
        LongestCommonPrefix commonPrefix= new LongestCommonPrefix();

        System.out.println("\t\tThe solution is: " + commonPrefix.solution(stringInput));
    }
}
