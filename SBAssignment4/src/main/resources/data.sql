DROP TABLE IF EXISTS EMPLOYEE;
	 
CREATE TABLE EMPLOYEE (
  EMPLOYEE_ID		NUMBER			PRIMARY KEY,
  EMPLOYEE_NAME		VARCHAR(250)	NOT NULL,
  EMPLOYEEE_EMAIL	VARCHAR(250)	NOT NULL,
  EMPLOYEE_LOCATION	VARCHAR(250)	NULL
);

insert into EMPLOYEE (EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEEE_EMAIL, EMPLOYEE_LOCATION) values (1001,'Shihir Gupta','shishir.gupta3@wipro.com','Atlanta GA');
insert into EMPLOYEE (EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEEE_EMAIL, EMPLOYEE_LOCATION) values (1002,'Kavita Gupta','kavita.gupta1@wipro.com','Chicago, IL');

