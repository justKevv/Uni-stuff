<?php
$numericGrade = 92;

if ($numericGrade >= 90 && $numericGrade <= 100) {
    echo "Alphabetic Grade: A";
} elseif ($numericGrade >= 80 && $numericGrade < 90) {
    echo "Alphabetic Grade: B";
} elseif ($numericGrade >= 70 && $numericGrade < 80) {
    echo "Alphabetic Grade: C";
} elseif ($numericGrade < 70) {
    echo "Alphabetic Grade: D";
}

$currentDistance = 0;
$targetDistance = 500;
$dailyIncrease = 30;
$day = 0;

while ($currentDistance < $targetDistance) {
    $currentDistance += $dailyIncrease;
    $day++;
}

echo "Athlete need to take $day days to reach the target distance.";

$amountLand = 10;
$plantPerLand = 5;
$fruitPerPlant = 10;
$amountFruit = 0;

for ($i=0; $i < $amountLand; $i++) {
    $amountFruit += ($plantPerLand * $fruitPerPlant);
}

echo "Amount of fruit that will be harvest: $amountFruit <br>";

$listScores = [85, 92, 78, 96, 88];
$totalScore = 0;

foreach ($listScores as $score) {
    $totalScore += $score;
}

echo "Total scores are: $totalScore <br>";

$studentGrades = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

foreach ($studentGrades as $grade) {
    if ($grade < 60) {
        echo "Grade: $grade (Not Pass) <br>";
        continue;
    }
    echo "Grade: $grade (Pass) <br>";
}
