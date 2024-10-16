<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $selectedFruit = $_POST['fruit'];

    if (isset($_POST['color'])) {
        $selectedColor = $_POST['color'];
    } else {
        $selectedColor = [];
    }

    $selectedGender = $_POST['gender'];

    echo "You selected fruit: " . $selectedFruit . "<br>";

    if (!empty($selectedColor)) {
        echo "Your favorite color(s): " . implode(", ", $selectedColor) . "<br>";
    } else {
        echo "You did not select any favorite color.<br>";
    }

    echo "Your gender: " . $selectedGender;
}
