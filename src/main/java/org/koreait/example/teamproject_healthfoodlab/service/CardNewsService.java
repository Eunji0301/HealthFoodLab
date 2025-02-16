package org.koreait.example.teamproject_healthfoodlab.service;

import org.koreait.example.teamproject_healthfoodlab.repository.CardNewsRepository;
import org.koreait.example.teamproject_healthfoodlab.vo.CardNewsVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardNewsService {
    private final CardNewsRepository cardNewsRepository;

    public CardNewsService(CardNewsRepository cardNewsRepository) {
        this.cardNewsRepository = cardNewsRepository;
    }

    // 카드뉴스 목록 조회
    public List<CardNewsVo> getAllCardNews(int startPageNum, int perPageNum) {
        return cardNewsRepository.findAll(startPageNum, perPageNum);
    }

//    // 카드뉴스 상세 조회
//    public CardNewsVo getCardNewsById(int cnIdx) {
//        return cardNewsRepository.findById(cnIdx);
//    }
//
//    // 카드뉴스 추가
//    public void addCardNews(CardNewsVo cardNews) {
//        cardNewsRepository.insert(cardNews);
//    }
//
//    // 카드뉴스 삭제
//    public void removeCardNews(int cnIdx) {
//        cardNewsRepository.delete(cnIdx);
//    }
}
