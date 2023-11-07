# Problem Statement

### Simplified Hotel Management System

The HotelApp needs to manage various hotel services for guest check-in and check-out. These services include valet parking for vehicles, room cleaning, and handling luggage carts. However, the HotelApp aims to interact with these services through a simplified, single interface provided by the FrontDesk. The FrontDesk class should delegate the client's requests to the appropriate service classes (Valet, HouseKeeping, Cart) while abstracting the service details from the client.

<b>Class Definitions:</b>
<ul>
	<li><b>HotelService (Interface): </b>Defines the common interface for all hotel services.</li>
	<li><b>Valet: </b>A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up. It includes the pickUpVehicle(plateNumber) method.</li>
	<li><b>HouseKeeping: </b>A service class implementing the HotelService interface, responsible for room cleaning. It includes the cleanRoom(roomNumber) method.</li>
	<li><b>Cart: </b>A service class implementing the HotelService interface, responsible for handling luggage cart requests. It includes the requestCart(numberOfCarts) method.</li>
	<li><b>FrontDesk: </b>The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services.</li>
	<li><b>HotelApp: </b>The client class that uses the FrontDesk facade to access and utilize hotel services seamlessly.</li>
</ul>

# Class Diagram
![Assessment 2 (1)](https://github.com/zakidasalla/SoftwareEngineering1_CourseProjects/assets/142433516/4b8b56d2-f563-4c68-aef5-4557e7f63df7)

