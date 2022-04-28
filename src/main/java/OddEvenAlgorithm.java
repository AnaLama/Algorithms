public class OddEvenAlgorithm {

// 1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
// Во всех остальных случаях результат будет “Undefined”.
    public String EvenOdd (int a){
        if(a % 2 == 0){
            return "Even";
        } else if (a % 2 != 0) {
            return "Odd";
        } else return "Undefined";
    }
}
