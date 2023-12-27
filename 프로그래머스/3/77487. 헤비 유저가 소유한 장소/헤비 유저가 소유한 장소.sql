-- 코드를 입력하세요
SELECT P.ID
     , P.NAME
     , P.HOST_ID
  FROM PLACES P
 WHERE 1=1
   AND P.HOST_ID IN (SELECT IP.HOST_ID
                      FROM PLACES IP
                     WHERE 1=1
                     GROUP BY IP.HOST_ID
                     HAVING COUNT(IP.HOST_ID) > 1
                     )
 ORDER BY P.ID

