package org.koreait.example.teamproject_healthfoodlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrCardNewsController {
    @RequestMapping("/usr/cardnews/cardNewsList")
    public String showCardNewsList() {
        return "usr/cardnews/cardNewsList";
    }

    @RequestMapping("/usr/cardnews/cardNewsContents")
    public String showCardNewsContents() {
        return "usr/cardnews/cardNewsContents";
    }
}
