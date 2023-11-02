SELECT R.FOOD_TYPE
     , R.REST_ID
     , R.REST_NAME
     , R.FAVORITES
  FROM REST_INFO R
 WHERE 1=1
   AND (R.FAVORITES, R.FOOD_TYPE) IN (SELECT MAX(IR.FAVORITES)
                                         , IR.FOOD_TYPE
                                      FROM REST_INFO IR
                                     WHERE 1=1
                                     GROUP BY IR.FOOD_TYPE
                                    )
 ORDER BY R.FOOD_TYPE DESC