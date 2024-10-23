<<<<<<< ours
<?php
    $username = $_POST["username"];
    $password = $_POST["password"];

    if ($username == "admin" && $password == "1234") {
        session_start();
        $_SESSION["username"] = $username;
        $_SESSION["status"] = "login";
        echo "You have successfully logged in. Please go to <a href='homeSession.php'>Home Page</a>";
    } else {
        echo "Failed to login. Please login again. <a href='sessionLoginForm.php'>Login Page</a>";
    }
|||||||
=======
<?php
    $username = $_POST["username"];
    $password = $_POST["password"];

    if ($username == "admin" && $password == "1234") {
        session_start();
        $_SESSION["username"] = $username;
        $_SESSION["status"] = "login";
        echo "You have successfully logged in. Please go to <a href='homeSession.php'>Home Page</a>";
    } else {
        echo "Failed to login. Please login again. <a href='sessionLoginForm.php'>Login Page</a>";
    }
>>>>>>> theirs
