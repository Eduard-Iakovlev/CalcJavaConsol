## О приложении

Простой калькулять.
Приложение кроссплатформенное для ОС Windows и Linux
Примеры вводятся строкой в формате a + b enter.
Предусмотрено меню:
(символы латинские)
q - завершение работы
c - очистить консоль от введённых решений.
enter(или любой другой набор символов) - продолжить.

## Классы

> class App  - класс с методом main, в котором вызывается основной рабочий класс CalcWork

> class CalcWork - класс отвечающий за организацию функционала калюкулятора.

> class OSDetected - определяет в какой системе запущено приложение и передаёт эту информацию в класс CLS.

> class CLS - на основе данных о ОС выполняет очистку консоли от решений и выводит инструкцию по соответствующему алгоритму.

> class Processing - принимает строку с входными данными, извлекает из неё переменные и знак действия, при отклонении от шаблона останавливает работу и выбрасывает ошибку. При соответствии шаблону передает данные в класс Operation и приняв от него результат, передает его в класс CalcWork.

> class Operation принимает переменные и знак действия, затем вощзвращает результат.


