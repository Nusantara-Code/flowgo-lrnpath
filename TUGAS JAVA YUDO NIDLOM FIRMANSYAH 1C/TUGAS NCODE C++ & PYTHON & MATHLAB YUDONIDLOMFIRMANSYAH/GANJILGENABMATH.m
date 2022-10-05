clear
clc

%tugas angka ganjil genap
%mathlab

sandi = input("SANDI(1-5) : ")
if sandi == 12345
    disp("MENGELUARKAN ANGKA GANJIL")
    awal = input("AWAL : ")
    akhir = input("AKHIR : ")
    x = 1:akhir;
    for i = x 
        if mod(i,2) == 0
            i 
        end
    end
end