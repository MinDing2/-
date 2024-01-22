-- 코드를 입력하세요
-- BOOK_ID, CATEGORY, AUTHOR_ID, PRICE, PUBLISHED_DATE 
-- 
SELECT book_id,TO_CHAR(published_date, 'YYYY-MM-DD')
FROM BOOK
WHERE CATEGORY = '인문' AND
TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') BETWEEN '2021-01-01' AND '2021-12-31'
ORDER BY PUBLISHED_DATE ASC;



