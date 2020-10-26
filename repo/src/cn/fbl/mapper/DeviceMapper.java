package cn.fbl.mapper;

import cn.fbl.pojo.Device;
import cn.fbl.pojo.User;

import java.util.List;

public interface DeviceMapper {
    User login(User user);

    List<Device> findAll();

    Device toUpdate(int id);

    void update(Device update);

    void delete(int id);
}
