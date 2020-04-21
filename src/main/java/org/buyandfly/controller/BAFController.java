package org.buyandfly.controller;

import org.buyandfly.dao.DeviceDao;
import org.buyandfly.dao.IDao;
import org.buyandfly.model.Device;
import org.buyandfly.service.DeviceService;
import org.buyandfly.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BAFController {

    private IService<Device> deviceService;
    private int devicesCount;

    @Autowired
    public void setDeviceService(final IService<Device> deviceService) {
        this.deviceService = deviceService;
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
}