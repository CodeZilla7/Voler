# Voler (French for 'Fly')
This android app gets a list of airline schedules and displays their origin and destination airports on a map.

# Features
- [ ] Give option to the user to select the origin and destination airport.
- [ ] Fetch list of airline schedules based on the selections above.
- [ ] Display the schedules on a list.
- [ ] Show the origin and destination of the flight on a map upon selection of a schedule.
- [ ] Connect the origin and destination with a polyline.

# Building The Project
You need an API Key from [Lufthansa](https://developer.lufthansa.com/).
In the .gitignore file, I have ignored secrets.properties which contains the keys. Change the secrets.sample.properties file to secrets.properties and fill in the key in it.
This is done to keep the keys out of git but still build the project.
