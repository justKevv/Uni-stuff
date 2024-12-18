<?php

class Car
{
    public $brand;

    function startEngine() {
        echo "Engine started\n";
    }
}

$car1 = new Car();
$car1->brand = "Toyota";

$car2 = new Car();
$car2->brand = "Honda";

$car1->startEngine();
echo $car2->brand . "\n";

class Animal {
    protected $name;

    function __construct($name) {
        $this->name = $name;
    }

    function eat() {
        echo $this->name . " is eating.\n";
    }

    function sleep() {
        echo $this->name . " is sleeping.\n";
    }
}

class Cat extends Animal {
    function meow() {
        echo $this->name . " is meowing.\n";
    }
}

class Dog extends Animal {
    function bark() {
        echo $this->name . " is barking.\n";
    }
}

$cat = new Cat("Kitty");
$dog = new Dog("Doggy");

$cat->eat();
$dog->sleep();

$cat->meow();
$dog->bark();

interface Shape {
    function calculateArea();
}

class Circle implements Shape {
    private $radius;

    function __construct($radius) {
        $this->radius = $radius;
    }

    function calculateArea() {
        return pi() * pow($this->radius, 2);
    }
}

class Rectangle implements Shape {
    private $width;
    private $height;

    function __construct($width, $height) {
        $this->width = $width;
        $this->height = $height;
    }

    function calculateArea() {
        return $this->width * $this->height;
    }
}

function printArea(Shape $shape) {
    echo "Area: " . $shape->calculateArea() . "\n";
}

$circle = new Circle(5);
$rectangle = new Rectangle(4, 6);

printArea($circle);
printArea($rectangle);
