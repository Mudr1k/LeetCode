package com.mudr1k.task0468;

public class IPv6 extends AbstractIp {
    public IPv6(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean checkSection(String s) {
        if (s.length() >= 1 && s.length() <= 4) {
            return Integer.parseInt(s, 16) >= 0 && Integer.parseInt(s, 16) <= 0xFFFF;
        }
        return false;
    }

    @Override
    public String getName() {
        return "IPv6";
    }

    @Override
    public String getSeparatorRegex() {
        return "\\:";
    }

    @Override
    public char getSeparatorFilter() {
        return ':';
    }

    @Override
    public int getCountSections() {
        return 8;
    }
}
