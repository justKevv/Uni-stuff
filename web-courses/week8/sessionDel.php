<<<<<<< ours
<?php
    session_start();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        session_unset();
        session_destroy();

        echo "Session variables are deleted.";
    ?>
</body>
</html>
|||||||
=======
<?php
    session_start();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        session_unset();
        session_destroy();

        echo "Session variables are deleted.";
    ?>
</body>
</html>
>>>>>>> theirs
