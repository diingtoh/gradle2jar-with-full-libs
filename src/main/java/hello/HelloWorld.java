package hello;

import  org.joda.time.LocalTime;

//test git
public class HelloWorld {
    public static void main(String[] args) {
 
      System.out.println("Local time is: " + new LocalTime());

      System.out.println(new Greeter().sayHello());
    }
}