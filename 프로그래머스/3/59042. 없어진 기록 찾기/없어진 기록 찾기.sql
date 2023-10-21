-- 코드를 입력하세요
SELECT O.ANIMAL_ID
     , O.NAME
  FROM ANIMAL_OUTS O
 WHERE 1=1
   AND O.ANIMAL_ID NOT IN (SELECT ANIMAL_ID
                             FROM ANIMAL_INS I
                          ) 
 ORDER BY O.ANIMAL_ID