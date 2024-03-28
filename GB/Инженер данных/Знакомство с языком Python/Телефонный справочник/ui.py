

def change_row():
    data, nf = data_file()
    count_rows = len(data)
    number_row = int(input(f"Введите номер строки "
                           f"от 1 до {count_rows}: "))
    while number_row < 1 or number_row > count_rows:
        number_row = int(input(f"Ошибка!"
                               f"Введите номер строки "
                               f"от 1 до {count_rows}: "))
    name = input("Введите свое имя: ")
    surname = input("Введите свою фамилию: ")
    birthdate = input("Введите дату рождения: ")
    town = input("Введите город: ")
    data[number_row - 1] = f'{number_row};{name};{surname};{birthdate};{town}\n'
    with open(f'db/data_{nf}.txt', 'w', encoding='utf-8') as file:
        file.writelines(data)
    print("Данные успешно изменены!")


def delete_row():
    data, nf = data_file()
    count_rows = len(data)
    if count_rows == 0:
        print("Файл пусто!")
    else:
        number_row = int(input(f"Введите номер строки "
                               f"от 1 до {count_rows}: "))
        while number_row < 1 or number_row > count_rows:
            number_row = int(input(f"Ошибка!"
                                   f"Введите номер строки "
                                   f"от 1 до {count_rows}: "))
        del data[number_row - 1]
        data = [f'{i + 1};{data[i].split(";")[1]};'
                f'{data[i].split(";")[2]};'
                f'{data[i].split(";")[3]};'
                f'{data[i].split(";")[4]}'
                for i in range(len(data))]
        with open(f'db/data_{nf}.txt', 'w', encoding='utf-8') as file:
            file.writelines(data)
        print("Строка успешно удалена!")

def choice_number_file():
    print_file()
    number = int(input("Выберит файл, с которым Вы хотите работать\n"
                       "Введите цифру 1 или 2: "))
    while number < 1 or number > 2:
        number = int(input("Ошибка!!!\n"
                           "Введите цифру 1 или 2: "))
    return number

def data_file():
    nf = choice_number_file()
    with open(f'db/data_{nf}.txt', 'r', encoding='utf-8') as file:
        data = file.readlines()
    return data, nf


def add_row():
    name = input("Введите свое имя: ")
    surname = input("Введите свою фамилию: ")
    birthdate = input("Введите дату рождения: ")
    town = input("Введите город: ")
    data, nf = data_file()
    now_number_row = len(data) + 1
    with open(f'db/data_{nf}.txt', 'a', encoding='utf-8') as file:
        file.write(f'{now_number_row};{name};'
                   f'{surname};{birthdate};{town}\n')
    print("Данные успешно записаны!")

def print_file():
    for i in range(1, 3):
        with open(f'db/data_{i}.txt', 'r', encoding='utf-8') as file:
            data = file.readlines()
        print(f"Вывод данных из {i}-ого файла:\n"
              f"{''.join(data)}")


def find_in_files():
    target_name = input("Введите фамилию: ")
    for i in range(1, 3):
        with open(f'db/data_{i}.txt', 'r', encoding='utf-8') as file:
            data = file.readlines()
        t_data = ""
        for a in data:
            a_s = a.split(';')
            if a_s[2] == target_name:
                t_data += a
        print(f"В файле {i}:\n")
        if len(t_data) > 1:
            print(t_data)
        else:
            print("Совпадений не найдено")


def check_number(n):
    while n < 1 or n > 6:
        n = int(input("Ошибка, такого номера команды не "
                      "существует! Введите цифру от 1 до 6\n"
                      "Выберите функцию:\n"
                      "1. Добавить\n"
                      "2. Удалить\n"
                      "3. Изменить\n"
                      "4. Вывод\n"
                      "5. Поиск\n"
                      "6. Выход\n"
                      "Введите номер команды: "))
    return n


def start_menu():
    command = None
    while command != 6:
        command = int(input("Доброго времени суток!\n"
                            "Выберите функцию:\n"
                            "1. Добавить\n"
                            "2. Удалить\n"
                            "3. Изменить\n"
                            "4. Вывод\n"
                            "5. Поиск\n"
                            "6. Выход\n"
                            "Введите номер команды: "))
        command = check_number(command)
        if command == 1:
            add_row()
        elif command == 2:
            delete_row()
        elif command == 3:
            change_row()
        elif command == 4:
            print_file()
        elif command == 5:
            find_in_files()
    print("Спасибо, что воспользовались нашими услугами!\n"
          "Всего доброго! Приходите к нам ещё :)")