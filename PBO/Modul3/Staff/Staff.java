package Modul3.Staff;

import Modul3.User;

public class Staff extends User {
    private String NIK;

    public Staff(String name, String address, String TTL, String telephone, String status, String NIK) {
        super(name, address, TTL, telephone, status);
        this.NIK = "987654321";
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public int getSalary() {
        return 0;
    }
}
