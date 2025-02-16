package org.koreait.example.teamproject_healthfoodlab.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.koreait.example.teamproject_healthfoodlab.utils.UploadFileUtiles;
import org.koreait.example.teamproject_healthfoodlab.utils.UserIp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminCardNewsController {
//    @Resource(name="uploadPath")
//    private String uploadPath;


    private UserIp userIp;

    @RequestMapping("/adm/cardnews/cardNewsList")
    public String showCardNewsList() {
        return "adm/cardnews/cardNewsList";
    }

    @RequestMapping("/adm/cardnews/cardNewsModify")
    public String showCardNewsModify() {
        return "adm/cardnews/cardNewsModify";
    }

    @RequestMapping("/adm/cardnews/cardNewsWrite")
    public String showCardNewsWrite() {
        return "adm/cardnews/cardNewsWrite";
    }

//    @RequestMapping(value="cardNewsWriteAction.do")
//    public String showCardNewsWriteAction(@RequestParam("attachfile") MultipartFile attachfile, HttpServletRequest request, RedirectAttributes rttr) throws Exception {
//        System.out.println("cardNewsWriteAction 들어옴");
//
//        MultipartFile file = attachfile;
//        String uploadedFileName = "";
//
//        if(!file.getOriginalFilename().equals("")) {
//            uploadedFileName = UploadFileUtiles.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes());
//        }
//
//        String ip = userIp.getUserIp(request);
//
//        return "adm/cardnews/cardNewsWrite";
//    }
}
