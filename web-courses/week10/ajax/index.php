<?php
include 'auth.php';
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="csrf-token" content="<?php echo $_SESSION['csrf_token']; ?>">
    <title>Data Anggota</title>

    <!-- CSS and JS links -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <link href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand" href="#" style="color: #fff;">CRUD Dengan AJAX</a>
    </nav>

    <div class="container" style="margin-top: 30px; margin-bottom: 30px;">
        <h3>Data Anggota</h3>

        <form method="post" class="form-data" id="form-data">
            <div class="form-group">
                <label>Nama</label>
                <input type="hidden" name="id" id="id">
                <input type="text" name="nama" id="nama" class="form-control" required="true">
            </div>

            <p class="text-danger" id="err_nama"></p>

            <div class="form-group">
                <label>Jenis Kelamin</label><br>
                <input type="radio" name="jenis_kelamin" id="jenis_kelamin1" value="L" required="true"> Laki-Laki
                <input type="radio" name="jenis_kelamin" id="jenis_kelamin2" value="P"> Perempuan
            </div>
            <p class="text-danger" id="err_jenis_kelamin"></p>

            <div class="form-group">
                <label>Alamat</label>
                <textarea name="alamat" id="alamat" class="form-control" required="true"></textarea>
            </div>

            <p class="text-danger" id="err_alamat"></p>

            <div class="form-group">
                <label>No. Telepon</label>
                <input type="number" name="no_telp" id="no_telp" class="form-control" required="true">
            </div>

            <p class="text-danger" id="err_no_telp"></p>

            <div class="form-group">
                <button type="button" name="simpan" id="simpan" class="btn btn-primary">
                    <i class="fa fa-save"></i>Simpan
                </button>
            </div>
        </form>

        <hr>

        <div class="data"></div>
    </div>

    <div class="text-center" style="margin-top: 30px;">
        <p>&copy; <?php echo date('Y'); ?> | Copyright
            <a href="https://google.com">Desain Dan Pemrograman Web</a>
        </p>
    </div>

    <!-- DataTables JS files -->
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>

    <!-- AJAX script -->
    <script type="text/javascript">
        $(document).ready(function() {
            // CSRF token setup for AJAX requests
            $.ajaxSetup({
                headers: {
                    'Csrf-Token': $('meta[name="csrf-token"]').attr('content')
                }
            });

            // Fetch data
            $('.data').load('data.php');

            $('#simpan').click(function() {
                var data = $('.form-data').serialize();
                var jenkel1 = document.getElementById('jenis_kelamin1').value;
                var jenkel2 = document.getElementById('jenis_kelamin2').value;
                var nama = document.getElementById('nama').value;
                var alamat = document.getElementById('alamat').value;
                var no_telp = document.getElementById('no_telp').value;

                if (nama == '') {
                    document.getElementById('err_nama').innerHTML = 'Nama harus diisi';
                } else {
                    document.getElementById('err_nama').innerHTML = '';
                }

                if (alamat == '') {
                    document.getElementById('err_alamat').innerHTML = 'Alamat harus diisi';
                } else {
                    document.getElementById('err_alamat').innerHTML = '';
                }

                if (document.getElementById('jenis_kelamin1').checked == false && document.getElementById('jenis_kelamin2').checked == false) {
                    document.getElementById('err_jenis_kelamin').innerHTML = 'Jenis kelamin harus diisi';
                } else {
                    document.getElementById('err_jenis_kelamin').innerHTML = '';
                }

                if (no_telp == '') {
                    document.getElementById('err_no_telp').innerHTML = 'No. Telepon harus diisi';
                } else {
                    document.getElementById('err_no_telp').innerHTML = '';
                }

                if (nama != '' && alamat != '' && (document.getElementById('jenis_kelamin1').checked == true || document.getElementById('jenis_kelamin2').checked == true) && no_telp != '') {
                    $.ajax({
                        type: 'POST',
                        url: 'form_action.php',
                        data: data,
                        success: function() {
                            $('.data').load('data.php');
                            document.getElementById('id').value = "";
                            document.getElementById('form-data').reset();
                        },
                        error: function(response) {
                            console.log(response.responseText);
                        }
                    })

                }

            })
        });
    </script>
</body>

</html>
