-- 코드를 입력하세요
SELECT a1.ANIMAL_ID
     , a1.NAME
     , (CASE WHEN a1.SEX_UPON_INTAKE IN('Neutered Male', 'Spayed Female') THEN 'O'
        ELSE 'X'
        END
       ) as 중성화
  FROM ANIMAL_INS a1
 WHERE 1=1
 ORDER BY a1.ANIMAL_ID
 ;