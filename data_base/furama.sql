create database furama_resort;
use furama_resort;
create table job_title(
id_job_title int primary key auto_increment,
name_job_title varchar(45)
);
create table education_level(
id_education_level int primary key auto_increment,
name_education_level varchar(255)
);

create table departments(
id_departments int primary key auto_increment,
name_departments varchar(255)
);
create table employee(
id_employee int primary	key auto_increment,
name_employee varchar(255),
date_of_birth date,
identity_card varchar(10),
salary double,
phone_number varchar(10),
email_employee varchar(255),
address_employee varchar(255),
id_job_title int,
id_education_level int,
id_departments int,
foreign key(id_job_title) references job_title(id_job_title),
foreign key(id_education_level)references education_level(id_education_level),
foreign key(id_departments) references departments(id_departments)
);
create table type_customer(
id_type_customer int primary key auto_increment,
name_type_customer varchar(255)
);
create table customer(
id_customer int primary key auto_increment,
id_type_customer int,
name_customer varchar(255),
date_of_birth date,
gender bit(1),
identity_card varchar(10),
phone_number varchar(45),
email_customer varchar(255),
address_customer varchar(255),
foreign key(id_type_customer) references type_customer(id_type_customer)
);
create table type_service(
id_type_service int primary key auto_increment,
name_type_service varchar(255)
);

create table type_of_argreements(
id_type_argreements int primary key auto_increment,
name_type_argreements varchar(255)
);

create table service(
id_service int primary key auto_increment,
name_service varchar(255),
area int,
rental_cost double,
person int,
id_type_argreements int,
id_type_service int,
room_stadard varchar(255),
desciption varchar(255),
area_simming_pool double,
floors int,
foreign key(id_type_service) references type_service(id_type_service),
foreign key(id_type_argreements) references type_of_argreements(id_type_argreements)
);
create table accompany_services(
id_accompany_services int primary key auto_increment,
name_accompany_service varchar(255),
price double,
unit varchar(10),
service_status varchar(255)
);
create table contract(
id_contract int primary key auto_increment,
name_contract varchar(255),
day_start date,
day_end date,
deposit double,
id_employee int,
id_customer int,
id_service int,
foreign key(id_employee) references employee(id_employee),
foreign key(id_customer) references customer(id_customer),
foreign key(id_service) references service(id_service)
);
create table detail_contract(
id_detail_contract int primary key auto_increment,
id_contract int,
id_accompany_services int,
quantity int,
foreign key(id_contract) references contract(id_contract),
foreign key(id_accompany_services) references accompany_services(id_accompany_services)
);