package com.example.demo.domain.vo;

import java.util.Date;

/**
 * @description:
 * @author: lam h
 * @date: 2023/11/07
 */
public class TargetVo {

    private String stringProperty;
    private long longProperty;
    private String stringConstant;
    private Integer integerConstant;

    private Long longWrapperConstant;

    private Date dateConstant;
    @Override
    public String toString() {
        return "TargetVo{" +
                "stringProperty='" + stringProperty + '\'' +
                ", longProperty=" + longProperty +
                ", stringConstant='" + stringConstant + '\'' +
                ", integerConstant=" + integerConstant +
                ", longWrapperConstant=" + longWrapperConstant +
                ", dateConstant=" + dateConstant +
                '}';
    }

    public String getStringProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
    }

    public long getLongProperty() {
        return longProperty;
    }

    public void setLongProperty(long longProperty) {
        this.longProperty = longProperty;
    }

    public String getStringConstant() {
        return stringConstant;
    }

    public void setStringConstant(String stringConstant) {
        this.stringConstant = stringConstant;
    }

    public Integer getIntegerConstant() {
        return integerConstant;
    }

    public void setIntegerConstant(Integer integerConstant) {
        this.integerConstant = integerConstant;
    }

    public Long getLongWrapperConstant() {
        return longWrapperConstant;
    }

    public void setLongWrapperConstant(Long longWrapperConstant) {
        this.longWrapperConstant = longWrapperConstant;
    }

    public Date getDateConstant() {
        return dateConstant;
    }

    public void setDateConstant(Date dateConstant) {
        this.dateConstant = dateConstant;
    }
}
