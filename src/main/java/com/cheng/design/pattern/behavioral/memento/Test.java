package com.cheng.design.pattern.behavioral.memento;

/**
 * 备忘录模式
 *
 * @author cheng
 *         2018/11/14 11:27
 */
public class Test {
    public static void main(String[] args) {

        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("手记A", "content", "img");
        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题: " + article.getTitle()
                + " 内容: " + article.getContent()
                + " 图片: " + article.getImg());

        System.out.println("手记完整信息: " + article);
        System.out.println("修改手记 start");

        article.setTitle("手记B");
        article.setContent("contentB");
        article.setImg("imgB");

        System.out.println("修改手记 end");

        System.out.println("手记完整信息: " + article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("手记C");
        article.setContent("contentC");
        article.setImg("imgC");

        System.out.println("暂存回退 start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退 end");
        System.out.println("手记完整信息: " + article);
    }
}
