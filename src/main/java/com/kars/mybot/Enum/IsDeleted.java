package com.kars.mybot.Enum;

public enum IsDeleted {

    USING("1", "사용중"),
    DELETED("2", "삭제됨");

    private String value;

    private String label;



    IsDeleted(String value, String label) {
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
