package org.koreait.example.teamproject_healthfoodlab.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Criteria {
    private int page = 1;         // 기본 페이지 번호 (1페이지)
    private int perPageNum = 4;   // 페이지당 게시물 수 (기본 5개)

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPageNum() {
        return perPageNum;
    }

    public void setPerPageNum(int perPageNum) {
        this.perPageNum = perPageNum;
    }
}