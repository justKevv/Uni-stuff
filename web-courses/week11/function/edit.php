<?php
session_start();
if (!empty($_SESSION['username'])) {
    require '../config/connect.php';
    require '../function/pesan_kilat.php';
    require '../function/anti_injection.php';

    if (!empty($_GET['jabatan'])) {
        $id = antiinjection($conn, $_POST['id']);
        $jabatan = antiinjection($conn, $_POST['jabatan']);
        $keterangan = antiinjection($conn, $_POST['keterangan']);

        $query_update = "UPDATE jabatan SET jabatan = '$jabatan', keterangan = '$keterangan' WHERE id = '$id'";
        $result_update = mysqli_query($conn, $query_update);
        if ($result_update) {
            pesan('success', 'Data jabatan berhasil diupdate.');
        } else {
            pesan('danger', 'Data jabatan gagal diupdate. ' . mysqli_error($conn));
        }
        header('location: ../index.php?page=jabatan');
    } elseif (!empty($_GET['anggota'])) {
        $user_id = antiinjection($conn, $_POST['id']);
        $nama = antiinjection($conn, $_POST['nama']);
        $jabatan = antiinjection($conn, $_POST['jabatan']);
        $jenis_kelamin = antiinjection($conn, $_POST['jenis_kelamin']);
        $alamat = antiinjection($conn, $_POST['alamat']);
        $no_telp = antiinjection($conn, $_POST['no_telp']);
        $username = antiinjection($conn, $_POST['username']);

        $query_anggota = "UPDATE anggota SET nama = '$nama',
                            jenis_kelamin = '$jenis_kelamin',
                            alamat = '$alamat',
                            no_telp = '$no_telp',
                            jabatan_id = '$jabatan'
                        WHERE user_id = '$user_id'";
        if (mysqli_query($conn, $query_anggota)) {
            if (!empty($_POST['password'])) {
                // Generate random salt
                $password = $_POST['password'];
                $salt = bin2hex(random_bytes(16));
                $combined_password = $salt . $password;
                $hashed_password = password_hash($combined_password, PASSWORD_BCRYPT);

                $query_user = "UPDATE user SET username = '$username', password = '$hashed_password', salt = '$salt' WHERE id = '$user_id'";
                if (mysqli_query($conn, $query_user)) {
                    pesan('success', "Anggota Telah Diubah.");
                } else {
                    pesan('warning', "Data Anggota Berhasil Diubah, Tetapi Password Gagal Diubah Karena: " . mysqli_error($conn));
                }
            } else {
                $query_user = "UPDATE user SET username = '$username' WHERE id = '$user_id'";
                if (mysqli_query($conn, $query_user)) {
                    pesan('success', "Anggota Telah Diubah.");
                } else {
                    pesan('warning', "Data Anggota Berhasil Diubah, Tetapi Username Gagal Diubah Karena: " . mysqli_error($conn));
                }
            }
        } else {
            pesan('danger', "Mengubah Anggota Karena: " . mysqli_error($conn));
        }
        header("Location: ../index.php?page=anggota");
    }
}
