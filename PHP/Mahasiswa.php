<?php

class Mahasiswa extends Civitas
{
    // atribut private
    private $nim, $studi, $fakultas;

    // construct
    public function __construct()
    {
        $this->nim = "";
        $this->studi = "";
        $this->fakultas = "";
    }

    //setter
    public function setNim($nim)
    {
        $this->nim = $nim;
    }
    public function setStudi($studi)
    {
        $this->studi = $studi;
    }
    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }

    //getter
    public function getNim()
    {
        return $this->nim;
    }
    public function getStudi()
    {
        return $this->studi;
    }
    public function getFakultas()
    {
        return $this->fakultas;
    }

    //print
    function printMhs()
    {
        echo "Data Mahasiswa :" . $this->getNim() . " --- " . $this->getFakultas() . " --- " . $this->getStudi() . "<br/>";
    }

    // destruct
    public function __destruct()
    {
    }
}
