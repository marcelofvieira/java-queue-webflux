package com.example.enums;

public enum ConfigMonitorEnum {

    CONFIG01("CONFIG01"),
    CONFIG02("CONFIG02"),
    CONFIG03("CONFIG03");

    private String config;

    ConfigMonitorEnum(String config) {
        this.config = config.toUpperCase();
    }

    public String getValue() {
        return this.config;
    }

    public static ConfigMonitorEnum getByName(String monitor) {

        for(ConfigMonitorEnum v : values()) {
            if( v.getValue().equals(monitor.toUpperCase())) {
                return v;
            }
        }

        return null;
    }

}
