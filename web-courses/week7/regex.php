<?php

$pattern = '/[a-z]/';
$text = 'This is a Sample Text.';

if (preg_match($pattern, $text)) {
    echo 'Small letter found.';
} else {
    echo 'Small letter not found.';
}

$pattern = '/[0-9]+/';
$text = 'There are 123 apples.';

if (preg_match($pattern, $text, $mat)) {
    echo "Match found: " . $mat[0];
} else {
    echo "Match not found.";
}

$pattern = '/apple/';
$replacement = 'banana';
$text = 'I like apple pie.';
$new_text= preg_filter($pattern, $replacement, $text);
echo $new_text;

$pattern = '/[o]{1,3}/';
$text = 'god is good';

if (preg_match($pattern, $text, $matches)) {
    echo "Match found: ". $matches[0];
} else {
    echo "Match not found.";
}
