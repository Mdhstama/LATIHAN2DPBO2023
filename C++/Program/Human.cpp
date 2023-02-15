#include <string>
#include <iostream>

using namespace std;

class Human
{

private:
    // atribut privat
    int nik;
    string name;
    string gender;

public:
    // fungsi publik

    // constructor
    Human()
    {
        this->nik = 0;
        this->name = "";
        this->gender = "";
    }

    // setter getter
    int GetNik()
    {
        return this->nik;
    }

    void SetNik(int nik)
    {
        this->nik = nik;
    }

    string GetName()
    {
        return this->name;
    }

    void SetName(string name)
    {
        this->name = name;
    }

    string GetGender()
    {
        return this->gender;
    }

    void SetGender(string gender)
    {
        this->gender = gender;
    }

    // destructor
    ~Human()
    {
    }
};