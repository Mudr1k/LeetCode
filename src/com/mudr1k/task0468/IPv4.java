package com.mudr1k.task0468;

public class IPv4 extends AbstractIp {

    public IPv4(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean checkSection(String s) {
        if (s.startsWith("0") && s.length() != 1) {
            return false;
        }
        return Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 255;
    }

    @Override
    public String getName() {
        return "IPv4";
    }

    @Override
    public String getSeparatorRegex() {
        return "\\.";
    }

    @Override
    public char getSeparatorFilter() {
        return '.';
    }

    @Override
    public int getCountSections() {
        return 4;
    }
}
