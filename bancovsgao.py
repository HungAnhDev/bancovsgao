n = int(input("Nhap so o: "))
q = int(input("Nhap so boi: "))
tongsogao = 0
gao = 1

for i in range(n):
    tongsogao += gao
    gao *= q

print(tongsogao)
