package cn.fbl.service;

import cn.fbl.mapper.DeviceMapper;
import cn.fbl.pojo.Device;
import cn.fbl.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServicelmpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;
    @Override
    public User login(User user) {
        return deviceMapper.login(user);
    }

    @Override
    public PageInfo<Device> findAll(int pageNum, int i) {
        PageHelper.startPage(pageNum,i);
        List<Device> dlist=deviceMapper.findAll();
        PageInfo<Device> pageInfo = new PageInfo<>(dlist);
        return pageInfo;
    }

    @Override
    public Device toUpdate(int id) {
        return deviceMapper.toUpdate(id);
    }



    @Override
    public void delete(int id) {
        deviceMapper.delete(id);
    }

    @Override
    public void update(Device device) {
        deviceMapper.update(device);
    }
}
