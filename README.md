# Password Generator - NURZHANOVA ZARINA
## SOLID:
### **Single Responsibility Principle (SRP):**

Примеры соблюдения: _Классы StrongPasswordGenerator и SimplePasswordGenerator имеют одну ответственность - генерировать пароли.
Open-Closed Principle (OCP):_

Примеры соблюдения: _Если вы захотите добавить новый тип генератора (например, генератор многозначных паролей), вы сможете сделать это без изменения существующего кода.
Liskov Substitution Principle (LSP):_

Примеры соблюдения: _Классы StrongPasswordGenerator и SimplePasswordGenerator реализуют интерфейс PasswordGenerator, поэтому их можно использовать вместо объекта типа PasswordGenerator.
Interface Segregation Principle (ISP):_

Примеры соблюдения: _Интерфейс PasswordGenerator имеет только один метод generatePassword(), что предотвращает наличие ненужных методов в реализующих классах.
Dependency Inversion Principle (DIP)_:

Примеры соблюдения: _Класс PasswordUtility зависит от абстракции PasswordGenerator, а не от конкретных реализаций, что позволяет подменять генераторы без изменения кода PasswordUtility._

### **DRY (Don't Repeat Yourself):**

Ваши классы для генерации паролей (StrongPasswordGenerator и SimplePasswordGenerator) соблюдают принцип DRY. Они используют циклы и генерацию случайных чисел, а не дублируют код.

### **KISS (Keep It Simple, Stupid):**

Ваши классы для генерации паролей сосредоточены на основной задаче - генерации пароля. Они не пытаются решить слишком много задач и имеют четкую цель.

Операции генерации пароля в этих классах просты и понятны. Нет избыточной сложности.

