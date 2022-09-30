#include <iostream>
// nama : muhammad abdul khafid
//squad : 3

using namespace std;

int main(){


//  memilih gender
	string nama;
	cout<<"masukkan gender (pria/wanita) : ";
	cin>>nama;
	if(nama == "pria"){
		cout<<"gender pria"<<endl;
	}else if(nama == "wanita"){
		cout << "gender wanita"<<endl;
	}else{
		cout << "gender aneh"<<endl;
	}
	
	return 0;
}
