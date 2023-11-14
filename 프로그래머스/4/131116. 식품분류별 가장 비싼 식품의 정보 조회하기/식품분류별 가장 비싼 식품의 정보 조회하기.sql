-- 코드를 입력하세요
SELECT F.CATEGORY
     , F.PRICE
     , F.PRODUCT_NAME
  FROM FOOD_PRODUCT F
  WHERE 1=1
    AND F.CATEGORY IN ('국', '과자', '김치', '식용유')
    AND (F.CATEGORY,F.PRICE) IN (SELECT IF.CATEGORY
                                     , MAX(IF.PRICE) AS PRICE
                                  FROM FOOD_PRODUCT IF
                                 WHERE 1=1
                                 GROUP BY IF.CATEGORY
                                 ) 
 ORDER BY F.PRICE DESC