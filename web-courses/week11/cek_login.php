<?php

if (session_status() === PHP_SESSION_NONE) {
    session_start();
}

include 'config/connect.php';
include 'function/pesan_kilat.php';
include 'function/anti_injection.php';

$username = antiinjection($conn, $_POST['username']);
$password = antiinjection($conn, $_POST['password']);

$query = "SELECT username, level, salt, password as password_hash FROM user WHERE username = '$username'";
$result = mysqli_query($conn, $query);
$row = mysqli_fetch_assoc($result);
mysqli_close($conn);
$salt = $row['salt'];
$password_hash = $row['password_hash'];

if ($salt !== null && $password_hash !== null) {
    $combined_password = $salt . $password;
    if (password_verify($combined_password, $password_hash)) {
        $_SESSION['username'] = $row['username'];
        $_SESSION['level'] = $row['level'];
        header('Location: index.php');
    } else {
        pesan('danger', "Login Gagal, Password AndaSalah");
        header('Location: login.php');
    }
} else {
    pesan('warning', "Login Gagal, Username Tidak Ditemukan");
    header('Location: login.php');
}
