package simpleFactoryDesignPatternV1.iPhone;

import simpleFactoryDesignPatternV1.IAppleProduct;
import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;

public class AppleIPhone13 implements IAppleProduct {

    @Override
    public String getType() {
        return AppleProductTypeEnum.SMARTPHONE.name();
    }

    @Override
    public String getProductName() {
        return "Apple iPhone";
    }

    @Override
    public String getModel() {
        return AppleProductEnum.IPHONE_13.name();
    }
}
