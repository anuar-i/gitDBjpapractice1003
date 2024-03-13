Практика

Создайте проект и выберите версию Java 17 и Spring boot 3.

Добавьте такие зависимости как Lombok, Hibernate, spring boot starter jpa, H2, web.
Измените properties файл в yml.


Пропишите в этом yml файле порт 8088.
Пропишите url для подключения к базе H2
Напишите какой драйвер для связи с базой будет использоваться
Пропишите логин и пароль от этой базы
Пропишите ddl-auto create-drop
Включите h2 консоль в этом файле и пропишите путь для доступа к этой консоли
Напишите какой диалект будет использоваться

Пропишите логин, пароль и url для flyway

Создайте Entity под названием Student с полями id, имя, фамилия, имейл, возраст и оценка(int)
Создайте интерфейс StudentRepository который будет наследоваться от JpaRepository


Напишите в этом интерфейсе метод который будет делать поиск студента по имени

Напишите метод который будет выдавать список студентов по возрасту

Создайте entity School с полями id, название школы и количество студентов

Создайте интерфейс SchoolRepository который будет наследоваться от JpaRepository

Напишите в этом интерфейсе метод который будет делать поиск школ по имени
Напишите метод  который будет выдавать количество всех студентов(query)

Запушьте проект в гитхаб