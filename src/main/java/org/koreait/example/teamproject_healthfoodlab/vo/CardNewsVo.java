package org.koreait.example.teamproject_healthfoodlab.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardNewsVo {
    private int cnIdx;
    private String cnTitle;
    private String cnFilename;
    private String cnWriter;
    private String cnContact;
    private String cnImage;
    private String cnWriteDay;
    private String cnDelyn;
    private String cnDelDate;
    private String cnModifyDate;
    private String cnCreateAt;
}
