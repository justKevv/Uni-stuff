<?php
class Car {
    private $model;
    private $color;

    function __construct($model, $color) {
        $this->model = $model;
        $this->color = $color;
    }

    function getModel() {
        return $this->model;
    }

    function getColor() {
        return $this->color;
    }

    function setColor($color) {
        $this->color = $color;
    }
}

$car1 = new Car("Toyota", "Blue");

echo "Model: " . $car1->getModel() . "\n";
echo "Color: " . $car1->getColor() . "\n";

$car1->setColor("Red");

echo "Updated Color: " . $car1->getColor() . "\n";

class Animal {
    public $name;
    protected $age;
    private $color;

    function __construct($name, $age, $color) {
        $this->name = $name;
        $this->age = $age;
        $this->color = $color;
    }

    function getName() {
        return $this->name;
    }

    function getAge() {
        return $this->age;
    }

    function getColor() {
        return $this->color;
    }
}

$animal = new Animal("Dog", 3, "Brown");

echo "Name: " . $animal->name . "\n";
echo "Age: " . $animal->getAge() . "\n";
echo "Color: " . $animal->getColor() . "\n";
