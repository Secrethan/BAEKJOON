-- 코드를 입력하세요
SELECT p1.PT_NAME
     , p1.PT_NO
     , p1.GEND_CD
     , p1.AGE
     , CASE  WHEN p1.TLNO IS NULL
        THEN 'NONE'
        ELSE p1.TLNO
       END
  FROM PATIENT p1
 WHERE 1=1
   AND p1.AGE < 13
   AND p1.GEND_CD = 'W'
ORDER BY p1.AGE DESC, p1.PT_NAME ASC