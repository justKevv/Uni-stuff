<?php
session_start();
if (!empty($_SESSION['username'])) {
    require '../config/connect.php';
    require '../function/pesan_kilat.php';
    require '../function/anti_injection.php';

    if (!empty($_GET['jabatan'])) {
        $jabatan = antiinjection($conn, $_POST['jabatan']);
        $keterangan = antiinjection($conn, $_POST['keterangan']);

        $query_tambah = "INSERT INTO jabatan (jabatan, keterangan) VALUES ('$jabatan', '$keterangan')";
        $result_tambah = mysqli_query($conn, $query_tambah);
        if ($result_tambah) {
            pesan('success', 'Data jabatan berhasil ditambahkan.');
        } else {
            pesan('danger', 'Data jabatan gagal ditambahkan. ' . mysqli_error($conn));
        }
        header('location: ../index.php?page=jabatan');
    } elseif (!empty($_GET['anggota'])) {
        $username = antiinjection($conn, $_POST['username']);
        $password = antiinjection($conn, $_POST['password']);
        $level = antiinjection($conn, $_POST['level']);
        $jabatan = antiinjection($conn, $_POST['jabatan']);
        $nama = antiinjection($conn, $_POST['nama']);
        $jenis_kelamin = antiinjection($conn, $_POST['jenis_kelamin']);
        $alamat = antiinjection($conn, $_POST['alamat']);
        $no_telp = antiinjection($conn, $_POST['no_telp']);

        $salt = bin2hex(random_bytes(16));
        $combined_password = $salt . $password;
        $hashed_password = password_hash($combined_password, PASSWORD_BCRYPT);

        $query = "INSERT INTO user (username, password, salt, level) VALUES ('$username', '$hashed_password', '$salt', '$level')";
        $result = mysqli_query($conn, $query);

        if ($result) {
            $last_id = mysqli_insert_id($conn);
            $query2 = "INSERT INTO anggota (nama, jenis_kelamin, alamat, no_telp, user_id, jabatan_id) VALUES ('$nama', '$jenis_kelamin', '$alamat', '$no_telp', '$last_id', '$jabatan')";
            $result2 = mysqli_query($conn, $query2);

            if ($result2) {
                pesan('success', 'Data anggota berhasil ditambahkan.');
            } else {
                pesan('danger', 'Data anggota gagal ditambahkan. ' . mysqli_error($conn));
            }
        } else {
            pesan('danger', 'Data user gagal ditambahkan. ' . mysqli_error($conn));
        }
        header('location: ../index.php?page=anggota');
    }
}
