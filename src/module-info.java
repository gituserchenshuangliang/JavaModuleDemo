/**
 * Java 模块
 * @author Cherry
 * 2020年4月22日
 */
module JavaModuleDemo {
    requires java.base;
    //不导入java.xml，Main.java引用XXMLConstants将报错
    requires java.xml;
}