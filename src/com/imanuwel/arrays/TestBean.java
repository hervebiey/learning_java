package com.imanuwel.arrays;

import java.util.Objects;

public class TestBean {
    private int i;
    private String str;

    public TestBean(int i, String str) {
        this.i = i;
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestBean testBean = (TestBean) o;
        return getI() == testBean.getI() && getStr().equals(testBean.getStr());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getI(), getStr());
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
