public class Operation {
    private int _a,
                _b,
                _result;
    private char _operator;

    Operation(int a, int b, char operator){
        _a = a;
        _b = b;
        _operator = operator;
    }

    public int operations(){
        switch (_operator) {
            case '+':
                _result = _a + _b;
                break;              
            case '-':
                _result = _a - _b;
                break;
            case '/':
                _result = _a / _b;
            case '*':
                _result = _a * _b;            
            default:
                break;
        }

        return _result;        
    }

}
