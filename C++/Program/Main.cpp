#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

int main()
{
    // deklrasi objekss
    Mahasiswa m;

    // variabel temp data
    int nim, nik = 0;
    string name, gender, univ, email, fakultas, prodi;

    // variabel main
    int index, menu, n = 0;
    string cekMenu;

    // deklarasi objek list
    list<Mahasiswa> myList;

    // loop menu
    do
    {
        // pilihan menu
        cout << "\n========== Menu ===========" << '\n';
        cout << "1)Add -- 2)Delete -- 3)Update" << '\n';
        cout << "Masukkan pilihan menu : "
             << "";
        cin >> menu;

        if (menu == 1)
        {
            // menu add data

            // input jumlah dan isi data
            cout << "Masukkan banyaknya data : "
                 << "";
            cin >> n;
            cout << "Masukkan data yang dimaksud" << '\n';
            for (int i = 0; i < n; i++)
            {
                cin >> nik >> name >> gender >> univ >> email >> nim >> fakultas >> prodi;

                Mahasiswa m;
                m.SetNik(nik);
                m.SetName(name);
                m.SetGender(gender);
                m.SetUniv(univ);
                m.SetNim(nim);
                m.SetEmail(email);
                m.SetFakultas(fakultas);
                m.SetProdi(prodi);

                // masukkan data ke dalam list
                myList.push_back(m);
            }
        }
        else if (menu == 2)
        {
            // menu delete data

            // input index yang ingin dihapus
            cout << "Masukkan index data yang ingin dihapus : "
                 << "";
            cin >> index;

            // cek index sesuai ukuran list
            if (index > myList.size())
            {
                // jika index tidak ditemukan
                cout << "Data tidak ditemukan!" << '\n';
            }
            else
            {
                // cari index yang sesuai input
                list<Mahasiswa>::iterator it = myList.begin();
                advance(it, (index - 1));

                // hapus list sesuai index inputan
                myList.erase(it);
            }
        }
        else if (menu == 3)
        {
            // menu update data

            // masukkan index yang ingin di update
            cout << "Masukkan index data yang ingin di update"
                 << "";
            cin >> index;

            // cek index sesuai ukuran list
            if (index > myList.size())
            {
                // jika index tidak ditemukan
                cout << "Data tidak ditemukan!" << '\n';
            }
            else
            {
                cout << "Masukkan data update : " << '\n';
                // cari index yang sesuai input
                list<Mahasiswa>::iterator it = myList.begin();
                advance(it, (index - 1));

                // input data update
                cin >> nik >> name >> gender >> univ >> email >> nim >> fakultas >> prodi;

                // massukan data update
                it->SetNik(nik);
                it->SetName(name);
                it->SetGender(gender);
                it->SetUniv(univ);
                it->SetNim(nim);
                it->SetEmail(email);
                it->SetFakultas(fakultas);
                it->SetProdi(prodi);
            }
        }
        else
        {
            cout << "Menu tidak ada!" << '\n';
        }

        // print isi list
        cout << "\n======================== Data Mahasiswa ========================" << '\n\n';
        int i = 0;
        if (myList.size() == 0)
        {
            // jika list kosong
            cout << "List masih kosong!!" << '\n';
        }
        else
        {
            // jika list ada
            for (list<Mahasiswa>::iterator it = myList.begin(); it != myList.end(); it++)
            {
                cout << "====== Mahasiswa ke-" << (i + 1) << " ======\n";
                cout << "Data Human : " << it->GetNik() << " --- " << it->GetName() << " --- " << it->GetGender() << '\n';
                cout << "Data Civitas : " << it->GetUniv() << " --- " << it->GetEmail() << '\n';
                cout << "Data Mahasiswa : " << it->GetNim() << " --- " << it->GetFakultas() << " --- " << it->GetProdi() << '\n';
                cout << endl;
                i++;
            }
        }

        // input menu
        cout << "\nKetik 't' lanjut atau ketik apa saja jika ingin keluar dari menu : "
             << "";
        cin >> cekMenu;

    } while (cekMenu == "t");
}

/*
327324
Muhammad_Aditya
L
UPI
mdhstama@upi.edu
2000360
FPMIPA
Ilmu_Komputer
327325
Fahreza_Priyatna
L
UPI
maxap14@upi.edu
20004222
FPTK
Teknik_Elektro
*/