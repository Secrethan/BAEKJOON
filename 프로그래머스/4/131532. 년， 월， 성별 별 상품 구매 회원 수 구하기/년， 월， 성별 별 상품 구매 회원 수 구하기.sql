-- 코드를 입력하세요
SELECT V.YEAR
     , V.MONTH * 1 AS MONTH
     , V.GENDER
     , COUNT(1) AS USERS
  FROM (SELECT DISTINCT TO_CHAR(O.SALES_DATE,'YYYY') AS YEAR
                      , TO_CHAR(O.SALES_DATE,'MM')  AS MONTH
                      , U.GENDER
                      , U.USER_ID
                   FROM ONLINE_SALE O
                      , USER_INFO U
                  WHERE 1=1
                    AND O.USER_ID = U.USER_ID
                    AND U.GENDER IS NOT NULL
        ) V
 WHERE 1=1
 GROUP BY V.YEAR, V.MONTH, V.GENDER
 ORDER BY V.YEAR, V.MONTH, V.GENDER