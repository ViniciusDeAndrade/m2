insert into events ( event_type , value, time )
values (2, 5, '2015-05-09 12:42:00');

insert into events ( event_type , value, time )
values (4, -42, '2015-05-09 13:19:57');

insert into events ( event_type , value, time )
values (2, 2, '2015-05-09 14:48:30');

insert into events ( event_type , value, time )
values (2, 7, '2015-05-09 12:54:39');

insert into events ( event_type , value, time )
values (3, 16, '2015-05-09 13:19:57');

insert into events ( event_type , value, time )
values (3, 20, '2015-05-09 15:01:09');

-- aqui começa a resolução da questão

select event_type from events group by event_type having count(event_type) > 1;


