package org.koreait.example.teamproject_healthfoodlab.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.koreait.example.teamproject_healthfoodlab.vo.CardNewsVo;

import java.util.List;

@Mapper
public interface CardNewsRepository {
    // 카드뉴스 목록 조회
    @Select("""
        SELECT * FROM CARDNEWS
        WHERE cnDelyn = 'N'
        ORDER BY cnWriteDay DESC
        LIMIT #{startPageNum}, #{perPageNum}
    """)
    List<CardNewsVo> findAll(@Param("startPageNum") int startPageNum, @Param("perPageNum") int perPageNum);

//    // 카드뉴스 상세 조회
//    @Select("SELECT * FROM CARDNEWS WHERE cnIdx = #{cnIdx}")
//    CardNewsVo findById(@Param("cnIdx") int cnIdx);

//    // 카드뉴스 추가
//    @Insert("""
//        INSERT INTO cardnews (title, content, image_url)
//        VALUES (#{title}, #{content}, #{imageUrl})
//    """)
//    @Options(useGeneratedKeys = true, keyProperty = "cnIdx")
//    void insert(CardNewsVo cardNews);
//
//    // 카드뉴스 삭제 (논리적 삭제)
//    @Update("UPDATE cardnews SET cnDelyn = 'Y' WHERE cn_idx = #{cnIdx}")
//    void delete(@Param("cnIdx") int cnIdx);
}
