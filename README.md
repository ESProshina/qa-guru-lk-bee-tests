# Автоматизация тестирования Личного кабинета B2C (Telecom)

[![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-blue)](https://jenkins.qa.guru/job/java-students/job/ESPro-lk-bee-tests/)
[![Allure Report](https://img.shields.io/badge/Allure-Report-green)](https://jenkins.qa.guru/job/java-students/job/ESPro-lk-bee-tests/allure/)

Дипломный проект по автоматизации UI-тестирования на Java (школа QA.GURU).

> **Бизнес-контекст:** Проект демонстрирует подходы к тестированию личного кабинета оператора связи (управление услугами, тарифами, детализацией). Ввиду политик безопасности (NDA) внутренний стенд компании недоступен, поэтому тесты написаны на открытый демо-стенд [demoqa.com](https://demoqa.com), а бизнес-сценарии стилизованы под телеком-компанию.

## 🛠 Стек технологий
* **Java 17/21**
* **Selenide** (UI-автоматизация)
* **JUnit 5** (тестовый фреймворк)
* **Gradle** (сборка проекта)
* **Allure Report** (отчетность и вложения)
* **Jenkins** (CI/CD)
* **Selenoid** (запуск тестов в удаленных Docker-контейнерах)
* **Page Object Pattern** (архитектура)

## 🚀 Покрытые сценарии
В проекте реализовано 5 UI-автотестов, покрывающих ключевые пользовательские пути:
1. **Smoke:** Проверка доступности главной страницы ЛК.
2. **Тарифы:** Успешный переход на тариф `BEE CONTACT LITE` (выбор Radio Button).
3. **Управление услугами:** Подтверждение смены тарифа двойным кликом (Double Click).
4. **Личные данные:** Заполнение формы с контактными данными (Text Box).
5. **Подключение опций:** Выбор чекбокса (подключение услуги).

## 📊 Отчетность и CI/CD
* Настроена Jenkins Job с параметризацией (выбор браузера).
* Тесты запускаются удаленно в **Selenoid** (Chrome).
* В **Allure Report** прикрепляются артефакты: скриншоты, HTML-код страницы (Page Source) и логи консоли браузера (Browser Console Logs). Это позволяет быстро локализовать дефекты при падении тестов.
* Настроены уведомления в **Telegram** (Allure Notifications).

## 💻 Запуск тестов локально
```bash
./gradlew clean test

📸 Скриншоты
1. Общий вид Allure Report
https://images/allure_overview.png

2. Артефакты при падении теста (Скриншоты и Логи)
https://images/allure_attachments1.png
https://images/allure_attachments2.png

3. Jenkins Job
https://images/jenkins_job.png

Автор: Елена Прошина (QA Automation Engineer)