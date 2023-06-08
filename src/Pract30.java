import java.util.Locale;

public class Pract30 {
    public static void main(String[] args) {

        String a = "This is A String";
        String b = "This is a String";
        StringBuffer c = new StringBuffer("This is a String");
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        // All methods of String class
        System.out.println(a.charAt(0));  // chatAt() returns the character at th specified index.
        System.out.println(a.codePointAt(8)); // codePointAt() returns the unicode of the specified
        // character at that index of the string.
        System.out.println(a.codePointBefore(1)); //returns the unicode value of the previous value of the
        //given index.
        System.out.println(a.codePointCount(3, 9)); // returns unicode value of the string provided between the range
        System.out.println(b.compareTo(a)); // compares the given string and provide the lexicographically value in int
        System.out.println(a.compareToIgnoreCase(b)); // compares the given string and provides the lexicographically
        // value ignoring the case of the string.
        System.out.println(a.concat(" Bidhu")); // concats the given string
        System.out.println(a.contains("is b")); // returns true or false checking the provided string in the given string
        System.out.println(a.contentEquals(b)); // returns in boolean checks equal contents in both the strings or not
        System.out.println(String.copyValueOf(ch)); // returns in string fomate of the char [] data
        System.out.println(String.copyValueOf(ch, 4, 3)); // returns in string fomate of the givn char[] data
        // parameters(char[], index of left over, next count characters)
        System.out.println(a.endsWith("s"));  // returns true or false if the provided character ends with the given
        //character in that string
        System.out.println(b.equals(a)); // returns boolean if the strings re equals also checks whether the string is
        //instance of provided string or not.
        System.out.println(a.equalsIgnoreCase(b)); // returns booleans if the strings are equals ignoring the case
        //String format
        System.out.println(String.format("The string is a is :- %s", a));
        //returns the String in a formated way
        System.out.println(String.format("the output of hex code in integer %x", 9));
        System.out.println(String.format("The fomate be like %s@%s", "bidhu", "Dash"));
        System.out.println(String.format("The decimal string would be like:-%16.9h", 345.5678)); //%h - hex code
        // %f,%e,%g= floating decimal number, %s = string, %o = ocatal number, %x=hex string
        byte[] bt = a.getBytes();    // return byte[] of the provided string

        for (byte i : bt) {
            System.out.print(i + " ");
        }
        //a.getChars(2, 7,ch,5);
        System.out.println();
        System.out.println(a.hashCode());  // returns the hashcode of the given string
        System.out.println(a.indexOf("A")); // returns the index of the given character or occurance in the given string
        System.out.println(a.intern()); //Returns the canonical representation for the string object
        System.out.println(a.isEmpty()); // returns true or false of the given string is empty or not.
        System.out.println(a.lastIndexOf("is")); // returns the last index of the given string or occurance in the string.
        System.out.println(a.length()); //returns the length of the given string in integer
        System.out.println(b.matches("This(.*)")); // returns boolean if the string matches the regex express in the given string.
        System.out.println(b.offsetByCodePoints(8, 5));  // returns the codepointoffset from th given index
        System.out.println(a.regionMatches(10, "This", 0, 10)); //returns booleans if two strings reagions are equal

        // replace char/charsequence in the given string with the new character sequence provided
        System.out.println(a.replace('A','a'));
        System.out.println(a.replace("is","err"));
        System.out.println(a.replaceFirst("is","that"));
        System.out.println(a.replaceAll("is","a"));
        //returns in string [] splits the given string from provided regex.
        String [] str = a.split("s");
        for (String i:str){
            System.out.println(i);
        }

        System.out.println(a.startsWith("T")); // checks wether th string starts with the given charater sequence or not
        System.out.println(a.subSequence(0,16)); // return the char sequence from the given index to end index
        System.out.println(a.substring(4)); //returns the given substring from the provided index.

        //return the given string into char [] format
        char [] chr = a.toCharArray();
        for (char i :chr){
            System.out.print(i+"_");
        }

        System.out.println("\n"+a.toLowerCase()); // coverts the given string into lowercase
        System.out.println(b.toUpperCase()); //coverts the given string into uppercase
        System.out.println(c.toString());  //returns th value of the string object in string
        System.out.println(a.trim());      // removes whitespaces from both the ends
        System.out.println(String.valueOf(ch)); //represents the string representation of the given string
        //charactersequence/ char [] / int []

    }
}
