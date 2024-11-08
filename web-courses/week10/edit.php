<!DOCTYPE html>
<html>

<head>
    <title>Edit Data Anggota</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>

<body>
    <?php
    include 'connect.php';
    $id = $_GET['id'];
    $query = "SELECT * FROM anggota WHERE id = $id";
    $result = mysqli_query($connect, $query);
    $row = mysqli_fetch_assoc($result);
    mysqli_close($connect);
    ?>
    <div class="container mt-4">
        <h2>Edit Data Anggota</h2>
        <form action="proses.php?aksi=update    " method="post">
            <input type="hidden" name="id" value="<?php echo $row['id']; ?>">

            <div class="form-group">
                <label for="nama">Nama:</label>
                <input type="text" class="form-control" name="nama" id="nama" value="<?php echo $row['nama']; ?>" required>
            </div>

            <div class="form-group">
                <label>Jenis Kelamin:</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="jenis_kelamin" value="L" id="laki" <?php if ($row['jenis_kelamin'] == 'L') echo 'checked'; ?> required>
                    <label class="form-check-label" for="laki">Laki-Laki</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="jenis_kelamin" value="P" id="perempuan" <?php if ($row['jenis_kelamin'] == 'P') echo 'checked'; ?> required>
                    <label class="form-check-label" for="perempuan">Perempuan</label>
                </div>
            </div>

            <div class="form-group">
                <label for="alamat">Alamat:</label>
                <input type="text" class="form-control" name="alamat" id="alamat" value="<?php echo $row['alamat']; ?>" required>
            </div>

            <div class="form-group">
                <label for="no_telp">No. Telp:</label>
                <input type="text" class="form-control" name="no_telp" id="no_telp" value="<?php echo $row['no_telp']; ?>" required>
            </div>

            <button type="submit" class="btn btn-primary">Simpan Perubahan</button>
        </form>

        <a class="btn btn-secondary mt-2" href="index.php">Kembali</a>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>

</html>
