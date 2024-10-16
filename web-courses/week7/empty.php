<?php

$myArray = array();

if (empty($myArray)) {
    echo "Array is not defined or empty.";
} else {
    echo "Array is defined and not empty.";
}

echo "<br>";

if (empty($nonExistentArray)) {
    echo "Array is not defined or empty.";
} else {
    echo "Array is defined and not empty.";
}
