/*
FIRST_HALF - 상반기 주문 정보
    SHIPMENT_ID	INT(N) 	
    FLAVOR	VARCHAR(N)	PK
    TOTAL_ORDER	INT(N) -- 상반기 총 주문량 
    
JULY - 7월의 아이스크림 주문 정보
    SHIPMENT_ID	INT(N)	FK
    FLAVOR	VARCHAR(N)	
    TOTAL_ORDER	INT(N) -- 7월까지 총 주문량 
    
    :::: 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회
*/
/*
SELECT A.FLAVOR
  FROM ( SELECT SUM(NVL(F.TOTAL_ORDER, 0)) + SUM(J.TOTAL_ORDER) AS FLAVOR
           FROM FIRST_HALF F
              , JULY J
         WHERE 1=1 
           --AND J.FLAVOR = 'strawberry'
           AND F.SHIPMENT_ID (+)= J.SHIPMENT_ID
         GROUP BY J.FLAVOR
         ORDER BY SUM(NVL(F.TOTAL_ORDER, 0)) + SUM(J.TOTAL_ORDER) DESC
       ) A
 WHERE 1=1
;
*/

SELECT A.FLAVOR
  FROM (SELECT SUM(NVL(F.TOTAL_ORDER, 0)) + SUM(J.TOTAL_ORDER) AS TOTAL
             , J.FLAVOR
             , ROW_NUMBER() 
                OVER(ORDER BY SUM(NVL(F.TOTAL_ORDER, 0)) + SUM(J.TOTAL_ORDER)DESC) AS RANK
          FROM FIRST_HALF F
             , JULY J
         WHERE 1=1 
           AND F.SHIPMENT_ID (+)= J.SHIPMENT_ID
         GROUP BY J.FLAVOR
         ORDER BY SUM(NVL(F.TOTAL_ORDER, 0)) + SUM(J.TOTAL_ORDER) DESC
       ) A
 WHERE 1=1
   AND A.RANK < 4
