# RightOvers
 RightOvers is a food sharing platform that allows for businesses and households to share their excess. This project takes aim at both food waste and food insecurity.

Users can make or reserve food posts after creating an account. They are guided through the process of reserving a food post, going to the poster, and then picking up the food.Once food is picked up, rating can be made and are then displayed on the user profile.

Browsing the food posts is aided by an interactive map. Those this map is centered on Horsens, the initial area listed in the description of the project, it is ready to scale up and expand.

# Technology
 Overall, this is a full stack web application that embodies the concepts of distributed systems as well as service oriented architecture.
 
 The frontend that the users interact with is a series of blazor pages. These pages use components from the RadZen library to speed up development.
 
 The map uses an API from Google that allows addresses to be turned into coordinates that can be shown as markers.
 
 The business logic is implemented as a .NET API with a group of segregated controllers. This RESTful Web Service allows for good decoupling between the tiers.
 
 The data acces tier is implemented in Java and is connected to the business logic using gRPC. The data itself is then persisted on a PostgreSQL database which is hosted by RDS from Amazon.
 
 # Methodology
 This project was developed using a combination of SCRUM, unified process, and kanban.
 
 For SCRUM we adhered to the principles of sprints, ceremonies, and roles. In each sprint, we had a sprint planning meeting, sprint review, and sprint retrospective. Everyday we had a standing daily SCRUM meeting. We utilized the roles to ensure an effective workflow as well as a high standard for the definition of done.
 
 Unified process was used to ensure that disciplines were integrated for each iteration to avoid the pitfalls of waterfall. Iterations were used to regularly deliver working software to the product owner as well as learn within the project to improve efficiency.
 
 We used Trello to visualize our tasks and take advantage of the benefits of kanban. By having cards on different boards with story points corresponding to the hours estimate on our sprint backlogs, we were able to use automated tools to visualize our velcotiy and stay on track. 
 
 # Results
 The project was a wonderful success as well as an excellent learning experience. As the largest software project any of us had completed up to that point, we were very pleased that we accomplished so many of the goals we set out. After implementing so many vertical slices, we all internalized the core principles of distributed systems and learned to love the technologies we used for the project.
