<?php

interface Shape {
    function calculateArea();
}

interface Color {
    function getColor();
}

class Circle implements Shape, Color {
    private $radius;
    private $color;

    function __construct($radius, $color) {
        $this->radius = $radius;
        $this->color = $color;
    }

    function calculateArea() {
        return pi() * pow($this->radius, 2);
    }

    function getColor() {
        return $this->color;
    }
}

$circle = new Circle(5, "Blue");

echo "Area of Circle: " . $circle->calculateArea() . "\n";
echo "Color of Circle: " . $circle->getColor() . "\n";
