s = input()[1:-1].split(', ')
s_new = []
for i in s:
    if len(i) < 6: # 6 получается с учетом двух символов ", которые нужно сохранить в выводе
        s_new.append(i)
print("[" + ', '.join(s_new) + "]")