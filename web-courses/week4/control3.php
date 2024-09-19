<?php
$points = 750; // Example points collected by the gamer

$totalScore = "Player's total score is: $points";
$additionalRewards = $points > 500 ? 'YES' : 'NO';

echo $totalScore . PHP_EOL;
echo "Do players get additional rewards? ($additionalRewards)";
?>
