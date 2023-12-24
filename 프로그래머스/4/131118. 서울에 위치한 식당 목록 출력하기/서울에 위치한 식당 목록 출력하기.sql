-- 코드를 입력하세요
SELECT R.REST_ID
     , I.REST_NAME
     , I.FOOD_TYPE
     , I.FAVORITES
     , I.ADDRESS
     , ROUND(AVG(R.REVIEW_SCORE),2)AS SCORE
  FROM REST_INFO I
     , REST_REVIEW R
 WHERE 1=1
   AND I.REST_ID = R.REST_ID
   AND I.ADDRESS LIKE '서울%'
 GROUP BY R.REST_ID , I.REST_NAME , I.FOOD_TYPE , I.FAVORITES , I.ADDRESS
 ORDER BY SCORE DESC, I.FAVORITES DESC
 ;