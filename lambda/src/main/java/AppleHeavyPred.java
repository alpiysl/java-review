public class AppleHeavyPred implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
