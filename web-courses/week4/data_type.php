<?php
$a = 10;
$b = 5;
$c = $a + 5;
$d = $b + (10 * 5);
$e = $d - $c;

echo "Variable a: {$a} <br>";
echo "Variable b: {$b} <br>";
echo "Variable c: {$c} <br>";
echo "Variable d: {$d} <br>";
echo "Variable e: {$e} <br>";

var_dump($e);

$mathGrade = 5.1;
$scienceGrade = 6.7;
$indonesianLanguageGrade = 9.3;

$average = ($mathGrade + $scienceGrade + $indonesianLanguageGrade) / 3;

echo "Math: {$mathGrade} <br>";
echo "Science: {$scienceGrade} <br>";
echo "Indonesian Language: {$indonesianLanguageGrade} <br>";
echo "Average: {$average} <br>";

var_dump($average);

$isStudentPassed = true;
$isStudentTakenExam = false;

var_dump($isStudentPassed);
echo "<br>";
var_dump($isStudentTakenExam);

$firstName = "Ibnu";
$lastName = "Jakaria";

$fullName = "{$firstName} {$lastName}";
$fullName2 = $firstName . " " . $lastName;

echo "First name: {$firstName} <br>";
echo 'Last name: '. $lastName . '<br>';

echo $fullName;

$listStudent = ["Wahid Abdullah", "Elmo Bachtiar", "Lendis Fabri"];
echo $listStudent[0];

?>
