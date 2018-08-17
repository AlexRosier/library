INSERT into library.book (title, isbn, year, author) VALUES
    ('Spring Data', '1234567890123', 2015, 'John Guru'),
    ('Spring REST', '3210987654321', 2014, 'Smith Jones');

INSERT into library.user (username, firstname, lastname, email) VALUES
	('JohnSmith12', 'John', 'Smith', 'john@smith.com'),
	('DavySmith32', 'Davy', 'Smith', 'davy@smith.com'),
	('EricNorth57', 'Eric', 'North', 'eric@north.com');

INSERT into library.rental (book_id, user_id, pickup_date, return_date) VALUES
	(1, 1, '2016-05-10', '2016-05-12'),
	(1, 1, '2016-05-15', '2016-05-16'),
	(1, 2, '2016-05-20', '2016-05-25'),
	(2, 3, '2016-05-20', '2016-05-25'),
	(2, 2, '2016-06-01', '2016-06-25');

INSERT into library.suggestion (user_id, url, motivation, isbn) VALUES
	(1, 'https://www.amazon.com/Spring-Data-Mark-Pollack/dp/1449323952', 'Good read', '9781449323950'),
	(1, 'https://www.amazon.com/Spring-Action-Craig-Walls/dp/161729120X/', 'Nice book', '9781617291203'),
	(1, 'https://www.amazon.com/Spring-Roo-Action-Ken-Rimple/dp/193518296X', 'Very informative', '9781935182962'),
	(2, 'https://www.amazon.com/Spring-Practice-Willie-Wheeler', '', '9785643217898'),
	(2, 'https://www.amazon.com/Spring-Integration-Action-Mark-Fisher', '', '9785643216666');

INSERT into library.tag (book_id, value) VALUES
	(1, 'Java'),
	(1, 'Spring'),
	(1, 'Spring Data'),
	(2, 'Java'),
	(2, 'Spring'),
	(2, 'REST');
