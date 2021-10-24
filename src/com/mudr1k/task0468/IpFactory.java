package com.mudr1k.task0468;

public class IpFactory {

    public static AbstractIp getIp(String ip) {
        if (ip.contains(".")) {
            return new IPv4(ip);
        } else {
            return new IPv6(ip);
        }
    }
}
