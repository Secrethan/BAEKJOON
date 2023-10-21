-- 코드를 입력하세요
SELECT A.NAME
     , A.DATETIME
  FROM (SELECT I.NAME
             , I.DATETIME
          FROM ANIMAL_INS I
         WHERE 1=1 
           AND I.ANIMAL_ID NOT IN (SELECT O.ANIMAL_ID
                                     FROM ANIMAL_OUTS O
                                  )
         ORDER BY I.DATETIME
       ) A
 WHERE 1=1
   AND ROWNUM <= 3
 
 