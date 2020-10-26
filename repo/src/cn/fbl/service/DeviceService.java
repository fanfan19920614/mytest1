package cn.fbl.service;

import cn.fbl.pojo.Device;
import cn.fbl.pojo.User;
import com.github.pagehelper.PageInfo;

public interface DeviceService {
    User login(User user);

    PageInfo<Device> findAll(int pageNum, int i);

    Device toUpdate(int id);


    void delete(int id);

    void update(Device device);
}
