SELECT `user_name`, substring(`email`, locate('@', email) + 1) AS 'Email Provider' FROM `users` 
ORDER BY `Email Provider`, `user_name`;
