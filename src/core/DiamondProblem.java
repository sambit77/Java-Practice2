package core;

interface AquaticAnimal{
    default public void liveIn()
    {
        System.out.println("I live in water");
    }
}

interface TerestrialAnimal{
    default  public void liveIn()
    {
        System.out.println("I live in land");
    }
}

class Frog implements  AquaticAnimal,TerestrialAnimal
{

    @Override
    public void liveIn() {
        AquaticAnimal.super.liveIn();
    }

    static Frog f = new Frog();

    public static void main(String[] args) {
        f.liveIn();
    }
}
public class DiamondProblem {
}
