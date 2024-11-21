<?php

$host = "LAPTOP-9IHF2TTM";

$connInfo = array("Database"=>"prakwebdb", "UID"=>"", "PWD"=>"");
$conn = sqlsrv_connect($host, $connInfo);

if($conn){
}else{
    echo "Connection could not be established.<br />";
    die(print_r(sqlsrv_errors(), true));
}
