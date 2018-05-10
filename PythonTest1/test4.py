# -*- coding:utf-8 -*-

import time
import calendar

# 输出时间戳 1970年至今时间毫秒数
print '当前时间戳：', time.time()

# 把时间戳转换成当前时间元组
localtime = time.localtime(time.time())
print '当前时间元组：', localtime

# 时间元组获取值
print '元组输出：', localtime[0:]

print '年份获取方式一：', localtime.tm_year, ',年份获取方式二：', localtime[0]


# 格式化日期获得当前时间

print '默认格式化：', time.asctime(localtime)
# a星期 b月份
print '自定义时间：', time.strftime('%a %b %d %H:%M:%S %Y')

print '格式化时间：', time.strftime('%Y-%m-%d %H:%M:%S', localtime)

# 把字符串转换成时间元组
a = "Sat Mar 28 22:24:24 2016"
strTime = time.strptime(a, "%a %b %d %H:%M:%S %Y")
print strTime

# 转换成时间戳
print time.mktime(strTime)










#
# print '当前时间为：',time

# print '当前年年份：',time[0]

print time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())

print time.localtime(time.time()).tm_mday

# call = calendar.month(2018, 4)

