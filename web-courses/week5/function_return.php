<?php

function hitungUmur($thn_lahir, $thn_sekarang) {
    $umur = $thn_sekarang - $thn_lahir;
    return $umur;
}

function perkenalan($name, $greeting="Assalamualaikum") {
    echo $greeting.", ";
    echo "Greetings, My name is ". $name . "<br>";
    echo "My age is ". hitungUmur(2005, 2024) . " years old<br>";
    echo "Nice to meet you<br>";
}

perkenalan("Elok");
