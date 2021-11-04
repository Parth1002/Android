package com.example.pratical;

public class Employee {

    private String txtNotice;

    public Employee(){}

    public Employee(String txtNotice) {
        this.txtNotice = txtNotice;
    }

    public String getTxtNotice() {
        return txtNotice;
    }

    public void setTxtNotice(String txtNotice) {
        this.txtNotice = txtNotice;
    }
}
