<?php
require_once 'database.php';

class Crud
{
    private $db;

    function __construct()
    {
        $this->db = new Database();
    }

    public function create($jabatan, $keterangan)
    {
        $sql = "INSERT INTO jabatan (jabatan, keterangan) VALUES ('$jabatan', '$keterangan')";

        $result = $this->db->conn->query($sql);

        return $result;
    }

    public function read()
    {
        $sql = "SELECT * FROM jabatan";

        $result = $this->db->conn->query($sql);

        $data = [];
        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                $data[] = $row;
            }
        }

        return $data;
    }

    function readById($id)
    {
        $sql = "SELECT * FROM jabatan WHERE id = $id";

        $result = $this->db->conn->query($sql);

        if ($result->num_rows > 0) {
            return $result->fetch_assoc();
        } else {
            return null;
        }
    }

    public function update($id, $jabatan, $keterangan)
    {
        $sql = "UPDATE jabatan SET jabatan = '$jabatan', keterangan = '$keterangan' WHERE id = $id";

        $result = $this->db->conn->query($sql);

        return $result;
    }

    public function delete($id)
    {
        $sql = "DELETE FROM jabatan WHERE id = $id";

        $result = $this->db->conn->query($sql);

        return $result;
    }
}
