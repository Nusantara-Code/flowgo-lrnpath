import datetime as dt

print("\n")
print("SIMPLE FORM")
print(20*"=")
nama = input("NAMA : ")
print(20*"=")
kelamin = input("(l) / (p) : ")
print(20*"=")
print("KAPAN KAMU LAHIR ? ")
print(20*"=")
tanggal = int(input("TANGGAL : "))
bulan = int(input("BULAN : "))
tahun = int(input("TAHUN : "))
print(20*"=")

if kelamin=="l":
    print("\n")
    print(20*"=")
    print("NAMA : " + nama)
    print("LAKI LAKI")
    nm = dt.date(tahun , bulan , tanggal)
    print(f"T/B/H : {nm}")
    print(f"HARI : {nm:%A}")
    tdy = dt.date.today();
    hrii = tdy - nm
    umr = hrii / 365
    print(f"UMUR : {umr.days}")
    print(20*"=")
    print("\n")
    
if kelamin=="p":
    print("\n")
    print(20*"=")
    print("NAMA : " + nama)
    print("PEREMPUAN")
    nm = dt.date(tahun , bulan , tanggal)
    print(f"T/B/H : {nm}")
    print(f"HARI : {nm:%A}")
    tdy = dt.date.today();
    hrii = tdy - nm
    umr = hrii / 365
    print(f"UMUR : {umr.days}")
    print(20*"=")
    print("\n")
