CREATE TABLE IF NOT EXISTS public.task(
	id integer CONSTRAINT task_fk PRIMARY KEY,
	number_task bigint,
	name varchar(50),
	description varchar(50),
	status boolean
); 

insert into task values(1,2234,'correcao','corrigir label',true);
insert into task values(2,4567,'correcao','corrigir a tela de cadastro',true);
insert into task values(3,7777,'bug','verificar a nova tabela',true);
insert into task values(4,9888,'implementação','implementar nova funcionalidade do sistema',true);