<?php

$message = "I am arek malang";
echo strrev($message) . "<br>";

$messagePerWord = explode(" ", $message);
$messagePerWord = array_map(fn($message) => strrev($message), $messagePerWord);
$message = implode(" ", $messagePerWord);

echo $message . "<br>";
