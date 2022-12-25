# PocketDex

## Description

### What my application does

This application was built with the sole purpose of enhencing the game experience of die hard pokemon fans.
The main goal of the app is to allow a user to keep track of all the pokemon they have caught throughout the various games they played.
I created this app in the hope of it acting like a real Pokedex one which is not limited to the ingame incorporated one.
The application makes it a lot easier for each trainer to keep track of their pokemons and potentially achieve the ultimate goal of catching them all.
It also allows its users to bypass another restriction that some games have which is the availability of certain pokemons within the game.
With the application you can view all your pokemons in the pokemon tab.
You can also view all the regions available and by clicking on them you can see the pokemons that you have caught withing that region.
You can add a new pokemon to the application and update and existing pokemon.
The application also allows the user to delete a pokemon they added.

### How the application was built and what technologies was used

This application was builed using springBoot for the backend ressources. 
Springboot took care of most of my requests to the api via its controllers and other functionalities that weer later tested with the postman application.
The backend was coded in JAVA and has a different package for its entities, controllers, requests, services, responses, repository and exceptions.
The front end was built with the help of react router to efficiently switch between all the many available pages without having to actually create 
a new page everytime.
in the front end which was coded in Javascript and css axios was in charge of sending and handling the requests to the api.

###  Runing the project

Running the project is quite simple since it is not being hosted anywhere you simply need to run the backend code that was done in intelije.
Once sprinboot has started and the database is running acces the front end and you can start using the application to complete the desired tasks.

### Challeges Faced

The PUT and POST request were the part of the hardest things for me to do in this project. 
However if I had to mention the most time consumming thing was getting the hang of react router their tutorial was weird and the css was so broken I had to 
give up after 5h of attempts in order to advance as much as i could in my project.
Thankfully i found a few simple videos that explained the base on react router which aloid me to switch states in javascript.

## Design

###  Explanation behind the classes structure of the projects

In my project the entities are composed of types, pokemon and region.
Pokemon being the main entity has a many to one relationship with the Region which allows the regions to keep track of all the pokemons that are withing them.
Pokemon has many one to one relationships with types more preciseley one with primary typoe and another with secondary type which are all stored 
within the type entity.
The Type enity has no acces to the information of any of the other classes it only knows about its own variable and can be used by the pokemon.

### Database Design: Entity-Relationship Diagram


### End-points documentation for your backend


### Screenshots of the Web Application frontend explaining the features of the app

#### Get POKEMON Request api

![image](https://user-images.githubusercontent.com/104465518/209457088-2cee6090-2c77-40a2-bcad-5799e40d8dd8.png)

#### Get POKEMON Request FrontEnd 

![image](https://user-images.githubusercontent.com/104465518/209457094-4e26c286-c650-487c-ab55-0435d08f6e6e.png)

#### Get Regions Request 

![image](https://user-images.githubusercontent.com/104465518/209457135-4578e995-cce5-4f35-ac2b-db2ad7eb1946.png)

#### Get Types Request  

![image](https://user-images.githubusercontent.com/104465518/209457145-27de16d4-ed57-4ab1-961c-22f30e76c8c8.png)

#### POST Request

![image](https://user-images.githubusercontent.com/104465518/209457167-b0b278ed-2e3e-45a8-a0d1-8f7095e3e9e1.png)

#### PUT Request

![image](https://user-images.githubusercontent.com/104465518/209457188-af33d498-089b-454b-bbcd-228e016a9b1d.png)

#### DELETE Request

![image](https://user-images.githubusercontent.com/104465518/209457195-f0b78d2c-04fe-4fa2-b507-f8cea75a160f.png)


