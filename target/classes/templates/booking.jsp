<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking - Matha Buru Hill Eco Resort</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <nav class="navbar">
        <a href="/" class="nav-item">Home</a>
        <a href="/about" class="nav-item">About Us</a>
        <a href="/rooms" class="nav-item">Rooms</a>
        <a href="/amenities" class="nav-item">Amenities</a>
        <a href="/gallery" class="nav-item">Gallery</a>
        <a href="/contact" class="nav-item">Contact Us</a>
        <a href="/booking" class="nav-item">Booking</a>
    </nav>
    <header class="header">
        <h1>Booking</h1>
    </header>
    <div class="content">
        <form action="/booking" method="post">
            <label for="checkin">Check-In</label>
            <input type="date" id="checkin" name="checkin" required>
            
            <label for="checkout">Check-Out</label>
            <input type="date" id="checkout" name="checkout" required>
            
            <label for="guests">Number of Guests</label>
            <input type="number" id="guests" name="guests" required>
            
            <button type="submit">Book Now</button>
        </form>
    </div>
</body>
</html>
