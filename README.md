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

# License
This project is licensed under the MIT license.
```text
MIT License

Copyright (c) 2018 Eton Otieno

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
