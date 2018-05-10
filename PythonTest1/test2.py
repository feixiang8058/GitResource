# -*- coding:utf-8 -*-

import sys

# 基本语法结构
b = ['feixiang', '爱情', '凉凉']
for a in b:
    print a

if 1 == 1:
    print("sss")
else:
    print("dd")

la = 1
print(la)

# while循环偶数和
i = 0
sum1 = 0
while True:
    if i > 100:
        break
    if i % 2 == 0:
        sum1 = sum1 + i
        print i
    i = i + 1
print sum1

for str in b:
    print str

for num in range(10, 20):
    for i in range(2, num):
        if num % i == 0:
            j = num/i
            print '%d等于%d*%d' % (num, i, j)
            break
        else:
            print num, '是一个质数'


