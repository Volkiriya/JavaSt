package out.com.base;

public class Part1 {
    /**
     * Если передать примитивную переменную в функцию, то передастся значение,
     * если ссылочный объект то передастся ссылка, то есть любые изменения будут происходить с определенной
     * ячейкой памяти
     */
    public static void main(String[] args) {
        Integer i = new Integer(10);
        System.out.println(i);
        souy(i);
        System.out.println(i);
    }

    private static void souy(Integer i) {
        i = new Integer(20);
    }

    /**
     * Аналог goto из с++
     * разница в том, что мы не можем поставить метку в любую часть кода, только в одном блоке
     */
    //Работает
    public static void gotoA1() {
        to:
        for (int i = 0; i < 10; i++) {
            //...
            break to;
            //...
        }
    }

    //Не работает
   /* public static void gotoA2() {
        to:
        public static void gotoA3 () {
            for (int i = 0; i < 10; i++) {
                //...
                break to;
                //...
            }
        }
    }*/

}
