#include <iostream>
#include <string>
#include <fstream>
#include <exception>

//waktu pengerjaan 01/10/2022
//30mnt

using namespace std;

class tugas2{

    private:
    //variable
        string nama;
        char kela;
        int umur;

    public:
    //constructor
        tugas2(string nama , char kela , int umur){
            this->nama = nama;
            this->kela = kela;
            this->umur = umur;
        }
    //method
        //int error(int nn){
        //    if (nn == 0)
        //    {
        //        throw "UMUR ERROR";
        //    }
        //    return nn; 
        //}

        void tugasN2(){
            system("cls");
            cout << "masukan nama : ";
            cin >> this->nama ;
            cout << "masukan umur anda : ";
            cin >> this->umur;
            cout << "masukan kela (P) / (L) : ";
            cin >> this->kela;

            if (kela == 'P')
            {
                cout << "\n" << endl;
                cout << "NAMA : " << nama << endl;
                cout << "perempuan" << endl;
                cout << "umur : " << umur << endl;
                cout << "\n" << endl;
            }else if (kela == 'L')
            {
                cout << "\n" << endl;
                cout << "NAMA : " << nama << endl;
                cout << "LAKI LAKI " << endl;
                cout << "umur : " << umur << endl;
                cout << "\n" << endl;
            }

//maaf error sedang dalam perbaikan
            //try
            //{
            //    int c = error(umur);
            //    cout << c << endl;
            //}
//
            //catch(exception e)
            //{
            //    cout << e.what() << '\n';
            //}
            
            
        }
};

int menu(){
    int inp;
    system("cls");
    cout << "      ____TUGAS N_CODE____     " << endl;
    cout << "================================" << endl;
    cout << "1.Tugas Bilangan genap" << endl;
    cout << "2.Tugas Menentukan jenis kelamin" << endl;
    cout << "Pilih tugas yang akan di buka " << endl;
    cout << "================================" << endl;
    cout << "input : ";
    cin >> inp;
    cout << "================================" << endl;

    return inp;
}

void tugas1(){
    int n1;
    int n2;
    system("cls");
    cout << "SELAMAT DATANG DI TUGAS BILANGAN GENAP" << endl;
    cout << "AWAL : " ;
    cin >> n1;
    cout << "KAHIR : ";
    cin >> n2;
    cout << "hasil nya : " << endl;
    for (int i = n1; i <= n2; i++)
    {
        if (i % 2 == 0)
        {
           cout << i << " , ";
        } 
    }    
}

int main(int argc, char const *argv[])
{
    string namaa;
    char kelam;
    int ummr;
    int plhh = menu();
    int plh;
    enum ops {TUGAS1 = 1 , TUGAS2 , end};
    tugas2 tugas2(namaa , kelam , ummr);
    while (plhh != end )
    {
        switch (plhh)
        {
            case TUGAS1:
                tugas1();
                break;
            case TUGAS2:
                tugas2.tugasN2();
                break;
        default:
            break;
        }

        balik :
        cout << "\n" << endl;
        cout << "1.selesai" << endl;
        cout << "2.lanjut" << endl;
        cin >> plh;
        if (plh == 1)
        {
            break;

        }else if (plh == 2)
        {
            menu();
        }else
        {
            goto balik;
        }       
    }
    
    return 0;
}

