mysql> delimiter $$
mysql> create trigger foo before insert on yar
    -> for each row
    -> begin
    -> if new.val = '' then
    -> signal sqlstate '45000';
    -> end if;
    -> end;$$
Query OK, 0 rows affected (0.01 sec)