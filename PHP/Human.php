<?php

class Human
{
    // atribut private
    private $nik, $name, $gender;

    // constructor
    public function __construct()
    {
        $this->nik = "";
        $this->name = "";
        $this->gender = "";
    }

    /**
     * Get the value of nik
     */
    public function getNik()
    {
        return $this->nik;
    }

    /**
     * Set the value of nik
     *
     */
    public function setNik($nik)
    {
        $this->nik = $nik;
    }

    /**
     * Get the value of name
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Set the value of name
     *
     */
    public function setName($name)
    {
        $this->name = $name;
    }

    /**
     * Get the value of gender
     */
    public function getGender()
    {
        return $this->gender;
    }

    /**
     * Set the value of gender
     *
     */
    public function setGender($gender)
    {
        $this->gender = $gender;
    }

    //  print
    function printHuman()
    {
        echo "Data Human :" . $this->getNik() . " --- " . $this->getName() . " --- " . $this->getGender() . "<br/>";
    }

    // destructor
    public function __destruct()
    {
    }
}
