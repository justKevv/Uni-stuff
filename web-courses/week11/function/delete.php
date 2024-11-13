<?php
session_start();
if (!empty($_SESSION['username'])) {
    require '../config/connect.php';
    require '../function/pesan_kilat.php';
    require '../function/anti_injection.php';

    if (!empty($_GET['jabatan'])) {
        $id = antiinjection($conn, $_GET['id']);

        $query_hapus = "DELETE FROM jabatan WHERE id = '$id'";
        $result_hapus = mysqli_query($conn, $query_hapus);
        if ($result_hapus) {
            pesan('success', 'Data jabatan berhasil dihapus.');
        } else {
            pesan('danger', 'Data jabatan gagal dihapus. ' . mysqli_error($conn));
        }
        header('location: ../index.php?page=jabatan');
    } elseif (!empty($_GET['anggota'])) {
        $id = antiinjection($conn, $_GET['id']);

        $query_hapus = "DELETE FROM anggota WHERE user_id = '$id'";
        $result_hapus = mysqli_query($conn, $query_hapus);
        if ($result_hapus) {
            $query_hapus_user = "DELETE FROM user WHERE id = '$id'";
            $result_hapus_user = mysqli_query($conn, $query_hapus_user);
            if ($result_hapus_user) {
                pesan('success', 'Data anggota berhasil dihapus.');
            } else {
                pesan('danger', 'Data anggota gagal dihapus. ' . mysqli_error($conn));
            }
        } else {
            pesan('danger', 'Data anggota gagal dihapus. ' . mysqli_error($conn));
        }
        header('location: ../index.php?page=anggota');
    }
}
