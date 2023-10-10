-- 코드를 입력하세요
SELECT p1.PT_NAME
     , p1.PT_NO
     , p1.GEND_CD
     , p1.AGE
     , CASE  WHEN p1.TLNO IS NULL
        THEN 'NONE'
        ELSE p1.TLNO
       END as TLNO
  FROM (SELECT ip1.PT_NAME
             , ip1.PT_NO
             , ip1.GEND_CD
             , ip1.AGE
             , ip1.TLNO
          FROM PATIENT ip1
         WHERE 1=1
           AND ip1.GEND_CD = 'W'
           AND ip1.AGE < 13
       ) p1
 WHERE 1=1
ORDER BY p1.AGE DESC, p1.PT_NAME ASC