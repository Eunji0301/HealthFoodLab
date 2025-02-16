package org.koreait.example.teamproject_healthfoodlab.vo;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PageMaker {

    private int displayPageNum = 10; // 페이지 목록 개수 (1~10, 11~20 ...)
    private int startPage; // 시작 페이지
    private int endPage; // 끝 페이지
    private int totalCount; // 전체 게시물 수

    private boolean prev; // 이전 버튼 활성화 여부
    private boolean next; // 다음 버튼 활성화 여부

    private SearchCriteria scri;

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        calcData(); // 페이지 계산
    }

    private void calcData() {
        // 끝 페이지 계산
        endPage = (int) (Math.ceil((double) scri.getPage() / displayPageNum) * displayPageNum);
        startPage = endPage - displayPageNum + 1;

        // 실제 마지막 페이지 계산
        int tempEndPage = (int) Math.ceil((double) totalCount / scri.getPerPageNum());
        if (endPage > tempEndPage) {
            endPage = tempEndPage;
        }

        // 이전, 다음 버튼 활성화 여부 설정
        prev = startPage > 1;
        next = endPage * scri.getPerPageNum() < totalCount;
    }
}