package com.learning.patterns.creational.factoryMethod;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class ParameterizedFactoryMethod {
    private static ParameterizedFactoryMethod parameterizedFactoryMethod = new ParameterizedFactoryMethod();

    private ParameterizedFactoryMethod(){}

    public static ParameterizedFactoryMethod getInstance()
    {
        return parameterizedFactoryMethod;
    }

    public MazeGame getMazeGameInstance(int num)
    {
        switch (num)
        {
            case 1:
                return new EnchantedMazeGame();
            case 2:
                return new BombedMazeGame();
            default:
                return new EnchantedMazeGame();
        }
    }
}
