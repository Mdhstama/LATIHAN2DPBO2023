<?php

class Civitas extends Human
{
    // atribut privat
    private $univ, $email;

    // constructor
    public function __construct()
    {
        $this->univ = "";
        $this->email = "";
    }

    /**
     * Get the value of email
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * Set the value of email
     *
     */
    public function setEmail($email)
    {
        $this->email = $email;
    }

    /**
     * Get the value of univ
     */
    public function getUniv()
    {
        return $this->univ;
    }

    /**
     * Set the value of univ
     *
     */
    public function setUniv($univ)
    {
        $this->univ = $univ;
    }

    // print civitas
    function printCivitas()
    {
        echo "Data Civitas :" . $this->getUniv() . " --- " . $this->getEmail() . "<br/>";
    }

    // destruct
    public function __destruct()
    {
    }
}
