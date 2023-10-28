SELECT A.ANIMAL_ID
     , A.NAME
  FROM (SELECT O.ANIMAL_ID
             , O.NAME
          FROM ANIMAL_INS I
             , ANIMAL_OUTS O
         WHERE 1=1
          AND O.ANIMAL_ID = I.ANIMAL_ID
          AND O.ANIMAL_ID IS NOT NULL
        
         ORDER BY O.DATETIME - I.DATETIME DESC
      ) A
 WHERE 1=1
   AND ROWNUM <= 2  