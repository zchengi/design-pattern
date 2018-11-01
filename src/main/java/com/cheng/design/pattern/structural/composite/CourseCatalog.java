package com.cheng.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cheng
 *         2018/11/1 12:29
 */
public class CourseCatalog extends CatalogComponent {

    private String name;
    private List<CatalogComponent> items = new ArrayList<>();
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
            }
            item.print();
        }
    }
}
