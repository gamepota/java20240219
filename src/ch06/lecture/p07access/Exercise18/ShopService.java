package ch06.lecture.p07access.Exercise18;

import ch06.lecture.p07access.Example.Singleton;

public class ShopService {
    private static ShopService s;

    private ShopService() {
    }

    public static ShopService getInstance() {
        if (s == null) {
            s = new ShopService();
        }
        return s;
    }
}

