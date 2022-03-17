package com.leige.design.结构型.享元模式;

import java.awt.*;

/**
 * BlackChess
 */
public class BlackChess implements Chess{
    //内部状态，共享
    private final Color color = Color.BLACK;
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("%s%s棋子置于（%d，%d）处", sharp,"黑色", x, y));
    }
}
