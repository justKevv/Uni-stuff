<?php
session_start();
include 'connect.php';
include 'csrf.php';

$id = $_POST['id'];

$query = "DELETE FROM anggota WHERE id = ?";
$sql = $db1->prepare($query);
$sql->bind_param('i', $id);
$sql->execute();

echo json_encode(['success' => 'Sukses']);

$db1->close();
