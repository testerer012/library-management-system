package com.library;

public class Member {
    private String name;
    private String address;
    private boolean membershipStatus;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
        this.membershipStatus = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(boolean membershipStatus) {
        this.membershipStatus = membershipStatus;
    }
}