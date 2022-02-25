package com.konopackipio1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterAddressPlayground 
{
    public static void main( String[] args )
    {
        String name = "www.google.com";
        
        // Showing local internet address
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Could not get local host: " + e.getMessage());
        }

        // Showing other website ip
        try {
            
            InetAddress localHost = InetAddress.getByName(name);
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Could not get adress for: " + name);
        }

    }
}
