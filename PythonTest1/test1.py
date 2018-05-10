# -*- coding:utf-8 -*-

import sys  # 导包


# 定义方法
def main():
    # 变量赋值与输出
    a = 'feixiang '
    b = '你好，Python '
    sys.stdout.write(a)  # sys提供不换行输出方法
    sys.stdout.write(b)

    '''
    这是多行注释
    c是一个list列表，
    直接输出print c会出现编码，
    只有输出具体值，才会显示为中文
    '''
    c = ['苹果', '梨子', '西瓜']
    d = 2685.025

    print c[1], c[2]  # 两个值之间使用,号分割。也能实现不换行输出
    print c[0] * 3  # *号直接输出多少遍值
    print a + b  # +号直接连接输出的值
    print id(d)  # id函数，输出变量的身份证号，可能会重复


if __name__ == '__main__':
    main()