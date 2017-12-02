package com.kars.mybot.Enum;

public enum ResultEnum {

    OK("1", "성공"),
    NG("2", "실패");

    private String value;

    private String label;



    ResultEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
