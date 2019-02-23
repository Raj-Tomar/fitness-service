
CREATE TABLE USER(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	my_location VARCHAR(50),
	user_role VARCHAR(40)
);

CREATE TABLE fitness_goal (
	goal_id INT AUTO_INCREMENT PRIMARY KEY,
	goal VARCHAR(100),
	user_id INT,
	FOREIGN KEY (user_id) REFERENCES USER(user_id)
);

INSERT INTO USER 
	(first_name, last_name, my_location, user_role)
VALUES ('Raj', 'Tomar', 'Hyderabad', 'user'),
	('Rajesh', 'Nair', 'Hyderabad', 'coach');

INSERT INTO fitness_goal 
	(goal, user_id)
VALUES ('wait loose', 1);

CREATE TABLE fitness_event(
	event_id INT AUTO_INCREMENT PRIMARY KEY,
	organizer_name VARCHAR(100),
	location VARCHAR(100),
	event_date TIMESTAMP
);

INSERT INTO fitness_event ( organizer_name, location, event_date)
VALUES ('Rajesh', 'hyderabad', NOW());

