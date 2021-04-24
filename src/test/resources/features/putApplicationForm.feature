# language: ru

Функциональность: При попытке оставить заявку на курс, неавторизованным пользавателям должна выдаваться форма,
  на которой можно ввести адрес почты , номер телефона и оставить заявку. Авторизованным пользователям
  должна выдаваться форма ввода телефона и отправка кода на этот номер


  @TestUI
  Структура сценария: проверка попытки оставить заявку на курс без аутентификации
    Дано я запускаю браузер
    И я перехожу по прямой ссылке '<link>'
    Когда я нажимаю на кнопку Оставить заявку
    То происходит успешный переход в раздел '<title>'
    Примеры:
      | link                                   | title |
      | https://otus.ru/lessons/certification-java/?int_source=courses_catalog&int_term=programming | Обработка заявки |
      | https://otus.ru/lessons/teamlead2-0/?int_source=courses_catalog&int_term=programming        | Обработка заявки |
      | https://otus.ru/lessons/html-css/?int_source=courses_catalog&int_term=programming           | Обработка заявки |

  @TestUI
  Структура сценария: проверка попытки оставить заявку на курс без аутентификации
    Дано я запускаю браузер
    И я ввожу корректные учётные данные
    Когда я ввожу логин и пароль
    И я осуществляю вход на сайт
    И я перехожу по прямой ссылке '<link>'
    Когда я нажимаю на кнопку Оставить заявку
    То происходит успешный переход в раздел '<title>'
    Примеры:
      | link                                   | title |
      | https://otus.ru/lessons/certification-java/?int_source=courses_catalog&int_term=programming | Обработка заявки |
      | https://otus.ru/lessons/teamlead2-0/?int_source=courses_catalog&int_term=programming        | Обработка заявки |
      | https://otus.ru/lessons/html-css/?int_source=courses_catalog&int_term=programming           | Обработка заявки |