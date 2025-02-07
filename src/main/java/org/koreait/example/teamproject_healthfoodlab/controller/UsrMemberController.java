package org.koreait.example.teamproject_healthfoodlab.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.koreait.example.teamproject_healthfoodlab.utils.Ut;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrMemberController {
    @RequestMapping("/usr/member/activityInformation")
    public String showActivityInformation() {
        return "usr/member/activityInformation";
    }

    @RequestMapping("/usr/member/informationModify")
    public String showInformationModify() {
        return "usr/member/informationModify";
    }
    
}
