<?php
include "connect.php";

$aksi = $_GET['aksi'];
$nama = $_POST['nama'];
$jenis_kelamin = $_POST['jenis_kelamin'];
$alamat = $_POST['alamat'];
$telepon = $_POST['telepon'];

if ($aksi == "create") {
    $sql = "INSERT INTO anggota (nama, jenis_kelamin,alamat,no_telp) VALUES ('$nama','$jenis_kelamin','$alamat','$telepon')";
    $result = mysqli_query($connect, $sql);

    if ($result) {
        header("location:index.php");
    } else {
        echo "Data Gagal Disimpan" . mysqli_error($connect);
    }
} elseif ($aksi == "update") {
    $id = $_POST['id'];
    $sql = "UPDATE anggota SET nama='$nama', jenis_kelamin='$jenis_kelamin', alamat='$alamat', no_telp='$telepon' WHERE id=$id";
    $result = mysqli_query($connect, $sql);

    if ($result) {
        header("location:index.php");
    } else {
        echo "Data Gagal Diupdate" . mysqli_error($connect);
    }
} elseif ($aksi == "delete") {
    if (isset($_GET['id'])) {
        $id = $_GET['id'];
        $sql = "DELETE FROM anggota WHERE id=$id";
        $result = mysqli_query($connect, $sql);

        if ($result) {
            header("location:index.php");
        } else {
            echo "Data Gagal Dihapus" . mysqli_error($connect);
        }
    } else  {
        echo "ID tidak valid";
    }
} else {
    header("Location: index.php");
}
mysqli_close($connect);
