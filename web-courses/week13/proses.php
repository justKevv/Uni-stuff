<?php
include "connect.php";

$aksi = $_GET['aksi'];
$nama = $_POST['nama'];
$jenis_kelamin = $_POST['jenis_kelamin'];
$alamat = $_POST['alamat'];
$telepon = $_POST['no_telp'];

if ($aksi == "create") {
    $sql = "INSERT INTO anggota (nama, jenis_kelamin,alamat,no_telp) VALUES ('$nama','$jenis_kelamin','$alamat','$telepon')";
    $result = sqlsrv_query($conn, $sql);

    if ($result) {
        header("location:index.php");
    } else {
        echo "Data Gagal Disimpan" . sqlsrv_errors();
    }
} elseif ($aksi == "update") {
    $id = $_POST['id'];
    $sql = "UPDATE anggota SET nama='$nama', jenis_kelamin='$jenis_kelamin', alamat='$alamat', no_telp='$telepon' WHERE id=$id";
    $result = sqlsrv_query($conn, $sql);

    if ($result) {
        header("location:index.php");
    } else {
        echo "Data Gagal Diupdate" .  sqlsrv_errors();
    }
} elseif ($aksi == "delete") {
    if (isset($_GET['id'])) {
        $id = $_GET['id'];
        $sql = "DELETE FROM anggota WHERE id=$id";
        $result = sqlsrv_query($conn, $sql);

        if ($result) {
            header("location:index.php");
        } else {
            echo "Data Gagal Dihapus" . sqlsrv_errors();
        }
    } else  {
        echo "ID tidak valid";
    }
} else {
    header("Location: index.php");
}
sqlsrv_close($conn);
