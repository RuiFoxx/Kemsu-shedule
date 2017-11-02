package com.testsb.controllers;

import com.testsb.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
    private GroupService groupService;

    @Autowired
    public void setGroupService(GroupService groupService) {
        this.groupService = groupService;
    }

    @RequestMapping("/")
    public String showMainPage(Model model) {
        Integer id = 4;
        model.addAttribute("first_name", groupService.getById(id).getFirst_name());
        model.addAttribute("last_name", groupService.getById(id).getLast_name());
        return "startPage";
    }
}
