package org.lombok;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User();
        user.setEmail("hello@email.com");
        System.out.println("EmailId :" + user.getEmail() );
       // user = new User("", "", "");
    }
}
