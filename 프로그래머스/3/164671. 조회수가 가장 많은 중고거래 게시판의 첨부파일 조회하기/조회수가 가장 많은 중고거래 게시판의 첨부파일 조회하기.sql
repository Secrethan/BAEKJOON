-- 코드를 입력하세요
SELECT '/home/grep/src/'||F.BOARD_ID||'/'||F.FILE_ID||F.FILE_NAME||F.FILE_EXT
  FROM USED_GOODS_FILE F
 WHERE 1=1
   AND F.BOARD_ID =(SELECT IB.BOARD_ID
                      FROM (SELECT ROW_NUMBER() OVER(ORDER BY B.VIEWS DESC) AS VIEWS
                                 , B.BOARD_ID
                              FROM USED_GOODS_BOARD B 
                           ) IB
                      WHERE 1=1
                        AND VIEWS = 1
                    )
 ORDER BY F.FILE_ID DESC