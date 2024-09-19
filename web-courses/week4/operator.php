<?php
$a = 10;
$b = 5;

$addition = $a + $b;
$subtraction = $a - $b;
$multiplication = $a * $b;
$division = $a / $b;
$remainder = $a % $b;
$power = $a ** $b;

echo "Addition: {$addition} <br>";
echo "Subtraction: {$subtraction} <br>";
echo "Multiplication: {$multiplication} <br>";
echo "Division: {$division} <br>";
echo "Remainder: {$remainder} <br>";
echo "Power: {$power} <br>";

$equal = $a == $b;
$notEqual = $a != $b;
$greaterThan = $a > $b;
$lessThan = $a < $b;
$greaterThanOrEqual = $a >= $b;
$lessThanOrEqual = $a <= $b;

echo "Is $a equal to $b? {$equal} <br>";
echo "Is $a not equal to $b? {$notEqual} <br>";
echo "Is $a greater than $b? {$greaterThan} <br>";
echo "Is $a less than $b? {$lessThan} <br>";
echo "Is $a greater than or equal to $b? {$greaterThanOrEqual} <br>";
echo "Is $a less than or equal to $b? {$lessThanOrEqual} <br>";

$and = $a && $b;
$or = $a || $b;
$notA = !$a;
$notB = !$b;

echo "Is $a and $b true? {$and} <br>";
echo "Is $a or $b true? {$or} <br>";
echo "Is $a not true? {$notA} <br>";
echo "Is $b not true? {$notB} <br>";

$a += $b;
echo "Increment: {$a} <br>";

$a -= $b;
echo "Decrement: {$a} <br>";

$a *= $b;
echo "Multiplication: {$a} <br>";

$a /= $b;
echo "Division: {$a} <br>";

$a %= $b;
echo "Remainder: {$a} <br>";

$identicResult = $a === $b;
$notIdenticResult = $a !== $b;

echo "Is $a identic to $b? {$identicResult} <br>";
echo "Is $a not identic to $b? {$notIdenticResult} <br>";

?>
