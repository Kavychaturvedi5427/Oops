package Oops.AccessControl;

import Test.*;

public class test {
    public static void main(String[] args) {
        PublicTest p = new PublicTest();
        System.out.println(p.Name);
        System.out.println(p.num);

        PrivateTest q = new PrivateTest();
        // System.out.println(q.num); // since the num and name variable in
        // Test/PrivateTest are private they can only be accessed in the PrivateTest
        // class....

        DefaultTest d = new DefaultTest();
        // System.out.println(d.Name); since name and num are default then we can't
        // access it outside any other package , we can only access it in the Test
        // package only.....
    }
}
