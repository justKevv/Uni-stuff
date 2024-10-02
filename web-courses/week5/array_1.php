<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $Listdosen = ["Elok Nur hamdana", "Unggul Pamenang", "Bagas Nugraha"];

        echo $Listdosen[0] . "<br>";
        echo $Listdosen[1] . "<br>";
        echo $Listdosen[2] . "<br>";

        for ($i=0; $i < count($Listdosen); $i++) {
            echo $Listdosen[$i] . "<br>";
        }
    ?>
</body>
</html>
