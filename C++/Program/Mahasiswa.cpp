#include "Civitas.cpp"

class Mahasiswa : public Civitas
{
private:
    // atribut privat
    int nim;
    string fakultas;
    string prodi;

public:
    // fungsi publik

    // constructor
    Mahasiswa()
    {
        this->nim = 0;
        this->fakultas = "";
        this->prodi;
    };

    // setter getter
    int GetNim()
    {
        return this->nim;
    }

    void SetNim(int nim)
    {
        this->nim = nim;
    }

    string GetFakultas()
    {
        return this->fakultas;
    }

    void SetFakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }

    string GetProdi()
    {
        return this->prodi;
    }

    void SetProdi(string prodi)
    {
        this->prodi = prodi;
    }

    // destructor
    ~Mahasiswa(){};
};
