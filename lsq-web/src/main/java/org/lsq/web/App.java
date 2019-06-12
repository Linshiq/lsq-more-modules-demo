package org.lsq.web;

import org.lsq.service.serviceTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        serviceTest  s = new serviceTest();
        
        System.out.println(s.test());;
    }
}
