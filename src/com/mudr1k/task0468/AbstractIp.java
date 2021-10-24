package com.mudr1k.task0468;

public abstract class AbstractIp {
    String ip;

    public abstract String getName();

    public abstract String getSeparatorRegex();

    public abstract char getSeparatorFilter();

    public abstract int getCountSections();

    public abstract boolean checkSection(String s);

    public String check() {
        try {
            long count = ip.chars().filter(ch -> ch == getSeparatorFilter()).count();
            if (count != getCountSections() - 1) {
                return "Neither";
            }
            String[] array;
            array = ip.split(getSeparatorRegex());
            if (array.length != getCountSections()) {
                return "Neither";
            } else {
                for (String s : array) {
                    if (!checkSection(s)) {
                        return "Neither";
                    }
                }
                return getName();
            }
        } catch (Exception ex) {
            return "Neither";
        }
    }
}
