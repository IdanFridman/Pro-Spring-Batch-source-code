package com.apress.springbatch.statement.domain;

public enum TransactionType {
    STOCK(0), FEE(1), UNDEFINED(-1);
    
    private int value;
    
    private TransactionType(int value) {
        this.value = value;
    }
    
    public int toIntValue() {
        return value;
    }
    
    public TransactionType fromIntValue(int value) {
        switch (value) {
        case 0:
            return STOCK;
        case 1:
            return FEE;
        default:
            return UNDEFINED;
        }
    }
}