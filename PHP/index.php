<?php

require('Human.php');
require('Civitas.php');
require('Mahasiswa.php');

$detail = new Mahasiswa();
$detail->setNik("32732425");
$detail->setName("Adit");
$detail->setGender("L");
$detail->setUniv("UPI");
$detail->setEmail("mdhstama@upi.edu");
$detail->setNim("2000360");
$detail->setFakultas("FPMIPA");
$detail->setStudi("Ilmu Komputer");

echo "========================== Data Mahasiswa ===========================" . "<br/>";
$detail->printHuman();
$detail->printCivitas();
$detail->printMhs();
