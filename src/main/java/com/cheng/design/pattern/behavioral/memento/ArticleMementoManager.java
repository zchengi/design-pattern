package com.cheng.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author cheng
 *         2018/11/14 11:23
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.add(articleMemento);
    }
}
