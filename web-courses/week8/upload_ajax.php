<<<<<<< ours
<?php
if (isset($_FILES['file'])) {
    $errors = array();
    $extensions = array("jpg", "jpeg", "png", "gif");

    $file_name = $_FILES['file']['name'];
    $file_size = $_FILES['file']['size'];
    $file_tmp = $_FILES['file']['tmp_name'];
    $file_type = $_FILES['file']['type'];
    $file_ext = strtolower(pathinfo($file_name, PATHINFO_EXTENSION));

    if (in_array($file_ext, $extensions) === false) {
        $errors[] = "extension not allowed for file: $file_name";
    }

    if ($file_size > 2097152) {
        $errors[] = "File size must be less than 2 MB for file: $file_name";
    }

    if (empty($errors)) {
        move_uploaded_file($file_tmp, "uploads/" . $file_name);
    }

    if (empty($errors)) {
        echo "Success";
    } else {
        echo implode(" ", $errors);
    }
}
|||||||
=======
<?php
if (isset($_FILES['file'])) {
    $errors = array();
    $extensions = array("jpg", "jpeg", "png", "gif");

    $file_name = $_FILES['file']['name'];
    $file_size = $_FILES['file']['size'];
    $file_tmp = $_FILES['file']['tmp_name'];
    $file_type = $_FILES['file']['type'];
    $file_ext = strtolower(pathinfo($file_name, PATHINFO_EXTENSION));

    if (in_array($file_ext, $extensions) === false) {
        $errors[] = "extension not allowed for file: $file_name";
    }

    if ($file_size > 2097152) {
        $errors[] = "File size must be less than 2 MB for file: $file_name";
    }

    if (empty($errors)) {
        move_uploaded_file($file_tmp, "uploads/" . $file_name);
    }

    if (empty($errors)) {
        echo "Success";
    } else {
        echo implode(" ", $errors);
    }
}
>>>>>>> theirs
