-- 코드를 입력하세요
SELECT A1.ANIMAL_ID
     , A1.NAME
     , A1.SEX_UPON_INTAKE
  FROM ANIMAL_INS A1
 WHERE 1=1
 --AND A1.NAME IN('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
   AND REGEXP_LIKE(A1.NAME, '^(Lucy|Ella|Pickle|Rogan|Sabrina|Mitty)$')
  ORDER BY A1.ANIMAL_ID