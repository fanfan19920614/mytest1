package cn.fbl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Device {
    private int id;
    private String devicename;
    private double price;
    private String detail;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    private int userid;
    private String username;

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", devicename='" + devicename + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", createtime=" + createtime +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
