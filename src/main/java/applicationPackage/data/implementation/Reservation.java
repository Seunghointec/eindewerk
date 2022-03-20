package applicationPackage.data.implementation;

import java.util.Date;

public class Reservation {

    private final int expiryMins=30;
    private int resID;
    private Date resTime;
    private boolean isValid;
    private int paxSize;
    private String name;
    private String contactNo;
    private Table assignedTable;
    private String memberID;

    public Reservation(int resID, Date resTime, boolean isValid, int paxSize, String name, String contactNo) {
        this.resID = resID;
        this.resTime = resTime;
        this.isValid = isValid;
        this.paxSize = paxSize;
        this.name = name;
        this.contactNo = contactNo;
    }

    public Reservation(int resID, Date resTime, boolean isValid, int paxSize, String name, String contactNo,
                       Table assignedTable, String memberID) {
        this.resID = resID;
        this.resTime = resTime;
        this.isValid = isValid;
        this.paxSize = paxSize;
        this.name = name;
        this.contactNo = contactNo;
        this.assignedTable = assignedTable;
        this.memberID = memberID;
    }

    public int getExpiryMins() {
        return expiryMins;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public Date getResTime() {
        return resTime;
    }

    public void setResTime(Date resTime) {
        this.resTime = resTime;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getPaxSize() {
        return paxSize;
    }

    public void setPaxSize(int paxSize) {
        this.paxSize = paxSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Table getAssignedTable() {
        return assignedTable;
    }

    public void setAssignedTable(Table assignedTable) {
        this.assignedTable = assignedTable;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }


}
