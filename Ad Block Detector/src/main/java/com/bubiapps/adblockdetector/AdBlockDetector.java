package com.bubiapps.adblockdetector;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AdBlockDetector {
    public static int AD_BLOCKER_DETECTED = 0;
    public static int AD_BLOCKER_NOT_DETECTED = 1;
    public static int NO_INTERNET_CONNECTION = 2;


    public static  int isAdBlockerEnabled() throws UnknownHostException {

        try {
            if (InetAddress.getByName("a.admob.com").getHostAddress().equals("127.0.0.1") ||
                    InetAddress.getByName("mm.admob.com").getHostAddress().equals("127.0.0.1") ||
                    InetAddress.getByName("p.admob.com").getHostAddress().equals("127.0.0.1") ||
                    InetAddress.getByName("r.admob.com").getHostAddress().equals("127.0.0.1")) {
                return AD_BLOCKER_DETECTED;
            }else{
                return AD_BLOCKER_NOT_DETECTED;
            }
        } catch (UnknownHostException e) {
        return NO_INTERNET_CONNECTION;

        }

    }


}
