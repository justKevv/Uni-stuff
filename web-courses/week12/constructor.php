<?php
class Car {
    private $brand;

    function __construct($brand) {
        $this->brand = $brand;
    }

    function getBrand() {
        return $this->brand;
    }

    function __destruct() {
        echo "Car object destroyed\n";
    }
}

$car1 = new Car("Toyota");

echo "Brand: " . $car1->getBrand() . "\n";
