<?php

$studentGrades = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];

$passedGrades = [];

foreach ($studentGrades as $grades) {
    if ($grades >= 70) {
        $passedGrades[] = $grades;
    }
}

echo "List students who passed: " . implode(", ", $passedGrades);

$listEmployee = [
    ['Alice', 7],
    ['Bob', 3],
    ['Charlie', 9],
    ['David', 5],
    ['Eva', 6],
];

$employeeWithFiveYearExperience = [];

foreach ($listEmployee as $employee) {
    if ($employee[1] > 5) {
        $employeeWithFiveYearExperience[] = $employee[0];
    }
}

echo "Employee with 5 years of experience: " . implode(", ", $employeeWithFiveYearExperience). "<br>";

$listGrades = [
    'Math' => [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78]
    ],
    'Physics' => [
        ['Alice', 90],
        ['Bob', 88],
        ['Charlie', 75]
    ],
    'Chemistry' => [
        ['Alice', 92],
        ['Bob', 80],
        ['Charlie', 85]
    ]
];

$course = 'Physics';

echo "List of students who have a grade in $course: <br>";

foreach ($listGrades[$course] as $grade) {
    echo "Name: {$grade[0]}, Grade: {$grade[1]} <br>";
}
