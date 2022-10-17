#include<iostream>
#include<string>
using namespace std;
int main()
{
	string nama;
	string jeniskelamin;
	
	cout<<"masukkan nama:";
	cin>>nama;
	cout<<"jenis kelamin[L/P]:";
	cin>>jeniskelamin;
	if(jeniskelamin=="L")
	{
	cout<<"hallo"<<nama<<",anda seorang pria dan tinggi anda 165";
	}
	else
	{
	cout<<"hallo"<<nama<<",anda seorang perempuan dan tinggi anda 150";
	}
	return 0;
		
}
	
	
