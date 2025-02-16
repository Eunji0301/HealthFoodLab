package org.koreait.example.teamproject_healthfoodlab.controller;

import jakarta.annotation.Resource;
import org.koreait.example.teamproject_healthfoodlab.vo.CardNewsVo;
import org.koreait.example.teamproject_healthfoodlab.vo.PageMaker;
import org.koreait.example.teamproject_healthfoodlab.vo.SearchCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsrCardNewsController {
    private static final Logger logger = LoggerFactory.getLogger(UsrCardNewsController.class);

    @RequestMapping("/usr/cardnews/cardNewsList")
    public String showCardNewsList() {
        return "usr/cardnews/cardNewsList";
    }

    @RequestMapping("/usr/cardnews/cardNewsContents")
    public String showCardNewsContents() {
        return "usr/cardnews/cardNewsContents";
    }

//    @RequestMapping(value = "/usr/cardnews/cardNewsList")
//    public String cardNewsList(SearchCriteria scri, Model model) {
//        logger.info("cardNewsList 실행");
//
//        // PageMaker 객체를 생성하여 scri와 cnt를 설정
//        PageMaker pm = new PageMaker(); // PageMaker 객체 생성
//        pm.setScri(scri); // scri 설정
//        int cnt = cardNewsService.cardNewsTotalCount(scri); // 총 게시글 수 조회
//        pm.setTotalCount(cnt); // 전체 게시글 수 설정
//
//        // 카드뉴스 목록 조회
//        ArrayList<CardNewsVo> cnList = cardNewsService.cardNewsSelectAll(scri);
//
//        // 모델에 카드뉴스 목록과 PageMaker 객체 추가
//        model.addAttribute("cnList", cnList);
//        model.addAttribute("pm", pm);
//
//        return "usr/cardnews/cardNewsList"; // JSP 페이지 경로
//    }



}
