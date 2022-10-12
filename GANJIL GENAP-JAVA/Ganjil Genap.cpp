#include <iostream>
using namespace std;

int main(){
		int bilangan;
		
		cout<<"masukkan bilangan: ";
		cin>>bilangan;
		
		if(bilangan%2==0){
			cout<<"bilangan yang dimasukkan adalah bilangan genap";
			cout<<"2,4,6,8,10,12,...";
		}
		else{
			cout<<"bilangan yang dimasukkan adalah bilangan ganjil";
			cout<<"1,3,5,7,9,11,...";
		}
		return 0;
}
