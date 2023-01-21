package com.example.enums;

public enum MonitorEnum {

    MONITOR01("MONITOR01"),
    MONITOR02("MONITOR02");

    private String monitor;

    MonitorEnum(String monitor) {
        this.monitor = monitor.toUpperCase();
    }

    public String getValue() {
        return this.monitor;
    }

    public static MonitorEnum getByName(String monitor) {

        for(MonitorEnum v : values()) {
            if( v.getValue().equals(monitor.toUpperCase())) {
                return v;
            }
        }

        return null;
    }

}
