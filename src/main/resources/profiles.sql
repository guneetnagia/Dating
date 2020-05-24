DROP TABLE IF EXISTS USER_PROFILES;

CREATE TABLE USER_PROFILES {
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR(10) DEFAULT NULL
}

create table user_interests {
  interest_id INT AUTO_INCREMENT  PRIMARY KEY,
  profile_id INT NOT NULL,
  activity VARCHAR(250),
  foreign key (profile_id) references USER_PROFILES(id)
}

insert into table user_profiles (name,age,gender) values 
('UserA',25,'FEMALE');
insert into table user_profiles (name,age,gender) values 
('UserB',27,'MALE');
insert into table user_profiles (name,age,gender) values 
('UserC',26,'MALE');
insert into table user_profiles (name,age,gender) values 
('UserD',24,'FEMALE');
insert into table user_profiles (name,age,gender) values 
('UserE',32,'FEMALE');



insert into user_interests (profile_id,activity) values
(1, 'CRICKET');

insert into user_interests (profile_id,activity) values
(2, 'CRICKET');
insert into user_interests (profile_id,activity) values
(2, 'FOOTBALL');
insert into user_interests (profile_id,activity) values
(2, 'MOVIES');

insert into user_interests (profile_id,activity) values
(3, 'Movies');
insert into user_interests (profile_id,activity) values
(3, 'Tennis');
insert into user_interests (profile_id,activity) values
(3, 'Football');
insert into user_interests (profile_id,activity) values
(3, 'Cricket');