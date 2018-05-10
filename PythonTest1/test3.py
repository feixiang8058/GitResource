# -*- coding:utf-8 -*-

# 素数判断输出
i = 2
while (i < 100):
    j = 2
    while (j <= (i / j)):
        if not (i % j): break
        j = j + 1
    if (j > i / j): print i, '是素数'
    i = i + 1

print '结束'

strs = ['a', 'b', 'c', 'd']
print len(strs)
