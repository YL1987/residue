package com.yyq.designmode.Composite.Component;

/**
 * 作者：yangyouqiao on 2017/11/24 10:35
 * 功能：
 */

/**
 * 可以是接口或者抽象类，为叶子对象和容器对象声明接口
 *
 * @author YangYQ
 *         created at 2017/11/24 上午10:38
 */
public abstract class AbstractFile {
    private String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public abstract void addFile(AbstractFile abstractFile);

    public abstract void removeFile(AbstractFile abstractFile);

    public abstract void getFileSuffix();

    public abstract AbstractFile getFile(int index);
}
