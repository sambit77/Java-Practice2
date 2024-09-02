package core;
//Basic Singleton (Not thread safe)
//class core.Car
//{
//    private static core.Car instance;
//    private core.Car(){
//
//    }
//
//    public static core.Car getInstance()
//    {
//        if(instance == null)
//        {
//            instance = new core.Car();
//        }
//        return  instance;
//
//    }
//
//}

//Way 2; (Early initialization , client cant pass arguments) | (Easy implementation)
//class core.Car
//{
//    private static core.Car instance;
//    static{
//        instance = new core.Car();
//    }
//    private core.Car(){
//
//    }
//
//    public static core.Car getInstance()
//    {
//        return  instance;
//    }
//
//}

////Way-3 (Unnecessary synchronization locking overhead , low perf) |
// (Client can pass args, lazy initialization)
//class core.Car
//{
//    private static core.Car instance;
//    private core.Car(){
//
//    }
//
//    public synchronized static core.Car getInstance()
//    {
//        if(instance == null)
//        {
//            instance = new core.Car();
//        }
//        return  instance;
//    }
//
//}

//Way-4

class Car
{
    private  static Object mutex = new Object();
    private volatile static Car instance;
    private Car(){

    }

    public  static Car getInstance()
    {
        Car result = instance;
            if(result == null)
            {
                synchronized (mutex)
                {
                    result = instance;
                    if(result == null)
                    {
                        instance = result = new Car();
                    }
                }
            }

        return  result;
    }

}

public class SingletonExample {

    public static void main(String[] args) {
        Car toyota = Car.getInstance();
        Car kia = Car.getInstance();

        System.out.println(toyota == kia);


    }


}
