<?php

$data = array(
    "name" => "John",
    "age" => 30
);

if (isset($data["name"])) {
    echo "Name: ". $data["name"];
} else {
    echo "Variable 'name' not found in the array.";
}
