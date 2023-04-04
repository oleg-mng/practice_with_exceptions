public class CheckApiOnExceptions {
    public static void main(String[] args) {
        Application.run();
    }

    class MyArray{

    }
    static class MyArrayApi {
        MyArray ma;
        public MyArrayApi(MyArray myArray) {
            ma = myArray;
        }
        public void build(){
            Integer[] ar = {2, 10, 13, null, 7, null};
        }
    }
    class Application{
        static void run(){
            MyArrayApi mapi = new MyArrayApi(null);
            mapi.build();
        }
    }
}
