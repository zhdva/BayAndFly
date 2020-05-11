package org.buyandfly.controller;

import org.buyandfly.model.Device;
import org.buyandfly.model.User;
import org.buyandfly.service.DeviceService;
import org.buyandfly.service.IDeviceService;
import org.buyandfly.service.IUserService;
import org.buyandfly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@SessionAttributes(value = "user")
public class BAFController {

    private IDeviceService deviceService;
    private IUserService userService;
    private int devicesCount;

    @Autowired
    public void setServices(final IDeviceService deviceService, final IUserService userService) {
        this.deviceService = deviceService;
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("baf");
        return modelAndView;
    }

    @GetMapping(value = "/catalog")
    public ModelAndView catalogPage() {
        List<Device> devices = deviceService.getAll();
        devicesCount = devices.size();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("catalog");
        modelAndView.addObject("devices", devices);
        modelAndView.addObject("devicesCount", devicesCount);
        return modelAndView;
    }

    @GetMapping(value = "/contacts")
    public ModelAndView contactsPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contacts");
        return modelAndView;
    }

    @GetMapping(value = "/about")
    public ModelAndView aboutPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

    @GetMapping(value = "/register")
    public ModelAndView registerPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @PostMapping(value = "/register")
    public ModelAndView registerUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        user.setType("client");
        userService.add(user);
        return modelAndView;
    }

    @PostMapping(value = "/login")
    public ModelAndView loginUser(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user.getLogin());
        User loginUser = userService.getByLogin(user.getLogin());
        modelAndView.addObject("user", loginUser);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @ModelAttribute
    public User createUser(){
        return new User();
    }

    @GetMapping(value = "/cabinet")
    public ModelAndView cabinetPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cabinet");
        return modelAndView;
    }

}