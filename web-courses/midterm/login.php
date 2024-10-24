<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $username = $_POST['username'];
    $password = $_POST['password'];

    if (empty($username) || empty($password)) {
        echo "<script>window.history.back();</script>";
        exit();
    }

    if (strlen($password) > 6) {
        echo "<script>window.history.back();</script>";
        exit();
    }

    if (!preg_match('/[A-Z]/', $password) || !preg_match('/[a-z]/', $password)) {
        echo "<script>window.history.back();</script>";
        exit();
    }

    $_SESSION['username'] = $username;
    header('Location: home.php');
    exit();
}
