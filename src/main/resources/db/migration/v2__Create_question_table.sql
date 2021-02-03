create table question
(
	int int AUTO_INCREMENT,
	title varchar(50),
	description text,
	gmt_create bigint,
	gmt_modify bigint,
	creator int,
	comment_count int default 0,
	view_count int default 0,
	tag varchar(256),
	constraint question_pk
		primary key (int)
);
