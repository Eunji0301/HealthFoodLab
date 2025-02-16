# DB 세팅
DROP TABLE IF EXISTS `teamproject_HealthFoodLab`;
CREATE DATABASE `teamproject_HealthFoodLab`;
USE `teamproject_HealthFoodLab`;

# 유저테이블 생성
CREATE TABLE USER (
                      uIdx INT AUTO_INCREMENT PRIMARY KEY,
                      uEmail VARCHAR(255) UNIQUE NOT NULL,
                      uPwd VARCHAR(50) NOT NULL,
                      uName VARCHAR(50) NOT NULL,
                      uGender CHAR(1) NOT NULL,
                      uBirth VARCHAR(10) NOT NULL,
                      uPhone VARCHAR(20) NOT NULL,
                      uNickName VARCHAR(20) UNIQUE NOT NULL,
                      uThumbnail TEXT,
                      uIp VARCHAR(50) NOT NULL,
                      uEnterDate DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,
                      uUpdateDate DATETIME,
                      uDelyn CHAR(1) DEFAULT ("N") NOT NULL,
                      uDelDate DATETIME,
                      uTOSAgree CHAR(1) DEFAULT("N") NOT NULL,
                      uPIPAgree CHAR(1) DEFAULT("N") NOT NULL,
                      uAdminPwd VARCHAR(50),
                      uRole ENUM('ADMIN', 'USER') NOT NULL,
                      uLevel INT DEFAULT 1 NOT NULL,
                      uExp INT DEFAULT 0 NOT NULL,
                      uMileage INT DEFAULT 0 NOT NULL,
                      uCreateAt DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL
);

#유저테이블 샘플데이터 생성
INSERT INTO USER (uEmail, uPwd, uName, uGender, uBirth, uPhone, uNickName, uThumbnail, uIp, uEnterDate, uDelyn, uTOSAgree, uPIPAgree, uRole, uLevel, uExp, uMileage, uCreateAt)
VALUES
    ('user1@example.com', 'password123', '홍길동', 'M', '1995-05-10', '010-1234-5678', 'GilDong', NULL, '192.168.1.1', NOW(), 'N', 'Y', 'Y', 'USER', 1, 100, 500, NOW()),
    ('user2@example.com', 'securepwd456', '김영희', 'F', '1998-12-25', '010-9876-5432', 'YoungHee', 'https://example.com/profile2.jpg', '192.168.1.2', NOW(), 'N', 'Y', 'N', 'USER', 2, 250, 1200, NOW()),
    ('admin@example.com', 'adminpass789', '관리자', 'M', '1980-07-15', '010-5555-6666', 'AdminUser', NULL, '192.168.1.3', NOW(), 'N', 'Y', 'Y', 'ADMIN', 10, 5000, 10000, NOW());

#카드뉴스테이블 생성
CREATE TABLE CARDNEWS (
                          cnIdx INT AUTO_INCREMENT PRIMARY KEY,            -- 건강정보 게시글 인덱스 (PK)
                          cnTitle TEXT NOT NULL,                           -- 건강정보 게시글 제목
                          cnFilename VARCHAR(255) NOT NULL,                 -- 건강정보 게시글 파일 이름 (예: example.jpeg)
                          cnWriter VARCHAR(50) NOT NULL,                   -- 작성자
                          cnContact VARCHAR(20) NOT NULL,                  -- 연락처
                          cnImage VARCHAR(255) NOT NULL,                   -- 건강정보 게시글 이미지 경로 (예: /images/example.jpeg)
                          cnWriteDay DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,  -- 건강정보 게시글 작성 날짜
                          cnDelyn CHAR(1) DEFAULT 'N' NOT NULL,            -- 건강정보 게시글 삭제 여부
                          cnDelDate DATETIME,                              -- 건강정보 게시글 삭제 날짜
                          cnModifyDate DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL, -- 건강정보 게시글 수정 날짜
                          cnCreateAt DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL,  -- 해당 정보 생성 날짜
                          uIdx INT,                                        -- 유저 인덱스 (FK)
                          FOREIGN KEY (uIdx) REFERENCES USER(uIdx)         -- USER 테이블과 연결
);

#카드뉴스테이블 샘플데이터 생성
INSERT INTO CARDNEWS (cnTitle, cnFilename, cnWriter, cnContact, cnImage, cnWriteDay, cnDelyn, cnModifyDate, cnCreateAt, uIdx)
VALUES
    ('건강 관리 팁 1', 'tip1.jpeg', '홍길동', '010-1234-5678', '/images/tip1.jpeg', '2025-02-09 10:00:00', 'N', '2025-02-09 10:00:00', '2025-02-09 10:00:00', 3),
    ('운동으로 건강 지키기', 'exercise.jpeg', '김철수', '010-2345-6789', '/images/exercise.jpeg', '2025-02-09 11:00:00', 'N', '2025-02-09 11:00:00', '2025-02-09 11:00:00', 3),
    ('영양소와 건강', 'nutrition.jpeg', '이영희', '010-3456-7890', '/images/nutrition.jpeg', '2025-02-09 12:00:00', 'N', '2025-02-09 12:00:00', '2025-02-09 12:00:00', 3),
    ('스트레스 관리 방법', 'stress_management.jpeg', '박준호', '010-4567-8901', '/images/stress_management.jpeg', '2025-02-09 13:00:00', 'N', '2025-02-09 13:00:00', '2025-02-09 13:00:00', 3),
    ('건강한 식습관', 'healthy_diet.jpeg', '최민지', '010-5678-9012', '/images/healthy_diet.jpeg', '2025-02-09 14:00:00', 'N', '2025-02-09 14:00:00', '2025-02-09 14:00:00', 3);