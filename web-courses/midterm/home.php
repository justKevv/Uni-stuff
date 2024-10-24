<?php
include "components/header.php";

session_start();

if (!isset($_SESSION['username'])) {
    header('Location: index.html');
    exit();
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/carousel.css">
    <link rel="stylesheet" href="css/home.css">
    <style>
        .carousel-btn.next {
            display: none;
        }

        .carousel-btn.prev {
            display: none;
        }
    </style>
</head>

<body>
    <div class="carousel-container">
        <div class="carousel-slides">
            <img src="img/laundry1.jpg" alt="Banner 1">
            <img src="img/laundry2.jpg" alt="Banner 2">
            <img src="img/laundry3.jpg" alt="Banner 3">
        </div>
        <button class="carousel-btn prev">❮</button>
        <button class="carousel-btn next">❯</button>
    </div>

    <div class="company-profile">
        <h2>Company Profile</h2>

        <p>
            Laundry XYZ is a trusted laundry service provider that has been serving the community for over [insert years] years. We specialize in delivering high-quality laundry care, dry cleaning, and ironing services for both residential and commercial clients. Our team is dedicated to offering reliable and efficient services that cater to the unique needs of every customer.
        </p>
        <br>
        <p>
            At Laundry XYZ, we use the latest technology and environmentally friendly cleaning products to ensure that your clothes are treated with the utmost care. From delicate fabrics to heavy-duty items, we guarantee a thorough cleaning process that maintains the integrity of your garments.
        </p>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            var currentIndex = 0;
            var slideWidth = $('.carousel-container').width();
            var totalSlides = $('.carousel-slides img').length;

            // Set the width of the slide container to hold all slides
            $('.carousel-slides').css('width', slideWidth * totalSlides + 'px');

            // Function to update the carousel position
            function updateCarousel() {
                var newLeft = -currentIndex * slideWidth;
                $('.carousel-slides').css('transform', 'translateX(' + newLeft + 'px)');
            }

            // Click event for next button
            $('.next').click(function() {
                if (currentIndex < totalSlides - 1) {
                    currentIndex++;
                } else {
                    currentIndex = 0; // Loop back to the first slide
                }
                updateCarousel();
            });

            // Click event for previous button
            $('.prev').click(function() {
                if (currentIndex > 0) {
                    currentIndex--;
                } else {
                    currentIndex = totalSlides - 1; // Loop to the last slide
                }
                updateCarousel();
            });

            // Autoplay feature
            function autoSlide() {
                setInterval(function() {
                    $('.next').click(); // Simulate clicking the "next" button every 3 seconds
                }, 3000); // Change slide every 3 seconds
            }

            // Start auto sliding
            autoSlide();
        });
    </script>


</body>

</html>
