package com.netcracker.dao.beans;

import java.sql.Date;

public class Reservation {
    private int id;
    private User user;
    private int roomNumber;
    private Date dateIn, dateOut;
    private int daysCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (id != that.id) return false;
        if (roomNumber != that.roomNumber) return false;
        if (daysCount != that.daysCount) return false;
        if (!user.equals(that.user)) return false;
        if (!dateIn.equals(that.dateIn)) return false;
        return dateOut.equals(that.dateOut);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user.hashCode();
        result = 31 * result + roomNumber;
        result = 31 * result + dateIn.hashCode();
        result = 31 * result + dateOut.hashCode();
        result = 31 * result + daysCount;
        return result;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", user=" + user +
                ", roomNumber=" + roomNumber +
                ", dateIn=" + dateIn +
                ", dateOut=" + dateOut +
                ", daysCount=" + daysCount +
                '}';
    }
}
