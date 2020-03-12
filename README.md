# anders-code-challenge
Code Challenge (Java, SpringBoot f/w, MySQL db)

# Intitalization
You need to change server url, username, password properties as per your MySQL server in the resources/application.properties. Then run the server to start the application. MySQL db name 'anders' will be created automatically.

This api can be used to return (The get request '') a list of players, with the amount of “points (scores)” that was scored by each player to display in a frontend scoreboard. The list has been sorted by the score (Descending).  As well as, user can input more scores into the list from a fronend page. Scores of each player will be stored in the database from the 'addScore' post request. 

Further improvements - exception/request handling must be added
