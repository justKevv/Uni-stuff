<!DOCTYPE html>
<html lang="en">

<head>
    <title>Laundry</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    <style>
        .navbar {
            padding: 15px;
        }

        .bg-body {
            background-color: #2e3440;
        }

        .nav.navbar-nav.navbar-right li {
            margin-right: 20px;
            /* Adjust the value as needed */
        }
        .navbar-nav .nav-item {
            font-size: 16px !important;
        }
    </style>
</head>

<body>
    <nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                Laundry XYZ
            </a>
            <ul class="nav navbar-nav navbar-right">
                <ul class="nav nav-pills">
                    <?php if (basename($_SERVER['PHP_SELF']) == 'home.php') { ?>
                        <li class="nav-item active">
                            <a class="nav-link active" href="home.php">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="price-check.php">Check Price</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="logout.php">Logout</a>
                        </li>
                    <?php } elseif (basename($_SERVER['PHP_SELF']) == 'price-check.php') { ?>
                        <li class="nav-item">
                            <a class="nav-link" href="home.php">Home</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link active" href="price-check.php">Check Price</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="logout.php">Logout</a>
                        </li>
                    <?php } elseif (basename($_SERVER['PHP_SELF']) == 'logout.php') { ?>
                        <li class="nav-item">
                            <a class="nav-link" href="home.php">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="price-check.php">Check Price</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link active" href="logout.php">Logout</a>
                        </li>
                    <?php } ?>
                </ul>
            </ul>
        </div>
    </nav>
</body>

</html>
