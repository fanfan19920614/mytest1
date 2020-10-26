package cn.fbl.controller;

import cn.fbl.pojo.Device;
import cn.fbl.pojo.User;
import cn.fbl.service.DeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request){
        User user1 = deviceService.login(user);
        if (user1!=null){
            request.getSession().setAttribute("user1",user1);
            return "redirect:/device/toShow.action";
        }
        request.getSession().setAttribute("error","用户名或密码错误，请重新输入");
        return "login";
    }
    @RequestMapping("/toShow")
    public String toShow(Model model,@RequestParam(required = true,defaultValue = "1")int pageNum) {
        PageInfo<Device> pageInfo = deviceService.findAll(pageNum,2);
        model.addAttribute("page",pageInfo);
        return "show";
    }
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Device device = deviceService.toUpdate(id);
        model.addAttribute("d",device);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Device device){
        deviceService.update(device);
        return "redirect:device/toShow.action";
    }
    @RequestMapping("/delete")
    public String delete(int id){
        deviceService.delete(id);
        return "redirect:toShow.action";
    }

}
