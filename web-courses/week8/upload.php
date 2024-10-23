<<<<<<< ours
<?php
if (isset($_POST['submit'])) {
    $targetdir = "uploads/";
    $targetfile = $targetdir . basename($_FILES["myfile"]["name"]);
    $fileType = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));

    $allowExntensions = array("txt", "pdf", "doc", "docx");
    $maxsize = 3*1024*1024;

    if (in_array($fileType, $allowExntensions) && $_FILES["myfile"]["size"] <= $maxsize) {

        if (move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)) {
            echo "File uploaded successfully";
            echo "<br>";
            echo "<img src='$targetfile' width='200'>";
        } else {
            echo "Error uploading file";
        }
    } else {
        echo "File type is not allowed or File is too large";
    }
}
|||||||
=======
<?php
if (isset($_POST['submit'])) {
    $targetdir = "uploads/";
    $targetfile = $targetdir . basename($_FILES["myfile"]["name"]);
    $fileType = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));

    $allowExntensions = array("txt", "pdf", "doc", "docx");
    $maxsize = 3*1024*1024;

    if (in_array($fileType, $allowExntensions) && $_FILES["myfile"]["size"] <= $maxsize) {

        if (move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)) {
            echo "File uploaded successfully";
            echo "<br>";
            echo "<img src='$targetfile' width='200'>";
        } else {
            echo "Error uploading file";
        }
    } else {
        echo "File type is not allowed or File is too large";
    }
}
>>>>>>> theirs
