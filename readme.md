# Алгоритмізація та основи програмування

## Практичні для виконання

[тут](./tasks-to-solve.md)

## Встановлення середи розробки

Потрібні чотири речі: **JDK 25**, **Maven**, **IntelliJ IDEA** і **Git**. Кожен крок нижче
розписаний для Windows, macOS і Linux — обирай свій рядок.

Швидше за все, якщо поставити пакетний менеджер і далі ставити все ним:

| ОС | Пакетний менеджер |
| --- | --- |
| Windows | [winget](https://learn.microsoft.com/windows/package-manager/winget/) (вбудований у Windows 11) або [Chocolatey](https://chocolatey.org/install) |
| macOS | [Homebrew](https://brew.sh/) |
| Linux | штатний `apt` / `dnf`, а для Java — [SDKMAN!](https://sdkman.io/install) |

### 1. JDK 25

Проєкт збирається під Java 25 (`<release>25</release>` у `pom.xml`), тому старіший JDK не підійде.

**Windows** — [інсталятор Eclipse Temurin 25](https://adoptium.net/temurin/releases/?version=25&os=windows).
В інсталяторі увімкни пункти **Set JAVA_HOME variable** і **Add to PATH**.

```shell
winget install EclipseAdoptium.Temurin.25.JDK
```

**macOS**

```shell
brew install --cask temurin@25
```

**Linux** — у штатних репозиторіях Ubuntu/Debian JDK 25 ще немає, тому простіше через SDKMAN!:

```shell
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 25-tem
```

Альтернатива — [apt-репозиторій Adoptium](https://adoptium.net/installation/linux/).

Перевірка (у **новому** вікні терміналу):

```shell
java -version
javac -version
```

Обидві команди мають показати версію `25`.

### 2. Maven

Ним збирається проєкт і запускаються тести — усі команди з наступного розділу readme.

**Windows**

```shell
winget install Apache.Maven
```

Якщо winget немає — [архів з maven.apache.org](https://maven.apache.org/download.cgi), розпакувати
й додати теку `bin` у змінну `Path` (Параметри → Система → Про систему → Додаткові параметри
системи → Змінні середовища).

**macOS**

```shell
brew install maven
```

**Linux**

```shell
sudo apt install maven      # Debian / Ubuntu
sudo dnf install maven      # Fedora
```

Перевірка:

```shell
mvn -v
```

### 3. IntelliJ IDEA

Безкоштовної **Community Edition** для курсу достатньо — [сторінка завантаження](https://www.jetbrains.com/idea/download/)
(прокрути до розділу *IntelliJ IDEA Community Edition*).

**Windows**

```shell
winget install JetBrains.IntelliJIDEA.Community
```

**macOS**

```shell
brew install --cask intellij-idea-ce
```

**Linux**

```shell
sudo snap install intellij-idea-community --classic
```

Відкриття проєкту (однаково в усіх ОС): **Open** → вибрати теку проєкту (ту, де лежить `pom.xml`) →
IDEA сама підтягне залежності Maven. Далі **File → Project Structure → Project** і перевір, що
**SDK** = 25.

Перший запуск для перевірки: відкрий `src/main/java/app/HelloWorldApp.java` і натисни зелений
трикутник біля методу `main`.

### 4. Git

**Windows** — [Git for Windows](https://git-scm.com/download/win); разом з ним ставиться Git Bash,
у якому працюють усі команди з цього readme.

```shell
winget install Git.Git
```

**macOS** — `xcode-select --install` (Git приїде разом з інструментами розробника) або:

```shell
brew install git
```

**Linux**

```shell
sudo apt install git        # Debian / Ubuntu
sudo dnf install git        # Fedora
```

Клонування репозиторію та перевірка, що все зібралось:

```shell
git clone <URL репозиторію>
cd <тека проєкту>
mvn test
```

### 5. Акаунт на LeetCode

Практичні здаються на [leetcode.com](https://leetcode.com/) — зареєструйся й розв'язуй задачі
з [tasks-to-solve.md](./tasks-to-solve.md) прямо в браузері, а код зберігай у цьому репозиторії.

### Якщо щось пішло не так

| Помилка | Причина |
| --- | --- |
| `invalid target release: 25` | активний старіший JDK — перевір `java -version` і `JAVA_HOME` |
| `java: command not found` / `не є внутрішньою командою` | JDK не в `PATH`; на Windows перевстанови інсталятором з увімкненим **Add to PATH** |
| `mvn: command not found` | Maven не встановлений або не в `PATH` — див. крок 2; після встановлення відкрий нове вікно терміналу |
| IDEA не бачить залежностей | правий клік на `pom.xml` → **Maven → Reload project** |

## Компіляція та тестування в командному рядку

### compile

```shell
mvn compile
```

### clean

```shell
mvn clean
```

### test

```shell
mvn test
```

### reformat code

```shell
mvn spotless:apply
```

### check formatting

```shell
mvn spotless:check
```

## Вирішені задачі

Розв'язки лежать в окремій гілці `solved`, а `master` лишається з порожніми шаблонами.

- [код розв'язків](https://github.com/djnzx/java-solved-78/tree/solved/src/main/java/practice) — 32 файли, по два на заняття
- [дифф до шаблонів](https://github.com/djnzx/java-solved-78/compare/master...solved) — видно тільки те, що дописано

Локально:

```shell
git switch solved   # подивитись розв'язки
git switch master   # повернутись до заготовок
```
