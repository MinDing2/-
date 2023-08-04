SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD,'YYYY-MM-DD') AS HIRE_YMD
from DOCTOR  
where MCDP_CD='CS' or MCDP_CD='GS'
order by HIRE_YMD DESC, DR_NAME ASC;