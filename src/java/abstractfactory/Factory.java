package abstractfactory;

import methodfactory.Product;

// 需要创建一系列的对象
public interface Factory {

    ProductA createProductA();

    ProductB createProductB();
}
