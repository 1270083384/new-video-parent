package com.qf.controller;

import com.qf.pojo.Admin;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("login")
    public String login(Admin admin, HttpServletRequest request) {
        admin = adminService.selectAdminByUsernameAndPassword(admin);
        if (null != admin) {
            HttpSession session = request.getSession();
            session.setAttribute("userName",admin.getUsername());
            return "success";
        } else {
            return "failed";
        }
    }
}
