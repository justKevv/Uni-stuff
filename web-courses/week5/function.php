<?php

// function perkenalan() {
//     echo "Assalamualaikum, ";
//     echo "Greetings, My name is Elok<br>";
//     echo "Nice to meet you<br>";
// }

// perkenalan();

// function perkenalan($name, $greeting) {
//     echo $greeting.", ";
//     echo "Greetings, My name is ". $name . "<br>";
//     echo "Nice to meet you<br>";
// }

// perkenalan("Hamdana", "Hello");

// echo "<hr>";

// $saya = "Elok";
// $ucapan = "Good Morning";

// perkenalan($saya, $ucapan);

function perkenalan($name, $greeting="Assalamualaikum") {
    echo $greeting.", ";
    echo "Greetings, My name is ". $name . "<br>";
    echo "Nice to meet you<br>";
}

perkenalan("Hamdana", "Hallo");

echo "<hr>";

$saya = "Elok";
$ucapan = "Good Morning";

perkenalan($saya);

?>
