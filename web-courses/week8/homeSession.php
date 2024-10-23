<<<<<<< ours
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    session_start();
    if ($_SESSION["status"] == "login") {
        echo "Welcome " . $_SESSION["username"];

    ?>
        <br><a href="sessionLogout.php">Logout</a>
    <?php
    } else {
        echo "You are not logged in.";

    ?>
        <a href='sessionLoginForm.php'>Login</a>

    <?php
    }
    ?>
</body>

</html>
|||||||
=======
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    session_start();
    if ($_SESSION["status"] == "login") {
        echo "Welcome " . $_SESSION["username"];

    ?>
        <br><a href="sessionLogout.php">Logout</a>
    <?php
    } else {
        echo "You are not logged in.";

    ?>
        <a href='sessionLoginForm.php'>Login</a>

    <?php
    }
    ?>
</body>

</html>
>>>>>>> theirs
