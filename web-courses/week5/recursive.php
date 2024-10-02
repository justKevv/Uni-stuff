<?php

function showNumber(int $sum, int $index = 1) {
    echo "Perulangan ke-{$index} <br>";

    if ($index < $sum) {
        showNumber($sum, $index + 1);
    }
}

showNumber(20);
