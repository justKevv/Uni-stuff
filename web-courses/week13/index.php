<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Anggota</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
    <h2>Data Anggota</h2>
    <a class="btn btn-success mt-2" href="create.php">Tambah Data</a>
    <br><br>
    <?php
    include "connect.php";
    $query = "SELECT * FROM dbo.anggota order by id desc";
    $result = sqlsrv_query($conn, $query);
    ?>
    <table class="table">
        <thead class="table-light">
            <tr>
                <th>No</th>
                <th>Nama</th>
                <th>Jenis Kelamin</th>
                <th>Alamat</th>
                <th>No. Telp</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
        <?php
        $no = 1;
        while ($row = sqlsrv_fetch_array($result)) {
            $kelamin = ($row["jenis_kelamin"] == 'L') ? 'Laki-Laki' : 'Perempuan';
        ?>
            <tr>
                <td><?php echo $no++; ?></td>
                <td><?php echo $row["nama"]; ?></td>
                <td><?php echo $kelamin; ?></td>
                <td><?php echo $row["alamat"]; ?></td>
                <td><?php echo $row["no_telp"]; ?></td>
                <td>
                    <a class="btn btn-primary" href="edit.php?id=<?php echo $row["id"]; ?>">Edit</a>
                    <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#hapusModal<?php echo $row["id"]; ?>">Hapus</button>
                </td>
            </tr>

            <!-- Modal Hapus -->
            <div class="modal fade" id="hapusModal<?php echo $row["id"]; ?>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Konfirmasi Hapus</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            Apakah Anda yakin ingin menghapus data dengan nama "<?php echo $row["nama"]; ?>"?
                        </div>
                        <div class="modal-footer">
                        <a class="btn btn-danger" href="proses.php?aksi=delete&id=<?php echo $row["id"]; ?>">Hapus</a>
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Batal</button>
                        </div>
                    </div>
                </div>
            </div>
        <?php } ?>
        </tbody>
    </table>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>
