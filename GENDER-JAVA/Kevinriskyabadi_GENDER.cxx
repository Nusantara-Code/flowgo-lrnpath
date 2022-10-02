#include <iostream>
using namespace std;

 int main()
{
	char kel;
	
	cout<<"program menentukan jenis kelamin"<<endl;
	cout<<"Isikan dengan L jika anda ( laki laki )"<<endl;
	cout<<"              P jika anda ( perempuan )"<<endl;
	cout<<"input:";
	cin>>kel;
	
	if (kel=='L')
	cout<<"anda laki laki";
	
	else if(kel=='P')
	cout<<"anda perempuan";
		
	else cout<<"gender tidak diketahui";
	
	
	
	return 0;
}