This project is about creating different digital services in Java.\
There is a main abstract class called Service. \
It stores common information like name, id, and if the service is active. \
Then I created three services: \
StreamingService \
CloudStorageService \
ConsultationService \
Each one has its own performService() method. \
There is also an abstract class User. \
From it I created Admin and Customer. \
Admin can manage and use services. \
Customer can only use services. \
Some services can be upgraded to premium. \
Some services can generate a bill. \
I used inheritance and interfaces to organize the code. \
The system works and new services can be added later.