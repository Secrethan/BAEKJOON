-- CART_PRODUCTS
/*
ID	INT        pk     
CART_ID	INT
NAME	VARCHAR
PRICE	INT
*/
SELECT DISTINCT 
       C1.CART_ID
  FROM (SELECT C1.ID
             , C1.CART_ID
             , C1.NAME
          FROM CART_PRODUCTS C1
         WHERE 1=1
           AND C1.NAME = 'Milk'
       ) C1
     , (SELECT C2.ID
             , C2.CART_ID
             , C2.NAME
         FROM CART_PRODUCTS C2
        WHERE 1=1
          AND C2.NAME = 'Yogurt' 
      ) C2
 WHERE 1=1
   AND C1.CART_ID = C2.CART_ID 
 ORDER BY C1.CART_ID 

           ;