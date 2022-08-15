-- 1)test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

-- 2)Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

-- 3)Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

-- 4)Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

-- 1)
CREATE TABLE employee(
id SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
birthday DATE NOT NULL,
email VARCHAR(100) NOT NULL
--	);

-- 2)
insert into employee (name, birthday, email) values ('Glyn', '1988-01-06', 'ggrundwater0@virginia.edu');
insert into employee (name, birthday, email) values ('Mathew', '1988-09-18', 'mockwell1@ca.gov');
insert into employee (name, birthday, email) values ('Nisse', '1961-02-08', 'nprendergrast2@angelfire.com');
insert into employee (name, birthday, email) values ('Aldous', '1986-09-25', 'avicent3@virginia.edu');
insert into employee (name, birthday, email) values ('Vincenty', '1998-07-18', 'vdudding4@washingtonpost.com');
insert into employee (name, birthday, email) values ('Matty', '1996-04-11', 'meverly5@1688.com');
insert into employee (name, birthday, email) values ('Magnum', '1954-06-26', 'mfurzer6@live.com');
insert into employee (name, birthday, email) values ('Lon', '1982-11-11', 'lrosbotham7@economist.com');
insert into employee (name, birthday, email) values ('Filippa', '2003-09-21', 'fdaughton8@msn.com');
insert into employee (name, birthday, email) values ('Nisse', '1977-08-23', 'naronowicz9@yale.edu');
insert into employee (name, birthday, email) values ('Bowie', '1977-08-07', 'bbaldwina@columbia.edu');
insert into employee (name, birthday, email) values ('Joana', '1986-09-26', 'jbarukhb@sitemeter.com');
insert into employee (name, birthday, email) values ('Kim', '1977-12-16', 'kmccrainec@qq.com');
insert into employee (name, birthday, email) values ('Amelita', '1966-02-03', 'asweetloved@hhs.gov');
insert into employee (name, birthday, email) values ('Stormi', '2000-12-13', 'scopyne@princeton.edu');
insert into employee (name, birthday, email) values ('Sanders', '1967-04-16', 'staillf@github.io');
insert into employee (name, birthday, email) values ('Dorree', '1960-04-19', 'dgeydong@bigcartel.com');
insert into employee (name, birthday, email) values ('Sly', '1983-04-27', 'saldgateh@lulu.com');
insert into employee (name, birthday, email) values ('Nevile', '1990-03-26', 'nmurpheyi@mlb.com');
insert into employee (name, birthday, email) values ('Kym', '1957-04-13', 'kpavesej@upenn.edu');
insert into employee (name, birthday, email) values ('Den', '1998-03-21', 'dpoilek@netvibes.com');
insert into employee (name, birthday, email) values ('Jessee', '1967-04-25', 'jmoloneyl@oakley.com');
insert into employee (name, birthday, email) values ('Mindy', '2002-06-14', 'myoseloffm@delicious.com');
insert into employee (name, birthday, email) values ('Hinze', '1954-05-06', 'hdomonkosn@apache.org');
insert into employee (name, birthday, email) values ('Derrik', '1961-03-18', 'dfilshino@imageshack.us');
insert into employee (name, birthday, email) values ('Ogdan', '1981-05-14', 'oseeleyp@indiatimes.com');
insert into employee (name, birthday, email) values ('Archibaldo', '1955-10-05', 'aisaacsonq@chicagotribune.com');
insert into employee (name, birthday, email) values ('Yankee', '1964-11-28', 'ytomsar@google.ru');
insert into employee (name, birthday, email) values ('Justine', '1983-01-18', 'jlordens@nbcnews.com');
insert into employee (name, birthday, email) values ('Sidonnie', '1985-06-28', 'shirchet@163.com');
insert into employee (name, birthday, email) values ('Ogden', '1984-12-12', 'odolligonu@xrea.com');
insert into employee (name, birthday, email) values ('Hodge', '1958-08-21', 'hpaybodyv@oaic.gov.au');
insert into employee (name, birthday, email) values ('Abigael', '1975-04-11', 'apauncefootw@seesaa.net');
insert into employee (name, birthday, email) values ('Klement', '1953-12-13', 'kradbornex@vkontakte.ru');
insert into employee (name, birthday, email) values ('Karie', '2000-01-30', 'kstrothery@lulu.com');
insert into employee (name, birthday, email) values ('Liam', '1967-03-19', 'ldesvignesz@icq.com');
insert into employee (name, birthday, email) values ('Theo', '1969-04-19', 'tsmaridge10@g.co');
insert into employee (name, birthday, email) values ('Issy', '1984-04-22', 'imingardo11@opensource.org');
insert into employee (name, birthday, email) values ('Bord', '1984-07-20', 'blound12@domainmarket.com');
insert into employee (name, birthday, email) values ('Elset', '1975-02-19', 'emonkley13@joomla.org');
insert into employee (name, birthday, email) values ('Herc', '1951-12-09', 'hmattosoff14@ca.gov');
insert into employee (name, birthday, email) values ('Vonni', '1971-12-08', 'vdelves15@comcast.net');
insert into employee (name, birthday, email) values ('Bethanne', '1992-11-02', 'bpleasance16@seattletimes.com');
insert into employee (name, birthday, email) values ('Daloris', '1977-04-01', 'dtrewman17@cafepress.com');
insert into employee (name, birthday, email) values ('Taffy', '1986-09-15', 'tdockrey18@google.co.jp');
insert into employee (name, birthday, email) values ('Thornie', '1988-04-24', 'tcurrao19@wired.com');
insert into employee (name, birthday, email) values ('Caren', '1961-02-12', 'cweagener1a@flavors.me');
insert into employee (name, birthday, email) values ('Roscoe', '1951-06-15', 'rbossons1b@ted.com');
insert into employee (name, birthday, email) values ('Bibbye', '1990-07-23', 'btween1c@time.com');
insert into employee (name, birthday, email) values ('Sinclare', '1957-06-19', 'sdaulton1d@java.com');

-- 3)
UPDATE employee
SET name = 'Ömer',
birthday = '1997-08-28',
email = 'nalcaciomer@outlook.com'	
WHERE id = 1
RETURNING *;

UPDATE employee
SET birthday = '2000-02-02',
email = 'maybelle@maybelle.com'	
WHERE name = 'Maybelle'
RETURNING *;
	
UPDATE employee
SET 
name = 'Sultan',
email = 'sultan@sultan.com'	
WHERE birthday = '1999-06-16'
RETURNING *;

-- 4)
DELETE FROM employee
WHERE id >= 45;

DELETE FROM employee
WHERE name = 'Lionel';

DELETE FROM employee
WHERE email >= 'nbeagleholei@mit.edu';

DELETE FROM employee
WHERE birthday = '1970-06-20';



