Create table DProduct(p_name varchar2(10 char)primary key,
p_price number(6)not null, p_floor number(1)not null);

Create table DFloor(f_floor number(1)primary key,f_theme varchar2(10 char)
not null);

Create sequence DFloor_seq;

Create table DStaff(s_phone varchar2(13 char)primary key,s_name varchar2(10 char)
not null,s_birth date not null,s_floor number(1)not null);
Delete from DPRODUCT where p_name='페브리즈';
Alter table DProduct add(p_stock number(3)not null);

select * from DProduct;