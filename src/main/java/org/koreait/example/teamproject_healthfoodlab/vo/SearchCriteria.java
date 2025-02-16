package org.koreait.example.teamproject_healthfoodlab.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true) // 부모 클래스(Criteria)와 비교 가능하도록 설정
public class SearchCriteria extends Criteria {
    private String search;  // 검색 옵션 (예: 제목, 내용, 작성자 등)
    private String keyword; // 검색어

    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}