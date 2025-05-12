
package Oops;

import static Oops.forImporting.*;      // for importing files with in same folder....

import static Methods.Palindrome.check_palindrome;  // for importing files / method which is not present in the same folder...

public class ImportingFiles {
    public static void main(String[] args) {
        message();
        System.out.println(check_palindrome(121));
    }
}
