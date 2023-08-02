package simpleFactoryDesignPatternV1;

import simpleFactoryDesignPatternV1.enums.AppleProductEnum;
import simpleFactoryDesignPatternV1.enums.AppleProductTypeEnum;
import simpleFactoryDesignPatternV1.factory.AppleFactory;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        AppleFactory appleFactory = AppleFactory.getFactory(AppleProductTypeEnum.SMARTPHONE);

        if (Objects.nonNull(appleFactory)) {
            IAppleProduct iPhone = appleFactory.buildProduct(AppleProductEnum.IPHONE_13);

            if (Objects.nonNull(iPhone)) {
                System.out.println("Product type: "+iPhone.getType());
                System.out.println("Product model: "+iPhone.getModel());
                System.out.println("Product name: "+iPhone.getProductName());
            } else {
                System.out.println("iPhone is null !");
            }
        } else {
            System.out.println("appleFactory is null !");
        }
    }
}

