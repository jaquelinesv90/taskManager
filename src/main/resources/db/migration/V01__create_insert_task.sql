CREATE TABLE IF NOT EXISTS public.task(
	id serial primary key,
	number bigint,
	name varchar(50),
	description varchar(100) 
); 


insert into task values(1,2234,'correcao','corrigir label');