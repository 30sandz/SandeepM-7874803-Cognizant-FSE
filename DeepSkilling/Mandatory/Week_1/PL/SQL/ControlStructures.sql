set serverouput ON;

Declare
    cursor customer_cursor is
    select customer_id from customer_cursor

BEGIN
    from customer_record in customer_cursor LOOP
        if customer_record.age > 60 then
            update loans set insurance = insurance -1 where id = customer_record;
        end if
    