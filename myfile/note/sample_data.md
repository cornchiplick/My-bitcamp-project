전시 첨부 티켓

insert into jang_search(KWD) values('lake');

insert into jang_so(PLNO, PLNAME, QCALL, POSTNO, BASICAD, DETAILAD, WIDO, KDO) 
 VALUES(3, 'Seoul National University', '0261102281', '08787', 'Gwanak-gu, Seoul, Republic of Korea', '1822, Nambusunhwan-ro', '37.481280902223006', '126.95270867757853');

insert into jang_exhibition(EXNO, EXNAME, CONT, PLNO, STDATE, EDDATE, PRICE) 
 VALUES(1, 'Limdonghyun Comedy Show', 'hello, im find thank you', 3, '20221006', '20221010', 50);

insert into jang_exhibition_file(EXFNO, PATH, EXNO) 
 VALUES(1, '/exhibition/file', 1);

insert into jang_exhibition_review(RVNO, CONT, ID, EXNO) 
 VALUES(1, 'oh...god...', 'user1', 1);

insert into jang_ticket(EXTKNO, ID, EXNO, CNT, PAYMENT) 
 VALUES(1, 'user1', 1, 2, 'kakaopay');