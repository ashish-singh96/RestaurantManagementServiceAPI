

# Restaurant Management System

The Restaurant Management System is a web application built with Spring Boot that allows users to manage food items, place orders, and perform user management tasks. The system provides different levels of access based on user roles, such as admin, normal user, and visitor.

## Features

- User Management:
  - User signup and signin functionality
  - User roles: admin, normal user, and visitor
  - Role-based access control: admin has additional privileges compared to normal users and visitors
  - User profile management

- Food Item Management:
  - Admin can create food items with a title, description, price, and dummy image URL
  - Visitors and normal users can view food items

- Order Management:
  - Normal users can place orders for food items
  - Admin can view all orders and update their status (created, dispatched, delivered)

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or any other database of your choice)
- RESTful APIs
- Maven

## Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/restaurant-management-system.git
   ```

2. Navigate to the project directory:

   ```bash
   cd restaurant-management-system
   ```

3. Configure the database:
   - Create a MySQL database.
   - Update the database configuration in the `application.properties` file.

4. Build the project:

   ```bash
   mvn clean install
   ```

5. Run the application:

   ```bash
   mvn spring-boot:run
   ```

6. Access the application in your browser:

   ```
   http://localhost:8080
   ```

## API Endpoints

The application exposes the following RESTful API endpoints:

- **User Endpoints**
  - `POST /api/signup`: User signup
  - `POST /api/signin`: User signin
  - `GET /api/users/{userId}`: Get a specific user by ID
  - `GET /api/users?role={role}`: Get all users based on their role

- **Food Item Endpoints**
  - `POST /api/fooditems`: Create a food item (admin-only)
  - `GET /api/fooditems`: Get all food items
  - `GET /api/fooditems/{foodItemId}`: Get a specific food item by ID (admin-only)
  - `PUT /api/fooditems/{foodItemId}`: Update a specific food item by ID (admin-only)
  - `DELETE /api/fooditems/{foodItemId}`: Delete a specific food item by ID (admin-only)

- **Order Endpoints**
  - `POST /api/orders`: Create an order (normal user)
  - `GET /api/orders/{orderId}`: Get a specific order by ID (admin-only)
  - `PUT /api/orders/{orderId}/status?status={status}`: Update the status of a specific order by ID (admin-only)
  - `DELETE /api/orders/{orderId}`: Delete a specific order by ID (admin-only)



